
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author colee
 */
public class AddPerson extends javax.swing.JFrame {
    
    public AddPerson() {
        initComponents();
        loadDataFromFile();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveDataToFile();  // Save data to file when the window is closing
            }
        });
    }

    public void receiveData(String[] data) {
    }
    
   
 
public abstract class User {
    protected String name;
    protected String[] userNames;

    public User(String name, String[] userNames) {
        this.name = name;
        this.userNames = userNames;
    }
    
  

    public abstract void processButton(JButton button, int buttonIndex);
    {}
}

public class User1 extends User {
    public User1(String name, String[] userNames) {
        super(name, userNames);
    }
    
       private void openAddTaskForm(String dataFileName) {
        AddTask1 addTaskForm = new AddTask1(dataFileName);
        addTaskForm.setVisible(true);
    }
     
    @Override
    public void processButton(JButton button, int buttonIndex) {
        if (button.getText().isEmpty()) {
            // Show an input dialog to input a name
            String enteredName = JOptionPane.showInputDialog(button, "Enter your name:");

            // Update the button and userNames array with the entered name
            if (enteredName != null && !enteredName.isEmpty()) {
                button.setText(enteredName);
                userNames[buttonIndex - 1] = enteredName;
            }
        } else {
            // If the button is not empty, show a message with the existing name
            String file = "data" + buttonIndex + ".txt";
            openAddTaskForm(file);
            close();
        }
    }

}

public class User2 extends User {
    public User2(String name, String[] userNames) {
        super(name, userNames);
    }
    
       private void openAddTaskForm(String dataFileName) {
        AddTask1 addTaskForm = new AddTask1(dataFileName);
        addTaskForm.setVisible(true);
    }
     
    @Override
    public void processButton(JButton button, int buttonIndex) {
        if (button.getText().isEmpty()) {
            // Show an input dialog to input a name
            String enteredName = JOptionPane.showInputDialog(button, "Enter your name:");

            // Update the button and userNames array with the entered name
            if (enteredName != null && !enteredName.isEmpty()) {
                button.setText(enteredName);
                userNames[buttonIndex - 1] = enteredName;
            }
        } else {
            // If the button is not empty, show a message with the existing name
            String file = "data" + buttonIndex + ".txt";
            openAddTaskForm(file);
            close();
        }
    }

}

public class User3 extends User {
    public User3(String name, String[] userNames) {
        super(name, userNames);
    }
    
       private void openAddTaskForm(String dataFileName) {
        AddTask1 addTaskForm = new AddTask1(dataFileName);
        addTaskForm.setVisible(true);
    }
     
    @Override
    public void processButton(JButton button, int buttonIndex) {
        if (button.getText().isEmpty()) {
            // Show an input dialog to input a name
            String enteredName = JOptionPane.showInputDialog(button, "Enter your name:");

            // Update the button and userNames array with the entered name
            if (enteredName != null && !enteredName.isEmpty()) {
                button.setText(enteredName);
                userNames[buttonIndex - 1] = enteredName;
            }
        } else {
            // If the button is not empty, show a message with the existing name
            String file = "data" + buttonIndex + ".txt";
            openAddTaskForm(file);
            close();
        }
    }

}

public class User4 extends User {
    public User4(String name, String[] userNames) {
        super(name, userNames);
    }
    
       private void openAddTaskForm(String dataFileName) {
        AddTask1 addTaskForm = new AddTask1(dataFileName);
        addTaskForm.setVisible(true);
    }
     
    @Override
    public void processButton(JButton button, int buttonIndex) {
        if (button.getText().isEmpty()) {
            // Show an input dialog to input a name
            String enteredName = JOptionPane.showInputDialog(button, "Enter your name:");

            // Update the button and userNames array with the entered name
            if (enteredName != null && !enteredName.isEmpty()) {
                button.setText(enteredName);
                userNames[buttonIndex - 1] = enteredName;
            }
        } else {
            // If the button is not empty, show a message with the existing name
            String file = "data" + buttonIndex + ".txt";
            openAddTaskForm(file);
            close();
        }
    }

}

public class User5 extends User {
    public User5(String name, String[] userNames) {
        super(name, userNames);
    }
    
       private void openAddTaskForm(String dataFileName) {
        AddTask1 addTaskForm = new AddTask1(dataFileName);
        addTaskForm.setVisible(true);
    }
     
