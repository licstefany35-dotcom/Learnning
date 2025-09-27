package ProyectoEstudiantes;

import java.util.ArrayList;

public class Salon {

    private String teacher;
    private String grado;
    private ArrayList<Estudiante> students;

    public Salon(String teacher, String grado, ArrayList<Estudiante> students) {
        this.teacher = teacher;
        this.grado = grado;
        this.students = students;
    }

    public Salon(String teacher, String grado) {
        this.teacher = teacher;
        this.grado = grado;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public ArrayList<Estudiante> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Estudiante> students) {
        this.students = students;
    }
}
