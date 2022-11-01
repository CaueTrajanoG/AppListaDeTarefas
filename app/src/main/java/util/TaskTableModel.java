package util;



import Model.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TaskTableModel extends AbstractTableModel{
    
    
    String[] columns = {"Nome","Descrição", "Prazo","Tarefa concluida","Editar","Excluir"};
    List<Task> tasks = new ArrayList();
    
      
    
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    
    }
    @Override
    public int getColumnCount() {
        return columns.length;
    }   

    @Override
    public int getRowCount() {
        return tasks.size();
        
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int ColumnIndex){
        if(ColumnIndex == 3){
            return true;
        }else{
            return false;
        }     
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        
        switch (columnIndex +1) {
            case 1:
                return tasks.get(rowIndex).getName();                
            case 2:
                return tasks.get(rowIndex).getDescription();
            case 3:
                //SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                //return dateFormat.format(tasks.get(rowIndex).getDeadLine());
                //falta implementar
                return "";
            case 4:
                return tasks.get(rowIndex).isCompleted();                
            case 5:
                return "";
            case 6:
                return "";
            
            
            default:
                return "Dados não encontrados";
        }
    }

    public String[] getColums() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
}
