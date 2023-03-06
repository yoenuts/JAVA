package AccessorNMut;

public class Person {
    private String firstName;
    private String lastName;
    //default
    public Person() {
        firstName = "";
        lastName = "";
    }
    //takes in Parameters
    public Person(String first, String last){
        //hello mutator!
        setName(first, last);
    }

    // create mutator here
    public void setName(String first, String last) {
        firstName = first;
        lastName = last;
    }

    // 2 accessor methods here
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String toString() {
        return ("Hello, " + firstName + " " + lastName);
    }

}