    @Override
    public void processButton(JButton button, int buttonIndex) {
        if (button.getText().isEmpty()) {
            // Show an input dialog to input a name
            String enteredName = JOptionPane.showInputDialog(button, "Enter your name:");

            // Update the button and userNames array with the entered name
            if (enteredName != null && !enteredName.isEmpty()) {
                button.setText(enteredName);
                userNames[buttonIndex - 1] = enteredName;
            }
        } else {
            // If the button is not empty, show a message with the existing name
            String file = "data" + buttonIndex + ".txt";
            openAddTaskForm(file);
            close();
        }
    }

}

public class User6 extends User {
    public User6(String name, String[] userNames) {
        super(name, userNames);
    }
    
       private void openAddTaskForm(String dataFileName) {
        AddTask1 addTaskForm = new AddTask1(dataFileName);
        addTaskForm.setVisible(true);
    }
     
    @Override
    public void processButton(JButton button, int buttonIndex) {
        if (button.getText().isEmpty()) {
            // Show an input dialog to input a name
            String enteredName = JOptionPane.showInputDialog(button, "Enter your name:");

            // Update the button and userNames array with the entered name
            if (enteredName != null && !enteredName.isEmpty()) {
                button.setText(enteredName);
                userNames[buttonIndex - 1] = enteredName;
            }
        } else {
            // If the button is not empty, show a message with the existing name
            String file = "data" + buttonIndex + ".txt";
            openAddTaskForm(file);
            close();
        }
    }

}

public class User7 extends User {
    public User7(String name, String[] userNames) {
        super(name, userNames);
    }
    
       private void openAddTaskForm(String dataFileName) {
        AddTask1 addTaskForm = new AddTask1(dataFileName);
        addTaskForm.setVisible(true);
    }
     
    @Override
    public void processButton(JButton button, int buttonIndex) {
        if (button.getText().isEmpty()) {
            // Show an input dialog to input a name
            String enteredName = JOptionPane.showInputDialog(button, "Enter your name:");

            // Update the button and userNames array with the entered name
            if (enteredName != null && !enteredName.isEmpty()) {
                button.setText(enteredName);
                userNames[buttonIndex - 1] = enteredName;
            }
        } else {
            // If the button is not empty, show a message with the existing name
            String file = "data" + buttonIndex + ".txt";
            openAddTaskForm(file);
            close();
        }
    }

}

public class User8 extends User {
    public User8(String name, String[] userNames) {
        super(name, userNames);
    }
    
       private void openAddTaskForm(String dataFileName) {
        AddTask1 addTaskForm = new AddTask1(dataFileName);
        addTaskForm.setVisible(true);
    }
     
    @Override
    public void processButton(JButton button, int buttonIndex) {
        if (button.getText().isEmpty()) {
            // Show an input dialog to input a name
            String enteredName = JOptionPane.showInputDialog(button, "Enter your name:");

            // Update the button and userNames array with the entered name
            if (enteredName != null && !enteredName.isEmpty()) {
                button.setText(enteredName);
                userNames[buttonIndex - 1] = enteredName;
            }
        } else {
            // If the button is not empty, show a message with the existing name
            String file = "data" + buttonIndex + ".txt";
            openAddTaskForm(file);
            close();
        }
    }

}

public class User9 extends User {
    public User9(String name, String[] userNames) {
        super(name, userNames);
    }
    
       private void openAddTaskForm(String dataFileName) {
        AddTask1 addTaskForm = new AddTask1(dataFileName);
        addTaskForm.setVisible(true);
    }
     
    @Override
    public void processButton(JButton button, int buttonIndex) {
        if (button.getText().isEmpty()) {
            // Show an input dialog to input a name
            String enteredName = JOptionPane.showInputDialog(button, "Enter your name:");

            // Update the button and userNames array with the entered name
            if (enteredName != null && !enteredName.isEmpty()) {
                button.setText(enteredName);
                userNames[buttonIndex - 1] = enteredName;
            }
        } else {
            // If the button is not empty, show a message with the existing name
            String file = "data" + buttonIndex + ".txt";
            openAddTaskForm(file);
            close();
        }
    }

}

public class User10 extends User {
    public User10(String name, String[] userNames) {
        super(name, userNames);
    }
    
       private void openAddTaskForm(String dataFileName) {
        AddTask1 addTaskForm = new AddTask1(dataFileName);
        addTaskForm.setVisible(true);
    }
     
