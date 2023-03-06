package AccessorNMut;

public class createSim {
    public static void main(String[] args) {
        Person erlein = new Person("Erlein","Ureta");
        Person name = new Person();
        System.out.println(erlein);
        System.out.println(name);

        name.setName("Arnie","Armada");
        System.out.println(name);
    }
}
