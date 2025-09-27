package ProyectoEstudiantes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Mundo {
    
    Salon salon = new Salon("Stefy","Noveno") ;
    ArrayList<Estudiante> studentsList = new ArrayList<>();

    

    public void menu(){
        int select =  Integer.parseInt(JOptionPane.showInputDialog(null,"Que desea hacer hoy:\n" +
                "1. Agregar Estudiante \n" +
                "2. Listar Estudiante\n" +
                "3. Añadir Notas\n" +
                "4. Contar Estudiantes\n" +
                "5. Estudiantes Aprobados\n" +
                "6. Estudiantes Reprobados\n" +
                "7. El Mejor Promedio\n" +
                "8. Salir.\n" ));

        switch (select) {
            case 1:
                createEstudiante();
                break;
            case 2:
                list();
                break;
            case 3:
                addNotes();
                break;
            case 4:
                contarStudents();
                break;
            case 5:
                aprobados();
                break;
            case 6:
                reprobados();
                break;
            case 7:
                bestPromedio();
                break;
            case 8:
                break;


            default:
                JOptionPane.showMessageDialog(null,"Error - numero invalido");
        }


    }

    private void createEstudiante(){

        Estudiante st = new Estudiante();

        String id = JOptionPane.showInputDialog("Digite el documento del estudiante: ");
        String name = JOptionPane.showInputDialog("Digite el nombre del estudiante: ");
        String lastName = JOptionPane.showInputDialog("Digite los apellidos del estudiante: ");

        st.setId(id);
        st.setName(name);
        st.setLastName(lastName);
        studentsList.add(st);

        new ArrayList<>();
        salon.setStudents(studentsList);

        menu();
    }
    
    private void list(){

        String students = "";
        for (Estudiante estudiante : studentsList) {

            students += estudiante + "\n" ;

        }
        JOptionPane.showMessageDialog(null,students);
        menu();
    }

    private void addNotes(){

        String id = JOptionPane.showInputDialog("Digite documento del estudiante a add note");
        double notes = Double.parseDouble(JOptionPane.showInputDialog("Digite la Nota"));

        for (Estudiante estudiante : studentsList) {
            if(estudiante.getId().equals(id)){
                estudiante.setNotes(notes);
            }
        }
        menu();

    }

    private void contarStudents(){

        int total = studentsList.size();

        JOptionPane.showMessageDialog(null,"En total hay: " +total +" Estudiantes");

        menu();
    }

    private void aprobados(){
        ArrayList<Estudiante> aprobadosList = new ArrayList<>();

        for (Estudiante estudiante : studentsList) {
            if(getPromedio(estudiante) >= 3.0){
                aprobadosList.add(estudiante);
            }
        }
        if(!aprobadosList.isEmpty()){
            String mensaje = "";
            for (Estudiante estudiante : aprobadosList) {
                mensaje += estudiante.getName() + " " + estudiante.getLastName() +
                        " - Nota: " + getPromedio(estudiante) + "\n";
            }
             JOptionPane.showMessageDialog(null, mensaje);
        }else JOptionPane.showMessageDialog(null,"No hay aprobados");

        menu();
    }


     private void reprobados(){
        ArrayList<Estudiante> reprobadosList = new ArrayList<>();

        for (Estudiante estudiante : studentsList) {
             if (getPromedio(estudiante) < 3.0) {
                 reprobadosList.add(estudiante);
             }
         }
         if (!reprobadosList.isEmpty()){
            String mensaje = " ";

             for (Estudiante estudiante : reprobadosList) {
                 mensaje += estudiante.getName() + " " + estudiante.getLastName() +" Reprobo porque su nota fue:  "
                         + getPromedio(estudiante) + "\n";
             }
                JOptionPane.showMessageDialog(null,mensaje);
         } else JOptionPane.showMessageDialog( null,"No hay Reprobados");
        menu();
     }
     private void bestPromedio(){
        ArrayList<Estudiante> bestList = new ArrayList<>();
        double elMejorPromedio = 0;

        for (Estudiante estudiante : studentsList) {
             if (getPromedio(estudiante) > elMejorPromedio){
                elMejorPromedio = getPromedio(estudiante);
             }
        }

        for (Estudiante estudiante : studentsList) {
             if(getPromedio(estudiante)== elMejorPromedio){
                 bestList.add(estudiante);
             }
        }

        String mensaje = " ";

        for (Estudiante estudiante : bestList) {
             mensaje += estudiante.getName() + " " + estudiante.getLastName() +" Esta en el mejor promedio " +
                     " porque su promedio fue:  "
                     + getPromedio(estudiante) + "\n";
        }
        JOptionPane.showMessageDialog(null,mensaje);

        menu();

     }

     public double getPromedio(Estudiante estudiante){
         double suma = 0;
         for (int i = 0; i < estudiante.getNotes().size()  ; i++) {
             suma += estudiante.getNotes().get(i);
         }
         return  suma / estudiante.getNotes().size();
     }

    public void cargarAlumnos(){

        studentsList.add(new Estudiante("1","Dionicio","Agudelo",crearNotas()));
        studentsList.add(new Estudiante("2","Betty","Barragan",crearNotas()));
        studentsList.add(new Estudiante("3","Ven","Cueva",crearNotas()));
    }


    private ArrayList<Double> crearNotas (){

        ArrayList<Double> notas = new ArrayList<>();
        Random num = new Random();

        notas.add(Math.round(num.nextDouble(1, 5) * 10) / 10.0);
        notas.add(Math.round(num.nextDouble(1, 5) * 10) / 10.0);
        notas.add(Math.round(num.nextDouble(1, 5) * 10) / 10.0);


        return notas;
    }

}
