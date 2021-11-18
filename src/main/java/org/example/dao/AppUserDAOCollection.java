package org.example.dao;

import org.example.models.AppUser;

import java.util.List;

public class AppUserDAOCollection implements AppUserDAO{

    List<AppUser> appUsers;

    @Override
    public AppUser persist(AppUser appUser) {
        return null;
    }

    @Override
    public List<AppUser> findAll() {
        return null;
    }

    @Override
    public AppUser findByUsername(String username) {
        return null;
    }

    @Override
    public void remove(String username) {

    }
}
