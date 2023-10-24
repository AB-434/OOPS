package OOPS;
class Student{
    String division,college;
    Student(String division,String college){
        this.division=division;
        this.college=college;
    }
}
public class Aggregation {
    String name;
    int en_no;
    Student student;
    Aggregation(String name,int en_no,Student student){
        this.name=name;
        this.en_no=en_no;
        this.student=student;
    }
    void display(){
        System.out.println(name+" "+en_no);
        System.out.println(student.division+" "+student.college);
    }
    public static void main(String[] args) {
        Student obj=new Student("3A2","Parul University");
        Aggregation obj1=new Aggregation("Arnaw",34,obj);
        obj1.display();
    }
}
