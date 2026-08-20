package S03.ACT2;

public class Main {
    public static void main(String[] args) {
       
        Estudiante e1 = new Estudiante("Itzel", "Ing. en Administración", 9.2);
        Estudiante e2 = new Estudiante("Santiago", "Lic. en Derecho", 8.5);
        Estudiante e3 = new Estudiante("Alain", "Ing. Industrial", 7);
        Estudiante e4 = new Estudiante("Alejandro", "Cirujano Dentista", 6.8);
   
        System.out.println("==================================================");
        e1.mostrarDatos();
        e1.evaluarRendimiento();
        System.out.println("==================================================");
        e2.mostrarDatos();
        e2.evaluarRendimiento();
        System.out.println("==================================================");
        e3.mostrarDatos();
        e3.evaluarRendimiento();
        System.out.println("==================================================");
        e4.mostrarDatos();
        e4.evaluarRendimiento();
        System.out.println("==================================================");
    }
}
