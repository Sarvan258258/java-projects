// import java.util.*;

// class MyArrayList {
//     private int arr[];
//     private int size;

//     public MyArrayList() {
//         arr = new int[10];
//         size = 0;
//     }

//     public void add(int element) {
//         if(size == arr.length) {
//             arr = Arrays.copyOf(arr, arr.length*2);
//         } else {
//             arr[size++] = element;
//         }
//     }

//     public int  get(int index) {
//         if(index >= size && index < 0) {
//            throw new ArrayIndexOutOfBoundsException();
//         } 
//             return arr[index];
//     }

//     public void remove(int index) {
//         if(index >= size && index < 0) {
//             System.out.println("Array index out of bound");
//         } else {
//             for(int i = index; i < size-1; i++) {
//                 arr[i] = arr[i+1];
//             }
//             size--;
//         }
//     }

//     public int size()  {
//         return size;
//     }
//     public String toString() {
//         int result[] = Arrays.copyOf(arr, size);
//         return Arrays.toString(result);
//     }
// }

// public class swings {
//     public static void main(String[] args) {
//         MyArrayList list = new MyArrayList();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.remove(8);
//         System.out.println(list.size());
//         System.out.println(list);

//     }
// }


// import java.io.*;
// import java.net.*;

// public class demo {
//     public static void main(String[] args) {
//         try (Socket socket = new Socket("localhost", 12345)) {
//             InputStream input = socket.getInputStream();
//             BufferedReader reader = new BufferedReader(new InputStreamReader(input));

//             OutputStream output = socket.getOutputStream();
//             PrintWriter writer = new PrintWriter(output, true);

//             BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
//             String message;
//             while ((message = consoleReader.readLine()) != null) {
//                 writer.println(message);
//                 System.out.println("Received from server: " + reader.readLine());
//             }

//             socket.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }



// import java.awt.*;
// import javax.swing.*;

// public class demo extends JPanel implements Runnable {
//     private String message = "Hell World";
//     private int x = 5;
//     Thread thread;

//     public demo() {
//         setBackground(Color.DARK_GRAY);
//         setForeground(Color.red);
//         thread = new Thread(this);
//         thread.start();
//     }

//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         g.drawString(message, x, 50);
//     }

//     public void run() {
//         while (true) {
//             x += 5;
//             if (x > getWidth()) {
//                 x = -message.length()*3;
//             }
//             repaint();
//             try {
//                 Thread.sleep(100);
//             } catch(InterruptedException e) {
//                 System.out.println(e.getLocalizedMessage());
//             }
//         }
//     }

//     public static void main(String args[]) {
//         JFrame frame = new JFrame();
//         frame.setSize(300,300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.add(new demo());

//         frame.setVisible(true);
//     }

// }

// import java.awt.*;
// import javax.swing.*;

// public class demo  {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame();
//         frame.setSize(300,300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLayout(new GridLayout(6,2,10,10));

//         JLabel nameLabel = new JLabel("Name");
//         JTextField nameField = new JTextField();

//         JLabel  emailLabel = new JLabel("Email");
//         JTextField emailField = new JTextField();

//         JLabel passwordLabel = new JLabel("Password");
//         JPasswordField passwordField = new JPasswordField();

//         JLabel genderLabel = new JLabel("Gender");

//         JPanel panel = new JPanel();
//         JRadioButton maleButton = new JRadioButton("Male");
//         JRadioButton femaleButton = new JRadioButton("Female");
//         ButtonGroup genderGroup = new ButtonGroup();
//         genderGroup.add(maleButton);
//         genderGroup.add(femaleButton);
//         panel.add(maleButton);
//         panel.add(femaleButton);

//         JLabel countryLabel = new JLabel("Country");
//         JComboBox<String> options = new JComboBox<>(new String[] {"India", "Africa", "China", "Japan"});

//         JButton submitButton  = new JButton("submit");

//         frame.add(nameLabel);
//         frame.add(nameField);

//         frame.add(emailLabel);
//         frame.add(emailField);

//         frame.add(passwordLabel);
//         frame.add(passwordField);

//         frame.add(genderLabel);
//         frame.add(panel);

//         frame.add(countryLabel);
//         frame.add(options);

//         frame.add(new JLabel());
//         frame.add(submitButton);

//         frame.setVisible(true);

//     }
// }

//                 // programe using isAlive() method.

// public class demo extends Thread {
//     public void run() {
//         try {
//             Thread.sleep(3000);
//             System.out.println("Is run() method is alive: " + Thread.currentThread().isAlive());
//         } catch (InterruptedException e) {
//             System.out.println("Error : " + e.getMessage());
//         }
//     }
//     public static void main(String[] args) {
//         demo d = new demo();
//         System.out.println("Before starting the thread is alive: " + d.isAlive());
//         d.start();
//         System.out.println("After starting the thread is alive: " + d.isAlive());
//     }
// }

//                     //using join()



