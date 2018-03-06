/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 * @author 13005626
 * 
 * Minimal "person" class.
 *
 * At the moment a Person object just holds their name, but in a more realistic
 * system, there would obviously be more.
 */
public class Person 
{

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}