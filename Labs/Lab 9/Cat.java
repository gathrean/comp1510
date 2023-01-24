package ca.bcit.comp1510.lab09;

/**
 * A Java program that manages a Cat Hotel.
 * 
 * This is the constructor class for CatHotel.java.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Cat {

    /** Name of the cat. */
    private final String name;

    /** Age of the cat. */
    private int age;

    /**
     * The constructor for cat.
     * 
     * @param name      String
     * @param age       int
     */
    public Cat(String name, int age) {

        if (name.trim().isEmpty()) {
            this.name = "Cleo";
        } else {
            this.name = name;
        }
        
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }

    }
    
    /**
     * Constructs a CAt object by defining its age.
     * @param age int
     */
    public Cat(int age) {
        this.name = "Cleo";
        
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    /**
     * Accessor for the Cat name.
     * 
     * @return catName String
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor for the Cat age.
     * 
     * @return catAge int
     */
    public int getAge() {
        return age;
    }

    /**
     * Mutator for the Cat age.
     * 
     * @param age int
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Cat class's toString method.
     * 
     * @return catName and catAge
     */
    public String toString() {
        return "Cat name: " + name + "\tAge: " + age + "\n";
    }
}
