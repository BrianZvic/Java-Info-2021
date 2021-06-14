import java.util.*;


public class Ejercicio3 {
    public static void main(String[] args){
        ArrayList<String> baraja = new ArrayList<String>();
        maso(baraja);
        imprInversa(baraja);
        System.out.println("----------------------------------------------");
        System.out.println(baraja);
        System.out.println("----------------------------------------------");
        mezclado(baraja);
    }

    public static void maso(ArrayList<String> baraja){
        baraja.add("1");
        baraja.add("2");
        baraja.add("3");
        baraja.add("4");
        baraja.add("5");
        baraja.add("6");
        baraja.add("7");
        baraja.add("8");
        baraja.add("9");
        baraja.add("10");
        baraja.add("J");
        baraja.add("K");
        baraja.add("Q");

    }
    
    public static void imprInversa(ArrayList<String> baraja){
        
        ArrayList<String> maso = new ArrayList<String>(baraja);

        Collections.reverse(maso);
        System.out.println(maso);
    }

    public static void mezclado(ArrayList<String> baraja){
        ArrayList<String> maso = new ArrayList<String>(baraja);
        Collections.shuffle(maso);
        System.out.println(maso);
    }

}
