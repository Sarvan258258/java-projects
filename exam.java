// import java.util.*;
// public class exam {
//     public static void main(String[] args) {
//         if(args.length == 0) {
//             System.out.println("Enter data through command line arguments\n");
//         }
//         else {
//             System.out.println(args[0] + args[1]);
//         }
//     }
// }

// import java.util.*;
// public class exam {
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str1 = sc.nextLine();
//         System.out.print("Enter another string: ");
//         String str2  = sc.nextLine();
//         System.out.println("The concatination is " + str1 + str2);

//     }
// }

// import java.util.*;
// public class exam {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter radius if circle: ");
//         int radius = sc.nextInt();
//         System.out.println("The perimeter of circle is : " + 2 * 3.14 * radius);
//         System.out.println("The radius of circle is : " + 3.14 * radius * radius);
//         sc.close();
//     }
// }


// import java.util.*;
// class Details {
//     String name;
//     int rollNo;
//     public Details(String name, int rollNo) {
//         this.name = name;
//         this.rollNo = rollNo;
//     }
//     public void getDetails(){
//         System.out.println("Name = " + this.name + "\nRoll no = " + this.rollNo);
//     }
// }
// public class exam {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name : ");
//         String name = sc.nextLine();
//         System.out.print("Enter your roll no : ");
//         int rollNo = sc.nextInt();

//         Details studentDetails1 = new Details(name, rollNo);
//         studentDetails1.getDetails();
//         sc.close();
//     }
// }


// import java.util.*;
// class Details {
//     String name;
//     int rollNo;
//     public Details(){
//         System.out.println("Default constructor called.");
//     }
//     public Details(String name, int rollNo) {
//        this();
//         this.name = name;
//         this.rollNo = rollNo;
//         System.out.println("Parametarized constructor called");
//     }
//     public void display(){
//         System.out.println("Name : " + this.name + "\nRoll No : " + this.rollNo);
//     }
// }
// public class exam {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name : ");
//         String name = sc.nextLine();
//         System.out.print("Enter your roll no : ");
//         int rollNo = sc.nextInt();

//         Details studentDetails1 = new Details(name, rollNo);
//         studentDetails1.display();
//         sc.close();
//     }
// }

// import java.util.*;

// public class exam {
//     public static boolean isPrime(int n) {
//         int count  = 0;
//         for(int i = 1; i <= n; i ++) {
//             if(n%i == 0) {
//                 count ++;
//             }
//         }
//         if(count == 2) {
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of the array : ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         System.out.print("Enter array elements : ");
//         for (int i = 0 ; i < size ; i ++) {
//             arr[i] = sc.nextInt();
//         }
//         int count = 0;
//         for(int i = 0 ; i < size ; i ++) {
//             if(arr[i]%2 != 0 && isPrime(arr[i])) {
//                 System.out.println(arr[i]);
//                 count ++;
//             }
//         }
//         if(count == 0) {
//             System.out.println("Not found");
//         }
//         sc.close();
//     }
// }

// import java.util.*;
// public class exam {
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         System.out.print("Enter no of financial year: ");
//         int m = sc.nextInt();
//         System.out.print("Enter no of items per year: ");
//         int n = sc.nextInt();
//         int arr[][] = new int[m][n];
//         for(int i = 0 ; i < m ; i ++) {
//             for (int j = 0 ; j < n ; j ++) {
//                 System.out.print("Enter no of items sold in " + (i+1) + " year of ID : " + (j+1) + ": ");
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int moreDemandedItem = arr[0][0];
//         int year = 0, id = 0;
//         for (int i = 0 ; i < m ; i ++) {
//             for (int j = 0 ; j < n ; j ++) {
//                 if(moreDemandedItem < arr[i][j]) {
//                     moreDemandedItem = arr[i][j];
//                     year = i;
//                     id = j;
//                 }
//             }
//         }
//         System.out.println("More demanded item sold in year " + (year+1) + " of ID : " + (id+1));
//         sc.close();
//     }
// }


// import java.util.*;
// class Box {
//     double width, height, depth;
//     public Box(double width, double height, double depth){
//         this.width = width;
//         this.height = height;
//         this.depth = depth;
//     }

//     public double caculateVolume(){
//         return this.depth * this.height * this.width;
//     }
// }

// public class exam {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter width of the box: ");
//         int width = sc.nextInt();
//         System.out.print("Enter height of the box: ");
//         int height = sc.nextInt();
//         System.out.print("Enter depth of the box: ");
//         int depth = sc.nextInt();

//         Box b1 = new Box(width, height, depth);
//         System.out.println("The volume : " + b1.caculateVolume());
//         sc.close();
//     }
// }

// import java.util.*;

