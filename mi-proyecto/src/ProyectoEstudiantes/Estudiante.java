package ProyectoEstudiantes;

import java.util.ArrayList;

public class Estudiante {

    private String id;
    private String name;
    private String lastName;
    private ArrayList<Double> notes;


    public Estudiante(String id, String name, String lastName, ArrayList<Double>  notes) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.notes = notes;
    }

    public Estudiante(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.notes = new ArrayList<>();
    }

    public Estudiante() {
        this.notes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double>  getNotes() {
        return notes;
    }

    public void setNotes(double notes) {
        this.notes.add(notes);
    }

    @Override
    public String toString() {
        return id + " "+ name+ " " + lastName+" "+ notes;
    }
}