// class A extends Thread {
//     public void run()
//     {
//         for(int i=0;i<=5;i++)
//         {
//             try {
//                 Thread.sleep(200);
//             } catch (InterruptedException e) {
//                 System.out.println(e.getMessage());
//             }
//             System.out.println("Thread A" + i);
//         }
//         System.out.println("Exit from thread A.");
//     }
// }
// class B extends Thread {
//     public void run() {
//         for(int i = 0;i <= 5;i++)  {
//             try {
//                 Thread.sleep(200);
//             } catch (InterruptedException e) {
//                 System.out.println(e.getMessage());
//             }
//             System.out.println("thread B: " +i);
//         }
//         System.out.println("Exit form B.");
//     }
// }
// class C extends Thread {
//     public void run() {
//         for(int i = 0;i <= 5;i++)  {
//             try {
//                 Thread.sleep(200);
//             } catch (InterruptedException e) {
//                 System.out.println(e.getMessage());
//             }
//             System.out.println("thread c: " + i);
//         }
//         System.out.println("Exit form c.");
//     }
// }
// public class demo {
//     public static void main(String[] args) {
//         A a = new A();
//         B b = new B();
//         C c = new C();
//         System.out.println("Before starting the thread is alive: " + a.isAlive());
//         a.start();
//         System.out.println("Before starting the thread is alive: " + a.isAlive());
//         try {
//             a.join();
//         } catch(InterruptedException e) {
//             System.out.println(e.getMessage());
//         }
//         b.start();
//         try {
//             b.join();
//         } catch(InterruptedException e) {
//             System.out.println(e.getMessage());
//         }
//         c.start();
//     }
// }



















// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.io.IOException;

// public class demo {
//     public static void main(String[] args) {
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//         OutputStreamWriter writer = new OutputStreamWriter(System.out);
//         System.out.println("Enter some text:");

//         try {
//             String input = reader.readLine();
//             writer.write("You entered: " + input + "\n");
//             writer.flush();  // Ensure the data is written to the console
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// 

// import java.awt.*;
// import javax.swing.*;

// public class demo {
//     public static void main(String args[]) {
//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
//         frame.setSize(300,300);
//         frame.setLayout(new BorderLayout());

//         JPanel panel = new JPanel();
//         panel.setLayout(new GridLayout(3,0,10,10));

//         JLabel label = new JLabel("Enter a number greater than 9");

//         JTextField tfield = new JTextField();

//         JButton button = new JButton("Submit");

//         panel.add(label);
//         panel.add(tfield);
//         panel.add(button);

//         frame.add(panel,BorderLayout.CENTER);
//         button.addActionListener(e -> {
//             String str = tfield.getText();
//             int num = 0;
//             for(int i = 0 ; i < str.length() ; i ++)  {
//                 num = num + (int)str.charAt(i);
//             }
//             tfield.setText("" + num +"");
//         });
//         frame.setVisible(true);

//     }

// }

// import java.awt.*;
// import javax.swing.*;

// public class demo {
//     public static void main(String args[]) {
//         JFrame frame = new JFrame("Number Sum Calculator");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300, 300);
//         frame.setLayout(new BorderLayout());

//         JPanel panel = new JPanel();
//         panel.setLayout(new GridLayout(3, 1, 10, 10));

//         JLabel label = new JLabel("Enter a number greater than 9", SwingConstants.CENTER);
//         JTextField tfield = new JTextField();
//         JButton button = new JButton("Submit");

//         panel.add(label);
//         panel.add(tfield);
//         panel.add(button);

//         frame.add(panel, BorderLayout.CENTER);

//         button.addActionListener(e -> {
//                 String str = tfield.getText();
//                 try{
//                     long num = Long.parseLong(str);
//                 if (num <= 9) {
//                     tfield.setText("Number must be greater than 9");
//                 } else {
//                     long sum = 0;
//                     while (num != 0) {
//                         sum = sum + num % 10;
//                         num = num / 10;
//                     }
//                     tfield.setText("Sum of digits: " + sum);
//                 }
//                 } catch (NumberFormatException ex) {
//                     System.out.println(ex.getMessage());
//                 }
//         });

//         frame.setVisible(true);
//     }
// }

// import java.awt.*;
// import java.awt.event.*;

// import javax.swing.*;


// public class demo {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300, 300);

//         JPanel panel = new JPanel(new GridLayout(2, 1, 20, 20));

//         JLabel label = new JLabel("Click mouse right or left after entering text", SwingConstants.CENTER);
//         JTextField tfield = new JTextField();

//         panel.add(label);
//         panel.add(tfield);

//         frame.add(panel);
//         frame.setVisible(true);
//         panel.addMouseListener(new MouseAdapter() {
            
//             public void mouseClicked(MouseEvent e) {
//                 String str = tfield.getText();
//                 if (e.getButton() == MouseEvent.BUTTON1) {
//                     tfield.setText(str.toUpperCase());
//                     //System.out.println("Left button clicked");
//                 } else if (e.getButton() == MouseEvent.BUTTON3) {
//                     tfield.setText(str.toLowerCase());
//                     //System.out.println("Right button clicked");
//                 }
//             }
//         });

//     }
// }