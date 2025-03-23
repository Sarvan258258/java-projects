//demo program
/*public class cse {
    public static void main(String args[]){
        System.out.println("Hello java");
    }
}*/
//demo program
/*import java.util.*;

public class cse {
    int fact(int a){
        if (a == 1||a==0){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        cse cs = new cse();
        int ans = cs.fact(x);
        System.out.printf("The factorial of %d is %d",x,ans);
    }
}*/
//demo program
/*import java.util.*;
class Object{
    int n;
    public int fact(int n){
        if (n == 1){
            return n;
        }
        else{
            return n*fact(n-1);
        }
    }
    Object(int n){
        this.n = n;
    }

}
class cse{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Object obj = new Object(num);
        int number = (obj.fact(num));
        System.out.printf("The factorial of %d is %d.",num,number);
    }
}*/
//1-a i using Scanner class
// import java.util.*;
// class cse{
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter string 1: ");
//     String str1 = sc.nextLine();
//     System.out.print("Enter string 12: ");
//     String str2 = sc.nextLine();
//     System.out.println(str1+" and "+str2);
//     System.out.println("The size of argumented array is: " + args.length);
//     sc.close();
//     } 
// }
//1a i using command line arguments
// class cse{
//     public static void main(String[] args){
//     String str1 = args[0];
//     String str2 = args[1];
//     System.out.println(str1+" and "+str2);
//     System.out.println("The size of argumented array is: " + args.length);
//     } 
// }

//1a-ii using Scanner class
// import java.util.*;
// class cse{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the radius of circle: ");
//         int rad = sc.nextInt();
//         int area = (22/7)*rad*rad;
//         int perimeter = 2*(22/7)*rad;
//         System.out.println("The area of circle is "+area);
//         System.out.println("The perimeter of circle is "+perimeter);
//         sc.close();
//     }
// }

//1a-ii using command line arguments
// class cse{
//     public static void main(String args[]){
//         int rad = Integer.parseInt(args[0]);
//         int area = (22/7)*rad*rad;
//         int perimeter = 2*(22/7)*rad;
//         System.out.println("The area of circle is "+area);
//         System.out.println("The perimeter of circle is "+perimeter);
//     }
// }

//demo program
//COMMAND LINE ARGUMENTS
/*class cse{
    public static void main(String[] args){
        for(int i=0;i<args.length;i++){
            System.out.println((i+1)+". "+args[i]);
        }
    }
}*/
//CLASSES AND OBJECTS
//1-b
// import java.util.*;
// class Rectangle{
//     int width;
//     int breadth;
//     int area(){
//         return width*breadth;
//     }
//     int perimeter(){
//         return 2*(width+breadth);
//     }
// }
// class cse{
// public static void main(String [] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter width of the rectangle: ");
//     int l1 = sc.nextInt();
//     System.out.print("Enter breadth of the rectangle: ");
//     int b1 = sc.nextInt();
//     Rectangle r1 = new Rectangle();
//     r1.width = l1;
//     r1.breadth = b1;
//     System.out.println("The area of rectangle is : "+r1.area());
//     System.out.println("The perimeter of rectangle is: "+r1.perimeter());
//     sc.close();
// }
// }
//2-september-2024
//2-a
// import java.util.*;
// class Rectangle{
//     int width;
//     int breadth;
//     Rectangle(){
//         width = 10;
//         breadth = 10;
//         System.out.println("constructor 1 is called");
//     }
//     Rectangle(int width,int breadth){ 
//         this();          
//         this.width = width;
//         this.breadth = breadth;
//         System.out.println("constructor 2 is called");
//     }
//     public int show(){
//         return width*breadth;
//     }
// }
// public class cse{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter width of the rectangle: ");
//         int width = sc.nextInt();
//         System.out.print("Enter breadth of the rectangle: ");
//         int breadth = sc.nextInt();
//         Rectangle rec2 = new Rectangle(width,breadth);
//         Rectangle rec1 = new Rectangle();
//         System.out.println("Rectangle 1 area: "+rec1.show());
//         System.out.println("Rectangle 2 area: "+rec2.show());
//         sc.close();
//     }
// }
// 2-b

// import java.util.Scanner;
// import java.lang.Math;
// public class cse{
//     static int count=0;
//     private static boolean isPrime(int n){
//         if(n<3){
//             return false;
//         }
//         for(int j=2;j<Math.sqrt(n);j++){
//             if(n%j==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         Scanner sc  = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         System.out.print("Enter array Elements: ");
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Odd and Prime number sorted array is: ");
//         for(int i=0;i<size;i++){
//             if(arr[i]%2!=0 && isPrime(arr[i])){
//                 System.out.print(" "+arr[i]);
//             }
//             else{
//                 count++;
//             }
//         }
//         if(count ==size){
//             System.out.print("No such elements");
//         }
//         sc.close();
//     }
// }

