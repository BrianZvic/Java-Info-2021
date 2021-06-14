import java.util.*;


public class ejercicio1 {
    
    public static void main(String[] args){
         
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo:");
        String nombre = scan.nextLine();
        scan.close();
        System.out.println("-------------------------------");
        System.out.println("HOLA "+ nombre);
    }
}
