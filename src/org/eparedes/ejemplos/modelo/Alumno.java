package org.eparedes.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota=" + nota;
    }

    @Override
    public int compareTo(Alumno a) {
        if(this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(a.nombre);

//        if(this.nota == a.nota) {
//            return 0;
//        } else if(this.nota > a.nota) {
//            return 1;
//        } else {
//            return -1;
//        }

//        Orden ASC por nota
//        if(this.nota == null){
//            return 0;
//        }
//        return this.nota.compareTo(a.nota);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Alumno alumno = (Alumno) object;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
