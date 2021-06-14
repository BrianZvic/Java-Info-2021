import java.util.*;





public class Ejercicio2 {
    public static void main(String[] arg){

        ArrayList<Integer> numero = new ArrayList<Integer>();
        numeros(numero);
        iterar(numero);
        numero.set(0, 30);
        numero.add(11);
        iterar(numero);
        
        
    }


    public static void iterar(ArrayList<Integer> numero){
        for(int i = 0; i < numero.size(); i++){
            System.out.println(numero.get(i));
        }
        System.out.println("------------------------------------------");
        System.out.println("El tamaño de la lista es: " + numero.size());
        System.out.println("------------------------------------------");
    }



    public static void numeros(ArrayList<Integer> numero){
        numero.add(5);
        numero.add(3);
        numero.add(2);
        numero.add(6);
        numero.add(10);
    }

}
