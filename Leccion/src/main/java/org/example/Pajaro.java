package org.example;

public class Pajaro extends Animal implements Volador {
    private String nombre;

    public Pajaro(String nombreC){
        this.nombre = nombreC;
    }
    @Override
    public void volar() {
        System.out.println("El pajaro esta volando");

    }

    public String cantar(String tipo){

        return "Es de tipo: " + tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre =nombre;
}
}