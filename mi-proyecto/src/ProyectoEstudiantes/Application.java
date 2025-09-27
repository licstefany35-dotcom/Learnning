package ProyectoEstudiantes;

public class Application {
    public static void main(String[] args) {

        Mundo mundo = new Mundo();
        mundo.cargarAlumnos();
        mundo.menu();
    }
}
