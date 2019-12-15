package com.example.girish.main.utility;


import org.hibernate.Session;
import org.hibernate.tuple.ValueGenerator;

public class LoggedInUser implements ValueGenerator<Long> {
    @Override
    public Long generateValue(Session session, Object owner) {
        return 1L;
    }
}
