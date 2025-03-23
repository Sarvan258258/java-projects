package packageA;

public class Student {
    String name;
    int rollNo;
    public Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public void setNewRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setNewNme(String name){
        this.name = name;
    }
    public int getRollNo(){
        return this.rollNo;
    }
    public String getName(){
        return this.name;
    }
}
