package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args){
        /*
        String universidades[];
        universidades = new String[5];
        universidades[0]="ITVH";
        universidades[1]="ULA";
        universidades[2]="UAM";
        universidades[3]="IPN";
        universidades[4]="UNAM";

        for(String universidad : universidades){
            System.out.println(universidad);
        }
        */
        Set<String> frutas =new HashSet();
        //Caracteristicas principales del SET
        //No puede contener elementos duplicados
        //El orden de los elementos puede variar
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");

        for (String fruta:frutas){
            System.out.println(fruta);
        }
        System.out.println("-------------TreeSet-----------");

        Set<String> frutas2 =new TreeSet<>();
        //Es más lento que el HashSet
        //Este ordena los elementos en orde alfabetico
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melon");
        frutas2.add("Lima");
        for (String fruta:frutas2){
            System.out.println(fruta);
        }
        System.out.println("-----------LinkedHashSet------------");

        Set<String> frutas3 =new LinkedHashSet<>();
        //Es un poco más costosa que HashSet
        //Almacena los valores en orden de inserción
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");
        for (String fruta:frutas3) {
            System.out.println(fruta);
        }

        System.out.println("-------------ArrayList--------------");
        List<String> frutas4 = new ArrayList<>();
        //List si admite elementos duplicados
        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melon");
        frutas4.add("Lima");
        frutas4.add("Mango");

        for (String fruta:frutas4) {
            System.out.println(fruta);
        }

        System.out.println("------------Elemento ArrayList---------------");
        System.out.println(frutas4.get(3));

        int indice=frutas4.indexOf("Melon");
        System.out.println("El melón tiene indice: "+indice);

        System.out.println("-------------LinkedList--------------");
        List<String> frutas5 = new ArrayList<>();
        //List si admite elementos duplicados
        frutas5.add("Mango");
        frutas5.add("Fresa");
        frutas5.add("Pera");
        frutas5.add("Uva");
        frutas5.add("Melon");
        frutas5.add("Lima");
        for (String fruta:frutas4) {
            System.out.println(fruta);
        }

        System.out.println("-------------MAP--------------");
        Map<Integer,String> universidades = new HashMap<Integer,String>();
        //El map se llena a pares, como una función en matemáticas
        //Asocia claves con valores y no puede tener claves repetidas y que solo puede tener un valor asociado a la clave
        universidades.put(1,"IPM");
        universidades.put(2,"UNAM");
        universidades.put(3,"UAEM");
        universidades.put(4,"UAM");
        universidades.put(5,"TESCO");
        System.out.println(universidades.get(3));
        for(Map.Entry<Integer,String> universidad:universidades.entrySet()){
            System.out.println("Clave="+universidad.getKey()+", Valor: "+universidad.getValue());
        }
    }

}
