package controller;

import Model.Project;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ConnectionFactory;

public class ProjectController {
    public void save(Project project) throws Exception{
      String sql = "INSERT INTO PROJECTS (PROJECTNAME,DESCRIPTION,STATUS) VALUES (? ,? ,?)";  
        Connection connection = null;
        PreparedStatement statement = null;  
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);            
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setBoolean(3, project.isCompleted());
            
            //statement.setDate(5, new Date(project.getCreateAt().getTime()));
            //statement.setDate(6, new Date(project.getUpdateAt().getTime()));
            
            //executando query
            statement.execute();            
            
        } catch (SQLException ex) {
            throw new Exception("Erro ao salvar registro", ex);
        }finally{
            ConnectionFactory.closeConnection(connection);
        }
        
    }
    public void update(Project project) throws Exception{
        String sql = "UPDATE PROJECTS SET PROJECTNAME = ?, DESCRIPTION = ?,STATUS = ? WHERE PROJECTID = ? ";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);            
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription()); 
            statement.setBoolean(3, project.isCompleted()); 
            statement.setInt(4, project.getId());
            
            //statement.setDate(5, new Date(project.getCreateAt().getTime()));
            //statement.setDate(6, new Date(project.getUpdateAt().getTime()));            
            
            statement.execute();
            
        } catch (SQLException ex) {
            throw new Exception("Erro ao atualizar registro", ex);
        }finally{
            ConnectionFactory.closeConnection(connection);
        }
    }
    
    public void removeById(int projectid) throws Exception{
        String sql = "DELETE FROM PROJECTS WHERE PROJECTID = ?";
        Connection connection = null;
        PreparedStatement statement = null;        
        try {
           connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);             
            statement.setInt(1, projectid);            
            statement.execute();            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar projeto", ex);
        }finally{
            ConnectionFactory.closeConnection(connection);
        }
    }
    
    public List<Project> getALL(){
        //Criando uma lista com os projetos do banco
        List<Project> projects = new ArrayList<Project>();
        String sql = "SELECT * FROM PROJECTS;";
        Connection connection = null;
        PreparedStatement statement = null;
        
        //classe que vai receber dados do Banco
        ResultSet resultSet = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
               Project project = new Project(); 
               
               project.setId(resultSet.getInt("PROJECTID"));
               project.setName(resultSet.getString("PROJECTNAME"));
               project.setDescription(resultSet.getString("DESCRIPTION"));
               project.setCompleted(resultSet.getBoolean("STATUS"));
                              
              //Adicionar o projeto a lista
              projects.add(project);
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao listar projetos", ex);
        }finally{
            ConnectionFactory.closeConnection(connection);
        }      
        
        return projects;        
    }
}
