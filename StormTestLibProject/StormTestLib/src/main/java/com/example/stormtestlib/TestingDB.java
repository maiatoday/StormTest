package com.example.stormtestlib;

import android.content.Context;

import java.util.List;

/**
 * Created by maia on 2013/10/26.
 */
public class TestingDB {
    Person person;
    long id;

    public static TestingDB getInstance(Context context) {
        return new TestingDB(context);
    }

    public Person getPerson(Context context) {
        com.example.stormtestlib.dao.PersonDao dao = new com.example.stormtestlib.dao.PersonDao(context);
        if (person == null) {
            id = dao.insert(new Person());
        }
        person = dao.get(id);
        return person;
    }

    public void savePerson(Context context) {
        if (person == null) return;
        com.example.stormtestlib.dao.PersonDao dao = new com.example.stormtestlib.dao.PersonDao(context);
        dao.update(person);
    }

    public void deletePerson(Context context) {
        com.example.stormtestlib.dao.PersonDao dao = new com.example.stormtestlib.dao.PersonDao(context);
        dao.delete(id);
        person = null;
    }

    TestingDB(Context context) {
        com.example.stormtestlib.dao.PersonDao dao = new com.example.stormtestlib.dao.PersonDao(context);
        List<Person> existing = dao.listAll();
        if (existing.size() > 0) {
            person = existing.get(0);
            id = person.getId();
        } else {
            id = dao.insert(new Person());
            person = dao.get(id);
        }
    }
}
