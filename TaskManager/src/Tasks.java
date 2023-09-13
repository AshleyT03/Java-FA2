import java.sql.PreparedStatement;
import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import taskmanager.TaskManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ic westgate
 */
public class Tasks extends javax.swing.JFrame {

    /**
     * Creates new form Tasks
     */
    public Tasks() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfCategory = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFileRead = new javax.swing.JButton();
        btnFileWrite = new javax.swing.JButton();
        btncsvWrite = new javax.swing.JButton();
        cbViewBy = new javax.swing.JComboBox<>();
        tfDescription = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasksTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Task Manager");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Task Name");

        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Task Category");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFileRead.setText("file Read");
        btnFileRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileReadActionPerformed(evt);
            }
        });

        btnFileWrite.setText("file Write");
        btnFileWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileWriteActionPerformed(evt);
            }
        });

        btncsvWrite.setText("csv Write");
        btncsvWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncsvWriteActionPerformed(evt);
            }
        });

        cbViewBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Categories", "Complete", "Incomplete"}));
        cbViewBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViewByActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Task Description");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescription)
                            .addComponent(tfCategory)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbViewBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(btnFileRead)
                                            .addGap(63, 63, 63)
                                            .addComponent(btnFileWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnDelete)
                                                .addComponent(btncsvWrite))))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbViewBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFileRead)
                    .addComponent(btnFileWrite)
                    .addComponent(btncsvWrite))
                .addContainerGap())
        );

        tasksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task Name", "Description", "Completion Status", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tasksTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String[] getUniqueValuesFromColumn(String columnName){
        DefaultTableModel model = (DefaultTableModel) tasksTable.getModel();
        int columnIndex = model.findColumn(columnName);
        int rowCount = model.getRowCount();

        if (columnIndex != -1){
            Set<String> uniqueValues = new HashSet<>();

            for (int rowIndex = 0; rowIndex < rowCount; rowIndex++){
                String cellValue = (String) model.getValueAt(rowIndex, columnIndex);
                uniqueValues.add(cellValue);
            }

            return uniqueValues.toArray(new String[0]);
        } else {
            return new String[0];       // Column Not found
        }
}
  
    private void updateCategoryComboBox(){
        // Get the initial values
        String[] initialValues = new String[]{"All Categories", "Complete", "Incomplete"};

        // Get the dynamic values from the table
        String[] dynamicValues = getUniqueValuesFromColumn("Category");
        
        // Create an array to hold the initial values and dynamic values
        String[] allValues = new String[initialValues.length + dynamicValues.length];
        System.arraycopy(initialValues, 0, allValues, 0, initialValues.length);
        System.arraycopy(dynamicValues, 0, allValues, initialValues.length, dynamicValues.length);
         
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(allValues);
        cbViewBy.setModel(comboBoxModel);
    }
    
    private void cbViewByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbViewByActionPerformed
        // Select from database and update table
        
        DefaultTableModel model = (DefaultTableModel) tasksTable.getModel();    // Retrieve Table model
        DefaultTableModel filteredModel = new DefaultTableModel(
                new Object[][]{}, new String[]{"Task Name","Task Description", "Completed", "Task Category"}
        );
        
        String selectedItem = (String) cbViewBy.getSelectedItem();              // Retrieve selected Category
        int rowCount = model.getRowCount();                                     // Retrieve number of rows
        
        if (selectedItem.equals("Complete"))
        {
            int columnIndex = model.findColumn("Completion Status");        // Retrieve the index of the Category column
            
            for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
            {
                boolean complete = (boolean) model.getValueAt(rowIndex, columnIndex);
                
                if (complete)
                {
                    Object[] rowData = new Object[]
                    {
                        model.getValueAt(rowIndex, 0), 
                        model.getValueAt(rowIndex, 1), 
                        model.getValueAt(rowIndex, 2),
                        model.getValueAt(rowIndex,3)
                    };
                    filteredModel.addRow(rowData);
                }
            }
        } 
        else if (selectedItem.equals("Incomplete"))
        {
            int columnIndex = model.findColumn("Completion Status");        // Retrieve the index of the Category column
            
            for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
            {
                boolean complete = (boolean) model.getValueAt(rowIndex, columnIndex);
                
                if (!complete)
                {
                    Object[] rowData = new Object[]
                    {
                        model.getValueAt(rowIndex, 0), 
                        model.getValueAt(rowIndex, 1), 
                        model.getValueAt(rowIndex, 2),
                        model.getValueAt(rowIndex, 3)
                    };
                    filteredModel.addRow(rowData);
                }
            }
        }
        else 
        {
            int columnIndex = model.findColumn("Category");        // Retrieve the index of the Category column

            for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
            {
                String categoryValue = (String) model.getValueAt(rowIndex, columnIndex);

                if (selectedItem.equals(categoryValue))
                {
                    Object[] rowData = new Object[] 
                    {
                        model.getValueAt(rowIndex, 0), 
                        model.getValueAt(rowIndex, 1), 
                        model.getValueAt(rowIndex, 2),
                        model.getValueAt(rowIndex, 3)
                    };
                    filteredModel.addRow(rowData);
                }
            }
        }
        
        // Clear the original Table
        model.setRowCount(0);
        tasksTable.setModel(filteredModel);
        
        // Create a custom cell renderer for the "Completed" column
        TableCellRenderer checkboxRenderer = new DefaultTableCellRenderer(){
            private final JCheckBox checkbox = new JCheckBox();
            
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
                if (value instanceof Boolean){
                    checkbox.setSelected((Boolean) value);
                }
                return checkbox;
            }
        };
        
        // Set the custom cell renderer for the "Completed" column
        TableColumn column = tasksTable.getColumnModel().getColumn(2);
        column.setCellRenderer(checkboxRenderer);
    }//GEN-LAST:event_cbViewByActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Clear all textfields
        tfName.setText("");
        tfDescription.setText("");
        tfCategory.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFileWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileWriteActionPerformed
        // Cast the model of the tasks table
        DefaultTableModel model = (DefaultTableModel) tasksTable.getModel();
        
        // Store the data from the table into a collection of vectors
        Vector<Vector> tableData = model.getDataVector();
        
        // Saving objects in a file
        try{
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            output.writeObject(tableData);
            
            output.close();
            file.close();
            
            System.out.println("Table data has been saved to file bin");
        } catch (IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving data to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFileWriteActionPerformed

    private void btnFileReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileReadActionPerformed
        try{
            FileInputStream file = new FileInputStream("file.bin");
            ObjectInputStream input = new ObjectInputStream(file);
            
            @SuppressWarnings("unchecked")
            Vector<Vector> tableData = (Vector<Vector>) input.readObject();
            
            input.close();
            file.close();
            
            System.out.println("Table data has been read from file bin");
            
            DefaultTableModel model = (DefaultTableModel) tasksTable.getModel();
            model.setRowCount(0);
            for (Vector<Object> rowData : tableData){
                model.addRow(rowData.toArray());
                updateCategoryComboBox();
            }
            
            //updateCategoryComboBox();
            System.out.println("Table data has been loaded from file.bin.");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading data from file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnFileReadActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // GET the values from user
        String taskName = tfName.getText();
        String taskDescription = tfDescription.getText();
        String taskCategory = tfCategory.getText();
        boolean isComplete = false;

        if (taskName.isEmpty() | taskDescription.isEmpty())
        {
            JOptionPane.showMessageDialog(this,
                "Please enter all fields",
                "Try again",
                JOptionPane.ERROR_MESSAGE);
        } else {
            // Get the database connection from the TaskManager class
            java.sql.Connection connection = TaskManager.getConnection();
            
            // Prepare the INSERT statement
            String sqlInsert = "Insert INTO Tasks (Task_Name, Description, Completion_Status, Category) VALUES (?, ?, ?, ?)";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert)){
                preparedStatement.setString(1, taskName);
                preparedStatement.setString(2, taskDescription);
                preparedStatement.setBoolean(3, isComplete);
                preparedStatement.setString(4, taskCategory);
            
            
                // Execute the INSERT statement
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0){
                    DefaultTableModel model = (DefaultTableModel) tasksTable.getModel();
                    model.addRow(new Object[] {taskName, taskDescription, isComplete, taskCategory});
                    updateCategoryComboBox();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        tfName.setText("");
        tfDescription.setText("");
        tfCategory.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tasksTable.getSelectedRow();
        
        if (row < 0){
            JOptionPane.showMessageDialog(this,
                    "No row is selected. Please select a row",
                    "Select row",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            // Get the database connection from the TaskManager class
            java.sql.Connection connection = TaskManager.getConnection();
            
            try{
                String taskNameToDelete = (String) tasksTable.getValueAt(row, 0);
                // Prepare the INSERT statement
                String sqlInsert = "DELETE FROM Tasks WHERE Task_Name = ?";

                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert)){
                    preparedStatement.setString(1, taskNameToDelete);           

                    // Execute the DELETE statement
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0){
                        DefaultTableModel model = (DefaultTableModel) tasksTable.getModel();
                        model.removeRow(row);
                        updateCategoryComboBox();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }   
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btncsvWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncsvWriteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tasksTable.getModel();
        try (FileWriter writer = new FileWriter("data.csv")) {
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        // Write the column headers to the CSV file
        for (int i = 0; i < columnCount; i++) {
            writer.write(model.getColumnName(i));
            if (i < columnCount - 1) {
                writer.write(",");
            }
        }
        writer.write("\n");

        // Write the table data to the CSV file
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                writer.write(model.getValueAt(row, col).toString());
                if (col < columnCount - 1) {
                    writer.write(",");
                }
            }
            writer.write("\n");
        }

        System.out.println("Table data has been saved to CSV file");
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error saving data to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btncsvWriteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tasks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFileRead;
    private javax.swing.JButton btnFileWrite;
    private javax.swing.JButton btncsvWrite;
    private javax.swing.JComboBox<String> cbViewBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tasksTable;
    private javax.swing.JTextField tfCategory;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
