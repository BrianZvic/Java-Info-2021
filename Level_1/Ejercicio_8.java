
import java.util.*;

public class Ejercicio_8 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Ingrese: ciudad - direccion - nombre - edad");
      String ciudad = scan.nextLine();
      String direccion = scan.nextLine();
      String nombre = scan.nextLine();
      int edad = scan.nextInt();
      String completo = ciudad + " - " + direccion + " - " + edad + " - " + nombre;
      System.out.println(completo);
      scan.close();
    }
  }
