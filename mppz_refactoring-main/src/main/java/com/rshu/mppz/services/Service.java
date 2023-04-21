package com.rshu.mppz.services;

import com.rshu.mppz.MyException;
import com.rshu.mppz.models.User;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class Service {



    @Test
    public void res() {
        try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
            writer.println("hello world!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void createUser() {
        try {
            saveUser();
        } catch (SQLException | MyException e) {
//            System.out.println("CATCH BLOCK: SQLException");
            if (e instanceof MyException)
            System.out.println(((MyException) e).getMessage());
        } finally {
            System.out.println("FINALLY BLOCK: save logs with user info");
        }

    }
    @Test
    public void saveUser() throws SQLException {
        User user = new User();
        user.setAge(21);
        user.setName("Jhon");

        user = validateUser(user);
        saveToDb(user);
    }

    private User validateUser(User user) {
        if (user.getAge() < 23) {
            user = null;
        }
        return user;
    }



    private void saveToDb(User user) throws SQLException {
        if (user == null) {
//            throw new SQLException("SQL: I can't save null object");
            throw new MyException("my exception");
        }
        System.out.println("user was saved to database");
    }


}
