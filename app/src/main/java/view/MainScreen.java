package view;

import Model.Project;
import Model.Task;
import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import util.TaskTableModel;

public final class MainScreen extends javax.swing.JFrame {
    ProjectController projectController;
    TaskController taskController;
    
    DefaultListModel projectsModel;
    TaskTableModel taskModel;
    
   //Contructor 
   public MainScreen() {
        initComponents();
        decorateTableTasks();
        initDataController();
        initComponentsModel();
        loadProjects();
    }
    
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEmptyListTitle = new javax.swing.JLabel();
        jLabelEmptyListSubTitle = new javax.swing.JLabel();
        jLabelEmptyListIcon = new javax.swing.JLabel();
        PanelTitle = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelSubTitle = new javax.swing.JLabel();
        PanelProjects = new javax.swing.JPanel();
        jLabelProjectTitle = new javax.swing.JLabel();
        jLabelProjectAdd = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTaksTitle = new javax.swing.JLabel();
        jLabelTaksAdd = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPaneProjects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        jPanelEmptyList.setBackground(java.awt.Color.white);

        jLabelEmptyListTitle.setBackground(new java.awt.Color(0, 153, 102));
        jLabelEmptyListTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmptyListTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListTitle.setText("Nenhuma tarefa por aqui :D");

        jLabelEmptyListSubTitle.setForeground(new java.awt.Color(204, 204, 204));
        jLabelEmptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubTitle.setText("Clique no botão ' + ' para adicionar tarefas ");

        jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListSubTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabelEmptyListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmptyListSubTitle)
                .addGap(93, 93, 93))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 600));

        PanelTitle.setBackground(new java.awt.Color(0, 153, 102));
        PanelTitle.setForeground(new java.awt.Color(102, 102, 102));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        jLabelTitle.setText(" Antiesquecedor");

        jLabelSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSubTitle.setText("O que você esquece, a gente te lembra...");

        javax.swing.GroupLayout PanelTitleLayout = new javax.swing.GroupLayout(PanelTitle);
        PanelTitle.setLayout(PanelTitleLayout);
        PanelTitleLayout.setHorizontalGroup(
            PanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSubTitle)
                    .addComponent(jLabelTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTitleLayout.setVerticalGroup(
            PanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitleLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelProjects.setBackground(java.awt.Color.white);
        PanelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelProjectTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProjectTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelProjectTitle.setText("Projetos");

        jLabelProjectAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelProjectAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelProjectsLayout = new javax.swing.GroupLayout(PanelProjects);
        PanelProjects.setLayout(PanelProjectsLayout);
        PanelProjectsLayout.setHorizontalGroup(
            PanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelProjectAdd)
                .addContainerGap())
        );
        PanelProjectsLayout.setVerticalGroup(
            PanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelProjectAdd))
                .addContainerGap())
        );

        jPanelTasks.setBackground(java.awt.Color.white);
        jPanelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTaksTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTaksTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelTaksTitle.setText("Tasks");

        jLabelTaksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelTaksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTaksAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTaksTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTaksAdd)
                .addGap(22, 22, 22))
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTaksTitle)
                    .addComponent(jLabelTaksAdd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelProjectList.setBackground(java.awt.Color.white);
        jPanelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListProjects.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jListProjects.setForeground(new java.awt.Color(0, 153, 102));
        jListProjects.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jScrollPaneProjects.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
        jPanelProjectList.setLayout(jPanelProjectListLayout);
        jPanelProjectListLayout.setHorizontalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects)
                .addContainerGap())
        );
        jPanelProjectListLayout.setVerticalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setAlignmentX(1.0F);

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(java.awt.Color.white);
        jTableTasks.setRowHeight(40);
        jTableTasks.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowGrid(false);
        jScrollPane1.setViewportView(jTableTasks);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(PanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //evento ao clicar no add project
    private void jLabelProjectAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectAddMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
        //criei um ouvinte de tela
        projectDialogScreen.addWindowListener(new WindowAdapter() {
            //ele percebe se ocorrera o event closewindow
            //que dispara o loadProjects
            public void windowClosed(WindowEvent event){loadProjects();}
        
        });
    }//GEN-LAST:event_jLabelProjectAddMouseClicked
    //evento ao clicar no add task
    private void jLabelTaksAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaksAddMouseClicked
        // TODO add your handling code here:
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        taskDialogScreen.setProject(null);
        taskDialogScreen.setVisible(true);
    }//GEN-LAST:event_jLabelTaksAddMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    //variaveis do jlabel
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelProjects;
    private javax.swing.JPanel PanelTitle;
    private javax.swing.JLabel jLabelEmptyListIcon;
    private javax.swing.JLabel jLabelEmptyListSubTitle;
    private javax.swing.JLabel jLabelEmptyListTitle;
    private javax.swing.JLabel jLabelProjectAdd;
    private javax.swing.JLabel jLabelProjectTitle;
    private javax.swing.JLabel jLabelSubTitle;
    private javax.swing.JLabel jLabelTaksAdd;
    private javax.swing.JLabel jLabelTaksTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneProjects;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables
    
    public void decorateTableTasks(){
        //definindo a fonte e as cores do header(cabeçalho)
        jTableTasks.getTableHeader().setFont(new Font("Segoe Ui",Font.BOLD,14));
        jTableTasks.getTableHeader().setBackground(new Color(0,152,102));
        jTableTasks.getTableHeader().setForeground(new Color(255,255,255));        
        //Organiza automatico das tasks
        jTableTasks.setAutoCreateRowSorter(true);       
    }
    public void initDataController(){
        projectController = new ProjectController();
        taskController = new TaskController();
    }
    
    
    public void initComponentsModel(){
        projectsModel = new DefaultListModel();
        loadProjects();
        
        taskModel = new TaskTableModel();
        jTableTasks.setModel(taskModel);
        loadTasks(3);
        
    }
    public void loadTasks(int idTask){
        //carrega tasks de um projeto especifico
        List<Task> tasks = taskController.getAll(idTask);
        taskModel.setTasks(tasks);
        
    }
    public void loadProjects(){
        //carrega os projetos do banco
        List<Project> projects = projectController.getALL();
        
        //Limpa o jLabel model
        projectsModel.clear();
        
        //Semeia o novo Model atualizado
        for(int i = 0; i < projects.size() ;i++){
            
           Project project = projects.get(i);
           projectsModel.addElement(project);
        }
        //implementa o model novo na interface
        jListProjects.setModel(projectsModel);
    }
    

    
}
