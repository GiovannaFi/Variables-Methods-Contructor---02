public class Student {
    public String name;
    public int grade;



    public Student(String studentName){

        this.name = studentName;
        System.out.println("New student " + name);
    }

    public void getStudentDetails(){
        System.out.println(name + " got " + grade);
    }
}
