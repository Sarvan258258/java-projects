//to check whether the given number is a vowel or not
/*import java.util.*;
class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charecter to check it is a vowel or not: ");
        String c = sc.next();
        switch(c){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            System.out.println("The given character is a vowel.");
            break;
            default:{
            System.out.println("The given character is not a vowel.");
            break;
            }
        }
    }
}*/
//to display integer character and string using scanner class
/*import java.util.*;
class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a character: ");
        String str =sc.next();
        char ch =  str.charAt(0);
        sc.nextLine();
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println("num: "+num);
        System.out.println("Character: "+ch);
        System.out.println("String: "+str1);

    }
}*/
//perfect number
/*import java.util.*;
class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is perfect or not: ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        if(sum==num){
            System.out.println("The number is a perfect number.");
        }
        else{
            System.out.println("The number is not a perfect number.");
        }
    }
}*/
//gcd of two numbers
/*import java.util.*;
class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int gcd=0;
        for(int i=1;i<num1&&i<num2;i++){
            if(num1%i==0&&num2%i==0){
                gcd = i;
            }
        }
        System.out.println("The GCD of "+num1+" and "+num2+" is "+gcd+".");
    }
}*/
/*import java.util.*;
class practice{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to which you want to print tables: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<11;j++){
                System.out.println(i+" * "+j+"  = "+i*j);
            }
            System.out.println();
        }
    }
}*/

// to check prime number
/*import java.util.*;
class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is prime number or not: ");
        int num = sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if (count<3&&num!=1&&num!=0){
            System.out.println("The number is a prime number.");
        }
        else{
            System.out.println("The number is not a prime number");
        }
    }
}*/
//to print prime numbers up to n
/*import java.util.*;
class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        for (int k=2;k<n;k++){
            int count=0;
            for(int i=1;i<=k;i++){
                if(k%i==0){
                    count++;
                }
            }
            if (count<3&&k!=1&&k!=0){
                System.out.print(k+" ");
            }

        }
    }
}*/
/*import java.util.*;
class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        int num = sc.nextInt();
        int rem=0;
        while(num>0){
            rem = num%10;
            num = num/10;
            System.out.print(rem);
        }
    }
}*/
//armstrong number
/*import java.util.*;
class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is a armstrong number or not: ");
        int num = sc.nextInt();
        double rem=0,sum  = 0,result = num;
        int size = String.valueOf(num).length();
        while(num>0){
            rem = num%10;
            sum = sum+Math.pow(rem,size);
            num = num/10;
        }
        if (result == sum){
            System.out.println("The number is an armstrong number.");
        }
        else{
            System.out.println("The number is not an amstrong number.");
        }
        sc.close();
    }
}*/
//fibonacci sequence
/*import java.util.*;

class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many fibonacci numbers do you want(n): ");
        int n = sc.nextInt();
        int first = 0, second = 1,next;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
*/

// import java.util.Scanner;
// class Student{
//     int redNo;
//     Student(){
//         this.redNo = 00;
//     }
//     public void setRedNo(int redNo){
//         this.redNo = redNo;
//     }
//     public void displayRedNo(){
//         System.out.println("Red no: "+redNo);
//     }
// }
// class Attendance extends Student{
//     int sub1,sub2,sub3;
//     Attendance(){
//         this.sub1 = 00;
//         this.sub2 = 00;
//         this.sub3 = 00;
//     }
//     public void setAttendance(int sub1,int sub2,int sub3){
//         this.sub1 = sub1;
//         this.sub2 = sub2;
//         this.sub3 = sub3;
//     }
//     public void displayAttendance(){
//         System.out.println("Attandance for:\nsub1 = "+this.sub1+"\nsub2 = "+this.sub2+"\nsub3 = "+this.sub3);
//     }
// }
// interface presumptive{
//     int presumptiveAttendance = 6;
//     void displayPresumptiveAttendance();
// }
// class TotalAttendance extends Attendance implements presumptive{
//     int total;
//     public void displayPresumptiveAttendance(){
//         System.out.println("Presumptive Attenddance: "+presumptiveAttendance);
//     }
//     public void displayTotalAttandance(){
//         total = this.sub1 +this.sub2 +this.sub3+presumptiveAttendance;
//         System.out.println("Total Attandance: "+total);
//     }
// }
// public class cse{
//     public static void main(String args[]){
//         Scanner sc  = new Scanner(System.in);
//         TotalAttendance a1 = new TotalAttendance();
//         //a1.displayRedNo();
//         System.out.print("Enter your red No: ");
//         int redno = sc.nextInt();
//         System.out.print("Enter attendance for sub1: ");
//         int sub1 = sc.nextInt();
//         System.out.print("Enter attendance for sub2: ");
//         int sub2 = sc.nextInt();
//         System.out.print("Enter attendance for sub3: ");
//         int sub3 = sc.nextInt();
//         a1.setRedNo(redno);
//         a1.setAttendance(sub1,sub2,sub3);
//         a1.displayRedNo();
//         a1.displayPresumptiveAttendance();
//         a1.displayAttendance();
//         a1.displayTotalAttandance(); 
//         sc.close(); 
//     }
// }
// import java.util.Scanner;
// import packages.*;
// public class cse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Herbivore name: ");
//         String herb1 = sc.nextLine();
//         Herbivore h1 = new Herbivore(herb1);
//         System.out.print("Enter Carnivore name: ");
//         String carn1 = sc.nextLine();
//         h1.display();
//         Carnivore c1 = new Carnivore(carn1);
//         c1.display();
//         sc.close();
//     }
// }

