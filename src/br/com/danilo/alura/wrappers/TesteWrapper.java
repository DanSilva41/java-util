package br.com.danilo.alura.wrappers;

public class TesteWrapper {

    public static void main(String[] args) {
        Integer intRef = Integer.valueOf("3"); // autoboxing
        System.out.println(intRef.intValue()); // unboxing

        Double doubleRef = Double.valueOf("3"); // autoboxing
        System.out.println(doubleRef.doubleValue()); // unboxing

        Boolean booleanRef = Boolean.FALSE; // autoboxing
        System.out.println(booleanRef.booleanValue()); // unboxing

        System.out.println("...");
    }
}
