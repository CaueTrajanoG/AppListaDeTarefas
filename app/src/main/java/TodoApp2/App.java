package TodoApp2;

import Model.Project;
import Model.Task;
import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class App {    
    public static void main(String[] args) throws Exception {
                
        TaskController tc = new TaskController();
        Task task = new Task();
        //task.setId(1);
        task.setIdProject(3);
        task.setName("TaskTeste-05");        
        task.setDescription("Teste de task 05");        
        task.setCompleted(false);
        task.setNotes("bla5");
        tc.save(task);
        //List<Task> tasks = tc.getAll(3);
        //System.out.println("total de TASKS:"+ tasks.size());

        // updateTasks ta funcionando :D tc.update(task);
        
        /*ProjectController pc = new ProjectController();        
        Project projeto = new Project();
        
        projeto.setName("Projeto teste04 ");
        projeto.setId(3);
        projeto.setDescription("Projeto de teste 04");
        projeto.setCompleted(false);
        
        List<Project> projects = pc.getALL();
        System.out.println("total de projetos:"+ projects.size());
        //update funcionando pc.update(projeto);
        pc.save(projeto);*/
        //Delete funcionando pc.removeById(2);*/
        
        
        
        /*conexao funcional de teste com banco de dados
          Connection connection = null;        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todoapp", "root", "0000");            
            ResultSet resultSet = connection.createStatement().executeQuery(("SELECT * FROM PROJECTS"));
            while(resultSet.next()){
                System.out.println("Nome: "+ resultSet.getNString("PROJECTNAME"));
                System.out.println("Description: " + resultSet.getString("Description"));
            }            
        } catch (ClassNotFoundException ex) {
            System.out.println("\n\n\nDriver do banco não localizado \n\n\n");
        } catch (SQLException e){
            System.out.println("Erro ao acessar o banco Todoapp");
            System.out.println(e.getMessage());
        } finally{
            if(connection != null){
                connection.close();
            }
        }*/
        
        
    }
}
