import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_7 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una palabra para convertirla: ");
        String caract = scan.nextLine();
        scan.close();
        
        conv(recorrer(caract));
    }

    public static ArrayList<Integer> recorrer(String caract){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i = 0; i < caract.length(); i++){
            int b = (int) caract.charAt(i);
            numeros.add(b);
        }
        return numeros;
    }

    public static void conv(ArrayList<Integer> recorrer){
        
        for (int i = 0; i < recorrer.size(); i++){
            int num = (recorrer.get(i) - 32);
            char letra = (char) num;
            System.out.print(letra);
        }
         
    }
}
