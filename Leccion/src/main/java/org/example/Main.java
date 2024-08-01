package org.example;

public class Main {
    public static void main(String []args){

        Pajaro elkin = new Pajaro("elkin");
        elkin.comer();
        elkin.volar();
        System.out.println(elkin.cantar("Pajaro"));
}
}