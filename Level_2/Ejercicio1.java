import java.util.ArrayList;
import java.util.Scanner;



public class Ejercicio1 {
    
    public static void main(String[] args){
        ArrayList<String> ciudades = new ArrayList<String>();
        cargar(ciudades);
        imprimir(ciudades);
        
    }



    public static void cargar(ArrayList<String> ciudades){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una ciudad: ");
        ciudades.add(scan.nextLine());
        System.out.print("Ingrese una ciudad: ");
        ciudades.add(scan.nextLine());
        System.out.print("Ingrese una ciudad: ");
        ciudades.add(scan.nextLine());
        scan.close();
    }
    public static void imprimir(ArrayList<String> ciudades){
        System.out.println("#1 " + ciudades.get(0));
        System.out.println("#2 " + ciudades.get(1));
        System.out.println("#3 " + ciudades.get(2));
    }
}
