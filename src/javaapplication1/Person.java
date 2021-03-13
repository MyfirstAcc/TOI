/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Objects;

/**
 *
 * @author North_PC
 */
/*Pojo class*/
public class Person {

    private String surname;
    private String name;
    private String middlename;
    private String date;
    private String telephonenumber;
    private int ID;
    private int positionOnFile;

    public int getPosition() {
        return positionOnFile;
    }

    public void setPosition(int Position) {
        this.positionOnFile = Position;
    }

    public Person(String surname, String name, String middlename, String date, String telephonenumber, int ID) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.date = date;
        this.telephonenumber = telephonenumber;
        this.ID = ID;
    }

    public Person(String surname, String name, String date, String telephonenumber, int ID) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.telephonenumber = telephonenumber;
        this.ID = ID;
    }

    public Person(String surname, String name, String date, String telephonenumber) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.telephonenumber = telephonenumber;
    }

    public Person(String surname, String name, String middlename, String date, String telephonenumber) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.telephonenumber = telephonenumber;
    }

    public Person(String surname, String name, int position) {
        this.name = name;
        this.surname = surname;
        this.positionOnFile = position;
        this.date = "";
        this.telephonenumber = "";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.surname);
        hash = 73 * hash + Objects.hashCode(this.date);
        hash = 73 * hash + Objects.hashCode(this.telephonenumber);
        hash = 73 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.telephonenumber, other.telephonenumber)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return surname + " " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDate() {
        return date;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getMiddlename() {
        return middlename;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
