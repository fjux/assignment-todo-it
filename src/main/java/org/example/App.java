package org.example;


import org.example.models.AppRole;
import org.example.models.AppUser;
import org.example.models.Person;
import org.example.models.TodoItem;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        AppUser appUser = new AppUser("erik", "2387hfjgj", AppRole.ROLE_APP_USER);

    }
}