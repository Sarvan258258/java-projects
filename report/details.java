package report;

                        //6-a
import packageA.*;
import packageB.*;
import java.util.*;
public class details implements Sports{
    static String sportName;
    public void displaySports(){
        System.out.println("1."+sportName1+"\n2."+sportName2+"\n3."+sportName3+"\n4."+sportName4+"\n5.Not intrested");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student Name: ");
        String name  = sc.nextLine();
        System.out.print("Enter student rollno: ");
        int rollno = sc.nextInt();

        Student s1 = new Student(name,rollno);
        
        System.out.println("Your details: ");
        System.out.println("Name: "+s1.getName());
        System.out.println("Roll No: "+s1.getRollNo());
        details d1 = new details();
        System.out.println("Different Sports.");
        d1.displaySports();
        System.out.print("Choose one sport to participate: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1: sportName=sportName1;
                    break;
            case 2: sportName =sportName2;
                    break;
            case 3: sportName = sportName3;
                    break;
            case 4: sportName = sportName4;
                    break;
            case 5 : sportName = "none";
                    break;
        }
        System.out.println("Details of Student: ");
        System.out.println("Name of the Student: "+s1.getName());
        System.out.println("Roll no of the student: "+s1.getRollNo());
        System.out.println("Going to participate in: "+details.sportName);
        sc.close();
    } 
}