// import java.io.*;
// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the name of the file with technical content: ");
//         String inputFileName = scanner.nextLine();

//         System.out.print("Enter the name of the stop words file: ");
//         String stopWordsFileName = scanner.nextLine();

//         Set<String> stopWords = loadStopWords(stopWordsFileName);
//         Set<String> technicalTerms = new TreeSet<>();

//         try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 String[] words = line.split("\\W+");
//                 for (String word : words) {
//                     if (!stopWords.contains(word.toLowerCase()) && !word.isEmpty()) {
//                         technicalTerms.add(word);
//                     }
//                 }
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading the file: " + e.getMessage());
//         }

//         System.out.println("Technical terms sorted alphabetically:");
//         for (String term : technicalTerms) {
//             System.out.println(term);
//         }
//         scanner.close();
//     }


//     private static Set<String> loadStopWords(String fileName) {
//         Set<String> stopWords = new HashSet<>();
//         try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 stopWords.add(line.trim().toLowerCase());
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading the stop words file: " + e.getMessage());
//         }
//         return stopWords;
//     }
// }

// import java.io.*;
// public class practice{
//     public static void main(String[] args) throws IOException{
//         FileReader fr = new FileReader("sample1.txt");
//         FileWriter fw = new FileWriter("sample1.txt");
//         int ch;
//         while((ch=fr.read())!=-1){
//             fw.write(ch);
//         }
//         fr.close();
//         fw.close();
//     }
// }


// import java.io.*;
// public class practice{
//     public static void main(String[] args) throws IOException{
//         FileInputStream fis = new FileInputStream("sample.txt");
//         FileOutputStream fos  = new FileOutputStream("sample1.txt",true);
//         int ch;
//         while((ch = fis.read())!=-1)
//             {
//                 fos.write(ch);
//             }
//         fis.close();
//         fos.close();
//     }
// }


// import java.util.*;
// import java.io.*;

// public class practice {
//     public static void main(String[] args)  throws IOException{
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter file name to read: ");
//         String fname1 = sc.nextLine();
//         System.out.print("Enter file name to write: ");
//         String fname2 = sc.nextLine();
//         FileReader fr = new FileReader(fname1);
//         FileWriter fw = new FileWriter(fname2);
//         int ch;
//         while((ch = fr.read())!=-1) {
//             fw.write(ch);
//         }
        
//         fr.close();
//         fw.close();;
//         sc.close();
//     }
// }


// class A extends Thread {
//     public void run()
//     {
//         for(int i=0;i<=20;i++)
//         {
//             System.out.println("Thread A: " + i);
//         }
//         System.out.println("Exit from thread A.");
//     }
// }
// class B extends Thread {
//     public void run() {
//         for(int i = 0;i <= 20;i++)  {
//             System.out.println("thread B: " +i);
//         }
//         System.out.println("Exit form B.");
//     }
// }
// class C extends Thread {
//     public void run() {
//         for(int i = 0;i <= 20;i++)  {
//             System.out.println("thread c: " + i);
//         }
//         System.out.println("Exit form c.");
//     }
// }
// public class practice {
//     public static void main(String[] args) {
//         A a = new A();
//         B b = new B();
//         C c = new C();
//         c.setPriority(Thread.MAX_PRIORITY);
//         b.setPriority(b.getPriority());
//         a.setPriority(Thread.MIN_PRIORITY);
//         a.start();
//         b.start();
//         c.start();
//     }
// }


