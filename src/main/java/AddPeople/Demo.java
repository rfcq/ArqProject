package AddPeople;

public class Demo {
    public static void main(String args[]){

        People person1 = new Person(1, "John Doe", "Grandpa");
        People person2 = new Person(2, "Johnny", "Father");

        Composite composite = new Composite(1, "Father Side");

        composite.addPerson(person1);
        composite.addPerson(person2);

        composite.printPerson();
    }
}
