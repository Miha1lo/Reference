package com.company;

public class CoutryTest {
    public static void main(String[] args) {

        Country european = new Country();
        european.name = "Ukraine";
        european.population = 44_130_000;
        european.square = 603_548;

        System.out.println("Characteristics of one european country: ");
        System.out.println("Name: " + european.name);
        System.out.println("Square: " + european.square + " sq km");
        System.out.println("Population: " + european.population);
        System.out.println();

        Country asian = new Country();
        asian.name = "China";
        asian.population = 1_402_000_000;
        asian.square = 9_597_000;

        System.out.println("Characteristics of one asian country: ");
        System.out.println("Name: " + asian.name);
        System.out.println("Square: " + asian.square + " sq km");
        System.out.println("Population: " + asian.population);
        System.out.println();

        Country african = new Country();
        african.name = "Egypt";
        african.population = 102_300_000;
        african.square = 1_010_408;

        System.out.println("Characteristics of one african country: ");
        System.out.println("Name: " + african.name);
        System.out.println("Square: " + african.square + " sq km");
        System.out.println("Population: " + african.population);
        System.out.println();

    }


}
