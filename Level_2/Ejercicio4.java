import java.util.*;




public class Ejercicio4 {
    public static void main(String[] args){
    ArrayList<String> alumnos = new ArrayList<String>();
        alumnos(alumnos);
        cursos(alumnos);

    }


    public static void alumnos(ArrayList<String> alumnos){
        alumnos.add("Juan");
        alumnos.add("Pedro");
        alumnos.add("Keith");
        alumnos.add("Braim");
        alumnos.add("Brian");
        alumnos.add("Braian");
        alumnos.add("Uriel");
        alumnos.add("Alan");
        alumnos.add("Santiago");
        alumnos.add("Karla");
        alumnos.add("Julieta");
        alumnos.add("Macarena");
  
  
  
    }

    public static void cursos(ArrayList<String> alumnos){
        List<String> curso_1 = alumnos.subList(0, 4);
        List<String> curso_2 = alumnos.subList(4, 8);
        List<String> curso_3 = alumnos.subList(8, 12);
        

        
        System.out.println("Curso N°1: " + curso_1);
        System.out.println("Curso N°2: " + curso_2);
        System.out.println("Curso N°3: " + curso_3);

    }
}