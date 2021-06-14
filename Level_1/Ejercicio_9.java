import java.util.*;

public class Ejercicio_9 {
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scan.nextLine().toLowerCase();
        System.out.print("Ingrese una letra para buscar en la frase: ");
        char letra = scan.nextLine().toLowerCase().charAt(0);
        int contador = 0;
        scan.close();

        for (int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i) == letra){
                contador++;
            }
        }
        System.out.println("El caracter de en la palabra elegida, aparece " + contador + " veces");
    }
}
