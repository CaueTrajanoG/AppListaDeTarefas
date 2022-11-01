package controller;

import Model.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ConnectionFactory;

public class TaskController {  
    public void save(Task task) throws Exception{
       String sql = "INSERT INTO TASKS("
               + "PROJECTID,"
               + " NAME,"
               + "DESCRIPTION,"
               + "COMPLETED,"
               + "NOTES) "
               + "VALUES (?, ?, ?, ?, ?);"; 
       //INSERT INTO nome_tabela (modelo, km , ano) VALUES ('Tipo', 95, 150);
       Connection connection = null;
       PreparedStatement statement = null;
        try {
            //estabelecendo conexão com banco
            connection = ConnectionFactory.getConnection();
            //estabelecendo um statement com a variavel sql
            statement = connection.prepareStatement(sql);
            //Modificando os "?" do sql com statement para criar a query
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isCompleted());
            statement.setString(5, task.getNotes());
            //executando a query 
            statement.execute();           
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar tarefa"+ ex.getMessage());
        }finally{
            //encerrando conexão com banco
            ConnectionFactory.closeConnection(connection , statement);            
        }
    }
    public void update(Task task) throws Exception{
        //Criando variavel String que vai servir de query
        
                    //UPDATE TASKS SET NAME = ?,DESCRIPTION = ?,NOTES = ?,COMPLETED = ?  WHERE IDTASK = 2 and projectid = 1 ;
        String sql = "UPDATE TASKS SET "
                + "NAME = ?,"
                + "DESCRIPTION = ?,"
                + "NOTES = ?,"
                + "COMPLETED = ? "
                + " WHERE IDTASK = ? and PROJECTID = ?;";
                
        //UPDATE NAME_TABELA SET NOME_COLUNA = 'MODIFICAÇÃO' WHERE IDADE = 20;
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //Estabelecendo a conexão com o DataBase
            connection = ConnectionFactory.getConnection();            
            //Preparando a Query
            statement = connection.prepareStatement(sql);            
            //Setando os valores no statement substituindo os "?"
            
            statement.setString(1, task.getName());
            statement.setString(2, task.getDescription());
            statement.setString(3, task.getNotes()); 
            statement.setBoolean(4, task.isCompleted());            
            statement.setInt(5, task.getId());
            statement.setInt(6, task.getIdProject());
            System.out.println(statement);
            //executando a query
            statement.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar");
        }
    }
    public void removeById (int taskId) throws Exception{
        String sql = "DELETE FROM TASKS WHERE IDTASK = ?;";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //estabelecendo conecção
            connection = ConnectionFactory.getConnection();            
            //preparando query
            statement = connection.prepareStatement(sql);            
            //Setando o id da task que vai ser excluida
            statement.setInt(1, taskId);
            //executando a query
            statement.execute();
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar tarefa", ex);
        }finally{
            //encerrando conexão após a execução da query
            ConnectionFactory.closeConnection(connection, statement);            
    } 
    }
    public List<Task> getAll(int PROJECTID){
        String sql = "SELECT * FROM tasks WHERE PROJECTID = ?;";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Task> tasks = new ArrayList<Task>();        
        try {
            //Criando conexão com Banco
            connection = ConnectionFactory.getConnection();
            //preparando a Query usando a variavel SQL criada mais acima
            statement = connection.prepareStatement(sql);
            //Selecionando de qual projeto são as tasks que vao ser listadas
            statement.setInt(1, PROJECTID);
            //Variavel que recebe os dados do banco 
            resultSet = statement.executeQuery();            
            //enquanto tiver itens no resultSet ele vai rodar
            while(resultSet.next()){
                //Objeto clone é criado para receber dados do banco
                Task task = new Task();
                //Dados do banco são clonados nesse objeto                
                task.setIdProject(resultSet.getInt("PROJECTID"));
                task.setName(resultSet.getString("NAME"));
                task.setDescription(resultSet.getString("DESCRIPTION"));
                task.setCompleted(resultSet.getBoolean("COMPLETED"));
                task.setNotes(resultSet.getString("NOTES"));                
                //Essa task é adicionada a um array de tasks
                tasks.add(task);
            }
        } catch (Exception ex) {            
            throw new RuntimeException("Erro ao inserir a tarefa", ex);
        }finally{
            //encerrando conexão
            ConnectionFactory.closeConnection(connection,statement,resultSet);
        }        
        //Retornando lista de tarefas que foi carregada do DB
        return tasks;
    }

    

    
}