// class MyThread extends Thread {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println(Thread.currentThread().getName() + " - " + i);
//             // Yielding the CPU to other threads
//             try{
//                 Thread.sleep(1000);
//                 Thread.yield();
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         MyThread t2 = new MyThread();
//         MyThread t3 = new MyThread();

//         t1.setName("Thread-1");
//         t2.setName("Thread-2");
//         t3.setName("Thread-3");

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }



// class Table {
//     void  printTable(int n) {
//         synchronized(this){ 
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n*i);
//             try {
//                 Thread.sleep(2000);
//             }
//             catch(Exception es) {
//                 System.out.println(es);
//             }
//         }
//     }
//     }
// }
// class MyThread1 extends Thread {
//     Table t;
//     MyThread1(Table t) {
//         this.t  = t;
//     }
//     public void run() {
//         t.printTable(2);
//     }
// }

// class MyThread2 extends Thread {
//     Table t;
//     MyThread2(Table t) {
//         this.t = t;
//     }
//     public void run() {
//         t.printTable(20);
//     }
// }
// public class practice {
//     public static void main(String[] args) {
//         Table obj = new Table();
//         MyThread1 t1 = new MyThread1(obj);
//         MyThread2 t2 = new MyThread2(obj);
//         t1.start();
//         t2.start();
//     }
// }
// public class practice {
//     public static void main(String[] args) {
//         try {
//             // Code that may throw an exception
//             int result = divide(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             // Handling the exception
//             System.out.println("Exception caught: " + e.getMessage());
//         } finally {
//             // Code that will always execute
//             System.out.println("Finally block executed.");
//         }
//     }

//     // Method that declares it might throw an exception
//     public static int divide(int a, int b) throws ArithmeticException {
//         if (b == 0) {
//             // Throwing an exception
//             throw new ArithmeticException("Division by zero is not allowed.");
//         }
//         return a / b;
//     }
// }


// import java.awt.*;
// import javax.swing.*;
// public class practice extends JFrame{
//     Button button;

//     public practice() {
//         button = new Button("Click Me");
//         button.setBounds(50, 100, 80, 30);
//         button.addActionListener(e->System.out.println("Button clicked!")); // Registering the listener

//         add(button);
//         setSize(200, 200);
//         setLayout(null);
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
//     public static void main(String[] args) {
//         new practice();
//     }
// }



// import java.io.*;
// import java.net.*;

// public class TCPClient {
//     public static void main(String[] args) {
//         String serverName = "localhost"; // Server IP address
//         int port = 6789; // Server port number

//         try {
//             // Create a client socket and connect to the server
//             Socket clientSocket = new Socket(serverName, port);

//             // Create output stream to send data to the server
//             DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

//             // Create input stream to receive data from the server
//             BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

//             // Send a message to the server
//             String message = "Hello, Server!";
//             outToServer.writeBytes(message + '\n');

//             // Read the response from the server
//             String response = inFromServer.readLine();
//             System.out.println("Server response: " + response);

//             // Close the socket
//             clientSocket.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }


// import java.io.*;
// import java.net.*;

// public class TCPServer {
//     public static void main(String[] args) {
//         int port = 6789; // Server port number

//         try {
//             // Create a server socket
//             ServerSocket serverSocket = new ServerSocket(port);
//             System.out.println("Server is listening on port " + port);

//             while (true) {
//                 // Accept a client connection
//                 Socket connectionSocket = serverSocket.accept();
//                 System.out.println("Client connected");

//                 // Create input stream to receive data from the client
//                 BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

//                 // Create output stream to send data to the client
//                 DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

//                 // Read the message from the client
//                 String clientMessage = inFromClient.readLine();
//                 System.out.println("Received from client: " + clientMessage);

//                 // Send a response to the client
//                 String response = "Hello, Client!";
//                 outToClient.writeBytes(response + '\n');

//                 // Close the connection
//                 connectionSocket.close();
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }


// public class practice {
//     static int a,b,c;
//     public static void main(String args[]) {
       
