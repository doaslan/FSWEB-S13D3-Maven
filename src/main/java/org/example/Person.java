
package org.example;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    // Eklediğimiz 3 instance variable
    private String gender;
    private String city;
    private String email;

    // İlk constructor
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "Not specified", "Not specified", "Not specified");
    }

    // İkinci constructor: Constructor overloading
    public Person(String firstName, String lastName, int age,
                  String gender, String city, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
