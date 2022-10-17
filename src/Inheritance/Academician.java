package Inheritance;

public class Academician extends Employee{
    String department,tasks;
    String lessonns;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getLessonns() {
        return lessonns;
    }

    public void setLessonns(String lessonns) {
        this.lessonns = lessonns;
    }

    Academician(String nameSurname, String eposta, String phone , String department, String tasks, String lessonns){
        super(nameSurname,eposta,phone);
        this.department=department;
        this.tasks=tasks;
        this.lessonns=lessonns;

    }

    public void enterCourse(){
        System.out.println("Derse girildi");
    }

}