//2-c
/*import java.util.*;
public class cse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array Elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int num,count=0;
        int arr1[] = new int[100];
        for(int i=0;i<size;i++){
            num=arr[i];
            for(int j=0;j<size;j++){
                if(num==arr[j]){
                    count++;
                }
            }
            for(int k=0;k<)
            System.out.println("The number "+num+" occured "+count+" times ");
            count=0;
        }
        sc.close();
    }
}*/
//2-d
// import java.util.*;
// public class cse{
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter no of years: ");
//        int m  = sc.nextInt();
//        System.out.print("Enter nom of items:");
//        int n = sc.nextInt();
//        int arr[][] = new int[m][n];
//         System.out.println("Enter data: ");
//         for(int i=0;i<m;i++){
//             for(int j =0;j<n;j++){
//                 System.out.print("Enter data for year "+(i+1)+" item "+(j+1)+": ");
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Data: ");    
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         int maxItems=arr[0][0],year=0,id=0;  
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(maxItems<arr[i][j]){
//                     maxItems = arr[i][j];
//                     year = i+1;
//                     id=j+1;
//                 }
//             }
//         }
//         System.out.println("the maximum items are sold in year "+year+" items id is: "+id+".");
//         sc.close();
//     }
// }
/*import java.util.Scanner;

public class cse {

    public static void sort(int[] arr, int[] freq) { 
        for(int i = 0; i < freq.length - 1; i++) {
            for(int j = 0; j < freq.length - i - 1; j++) {
                if(freq[j] < freq[j + 1]) {
                    int temp = freq[j];
                    freq[j]= freq[j + 1];
                    freq[j + 1] = temp;
                    int tempArr = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempArr;
                }
            }
        }
    }

    public static void printArray(int[] arr, int[] freq) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != Integer.MIN_VALUE) {
                System.out.println("Element: " + arr[i] + ", Frequency: " + freq[i]);
            }
        }
    }
    public static void main(String[] args) {

        int frequency;
        Scanner s = new Scanner(System.in);

        System.out.printf("Enter the size of array: ");
        int size = s.nextInt();

        int arr[] = new int[size];
        int freq[] = new  int[size];

        System.out.printf("Enter the %d elements: ",size);
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        for (int j = 0; j < size; j++) {
            frequency = 1;
            for(int k = j + 1; k < size; k++) {
                if (arr[j] == arr[k]){ 
                    frequency++;

                    arr[k] = Integer.MIN_VALUE;
                }
            }
            if(arr[j] != Integer.MIN_VALUE) {
                freq[j] = frequency;
            }
        }

        sort(arr, freq);
        System.out.println("Frequencies of elements in their order of oeccurences: ");
        printArray(arr, freq);
        s.close();
    }
}*/
// import java.util.Scanner;

// public class cse{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.print("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         int[] frequency = new int[max + 1];
//         for (int i = 0; i < n; i++) {
//             frequency[arr[i]]++;
//         }
//         int[][] freqArray = new int[max + 1][2];
//         for (int i = 0; i <= max; i++) {
//             freqArray[i][0] = i;
//             freqArray[i][1] = frequency[i];
//         }
//         for (int i = 0; i < freqArray.length - 1; i++) {
//             for (int j = i + 1; j < freqArray.length; j++) {
//                 if (freqArray[i][1] < freqArray[j][1]) {
//                     int[] temp = freqArray[i];
//                     freqArray[i] = freqArray[j];
//                     freqArray[j] = temp;
//                 } 
//             }
//         }
//         System.out.println("Number frequencies in order of occurrences:");
//         for (int i = 0; i <= max; i++) {
//             if (freqArray[i][1] > 0) {
//                 System.out.println("Number: " + freqArray[i][0] + ", Frequency: " + freqArray[i][1]);
//             }
//         }
//         sc.close();
//     }
// } 
//3-a
/*import java.util.*;
class Box{
    int heigth,width,depth;
    Box(int heigth,int width,int depth){
        this.heigth = heigth;
        this.width  = width;
        this.depth  = depth;
    }
    public int volume(){
        return heigth*depth*width;
    }
}
public class cse{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        while(true){
            System.out.print("Enter heigth of the box: ");
            int heigth = sc.nextInt();
            System.out.print("Enter width of the box: ");
            int width = sc.nextInt();
            System.out.print("Enter depth of the box: ");
            int depth = sc.nextInt();
            Box box = new Box(heigth,width,depth);
            System.out.println("The volume is: "+box.volume());
            System.out.println("Want to find volume for another Box type\n1 for continue\n2 for exit.");
            System.out.print("Input: ");
            int input = sc.nextInt();
            if(input==2){
                System.out.println("ok bye!!!!!!!!!");
                break;
            }
        }
        sc.close();
    }
}
*/
//3-b
// import java.util.*;
// public class calculator{
//     public static int powerInt(int n1,int n2){
//         return (int) Math.pow(n1, n2);
//     }
//     public static double powerDouble(double n1,double n2){
//         return Math.pow(n1, n2);
//     }
//     public static void main(String args[]){
//         Scanner sc  = new Scanner(System.in);
//         System.out.print("Enter number to calculate the power of it: ");
//         double num = sc.nextDouble();
//         System.out.print("Enter its power: ");
//         double power = sc.nextDouble();
//         System.out.println("The answer is: "+powerInt((int)num,(int)power));
//         System.out.println("The answer is: "+powerDouble(num,power));
//         sc.close();
//     }
// }
//4-a

// import java.util.*;
// public class cse{
//     public static void bubbleSort(String arr[]){

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if (arr[j].compareTo(arr[j + 1]) > 0) {
//                     String temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a sentence: ");
//         String str = sc.nextLine();
//         System.out.print("Enter size of sub string: ");
//         int n = sc.nextInt();
//         int count = str.length()/n;
//         int j =0,k=0;
//         String[] arr = new String[count];
//         for(int i =0;i<count;i++){
//             arr[j] = str.substring(k,k+n);
//             k = k+n;
//             j++;
//         }
//         System.out.println("Before sorting: ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         bubbleSort(arr);
//         System.out.println("After sorting: ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         sc.close();
//     }
// }

//4-b
// import java.util.*;
// public class cse{
//     public static void main(String args[]){
//         Scanner sc  = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int size = sc.nextInt();
//         sc.nextLine();
//         String arr[] = new String[size];
//         for(int i = 0;i<size;i++){
//             System.out.print("Enter string "+(i+1)+": ");
//             arr[i] = sc.nextLine();
//         }
//         int vowelCount=0;
//         int consonantCount = 0;

//         for(int i =0;i<size;i++){
//             String str1 = arr[i];
//             for(int j=0;j<str1.length();j++){
//                 char ch = str1.charAt(j);
//                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
//                     vowelCount++;
//                 }
//                 else{
//                     consonantCount++;
//                 }
//             }
//             System.out.println("The no of vowels in "+str1+" are: "+vowelCount);
//             System.out.println("The no of consonants int "+str1+" are: "+consonantCount);
//             vowelCount=0;
//             consonantCount=0;
//         }
//         sc.close();
//     }
// }

//4-c
// import java.util.*;
// public class cse{
//     public static void bubbleSort(char arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if (arr[j]>(arr[j + 1])) {
//                     char temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     }   
//             }
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string 1: ");
//         String str1 = sc.nextLine();
//         System.out.print("Enter string 2: ");
//         String str2 = sc.nextLine();
//         char str3[] = str1.toCharArray();
//         char str4[] = str2.toCharArray();
//         int count=0;
//         bubbleSort(str3);
//         bubbleSort(str4);
//         for(int i=0;i<str3.length;i++){
//             if(str3[i]==str4[i]){
//                 count++;
//             }
//         }
//         if(count==str3.length){
//             System.out.println("The two strings are anagrams");
//         }
//         else{
//             System.out.println("The two strings are not anagrams");
//         }
//         sc.close();        
//     }
// }
//5-a
// import java.util.*;
// class Vehicle{
//     String vehicleName;
//     public Vehicle(String vehicleName){
//         this.vehicleName  = vehicleName;
//     }
//     public void displayVehicleName(){
//         System.out.println("Vehicle name: "+this.vehicleName);
//     }
// }
// class Brand extends Vehicle{
//     String brand;
//     public Brand(String vehicleName,String brand){
//         super(vehicleName);
//         this.brand = brand;
//     }
//     public void displayBrand(){
//         System.out.println("Brand Name: "+this.brand);
//     }
// }
// class Cost extends Brand{
//         int cost;
//         public Cost(String vehicleName,String brand){
//             super(brand,vehicleName);
//             this.cost  = 150000;
//         }
//         public void displayCost(){
//             System.out.println("Cost of the vehicle: "+this.cost);
//         }
//     }
// public class cse{
//     public static void main(String[] args) {
//         Scanner sc   = new Scanner(System.in);
//         System.out.print("Enter Vehicle Name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter Brand Name: ");
//         String brand = sc.nextLine();
//         Cost c1 = new Cost(name,brand);
//         c1.displayVehicleName();
//         c1.displayBrand();
//         c1.displayCost();
//         sc.close();
//     }
// }
//5 b
// import java.util.*;
// class Figure_3D{
//     String type;
//     public Figure_3D(){
//         this.type = "3D";
//     }
//     public void displayDimention(){
//         System.out.println("3D - Dimention.");
//     }
//     public void displayShape(){
//         System.out.println(this.type+" figure");
//     }
//     public void calculateVolume(){
//         System.out.println("Volume: "+00);
//     }
// }
// class Cylinder extends Figure_3D{
//     double radius;
//     double height;
//     public Cylinder(double radius,double height){
//         this.radius = radius;
//         this.height = height;
//     }
//     public void displayShape(){
//         System.out.println(this.type+" cylinder");
//     }
//     public void calculateVolume(){
//         System.out.println("volume: "+((3.14)*this.radius*this.radius*this.height));
//     }
// }
// class Cone extends Figure_3D{
//     double radius;
//     double height;
//     public Cone(double radius,double height){
//         this.radius = radius;
//         this.height = height;
//     }
//     public void displayShape(){
//         System.out.println(this.type+" cone");
//     }
//     public void calculateVolume(){
//         System.out.println("volume: "+((0.33)*(3.14)*this.radius*this.radius*this.height));
//     }
// }
// class Sphere extends Figure_3D{
//     double radius;
//     public Sphere(double radius){
//         this.radius = radius;
//     }
//     public void displayShape(){
//         System.out.println(this.type+" sphere");
//     }
//     public void calculateVolume(){
//         System.out.println("voulme: "+((4/3)*(3.14)*this.radius*this.radius*this.radius));
//     }
// }
// public class cse{
//     // static Figure_3D[] figures; 
//     //  static int count=0;
//     // cse(int size){
//     //     figures  = new Figure_3D[size];
//     // }
//     // void addFigure(Figure_3D figure){
//     //     figures[count] = figure;
//     //     count++;
//     // }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         Cylinder cy1 = new Cylinder(3.1,2.3);
//         Cone co1 = new Cone(3.5, 5.4);
//         Sphere s1 = new Sphere(5.6);

//         Figure_3D figures[] = new Figure_3D[3];
//         figures[0] = cy1;
//         figures[1] = co1;
//         figures[2] = s1;
//         // cse cs1  = new cse(3);
//         // cs1.addFigure(cy1);
//         // cs1.addFigure(co1);
//         // cs1.addFigure(s1);
//         figures[0].displayDimention();
//         figures[0].displayShape();
//         figures[0].calculateVolume();
//         figures[1].displayDimention();
//         figures[1].displayShape();
//         figures[1].calculateVolume();
//         figures[2].displayDimention();
//         figures[2].displayShape();
//         figures[2].calculateVolume();
//         sc.close();
//     }
// }

//6-b
// import java.util.*;
// public class cse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         System.out.print("Enter a character: ");
//         char ch = sc.next().charAt(0);
//         System.out.print("Enter a bool value: ");
//         boolean b = sc.nextBoolean();
//         Integer n = num;
//         Character c= ch;
//         System.out.println("Integer : "+n);
//         System.out.println("Character : "+c);
//         System.out.println("Boolean : "+b);
//         Vector<Object> v1 = new Vector<>();
//         v1.addElement(b);
//         v1.addElement(n);
//         v1.addElement(c);
//         System.out.println(v1);
//         sc.close();
//     }
// }

// import java.util.*;
// public class cse{
//     public static void main(String[] args) {
//         Vector<String> v1 = new Vector<>();
//         int l = args.length;
//         for(int i = 0;i<l;i++){
//             v1.addElement(args[i]);
//         }
//        System.out.println(v1);
//     } 
// }

//7a

// import java.util.*;
// public class cse{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Random rd = new Random();
//         System.out.print("Enter lower bound: ");
//         int lb = sc.nextInt();
//         System.out.print("Enter upper bound: ");
//         int ub = sc.nextInt();
//         System.out.print("Enter how many numbers do u want: ");
//         int count = sc.nextInt();
//         int arr[] = new int[count];
//         for(int i = 0;i<count;i++){
//             arr[i] = rd.nextInt(lb,ub);
//         }
//         System.out.println("Randomm numbers are: ");
//         for(int i = 0;i<count;i++){
//             System.out.print(arr[i]+" ");
//         }

//         sc.close();
//     }
// }

// 7b
// import java.util.*;
// public class cse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter how many elements to insert: " );
//         int n = sc.nextInt();
//         ArrayList<Integer> al = new ArrayList<>(n);
//         System.out.print("Enter array elements: ");
//         for(int i = 0;i<n;i++) {
//             int element = sc.nextInt();
//             al.add(element);
//         }
//         System.out.println("Elements are: "+al);
//         System.out.println("Element at index 2: "+al.get(2));
//         al.remove(2);
//         System.out.println("Elements are: "+al);
//         System.out.println("Size of array list is: "+al.size());
//         sc.close();
//     }
// }

//7c
// import java.util.*;
// class Employee{
//     String name;
//     int id;
//     int salary;
//     public void setName(String name){
//         this.name = name;
//     }
//     public int  getSalary(){
//         return this.salary;
//     }
//     public int getId(){
//         return this.id;
//     }
//     public Employee(String name,int id,int salary){
//         this.name = name;
//         this.id = id;
//         this.salary = salary;
//     }
//     public void getDetails(){
//         System.out.println("Name: "+this.name+"\nId: "+this.id+"\nSalary: "+this.salary);
//     }
// }
// public class cse{
//     public static void main(String args[]){
//         HashMap<Integer,Employee> h1 = new HashMap<>();
//         Employee e1  = new Employee("sarvan", 41, 100000);
//         Employee e2  = new Employee("sarat",18,200000);
//         Employee e3  = new Employee("gopi", 52, 5000000);
//         h1.put(e1.getId(),e1);
//         h1.put(e2.getId(),e2);
//         h1.put(e3.getId(),e3);
//         System.out.println("keys: "+h1.keySet());
//         System.out.println("------------------------");
//         for(Integer key:h1.keySet()){
//             Employee value  =  h1.get(key);
//             value.getDetails();
//         }
//         System.out.println("------------------------");
//         for(Employee value:h1.values()){
//             value.getDetails();
//         }
//         System.out.println("-------------------------");
//         h1.forEach((key,value)->{
//             value.getDetails();
//         });
//         System.out.println("--------------------------");
//     }
// }
//8-a

// import java.io.*;
// import java.util.Scanner;

// public class cse{
//     public static void main(String args[]) throws IOException{
//         Scanner sc = new Scanner(System.in);
//         System.out.println("---------------------------------");
//         System.out.print("Enter file name: ");
//         String inputFileName = sc.nextLine();

//         File inputFile = new File(inputFileName);
//         System.out.println("File name: "+inputFile.getName());
//         System.out.println("IS Readabel: "+inputFile.canRead());
//         System.out.println("Path: "+inputFile.getPath());
//         System.out.println("Absolute path: "+inputFile.getAbsolutePath());
//         System.out.println("Length of the file: "+inputFile.length());
//         System.out.println("---------------------------------");

//         FileInputStream fis = new FileInputStream(inputFile);
//         int alphabets =0,digits = 0,specialSymbols =0;
//         int byteData;
//         while((byteData = fis.read())!=-1){
//             if(Character.isAlphabetic(byteData)){
//                     alphabets++;
//             }
//             else if(Character.isDigit(byteData)){
//                     digits++;
//                 }
//             else{
//                     specialSymbols++;
//                 }
//         }

//         System.out.print("Enter file name to write: ");
//         String outputFile = sc.nextLine();

//         FileOutputStream fos = new FileOutputStream(outputFile);
//         String outputInformation = "No of Alphabets = "+alphabets+"\nNo of Digits are = "+digits +"\nNo of special symbols = "+specialSymbols;
//         fos.write(outputInformation.getBytes());
//         System.out.println("Data transfered to "+ outputFile+" successfully.");
//         System.out.println("---------------------------------");

//         fis.close();
//         fos.close();
//         sc.close();
//         }
//     }

//8b

// import java.util.*;
// import java.io.*;

// class Supermarket {
//     String productID;
//     String name;
//     double cost;
//     int quantity;

//     public Supermarket (String productID, String name, double cost, int quantity) {
//         this.productID = productID;
//         this.name = name;
//         this.cost = cost;
//         this.quantity = quantity;
//     }

//     public double getRevenue() {
//         return cost * quantity;
//     }

//     public int getQuantity() {
//         return quantity;
//     }

//     public String toString() {
//         return "ID: " + productID + " name: " + name +  " cost: "  + cost +  " Quantity: " + quantity + " revenue: " + getRevenue();
//     }
// }

// public class cse {
//     public static void main(String args[]) throws IOException {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter csv file name to read: ");
//         String fname = sc.nextLine();
//         BufferedReader br = new BufferedReader(new FileReader(fname));
//         ArrayList<Supermarket> products = new ArrayList<>();

//         String line;
//         br.readLine();
//         while ((line = br.readLine()) != null) {
//             String[] data = line.split(","); 
//             String productID = data[0];
//             String name = data[1];
//             double cost = Double.parseDouble(data[2]);
//             int quantity = Integer.parseInt(data[3]);
//             products.add(new Supermarket(productID, name, cost, quantity));
//         }

//         double totalRevenue = 0;
//         for (Supermarket product : products) {
//             totalRevenue += product.getRevenue();
//         }
//         System.out.println("Total revenue: " + totalRevenue);

//         //Collections.sort(products, Comparator.comparingDouble(p -> -p.getRevenue()));
//         products.sort((p1, p2) -> Double.compare(p2.getRevenue(), p1.getRevenue()));

//         System.out.println("Sorted order: ");
//         for(Supermarket product : products) {
//             System.out.println(product.toString());
//         }

//         br.close();
//         sc.close();
//     }
// }

//8 c

// import java.util.*;
// import java.io.*;

// public class cse {
//     public static void main(String args[]) throws IOException {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter stop words file: ");
//         String stopWords = sc.nextLine();
//         System.out.print("Enter any text file: ");
//         String textfile = sc.nextLine();

//         HashSet<String> stopwordsData = new HashSet<>();
//         HashSet<String> filteredData = new HashSet<>();

//         BufferedReader br1 = new BufferedReader(new FileReader(stopWords));

//         String line1;
//         while ((line1 = br1.readLine()) != null) {
//             stopwordsData.add(line1.trim().toLowerCase());
//         }

//         BufferedReader br2 = new BufferedReader(new FileReader(textfile));

//         String line2;
//         while ((line2 = br2.readLine()) != null) {
//             String[] words = line2.toLowerCase().split("\\W+");
//             for (String word : words) {
//                 if (!stopwordsData.contains(word) && word.length() > 1) {
//                     filteredData.add(word);
//                 }
//             }
//         }

//         ArrayList<String> list = new ArrayList<>(filteredData);
//         Collections.sort(list);

//         System.out.println("Technical Terms (Sorted):");
//         for (String term : list) {
//             System.out.print(term + "  ");
//         }

//         br1.close();
//         br2.close();
//         sc.close();
//     }
// }

//9a

// import java.util.*;
// public class cse{
//     public static void main(String args[]){
//         try{
//             int num1 = Integer.parseInt(args[0]);
//             int num2 = Integer.parseInt(args[1]);
//             System.out.println("The division of "+args[0]+" with "+args[1]+" Answer: "+num1/num2);
//         }
//         catch(NumberFormatException e){
//             System.out.println(e);
//         }
//         catch(ArithmeticException e){
//             System.out.println(e);
//         }
//         sc.close();
//     }
// }

//9b

// import java.util.*;
// class MyException extends Exception{
//     public MyException(String msg){
//         super(msg);
//     }
// }
// public class cse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("RIGHT TO VOTE");
//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();
//         try{
//             if(age<18){
//                 throw new MyException("Your are not eligible to vote");
//             }
//             else{
//                 System.out.println("You can vote.");
//             }
//         }
//         catch(MyException e){
//             System.out.println(e.getMessage());
//         }
//         finally{
//             sc.close();
//         }
//     }
// }

//10 a

// class GoodMorning extends Thread{
//     public boolean running = true;
//     public void run(){
//         try{
//             while(running){
//                 System.out.println("Good Morning!!!");
//                 Thread.sleep(1000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println(e.getMessage());
//         }
//     }

//     public void stopThread() {
//         running = false;
//     }
// }
// class Hello extends Thread{
//     public boolean running = true;
//     public void run(){
//         try{
//             while(running){
//                 System.out.println("Hello!!!");
//                 Thread.sleep(2000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println(e.getMessage());
//         }
//     }
//     public void stopThread() {
//         running = false;
//     }
// }
// class Welcome extends Thread{
//     public boolean running = true;
//     public void run(){
//         try{
//             while(running){
//                 System.out.println("Welcome!!!");
//                 Thread.sleep(3000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println(e.getMessage());
//         }
//     }
//     public void stopThread() {
//         running = false;
//     }
// }
// public class cse{
//     public static void main(String[] args) {
//         GoodMorning gm = new GoodMorning();
//         Hello he = new Hello();
//         Welcome wel = new Welcome();
//         gm.start();
//         he.start();
//         wel.start();

//         try {
//             Thread.sleep(10000);
//         } catch (InterruptedException e) {
//             System.out.println(e.getLocalizedMessage());
//         }

//         gm.stopThread();
//         he.stopThread();
//         wel.stopThread();
//         System.out.println("All threads are stopped");
//     }
// }            

// using runnable 

// class GoodMorning implements Runnable{
//     public void run(){
//         try{
//             while(true){
//                 System.out.println("Good Morning!!!");
//                 Thread.sleep(1000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }
// class Hello implements Runnable{
//     public void run(){
//         try{
//             while(true){
//                 System.out.println("Hello!!!");
//                 Thread.sleep(2000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }
// class Welcome implements Runnable{
//     public void run(){
//         try{
//             while(true){
//                 System.out.println("Welcome!!!");
//                 Thread.sleep(3000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }
// public class cse{
//     public static void main(String[] args) {
//         GoodMorning gm = new GoodMorning();
//         Hello he = new Hello();
//         Welcome wel = new Welcome();
//         Thread thread1 = new Thread(gm);
//         Thread thread2 = new Thread(he);
//         Thread thread3 = new Thread(wel);
//         thread1.start();
//         thread2.start();
//         thread3.start();
//     }
// }

//10 b
//synchronized block

// class Table {
//     void printTable(int n) {
//         synchronized (this) {
//             for (int i = 1; i <= 10; i++) {
//                 System.out.println(n * i);
//                 try {
//                     Thread.sleep(2000);
//                 } catch (Exception es) {
//                     System.out.println(es);
//                 }
//             }
//         }
//     }
// }

// class MyThread1 extends Thread {
//     Table t;

//     MyThread1(Table t) {
//         this.t = t;
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

// public class cse {
//     public static void main(String[] args) {
//         Table obj = new Table();
//         MyThread1 t1 = new MyThread1(obj);
//         MyThread2 t2 = new MyThread2(obj);
//         t1.start();
//         t2.start();
//     }
// }

// synchroized method
// class Table {
//    synchronized void printTable(int n) {
//             for (int i = 1; i <= 10; i++) {
//                 System.out.println(n + " * " + i + " = " + n*i);
//                 try {
//                     Thread.sleep(2000);
//                 } catch (Exception es) {
//                     System.out.println(es);
//                 }
//             }
//         }
//     }

// class MyThread1 extends Thread {
//     Table t;

//     MyThread1(Table t) {
//         this.t = t;
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

// public class cse {
//     public static void main(String[] args) {
//         Table obj = new Table();
//         MyThread1 t1 = new MyThread1(obj);
//         MyThread2 t2 = new MyThread2(obj);
//         t1.start();
//         t2.start();
//     }
// }

//11 a

// import java.awt.*;
// import javax.swing.*;

// public class cse extends JPanel implements Runnable {
//     private String message = "Welcome to Java Programming! ";
//     private int x = 0;
//     private Thread thread;

//     public cse() {
//         setBackground(Color.WHITE);
//         setForeground(Color.BLUE);

//         // Start the thread for scrolling the message
//         thread = new Thread(this);
//         thread.start();
//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);

//         // Draw the scrolling message
//         g.drawString(message, x, 50);
//     }

//     @Override
//     public void run() {
//         while (true) {
//             x += 5; // Increment x-coordinate
//             if (x > getWidth()) { // Reset position when message moves out of view
//                 x = -message.length(); // Adjust to start from the left
//             }
//             repaint(); // Redraw the panel
//             try {  
//                 Thread.sleep(100); // Delay for smooth scrolling
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Scrolling Message Example");
//         frame.setSize(400, 200);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // Add the custom panel to the frame
//         frame.add(new cse());
//         frame.setVisible(true);
//     }
// }

// import java.awt.*;
// import javax.swing.*;

// public class cse extends JPanel implements Runnable {
//     private String message  = "sarvan";
//     private int x = 5;
//     Thread thread;

//     public cse() {
//         setBackground(Color.CYAN);
//         setForeground(Color.BLUE);

//         thread  = new Thread(this);
//         thread.start();

//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         g.drawString(message, x, 150);
//     }

//     @Override
//     public void run() {
//         while (true) {
//             x += 5;
//             if (x > getWidth()) {
//                 x = -message.length() * 7;
//             }
//             repaint();
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 System.out.println(e.getLocalizedMessage());
//             }
//         } 
//     }

//     public static void main(String args[] ) {
//         JFrame frame = new JFrame("Scrolling message!!!!");
//         frame.setSize(400,400);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         frame.add(new cse());
//         frame.setVisible(true);
//     }

// }

//11b

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class cse {
//     public static void main(String[] args) {
//         // Create JFrame
//         JFrame frame = new JFrame("Registration Page");
//         frame.setSize(400, 400);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // Set Layout Manager
//         frame.setLayout(new GridLayout(6, 2, 10, 10));

//         // Add Labels and TextFields
//         JLabel nameLabel = new JLabel("Name:");
//         JTextField nameField = new JTextField();

//         JLabel emailLabel = new JLabel("Email:");
//         JTextField emailField = new JTextField();

//         JLabel passwordLabel = new JLabel("Password:");
//         JPasswordField passwordField = new JPasswordField();

//         JLabel genderLabel = new JLabel("Gender:");
//         JPanel genderPanel = new JPanel();

//         JRadioButton maleButton = new JRadioButton("Male");
//         JRadioButton femaleButton = new JRadioButton("Female");
//         ButtonGroup genderGroup = new ButtonGroup();
//         genderGroup.add(maleButton);
//         genderGroup.add(femaleButton);
//         genderPanel.add(maleButton);
//         genderPanel.add(femaleButton);

//         JLabel countryLabel = new JLabel("Country:");
//         String[] countries = { "Select Country", "USA", "UK", "India", "Australia" };
//         JComboBox<String> countryCombo = new JComboBox<>(countries);

//         JButton submitButton = new JButton("Submit");

//         // Add components to the frame
//         frame.add(nameLabel);
//         frame.add(nameField);

//         frame.add(emailLabel);
//         frame.add(emailField);

//         frame.add(passwordLabel);
//         frame.add(passwordField);

//         frame.add(genderLabel);
//         frame.add(genderPanel);

//         frame.add(countryLabel);
//         frame.add(countryCombo);

//         frame.add(new JLabel()); // Empty cell for alignment
//         frame.add(submitButton);

//         // Add Action Listener for Submit Button
//         submitButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 String name = nameField.getText();
//                 String email = emailField.getText();
//                 String password = new String(passwordField.getPassword());
//                 String gender = maleButton.isSelected() ? "Male" : "Female";
//                 String country = (String) countryCombo.getSelectedItem();

//                 JOptionPane.showMessageDialog(frame,
//                         "Name: " + name +
//                                 "\nEmail: " + email +
//                                 "\nPassword: " + password +
//                                 "\nGender: " + gender +
//                                 "\nCountry: " + country,
//                          "Registration Details", JOptionPane.INFORMATION_MESSAGE);
//             }
//         });

//         // Make Frame Visible
//         frame.setVisible(true);
//     }
// }

//11 c

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;

// public class cse extends JFrame {
//     private JLabel statusLabel;
//     public cse() {
//         setTitle("Mouse Event Example");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());
//         statusLabel = new JLabel("Interact with the panel to see mouse events.");
//         statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
//         add(statusLabel, BorderLayout.SOUTH);
//         JPanel panel = new JPanel();
//         panel.setBackground(Color.LIGHT_GRAY);
//         add(panel, BorderLayout.CENTER);
//         panel.addMouseListener(new MouseAdapter() {
//             @Override
//             public void mouseClicked(MouseEvent e) {
//                 statusLabel.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
//             }
//             @Override
//             public void mouseEntered(MouseEvent e) {
//                 statusLabel.setText("Mouse entered the panel.");
//             }
//             @Override
//             public void mouseExited(MouseEvent e) {
//                 statusLabel.setText("Mouse exited the panel.");
//             }
//             @Override
//             public void mouseReleased(MouseEvent e) {
//                 statusLabel.setText("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
//             }
//         });
//         panel.addMouseMotionListener(new MouseAdapter() {
//             @Override
//             public void mouseMoved(MouseEvent e) {
//                 statusLabel.setText("Mouse moved to (" + e.getX() + ", " + e.getY() + ")");
//             }
//         });
//     }
//     public static void main(String[] args) {
//         // Create and display the frame
//         SwingUtilities.invokeLater(() -> {
//             cse frame = new cse();
//             frame.setVisible(true);
//         });
//     }
// }

//12 a

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;

// public class cse extends JFrame {
//     private JRadioButton lineButton, rectangleButton, ovalButton;
//     private JPanel drawingPanel;
//     private String selectedShape = "Line";
//     private Point startPoint, endPoint;

//     public cse() {
//         // Set up the frame
//         setTitle("Shape Drawer");
//         setSize(600, 400);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         // Create radio buttons for shape selection
//         lineButton = new JRadioButton("Line");
//         rectangleButton = new JRadioButton("Rectangle");
//         ovalButton = new JRadioButton("Oval");

//         // Add radio buttons to a button group
//         ButtonGroup group = new ButtonGroup();
//         group.add(lineButton);
//         group.add(rectangleButton);
//         group.add(ovalButton);

//         // Set default selection
//         lineButton.setSelected(true);

//         // Create a control panel to hold the radio buttons
//         JPanel controlPanel = new JPanel();
//         controlPanel.setLayout(new FlowLayout());
//         controlPanel.add(lineButton);
//         controlPanel.add(rectangleButton);
//         controlPanel.add(ovalButton);

//         add(controlPanel, BorderLayout.NORTH);

//         // Create the drawing panel
//         drawingPanel = new JPanel() {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 super.paintComponent(g);
//                 if (startPoint != null && endPoint != null) {
//                     Graphics2D g2d = (Graphics2D) g;
//                     g2d.setStroke(new BasicStroke(2));
//                     switch (selectedShape) {
//                         case "Line":
//                             g2d.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
//                             break;
//                         case "Rectangle":
//                             int rectX = Math.min(startPoint.x, endPoint.x);
//                             int rectY = Math.min(startPoint.y, endPoint.y);
//                             int rectWidth = Math.abs(endPoint.x - startPoint.x);
//                             int rectHeight = Math.abs(endPoint.y - startPoint.y);
//                             g2d.drawRect(rectX, rectY, rectWidth, rectHeight);
//                             break;
//                         case "Oval":
//                             int ovalX = Math.min(startPoint.x, endPoint.x);
//                             int ovalY = Math.min(startPoint.y, endPoint.y);
//                             int ovalWidth = Math.abs(endPoint.x - startPoint.x);
//                             int ovalHeight = Math.abs(endPoint.y - startPoint.y);
//                             g2d.drawOval(ovalX, ovalY, ovalWidth, ovalHeight);
//                             break;
//                     }
//                 }
//             }
//         };
//         drawingPanel.setBackground(Color.WHITE);
//         add(drawingPanel, BorderLayout.CENTER);

//         // Add mouse listeners to the drawing panel
//         drawingPanel.addMouseListener(new MouseAdapter() {
//             @Override
//             public void mousePressed(MouseEvent e) {
//                 startPoint = e.getPoint();
//             }

//             @Override
//             public void mouseReleased(MouseEvent e) {
//                 endPoint = e.getPoint();
//                 drawingPanel.repaint();
//             }
//         });

//         // Add action listeners for radio buttons
//         lineButton.addActionListener(e -> selectedShape = "Line");
//         rectangleButton.addActionListener(e -> selectedShape = "Rectangle");
//         ovalButton.addActionListener(e -> selectedShape = "Oval");
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             cse frame = new cse();
//             frame.setVisible(true);
//         });
//     }
// }

//12 b
// import java.awt.*;
// import javax.swing.*;
// import javax.swing.table.DefaultTableModel;

// public class cse {
// public static void main(String[] args) {
// JFrame frame = new JFrame("Table");
// frame.setSize(300,300);
// frame.setBackground(Color.CYAN);
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// String columns[] = {"Name", "Roll no", "marks", "age"};
// String data[][] = {
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", },
// {"sarvan", "41", "67", "19"},
// {"suhas", "47", "84", }

// };
// JTable table = new JTable(new DefaultTableModel(data,columns));
// JScrollPane jsp = new JScrollPane(table);
// frame.add(jsp);
// frame.setVisible(true);

// }
// }

                                // 12 c
// import javax.swing.*;
// import javax.swing.table.DefaultTableModel;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.io.*;
// import java.util.ArrayList;
// import java.util.List;

// public class cse extends JFrame {
//     private JTable table;
//     private JComboBox<String> departmentComboBox;
//     private DefaultTableModel tableModel;

//     private List<String[]> employeeData; // Stores the employee data from the CSV

//     public cse() {
//         // Set up the frame
//         setTitle("Employee Data Viewer");
//         setSize(800, 600);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         // Panel for controls (JFileChooser and department filter)
//         JPanel controlPanel = new JPanel();
//         JButton loadFileButton = new JButton("Load CSV File");
//         departmentComboBox = new JComboBox<>(new String[] { "All Departments" });
//         controlPanel.add(loadFileButton);
//         controlPanel.add(new JLabel("Filter by Department:"));
//         controlPanel.add(departmentComboBox);

//         add(controlPanel, BorderLayout.NORTH);

//         // Table to display employee data
//         tableModel = new DefaultTableModel(new String[] { "ID", "Name", "Age",
//                 "Department", "Salary" }, 0);
//         table = new JTable(tableModel);
//         add(new JScrollPane(table), BorderLayout.CENTER);

//         // List to store employee data
//         employeeData = new ArrayList<>();

//         // Action listener for "Load CSV File" button
//         loadFileButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 loadCSVFile();
//             }
//         });

//         // Action listener for department filter
//         departmentComboBox.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 filterByDepartment((String) departmentComboBox.getSelectedItem());
//             }
//         });
//     }

//     // Method to load the CSV file
//     private void  loadCSVFile() {
//         JFileChooser fileChooser = new JFileChooser();
//         int result = fileChooser.showOpenDialog(this);
//         if (result == JFileChooser.APPROVE_OPTION) {
//             File selectedFile = fileChooser.getSelectedFile();
//             readCSVFile(selectedFile);
//         }
//     }

//     // Method to read the CSV file and populate data
//     private void readCSVFile(File file) {
//         employeeData.clear();
//         tableModel.setRowCount(0); // Clear the table

//         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 String[] data = line.split(",");
//                 employeeData.add(data);
//             }

//             // Populate the department combo box
//             populateDepartmentComboBox();

//             // Show all data by default
//             filterByDepartment("All Departments");

//         } catch (IOException e) {
//             JOptionPane.showMessageDialog(this, "Error reading the file: " +
//                     e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//         }
//     }

//     // Method to populate the department combo box
//     private void populateDepartmentComboBox() {
//         departmentComboBox.removeAllItems();
//         departmentComboBox.addItem("All Departments");

//         employeeData.stream()
//                 .map(data -> data[3]) // Get the department field
//                 .distinct()
//                 .forEach(departmentComboBox::addItem);
//     }

//     // Method to filter and display data by department
//     private void filterByDepartment(String department) {
//         tableModel.setRowCount(0); // Clear the table 

//         for (String[] data : employeeData) {
//             if ("All Departments".equals(department) || data[3].equals(department)) {
//                 tableModel.addRow(data);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             cse frame = new cse();
//             frame.setVisible(true);
//         });
//     }
// }
