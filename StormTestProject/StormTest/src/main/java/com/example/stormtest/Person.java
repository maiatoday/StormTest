package com.example.stormtest;

import com.turbomanage.storm.api.Entity;
import com.turbomanage.storm.api.Id;

/**
 * Created by maia on 2013/10/26.
 */
@Entity
public class Person {

    @Id
    long id;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    int myInt;
    String myString;

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }
}