//         try {
//             a = 10;
//             b = 1;
//             c = a/b;
//             System.out.println("The value is: "+ c);
//         } catch (ArithmeticException e) {
//             System.out.println("Divide by zero");
//         }
//         finally{
//             c = a * b;
//             System.out.println("c: "+c);
//         }
//     }
// }


// public class practice {
//     public static void main(String[] args) {
//         int invalid  = 0;
//         int number,count = 0;

//         for(int i  = 0; i <args.length; i++) {
//             try {
//                 number = Integer.parseInt(args[i]);
//                 count = count+1;
//             } catch  (NumberFormatException e) {
//                 invalid  = invalid + 1;
//                 System.out.println("Invalid number: " + args[i]);
//                 //continue;
//             }
//           //  count = count+1;
//         }

//         System.out.println("No of Valid numbers: " + count);
//         System.out.println("No of Invalid numbers: " + invalid);
//     }
// }


// public class practice {

//     public static void main(String[] args) {
//         int a[] = {10, 20};
//         int b = 10;
//         try {
//             int x = a[1]/(b-a[1]);
//         } catch (ArithmeticException e) {
//             System.out.println("Arithemetic Exception.");
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array index out of bound exception.");
//         } catch (ArrayStoreException e) {
//             System.out.println("Wrong data type.");
//         }

//         finally {
//             int y = a[1]/a[0];
//             System.out.println("Y: "+ y);
//         }
//     }
// }


// public class practice {

//     static void m1() {
//         try {
//             throw new NullPointerException("Throw demo.");
//         } catch (NullPointerException e) {
//             System.out.println("catught inside m1." + e);
//             throw e;        //rethrow the exception
//         }
//     }
//     public static void main(String[] args) {
        
//         try {
//             m1();
//         } catch (NullPointerException e) {
//             System.out.println("Recaught the exception" + e);
//         }
//     }
// }

// import java.io.*;
// import java.net.*;

// public class  practice{
//     public static void main(String[] args) {
//         try (ServerSocket serverSocket = new ServerSocket(12345)) {
//             System.out.println("Server is listening on port 12345");
//             Socket socket = serverSocket.accept();
//             System.out.println("Client connected");

//             InputStream input = socket.getInputStream();
//             BufferedReader reader = new BufferedReader(new InputStreamReader(input));

//             OutputStream output = socket.getOutputStream();
//             PrintWriter writer = new PrintWriter(output, true);

//             String message;
//             while ((message = reader.readLine()) != null) {
//                 System.out.println("Received from client: " + message);
//                 writer.println("Echo: " + message);
//             }

//             socket.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }



// public class practice {
//     static void t1 ()  throws IllegalAccessException {
//         System.out.println("Inside method");
//         throw new IllegalAccessException("Demo");
//     }
//     public static void main(String args[] ) {
//         try  {
//             t1();
//         } catch(IllegalAccessException e) {
//             System.out.println("caught: " + e.getLocalizedMessage());
//         }
//     }
// }



// class MyException extends Exception {
//     MyException(String m1) {
//         super(m1);
//     }
// }
// public class practice {
//     public static void main(String args[]) {
//         int a = 100, b = 10000;
//         try {
//             float c = (float)a/(float)b;
//             if (c < 0.01) {
//                 throw new MyException("Number is too small");
//             }
//         } catch (MyException e) {
//             System.out.println("Caught: " + e.getMessage());
//         }
//         finally {
//             System.out.println("Finally block!!!!!!!!!!!");
//         }
//     }
// }



// class customer {

//     int initaialamount = 20000;

//     synchronized void withdraw(int amount) {
//         System.out.println("Available amount : " + initaialamount);
//         System.out.println("Going to whithdraw " + amount);
//         if (initaialamount < amount) {
//             System.out.println("Less balance waiting for deposite");
//         }
//         try {
//             wait();
//         } catch (InterruptedException e) {
//             System.out.println("ERROR " +e.getMessage());
//         }
//         initaialamount -= amount;
//         System.out.println("Amount has been withdrawm now total balance is " + initaialamount);
//     }

//     synchronized void deposite(int amount) {

//         System.out.println("Going to deposite. " + amount);
//         initaialamount += amount;
//         System.out.println("Total amount. " + initaialamount);
//         notify();

//     }
// }

// class Thread1 extends Thread  {
//     customer c;
//     Thread1(customer c) {
//         this.c = c;
//     }
//     public void run() {
//         c.withdraw(25000);
//     }
// }

