import Converter.*;

public class Demo {
    public static void main(String args[]){

        People person = new Person(1, "John Doe", "Grandpa");

        Management management = new Management(1, "Father Side");

        management.addPerson(person);

        Formatters formatters = new JsonAdapter(new StringToJson());

        //formatters.StringToFormat();

        management.printPerson();
    }
}
