public class Main {
    public static void main(String[] args) {

        Student student1, student2;
        student1 = new Student("Luca");
        student2 = new Student("Laura");


        Teacher teacher1 = new Teacher("Francesca");
        teacher1.assignGrade(student1, 10);
        teacher1.assignGrade(student2, 8);
        student1.getStudentDetails();
        student2.getStudentDetails();
    }

}