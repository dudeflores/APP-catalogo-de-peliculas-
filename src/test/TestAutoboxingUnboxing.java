
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases Wrap de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean = Boolean
        byte = Byte
        char = Character
        short = Short
        */
        
        Integer entero = 10; //Autoboxing
        System.out.println("entero = " +entero);
        System.out.println("entero double = " +entero.doubleValue());
        
        //Unboxing
        int entero2 = entero;
        System.out.println("Entero2 = " +entero2);
        
    }
}
