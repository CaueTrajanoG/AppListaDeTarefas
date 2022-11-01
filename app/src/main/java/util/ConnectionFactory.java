package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASS = "0000";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexao com Banco de dados 222"+ ex.getMessage(), ex);            
        }
    }
    
    
    //Daqui pra baixo é tudo close connection
    public static void closeConnection(Connection connection){
        try {
            if(connection != null){
                connection.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao encerrar conexão com banco de dados",ex);
        }
    }
    public static void closeConnection(Connection connection,PreparedStatement statement){
        try {
            if(connection != null){
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao encerrar conexão com banco de dados",ex);
        }
    }
    public static void closeConnection(Connection connection,
            PreparedStatement statement,ResultSet resultSet){
        try {
            if(connection != null){
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao encerrar conexão com banco de dados",ex);
        }
    }
}
