package org.example;


import org.example.models.Person;

public class App {
    public static void main(String[] args) {
        Person erik = new Person(1, "Erik", "Alfredsson", "erik@mail.com");
        System.out.println(erik.getSummary());
    }



}