// class Calculator {
//     public static int powerInt(int num1, int num2) {
//         return (int)Math.pow(num1, num2);
//     }
//     public static double powerDouble(double num1, double num2) {
//         return Math.pow(num1, num2);
//     }
// }
// public class exam{
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);

//         System.out.print("Enter number to calculate power of it: ");
//         double num = sc.nextDouble();
//         System.out.print("Enter its power: ");
//         double power = sc.nextDouble();
//         System.out.println(Calculator.powerInt((int)num, (int)power));
//         System.out.println(Calculator.powerDouble(num, power));

//         sc.close();
//     }
// }



// import java.util.*;
// public class exam {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a sentence: ");
//         String str  = sc.nextLine();
//         System.out.print("Enter the size of sub string: ");
//         int n = sc.nextInt();
//         int count = str.length()/n;
//         String  a[] = new String[count];
//         int j = 0, k = 0;
//         for(int i = 0 ; i < count ; i ++) {
//             a[j] = str.substring(k, k+n);
//             j++;
//             k = k +n;
//         }
//         System.out.print("Array Before sorting: ");
//         for(String i : a) {
//             System.out.print(i + " ");
//         }
//         sc.close();
//         Arrays.sort(a);
//         System.out.println();
//         System.out.print("Array after sorting: ");
//         for (String i: a) {
//             System.out.print(i + " ");
//         }
//     }
// }

// import java.util.*;

// public class exam {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of the array: ");
//         int size = sc.nextInt();
//         sc.nextLine();
//         String arr[] = new String[size];
//         for(int i = 0; i < size ; i ++) {
//             System.out.print("Enter String" + (i+1) + " : ");
//             arr[i] = sc.nextLine();
//         }

//         int vowelCount = 0;
//         int consonentCount = 0;
//         for(int i = 0 ; i < size ; i ++){
//             String str1 = arr[i];
//             for(int j = 0; j < str1.length(); j ++) {
//                 char c = str1.charAt(j);
//                 if(c == 'A'||c == 'a' || c == 'e' || c == 'E'|| c == 'I'||c == 'i' || c== 'O' ||c == 'o' || c== 'U' || c== 'u') {
//                     vowelCount++;
//                 } else {
//                     consonentCount++;
//                 }
//             }
//             System.out.println("No of vowels in " + str1 + " is : " + vowelCount);
//             System.out.println("No of consonents in " + str1 + " is " + consonentCount);
//             System.out.println("------------------------------------------------------");
//             vowelCount = 0;
//             consonentCount = 0;
//         }
//         sc.close();
//     }
// }




// import java.util.*;
// public class exam {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string1 : ");
//         String str1 = sc.nextLine();
//         System.out.print("Enter string2 : ");
//         String str2 = sc.nextLine();
//         char str3[] = str1.toCharArray();
//         char str4[] = str2.toCharArray();
//         Arrays.sort(str3);
//         Arrays.sort(str4);
//         Arrays.compare(str3, str4);
//         int count = 0;
//         for(int i = 0 ;i < str3.length; i ++) {
//             if(str3[i] == str4[i]) {
//                 count ++;
//             }
//         }
//         if(count == str3.length) {
//             System.out.println("The two strings are anagrams.");
//         } else {
//             System.out.println("The two strings are not anagrams.");
//         }
//         sc.close();
//     }
// }

// import java.util.*;
// public class exam {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Random rd = new Random();
//         System.out.print("Enter lower bound : ");
//         int lower = sc.nextInt();
//         System.out.print("Enter upper bouund : ");
//         int upper = sc.nextInt();
//         System.out.print("Enter how many numbers do you want : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0; i < n ; i ++) {
//             arr[i] = rd.nextInt(lower, upper);
//         }
//         System.out.print("Random numbers are : ");
//         for(int i : arr) {
//             System.out.print(i + " ");
//         }
//         sc.close();
//     }
// } 

// import java.awt.*;
// import javax.swing.*;

// public class exam extends JPanel implements Runnable {
//     private String message = "java programing";
//     private int x = 0;
//     private Thread thread;
//     public exam() {
//         setBackground(Color.WHITE);
//         setForeground(Color.red);
//         thread = new Thread(this);
//         thread.start();
//     }
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         g.drawString(message, x, 50);
//     }

//     public void run() {
//         while(true) {
//             x += 5;
//             if(x>=getWidth()) {
//                 x = -message.length() * 7;
//             }
//             repaint();
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
//     public static void main(String args[]) {
//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300,300);
//         frame.add(new exam());
//         frame.setVisible(true);

//     }

// }



// import java.awt.*;
// import javax.swing.*;
// import java.awt.event.*;

// public class exam{
//     public static void main(String args[]) {
//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300,300);
//         frame.setLayout(new GridLayout(4, 2, 20, 20));
//         JLabel nameLabel = new JLabel("Name :");
//         JTextField nameField = new JTextField();
        
