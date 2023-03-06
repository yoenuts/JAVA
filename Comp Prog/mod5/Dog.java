//Mod 5 Classes and Objects
//Explore

/**
 * Dog
 */
//create a class Dog with no main method
public class Dog {
    //Include the following instance fields in the dog class: name, breed, weight and barkNoise = 'Woof!'
    private String name;
    private String breed;
    private double weight = 0;
    private String barkNoise = "Woof!";
    //Create a constructor that creates a dog object using parameters for the name, breed 
    //and weight fields. Assign the instance fields to these values.
    public Dog(String name, String Breed, double weight){
        this.name = name;
        Breed = breed;
        this.weight = weight;
    }
    //
    
}