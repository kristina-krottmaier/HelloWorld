// Basisklasse Person
class Person {
    private String name;
    private String firstName;
    public int age;

    // Konstruktor
    public Person(String name, String firstName, int age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }
    //stter für name und firstname
    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Methode zur Rückgabe des vollständigen Namens
    public String fullName() {
        return firstName + " " + name;
    }
}