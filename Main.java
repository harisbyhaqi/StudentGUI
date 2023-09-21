
/**
 *
 * @author haris
 */
import javax.swing.JOptionPane;
import javax.swing.table.*;
import javax.swing.JTable;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        nameField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        averageField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        sortButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Students Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1)
                                .addContainerGap(60, Short.MAX_VALUE)));

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 14));
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 0, 14));
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Student ID: ");

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 0, 14));
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Class average:");

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 0, 14));
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Email:");

        table.setFont(new java.awt.Font("Eras Demi ITC", 0, 12));
        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name", "Student ID", "Email", "Class Average"
                }));
        jScrollPane1.setViewportView(table);

        nameField.setFont(new java.awt.Font("Eras Demi ITC", 0, 14));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        idField.setFont(new java.awt.Font("Eras Demi ITC", 0, 14));
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        emailField.setFont(new java.awt.Font("Eras Demi ITC", 0, 14));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        averageField.setFont(new java.awt.Font("Eras Demi ITC", 0, 14));
        averageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageFieldActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(0, 153, 153));
        deleteButton.setFont(new java.awt.Font("Eras Demi ITC", 0, 12));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(0, 153, 153));
        addButton.setFont(new java.awt.Font("Eras Demi ITC", 0, 12));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(0, 153, 153));
        logoutButton.setFont(new java.awt.Font("Eras Demi ITC", 0, 12));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        sortButton.setBackground(new java.awt.Color(0, 153, 153));
        sortButton.setFont(new java.awt.Font("Eras Demi ITC", 0, 12));
        sortButton.setForeground(new java.awt.Color(255, 255, 255));
        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(averageField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel5))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(emailField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(idField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nameField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(logoutButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(deleteButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(sortButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78,
                                        Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(41, 41, 41)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(emailField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(averageField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(60, 60, 60)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deleteButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(sortButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443,
                                                        Short.MAX_VALUE)))));

        pack();
    }// </editor-fold>

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void averageFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {

        if (nameField.getText().isEmpty() || idField.getText().isEmpty() || emailField.getText().isEmpty()
                || averageField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Make sure all the fields are completed");
        }

        try {
            Integer.parseInt(idField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Make sure the student ID consists of only numbers");
            nameField.setText("");
            idField.setText("");
            emailField.setText("");
            averageField.setText("");
            return;
        }

        try {
            Integer.parseInt(averageField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Make sure the student average grade consists of only numbers");
            nameField.setText("");
            idField.setText("");
            emailField.setText("");
            averageField.setText("");
            return;
        }

        for (int i = 0; i < nameField.getText().length(); i++) {
            char current_char = nameField.getText().charAt(i);
            if (Character.isDigit(current_char)) {
                JOptionPane.showMessageDialog(this,
                        "Make sure the student name consists of only letters of the alphabet");
                nameField.setText("");
                idField.setText("");
                emailField.setText("");
                averageField.setText("");
                return;
            }
        }
        String data[] = { nameField.getText(), idField.getText(), emailField.getText(), averageField.getText() };
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(data);
        nameField.setText("");
        idField.setText("");
        emailField.setText("");
        averageField.setText("");
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Delete Selected Row
        int getSelectedRowForDeletion = table.getSelectedRow();
        System.out.println(getSelectedRowForDeletion);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        // Check if there is a row selected
        if (getSelectedRowForDeletion != -1) {
            model.removeRow(getSelectedRowForDeletion);
            JOptionPane.showMessageDialog(null, "Row Deleted");
        } else {
            JOptionPane.showMessageDialog(null, "No Row Highlighted");
        }
    }

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[][] tableData = getTableData(table);
        int numOfGrades = model.getRowCount();
        int[] grades = new int[numOfGrades];
        for (int i = 0; i < numOfGrades; i++) {
            String string = tableData[i][3].toString();
            int grade = Integer.parseInt(string);
            grades[i] = grade;
        }
        quickSort(grades, 0, grades.length - 1);

        model.setRowCount(0);

        for (int row = 0; row < tableData.length; row++) {
            Object data[] = { tableData[row][0], tableData[row][1], tableData[row][2], grades[row] };
            model.addRow(data);
        }
        JOptionPane.showMessageDialog(null, "Students have been sorted by grades");
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = (arr[high]);
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private Object[][] getTableData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int nRow = model.getRowCount(), nCol = model.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++)
            for (int j = 0; j < nCol; j++)
                tableData[i][j] = model.getValueAt(i, j);
        return tableData;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private javax.swing.JButton addButton;
    private javax.swing.JTextField averageField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton sortButton;
    private javax.swing.JTable table;

}
