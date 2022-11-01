package Model;

public class Task { 
   private int id;  
   private int idProject;
   private String name;
   private String description;
   private boolean completed;
   private String notes;

    public Task(int idproject,String name,String Description,boolean completed,String notes ){
                       
        this.idProject = idproject;
        this.name = name;
        this.description = Description;
        this.completed = completed;
        this.notes = notes;        
    }

    public Task() {
        //this.createdAt = new Date();
    }
    
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }    

    @Override
    public String toString() {
        return "Task{ idProject=" + idProject
                + ", name=" + name 
                + ", description=" + description 
                + ", completed=" + completed 
                + ", notes=" + notes +'}'; }

    public void isCompleted(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
   
   
}