    @Override
    public void processButton(JButton button, int buttonIndex) {
        if (button.getText().isEmpty()) {
            // Show an input dialog to input a name
            String enteredName = JOptionPane.showInputDialog(button, "Enter your name:");

            // Update the button and userNames array with the entered name
            if (enteredName != null && !enteredName.isEmpty()) {
                button.setText(enteredName);
                userNames[buttonIndex - 1] = enteredName;
            }
        } else {
            // If the button is not empty, show a message with the existing name
            String file = "data" + buttonIndex + ".txt";
            openAddTaskForm(file);
            close();
        }
    }

}
    private void showUserMessage(int index) {
    switch(index){
        case 1:
        JOptionPane.showMessageDialog(null, "User " + b1.getText() + " has been removed.");
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "User " + b2.getText() + " has been removed.");
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "User " + b3.getText() + " has been removed.");
        break;
        case 4:
        JOptionPane.showMessageDialog(null, "User " + b4.getText() + " has been removed.");
        break;
        case 5:
        JOptionPane.showMessageDialog(null, "User " + b5.getText() + " has been removed.");
        break;
        case 6:
        JOptionPane.showMessageDialog(null, "User " + b6.getText() + " has been removed.");
        break;
        case 7:
        JOptionPane.showMessageDialog(null, "User " + b7.getText() + " has been removed.");
        break;
        case 8:
        JOptionPane.showMessageDialog(null, "User " + b8.getText() + " has been removed.");
        break;
        case 9:
        JOptionPane.showMessageDialog(null, "User " + b9.getText() + " has been removed.");
        break;
        case 10:
        JOptionPane.showMessageDialog(null, "User " + b10.getText() + " has been removed.");
        break;
    }
}

    private void clearDataForRange(int start, int end) {
    for (int i = start; i <= end; i++) {
        clearFile("data" + i + ".txt");
        System.out.println("Content of 'data" + i + ".txt' cleared.");
    }
}
              
     public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
     private void deletePersonAtIndex(int index) {
    // Read all lines from the file
    List<String> lines;
    try {
        lines = Files.readAllLines(Paths.get("data1.txt"), StandardCharsets.UTF_8);
    } catch (IOException e) {
        e.printStackTrace(); // Handle the exception according to your needs
        return;
    }

    // Remove the line corresponding to the selected user
    if (index < lines.size()) {
        lines.remove(index);

        // Write the modified lines back to the file
        try {
            Files.write(Paths.get("data1.txt"), lines, StandardCharsets.UTF_8);
            System.out.println("User at index " + index + " deleted.");
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }
    } else {
        System.out.println("Invalid index: " + index);
    }
}
     
   private void clearFile(String filePath) {
    // Clear the entire content of the file
    try {
        Files.write(Paths.get(filePath), new ArrayList<>(), StandardCharsets.UTF_8);
    } catch (IOException e) {
        e.printStackTrace(); // Handle the exception according to your needs
    }
}
    
private void saveDataToFile() {
    try {
        // Specify the path to your text file
        String filePath = "usernames3.txt";
        getName();
        
        String input = b1.getText();
        // Create a FileWriter object with the specified file path
        FileWriter fileWriter = new FileWriter(filePath, false); // 'false' to overwrite the file
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Write the usernames to the file using a different delimiter
        bufferedWriter.write(input + ";" + b2.getText() + ";" + b3.getText() + ";" +
                             b4.getText() + ";" + b5.getText() + ";" + b6.getText() + ";" +
                             b7.getText() + ";" + b8.getText() + ";" + b9.getText() + ";" +
                             b10.getText());

        bufferedWriter.newLine(); // Add a newline character to separate entries

        // Close the BufferedWriter
        bufferedWriter.close();

        // Optionally show a success message
        JOptionPane.showMessageDialog(null, "Data saved successfully");

    } catch (IOException ex) {
        // Handle the exception appropriately, e.g., print the stack trace or show an error message
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error saving data to file");
    }
}