// class Thread2 extends Thread {
//     customer c;
//     Thread2(customer c) {
//         this.c = c;
//     }
//     public void run() {
//         c.deposite(40000);
//     }
// }


// public class practice {
//     public static void main(String[] args) {
//         customer c = new customer();
//         Thread1 t1 = new Thread1(c);
//         Thread2 t2 = new Thread2(c);
//         t1.start();
//         t2.start();
//     }
// }


// import java.awt.*;
// import javax.swing.*;

// import java.awt.event.*;

// public class practice {
//     public static void main(String args []) {
//         JFrame frame = new JFrame("Registration page");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300,300);

//         frame.setLayout(new GridLayout(6,2,10,10));

//         JLabel nameLabel = new JLabel("Name: ");
//         JTextField nameField = new JTextField();

//         JLabel emailLabel = new JLabel("Email: ");
//         JTextField emailField = new JTextField();

//         JLabel passwordLabel = new JLabel("Password: ");
//         JPasswordField passwordField = new JPasswordField();

//         JLabel genderLabel = new JLabel("Gender: ");
//         JPanel genderPanel = new JPanel();
//         JRadioButton maleButton = new JRadioButton("Male");
//         JRadioButton femalButton = new JRadioButton("Female");
//         ButtonGroup genderGroup = new ButtonGroup();
//         genderGroup.add(maleButton);
//         genderGroup.add(femalButton);
//         genderPanel.add(maleButton);
//         genderPanel.add(femalButton);

//         JLabel countryLabel = new JLabel("Country: ");

//         String [] countries = {"India", "Russia", "America", "Japan", "Africa"};
//         JComboBox<String> options = new JComboBox<>(countries);

//         JButton submitbutton  = new JButton("Submit");

//         frame.add(nameLabel);
//         frame.add(nameField);

//         frame.add(emailLabel);
//         frame.add(emailField);

//         frame.add(passwordLabel);
//         frame.add(passwordField);

//         frame.add(genderLabel);
//         frame.add(genderPanel);

//         frame.add(countryLabel);
//         frame.add(options);

//         frame.add(new JLabel());
//         frame.add(submitbutton);


//         frame.setVisible(true);

//         submitbutton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 String name = nameField.getText();
//                 String email = emailField.getText();
//                 String password = new String(passwordField.getPassword());
//                 String gender = maleButton.isSelected() ? " Male " : " Female ";
//                 String country = (String) options.getSelectedItem();

//                 JOptionPane.showMessageDialog(frame,
//                 "Name: " + name +
//                  "\nEmail: " + email +
//                   "\nPassword: " + password + 
//                   "\nGender: " + gender + "\nCountry: "
//                    + country, "registration details", 
//                    JOptionPane.INFORMATION_MESSAGE);

//             }
//         });


//     }
// }



// import java.awt.*;
// import javax.swing.*;

// import java.awt.event.*;

// public class practice extends JFrame {
//     JLabel label;

//     public practice() {
//         setTitle("Mouse events!!!!!!");
//         setSize(300,300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         label = new JLabel("Intract with the label to see mouse events.");
//         //label.setHorizontalAlignment(SwingConstants.CENTER);
//         add(label,BorderLayout.SOUTH);

//         JPanel panel = new JPanel();
//         panel.setBackground(Color.DARK_GRAY);
//         add(panel, BorderLayout.CENTER);