//         JLabel genderLabel = new JLabel("Gender: ");
//         JPanel genderPanel  = new JPanel();
//         JRadioButton maleButton = new JRadioButton("Male");
//         JRadioButton femaleButton = new JRadioButton("Female");
//         ButtonGroup genderGroup = new ButtonGroup();
//         genderGroup.add(maleButton);
//         genderGroup.add(femaleButton);
//         genderPanel.add(femaleButton);
//         genderPanel.add(maleButton);

//         JLabel passwordLabel = new JLabel("password: ");
//         JPasswordField passwordField = new JPasswordField();

//         JButton submitButton = new JButton("Submit");
//         frame.add(nameLabel);
//         frame.add(nameField);
//         frame.add(passwordLabel);
//         frame.add(passwordField);
//         frame.add(genderLabel);
//         frame.add(genderPanel);
//         frame.add(new JPanel());
//         frame.add(submitButton);

//         submitButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 String name = nameField.getText();
//                 String password = new String(passwordField.getPassword());
//                 String gender  = maleButton.isSelected() ? "male" : " female";
//                 JOptionPane.showMessageDialog(frame, "name : " + name + "\npassword : " + password  +"\ngender : " + gender, "Registration Details", JOptionPane.INFORMATION_MESSAGE);
//             }
//         });
//         frame.setVisible(true);

//     }
// }

// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.event.MouseAdapter;
// import java.awt.event.MouseEvent;

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.SwingConstants;

// public class exam {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300,300);
//         frame.setLayout(new BorderLayout());
//         JLabel statusLabel = new JLabel("Interact with lable to see magic.");
//         statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
//         frame.add(statusLabel, BorderLayout.SOUTH);
//         JPanel drawingPanel = new JPanel();
//         drawingPanel.setBackground(Color.GRAY);
//         frame.add(drawingPanel, BorderLayout.CENTER);
//         drawingPanel.addMouseListener(new MouseAdapter() {
//             public void mouseClicked(MouseEvent e) {
//                 statusLabel.setText("Mouse clicked at (" + e.getX() + " , " + e.getY() + " )");
//             }
//             public void mouseEntered(MouseEvent e) { 
//                 statusLabel.setText("Mouse Entered");
//             }
//             public void mouseExited(MouseEvent e) {
//                 statusLabel.setText("Mouse Exited");
//             }
//             public void mousePressed(MouseEvent e) {
//                 statusLabel.setText("Mouse Pressed");
//             }
//         });

//         drawingPanel.addMouseMotionListener(new MouseAdapter() {
//             public void mouseMoved(MouseEvent e){
//                 statusLabel.setText("Mouse moved to (" + e.getX() + "," + e.getY() + ")");
//             }
//         });

//         frame.setVisible(true);

//     }
// }


// import java.awt.*;
// import javax.swing.*;
// import javax.swing.table.DefaultTableModel;


// public class exam {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300,300);
//         String columns[] = {"name", "roll no", "department"};
//         Object[][] data = {{"sarvan", 41, "CSE"},{"suahs", 47, "CSE"}};
//         JTable table = new JTable(new DefaultTableModel(data, columns));
//         JScrollPane jsp = new JScrollPane(table);
//         frame.add(jsp);
//         frame.setVisible(true);
//     }
// }


// import java.awt.*;
// import java.awt.event.MouseAdapter;
// import java.awt.event.MouseEvent;

// import javax.swing.*;

// public class exam {
//     static Point startPoint = null, endPoint = null;
//     static String selectedShape = "line";

//     public static void main(String args[]) {
//         JFrame frame = new JFrame();
       
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300,300);
//         frame.setLayout(new BorderLayout());



//         JRadioButton lineButton = new JRadioButton("line");
//         JRadioButton rectButton = new JRadioButton("rectangle");
//         JRadioButton ovalButton = new JRadioButton("oval");
//         ButtonGroup group = new ButtonGroup();
//         group.add(lineButton);
//         group.add(rectButton);
//         group.add(ovalButton);
//         JPanel controlPanel = new JPanel();
//         controlPanel.setLayout(new FlowLayout());
//         controlPanel.add(lineButton);
//         controlPanel.add(rectButton);
//         controlPanel.add(ovalButton);
//         frame.add(controlPanel, BorderLayout.NORTH);
//         lineButton.setSelected(true);

