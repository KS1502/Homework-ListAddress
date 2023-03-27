package Homework;

public class Main {
    public static void main(String[] args) {
        Address address =new Address("Holundestr",1);
        Address address1 = new Address("Blumenweg",2);
        Person person = new Person("Ben");
        Person person1 = new Person("Tim");

        System.out.println(person.name + " "+ address.street+ " "+address.houseNumber);
        System.out.println(person1.name + " "+ address1.street+ " "+address1.houseNumber);
    }
    /*Ben Holundestr 1
Tim Blumenweg 2 */
}
