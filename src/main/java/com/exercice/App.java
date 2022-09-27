package com.exercice;

public class App {

    public static void main(String[] args) {
        System.out.println("Il est 12 h 34 min 56 s.");
        int secondes = 56;
        int minutes = 2040;
        int heures = 43200;
        int heureactuelle = secondes + minutes + heures;
        System.out.println("Il s'est écoulé " + heureactuelle + " secondes depuis minuit");
    }

}
