import java.util.Scanner;

public class ejercicio_3 {
    public static Scanner scan = new Scanner(System.in);
    

    public static void main(String[] args){

        System.out.print("Ingrese un numero: ");
        int numero = scan.nextInt();
        scan.close();
        escalera(numero);

    }

    public static void escalera(int numero){
        for(int i = 1; i <= numero; i++ ){
            for(int j = 1; j <= i; j++){
              System.out.print(j);
            }
            System.out.println("");
          }
    }
        



}
