package org.example.dao;

import org.example.models.AppUser;

import java.util.List;

public class AppUserDAOCollection implements AppUserDAO{

    List<AppUser> appUsers;

    public AppUserDAOCollection(List<AppUser> appUsers) {
        this.appUsers = appUsers;
    }

    @Override
    public AppUser persist(AppUser appUser) {
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public List<AppUser> findAll() {
        return appUsers;
    }

    @Override
    public AppUser findByUsername(String username) {
        for(AppUser appUser : appUsers)
            if(appUser.getUsername().equals(username)) {
                return appUser;
            }
        throw new RuntimeException("Could not find app user with username " + username);
    }

    @Override
    public void remove(String username) {
        appUsers.removeIf(appUser -> appUser.getUsername().equals(username));

    }
}
