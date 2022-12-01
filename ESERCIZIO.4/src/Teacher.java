public class Teacher {
    public String teacherName;


    public Teacher(String teacherName){
        this.teacherName = teacherName;
        System.out.println("New teacher " + teacherName);
    }

    public void assignGrade(Student student, int finalGrade){

        student.grade = finalGrade;
        System.out.println(student.name + ", here's your final grade: " + finalGrade);


    }
}
