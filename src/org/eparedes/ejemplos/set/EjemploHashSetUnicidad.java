package org.eparedes.ejemplos.set;

import org.eparedes.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        // TreeSet Ordena por el metodo compareTo, en este caso las notas repetidas las omite
        Set<Alumno> sa = new HashSet<>();
        // TreeSet Ordena en el orden que se registró y permite repetidos
//        List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));
        System.out.println(sa);

//        No se puede utilizar el for clasico para HashSet
//        System.out.println("Utilizando un for clásico");
//        for (int i = 0; i < sa.size(); i++) {
//            System.out.println(sa.get(i).getNombre());
//        }

        System.out.println("Iterando usando un foreach");
        for (Alumno a: sa){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(a -> System.out.println(a.getNombre()));
    }
}
