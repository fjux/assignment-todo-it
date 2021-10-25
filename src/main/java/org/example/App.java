package org.example;


import org.example.models.Person;
import org.example.models.TodoItem;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Person erik = new Person(1, "Erik", "Alfredsson", "erik@mail.com");
        System.out.println(erik.getSummary());
        System.out.println(erik);

        TodoItem changeTires = new TodoItem(2, "Change Tires", "Change tires on your car", LocalDate.of(2021, 11, 3), false, erik);
        System.out.println(changeTires.isOverdue());
        System.out.println(changeTires.getSummary());
    }
}