private void loadDataFromFile() {
    try {
        // Specify the path to your text file
        String filePath = "usernames3.txt";

        // Create a FileReader object with the specified file path
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Read the line from the file
        String line = bufferedReader.readLine();

        // Check if the line is not null
        if (line != null) {
            // Split the line into individual usernames using a different delimiter
            String[] usernames = line.split(";");

            // Iterate over the buttons and set the usernames
            for (int i = 0; i < Math.min(usernames.length, 10); i++) {
                switch (i) {
                    case 0:
                        b1.setText(usernames[i]);
                        break;
                    case 1:
                        b2.setText(usernames[i]);
                        break;
                    case 2:
                        b3.setText(usernames[i]);
                        break;
                    case 3:
                        b4.setText(usernames[i]);
                        break;
                    case 4:
                        b5.setText(usernames[i]);
                        break;
                    case 5:
                        b6.setText(usernames[i]);
                        break;
                    case 6:
                        b7.setText(usernames[i]);
                        break;
                    case 7:
                        b8.setText(usernames[i]);
                        break;
                    case 8:
                        b9.setText(usernames[i]);
                        break;
                    case 9:
                        b10.setText(usernames[i]);
                        break;
                    default:
                        break;
                }
            }
        }

        // Close the BufferedReader
        bufferedReader.close();

    } catch (IOException e) {
        // Handle the exception appropriately, e.g., print the stack trace or show an error message
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading data from file");
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        deletePerson = new javax.swing.JComboBox<>();
        editName = new javax.swing.JComboBox<>();
        insertdata = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        b1.setBackground(new java.awt.Color(51, 51, 51));
        b1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(51, 51, 51));
        b2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(51, 51, 51));
        b3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(51, 51, 51));
        b4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(51, 51, 51));
        b5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(51, 51, 51));
        b6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(51, 51, 51));
        b7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(51, 51, 51));
        b8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(51, 51, 51));
        b9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.setBackground(new java.awt.Color(51, 51, 51));
        b10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        b10.setForeground(new java.awt.Color(255, 255, 255));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deletePerson.setBackground(new java.awt.Color(51, 51, 51));
        deletePerson.setForeground(new java.awt.Color(255, 255, 255));
        deletePerson.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delete User", "User 1", "User 2", "User 3", "User 4", "User 5", "User 6", "User 7", "User 8", "User 9", "User 10", "Delete All" }));
        deletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonActionPerformed(evt);
            }
        });

        editName.setBackground(new java.awt.Color(51, 51, 51));
        editName.setForeground(new java.awt.Color(255, 255, 255));
        editName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clear Name", "User 1", "User 2", "User 3", "User 4", "User 5", "User 6", "User 7", "User 8", "User 9", "User 10", "Clear all" }));
        editName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNameActionPerformed(evt);
            }
        });

        insertdata.setBackground(new java.awt.Color(51, 51, 51));
        insertdata.setForeground(new java.awt.Color(255, 255, 255));
        insertdata.setText("Save Data");
        insertdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertdataActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(deletePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(insertdata, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(deletePerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertdata)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private int buttonCounter = 0;
  private final String[] userNames = new String[10];
  
 
  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     // Load existing names from buttons
    boolean allButtonsOccupied = true;
    for (String userName : userNames) {
        if (userName == null || userName.isEmpty()) {
            allButtonsOccupied = false;
            break;
        }
    }

    if (allButtonsOccupied) {
        JOptionPane.showMessageDialog(this, "Maximum limit reached. Cannot add more names.");
        return;
    }
    
for (int i = 0; i < userNames.length; i++) {
    switch (i) {
        case 0:
            userNames[i] = b1.getText();
            break;
        case 1:
            userNames[i] = b2.getText();
            break;
        case 2:
            userNames[i] = b3.getText();
            break;
        case 3:
            userNames[i] = b4.getText();
            break;
        case 4:
            userNames[i] = b5.getText();
            break;
        case 5:
            userNames[i] = b6.getText();
            break;
        case 6:
            userNames[i] = b7.getText();
            break;
        case 7:
            userNames[i] = b8.getText();
            break;
        case 8:
            userNames[i] = b9.getText();
            break;
        case 9:
            userNames[i] = b10.getText();
            break;
        default:
            JOptionPane.showInputDialog(this, "You have reached maximum limit of users");
            break;
    }
}

// Find the next empty button and proceed
for (int i = 0; i < userNames.length; i++) {
    if (userNames[i] == null || userNames[i].isEmpty()) {
        userNames[i] = JOptionPane.showInputDialog(this, "Enter your name:");

        // Check if the entered name is not empty
        if (userNames[i] != null && !userNames[i].isEmpty()) {
            switch (i) {
                case 0:
                    b1.setText(userNames[i]);
                    break;
                case 1:
                    b2.setText(userNames[i]);
                    break;
                case 2:
                    b3.setText(userNames[i]);
                    break;
                case 3:
                    b4.setText(userNames[i]);
                    break;
                case 4:
                    b5.setText(userNames[i]);
                    break;
                case 5:
                    b6.setText(userNames[i]);
                    break;
                case 6:
                    b7.setText(userNames[i]);
                    break;
                case 7:
                    b8.setText(userNames[i]);
                    break;
                case 8:
                    b9.setText(userNames[i]);
                    break;
                case 9:
                    b10.setText(userNames[i]);
                    break;
                default:
            JOptionPane.showInputDialog(this, "You have reached maximum limit of users");
            break;
            }
            break; // Break out of the loop once an empty button is found and processed
        } else {
            break;
        }
    }
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
       User9 user9 = new User9(b9.getText(),userNames);
    user9.processButton(b9, 9);
    }//GEN-LAST:event_b9ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
    User8 user8 = new User8(b8.getText(),userNames);
    user8.processButton(b8, 8);
    }//GEN-LAST:event_b8ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
    User10 user10 = new User10(b10.getText(),userNames);
    user10.processButton(b10, 10);
    }//GEN-LAST:event_b10ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
    User5 user5 = new User5(b5.getText(),userNames);
    user5.processButton(b5, 5);
    }//GEN-LAST:event_b5ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
    User7 user7 = new User7(b7.getText(),userNames);
    user7.processButton(b7, 7);
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
    User6 user6 = new User6(b1.getText(),userNames);
    user6.processButton(b6, 6);
    }//GEN-LAST:event_b6ActionPerformed
 /*class User1 extends User{  
               public User1(String name, String[] data) {
                    super(name, data);
                    this.name=enteredName;
                    this.taskComponents=data;
                 }
            }*/
    
    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    User1 user1 = new User1(b1.getText(),userNames);
    user1.processButton(b1, 1);
    
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
     User2 user2 = new User2(b2.getText(),userNames);
    user2.processButton(b2, 2);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
    User3 user3 = new User3(b3.getText(),userNames);
    user3.processButton(b3, 3);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
    User4 user4 = new User4(b4.getText(),userNames);
    user4.processButton(b4, 4);
    }//GEN-LAST:event_b4ActionPerformed

    private void insertdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertdataActionPerformed
saveDataToFile();
    }//GEN-LAST:event_insertdataActionPerformed

    private void editNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNameActionPerformed
        int editNameValue = editName.getSelectedIndex();
        switch(editNameValue){
            case 1:
                b1.setText("");
                break;
            case 2:
                b2.setText("");
                break;
            case 3:
                b3.setText("");
                break;
            case 4:
                b4.setText("");
                break;
            case 5:
                b5.setText("");
                break;    
            case 6:
                b6.setText("");
                break;
             case 7:
                b7.setText("");
                break;
             case 8:
                b8.setText("");
                break;
            case 9:
                b9.setText("");
                break;
            case 10:
                b10.setText("");
                break;
            case 11:
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                b10.setText("");
                JOptionPane.showMessageDialog(null,"All Names are Cleared");
             break;      
        }
    }//GEN-LAST:event_editNameActionPerformed

    private void deletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonActionPerformed
   // Clears content based on selected button
    int selectedButtonIndex = deletePerson.getSelectedIndex();

    switch (selectedButtonIndex) {
    case 1:
        clearFile("data1.txt");
        showUserMessage(1);
        b1.setText("");
        break;
    case 2:
        clearFile("data2.txt");
        showUserMessage(2);
        b2.setText("");
        break;
    case 3:
        clearFile("data3.txt");
        showUserMessage(3);
        b3.setText("");
        break;
    case 4:
        clearFile("data4.txt");
        showUserMessage(4);
        b4.setText("");
        break;
    case 5:
        clearFile("data5.txt");
        showUserMessage(5);
        b5.setText("");
        break;
    case 6:
        clearFile("data6.txt");
        showUserMessage(6);
        b6.setText("");
        break;
    case 7:
        clearFile("data7.txt");
        showUserMessage(7);
        b7.setText("");
        break;
    case 8:
        clearFile("data8.txt");
        showUserMessage(8);
        b8.setText("");
        break;
    case 9:
        clearFile("data9.txt");
        showUserMessage(9);
        b9.setText("");
        break;
    case 10:
        clearFile("data10.txt");
        showUserMessage(10);
        b10.setText("");
        break;
    case 11:
        clearDataForRange(1, 10); // Clear data for cases 1 to 10
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            b10.setText("");
        JOptionPane.showMessageDialog(null, "All data is Cleared");
        break;
    default:
        JOptionPane.showMessageDialog(null, "Invalid index: " + selectedButtonIndex);
        break;
}


    }//GEN-LAST:event_deletePersonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      //go back to main menu
      Main_Menu mm = new Main_Menu();
       mm.setVisible(true);
       close();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
          new AddPerson().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JComboBox<String> deletePerson;
    private javax.swing.JComboBox<String> editName;
    private javax.swing.JButton insertdata;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
