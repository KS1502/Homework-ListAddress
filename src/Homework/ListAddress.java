package Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAddress {
    ListAddress listAddress;
    Address address = new Address("Holunder", 1);
    Address address1 = new Address("Blumenweg", 2);
    Person person = new Person("Ben");
    Person person1 = new Person("Tim");
    /*
    Ben
Holunder
1
Tim
Blumenweg
2
 */


    @BeforeEach
    public void init() {
        listAddress = new ListAddress();
    }


    @Test
    public void testAdd() {
        ListAddress ld = new ListAddress();
        Person person = new Person("Ben");
        System.out.println(person.name);
        Address address = new Address("Holunder", 1);
        System.out.println(address.street);
        System.out.println(address.houseNumber);
    }

    /*
    Ben
   Holunder
     1
    */


    @Test
    public void testName() {
        ListAddress ld = new ListAddress();
        Person person1 = new Person("Tim");
        System.out.println(person1.name);
        Address address1 = new Address("Blumenweg", 2);
        System.out.println(address1.street);
        System.out.println(address1.houseNumber);
    }
    /*
    Tim
Blumenweg
    2
*/
}
