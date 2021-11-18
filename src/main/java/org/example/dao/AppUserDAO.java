package org.example.dao;

import org.example.models.AppUser;

import java.util.List;

public interface AppUserDAO {

    AppUser persist(AppUser appUser);
    List<AppUser> findAll();
    AppUser findByUsername(String username);
    void remove(String username);


}