//         JPanel drawingPanel = new JPanel() {
//             protected void paintComponent(Graphics g){
//                 super.paintComponent(g);
//                 if(startPoint != null && endPoint != null) {
//                     Graphics2D g2d = (Graphics2D) g;
//                     g2d.setStroke(new BasicStroke(2));
//                     switch(selectedShape) {
//                         case "line" : g2d.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
//                                         break;
//                         case "rectangle" : 
//                                     int rectX = Math.min(startPoint.x, endPoint.x);
//                                     int rectY = Math.min(startPoint.y, endPoint.y);
//                                     int rectWidth = Math.abs(endPoint.x - startPoint.x);
//                                     int rectheight = Math.abs(endPoint.y - startPoint.y);
//                                     g2d.drawRect(rectX, rectY, rectWidth, rectheight); 
//                                     break;
//                         case "oval" : 
//                                     int ovalX = Math.min(startPoint.x, endPoint.x);
//                                     int ovalY = Math.min(startPoint.y, endPoint.y);
//                                     int ovalWidth = Math.abs(endPoint.x - startPoint.x);
//                                     int ovalheight = Math.abs(endPoint.y - startPoint.y);
//                                     g2d.drawOval(ovalX, ovalY, ovalWidth, ovalheight); 
//                                     break;
//                     }
//                 }
//             }

//         };

//         drawingPanel.setBackground(Color.WHITE);
//         frame.add(drawingPanel, BorderLayout.CENTER);
//         drawingPanel.addMouseListener(new MouseAdapter() {
//             public void mousePressed(MouseEvent e) {
//                 startPoint = e.getPoint();
//             }
//             public void mouseReleased(MouseEvent e) {
//                 endPoint = e.getPoint();
//                 drawingPanel.repaint();
//             }
//         });
//         lineButton.addActionListener(e->selectedShape = "line");
//         rectButton.addActionListener(e->selectedShape = "rectangle");
//         ovalButton.addActionListener(e->selectedShape = "oval");
//         frame.setVisible(true);
//     }
// }





// import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.List;
// import java.util.ArrayList;


// public class exam {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.print("Enter the elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Calculate frequencies using a HashMap
//         HashMap<Integer, Integer> frequencyMap = new HashMap<>();
//         for (int num : arr) {
//             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//         }

//         // Convert the frequency map to a list of entries
//         List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(frequencyMap.entrySet());
//         //sort the frequencies
//          freqList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

//         // Print the sorted frequencies
//         System.out.println("Number frequencies in order of occurrences:");
//         for (Map.Entry<Integer, Integer> entry : freqList) {
//             System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
//         }

//         sc.close();
//     }
// }



// import javax.swing.*;
// import javax.swing.table.DefaultTableModel;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// public class exam extends JFrame {
//     private JTable table;
//     private DefaultTableModel tableModel;

//     public exam() {
//         setTitle("Employee Data Viewer");
//         setSize(800, 600);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         JButton openButton = new JButton("Open CSV File");
//         openButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 JFileChooser fileChooser = new JFileChooser();
//                 int result = fileChooser.showOpenDialog(null);
//                 if (result == JFileChooser.APPROVE_OPTION) {
//                     File selectedFile = fileChooser.getSelectedFile();
//                     readCSVFile(selectedFile);
//                 }
//             }
//         });

//         tableModel = new DefaultTableModel();
//         table = new JTable(tableModel);
//         JScrollPane scrollPane = new JScrollPane(table);

//         add(openButton, BorderLayout.NORTH);
//         add(scrollPane, BorderLayout.CENTER);
//     }

//     private void readCSVFile(File file) {
//         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//             String line;
//             Map<String, List<String[]>> departmentData = new HashMap<>();
//             String[] headers = br.readLine().split(",");
//             while ((line = br.readLine()) != null) {
//                 String[] data = line.split(",");
//                 String department = data[2]; // Assuming department is the third column
//                 departmentData.computeIfAbsent(department, k -> new ArrayList<>()).add(data);
//             }
//             displayData(departmentData, headers);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     private void displayData(Map<String, List<String[]>> departmentData, String[] headers) {
//         tableModel.setRowCount(0);
//         tableModel.setColumnIdentifiers(headers);
//         for (Map.Entry<String, List<String[]>> entry : departmentData.entrySet()) {
//             String department = entry.getKey();
//             List<String[]> records = entry.getValue();
//             for (String[] record : records) {
//                 tableModel.addRow(record);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new exam().setVisible(true);
//             }
//         });
//     }
// }

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class exam extends JFrame implements ActionListener {
    private JTable table;
    private DefaultTableModel model;
    private JButton openButton;

    public exam() {
        setTitle("Employee Data Viewer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] columnNames = {"ID", "Name", "Age", "Department"};
        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
       // table.setFillsViewportHeight(true);
        add(scrollPane, BorderLayout.CENTER);

        openButton = new JButton("Open CSV File");
        openButton.addActionListener(this);
        add(openButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openButton) {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                readCSVFile(selectedFile);
            }
        }
    }

    private void readCSVFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            List<Object[]> data = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }
            updateTable(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateTable(List<Object[]> data) {
        model.setRowCount(0); // Clear existing data
        for (Object[] row : data) {
            model.addRow(row);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(exam::new);
    }
}