//         panel.addMouseListener(new MouseAdapter() {
//             public void mouseClicked(MouseEvent e) {
//                 label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
//             }
//             public void mouseEntered(MouseEvent e) {
//                 label.setText("Mouse entered");
//             }
//             public void mouseExited(MouseEvent e) {
//                 label.setText("Mouse exited");
//             }
//             public void mouseReleased(MouseEvent e) {
//                 label.setText("Mouse relesed");
//             }
//         });
//         panel.addMouseMotionListener(new MouseAdapter() {
//             public void mouseMoved(MouseEvent e) {
//                 label.setText("Mouse moved to (" + e.getX() + ", " + e.getY() + ")");  
//             }            
//         });
//     }
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(()-> {
//             practice p = new practice();
//             p.setVisible(true);
//         });
//     }
// }




// import java.awt.*;
// import java.awt.event.MouseAdapter;
// import java.awt.event.MouseEvent;

// import javax.swing.*;

// public class practice extends JFrame {
//     private JRadioButton lineButton;
//     private JRadioButton rectButton;
//     private JRadioButton ovalButton;
//     private String selectedShape = "Line";
//     private JPanel barPanel;
//     private Point startPoint, endPoint;

//     public practice() {
//         setSize(300,300);
//         setBackground(Color.DARK_GRAY);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         lineButton = new JRadioButton("Line");
//         rectButton = new JRadioButton("rectangle");
//         ovalButton = new JRadioButton("oval");

//         lineButton.setSelected(true);

//         ButtonGroup group = new ButtonGroup();
//         group.add(lineButton);
//         group.add(rectButton);
//         group.add(ovalButton);

//         barPanel  = new JPanel();
//         barPanel.setLayout(new FlowLayout());
//         barPanel.add(lineButton);
//         barPanel.add(rectButton);
//         barPanel.add(ovalButton);
//         add(barPanel, BorderLayout.NORTH);

//         JPanel drawingpanel = new JPanel() {
//             protected void paintComponent(Graphics g) {
//                 super.paintComponent(g);
//                 if (startPoint != null && endPoint != null) {
//                     Graphics2D g2d = (Graphics2D) g;
//                     g2d.setStroke(new BasicStroke(2));
//                     switch (selectedShape) {
//                         case "Line" : 
//                                 g2d.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
//                                 break;
//                         case "Rectangle":
//                             int rectX = Math.min(startPoint.x, endPoint.x);
//                             int rectY = Math.min(startPoint.y, endPoint.y);
//                             int rectWidth = Math.abs(endPoint.x -startPoint.x);
//                             int rectHeight = Math.abs(endPoint.y - startPoint.x);
//                             g2d.drawRect(rectX, rectY, rectWidth, rectHeight);
//                             break;
//                         case "Oval":
//                             int ovalX = Math.min(startPoint.x, endPoint.x);
//                             int ovalY = Math.min(startPoint.y, startPoint.y);
//                             int ovalWidth = Math.abs(endPoint.x - startPoint.x);
//                             int ovalHeight = Math.abs(endPoint.y- startPoint.y);
//                             g2d.drawOval(ovalX, ovalY, ovalWidth, ovalHeight);
//                             break;
//                     }
//                 }
//             }
//         };
//         drawingpanel.setBackground(Color.WHITE);
//         add(drawingpanel, BorderLayout.CENTER);

//         drawingpanel.addMouseListener(new MouseAdapter() {
//             public void mousePressed(MouseEvent e) {
//                 startPoint = e.getPoint();
//             }
//             public void mouseReleased(MouseEvent e) {
//                 endPoint = e.getPoint();
//                 drawingpanel.repaint();;
//             }
//         });


//         lineButton.addActionListener(e -> selectedShape = "Line");
//         rectButton.addActionListener(e -> selectedShape = "Rectangle");
//         ovalButton.addActionListener(e -> selectedShape = "Oval");

//     }
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             practice frame = new practice();
//             frame.setVisible(true);
//         });
        
//     }
// }


// import java.util.Arrays;

// class MyArrayList {
//     private int[] array;
//     private int size;

//     public MyArrayList() {
//         array = new int[10];
//         size = 0;
//     }

//     public void add(int value) {
//         if (size == array.length) {
//             array = Arrays.copyOf(array, array.length * 2);
//         }
//         array[size++] = value;
    
//     }

//     public int get(int index) {
//         if (index >= size || index < 0) {
//             // throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//             System.out.println("Array index out of bound");
//         }
//         return array[index];
//     }

//     public void remove(int index) {
//         if (index >= size || index < 0) {
//             // throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//             System.out.println("Array index out of bound");
//         }
//         for (int i = index; i < size - 1; i++) {
//             array[i] = array[i + 1];
//         }
//         size--;
//     }

//     public int size() {
//         return size;
//     }

//     @Override
//     public String toString() {
//         int[] result = Arrays.copyOf(array, size);
//         return Arrays.toString(result);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         MyArrayList arrl = new MyArrayList();
//         arrl.add(1);
//         arrl.add(2);
//         arrl.add(3);
//         arrl.add(4);

//         System.out.println(arrl);
//         System.out.println("size: " + arrl.size());
//         arrl.remove(2);
//         System.out.println("at 2: " + arrl.get(2));
//         System.out.println(arrl);

//     }
// }