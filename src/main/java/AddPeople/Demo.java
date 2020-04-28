package AddPeople;

import Converter.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
    public static void main(String args[]) throws IOException, SAXException, ParserConfigurationException {

        People person1 = new Person("John Doe", "Grandpa");
        People person2 = new Person("Johnny", "Father");

        Composite composite = new Composite("Father Side");

        composite.addPerson(person1);
        composite.addPerson(person2);

        ArrayList<People> members = new ArrayList<People>();

        members.add(composite);
        People person3 = new Person("Maria", "Grandma");
        People person4 = new Person("Juliet", "Mother");

        Composite composite1 = new Composite("Mother Side");

        composite1.addPerson(person3);
        composite1.addPerson(person4);

        members.add(composite1);

        StringToJson toJson = new StringToJson(members);
        //StringToXML toXML = new StringToXML(composite);
        //StringToYaml toYaml = new StringToYaml(composite);
        StringToToml toToml = new StringToToml(members);
        StringToXml toXml = new StringToXml(members);
        composite.printPerson();
        toJson.StringToFormat();
        System.out.println("\n");
        toToml.StringToFormat();
        toXml.StringToFormat();
        //toYaml.StringToFormat();
        //toXML.stringToDom();
    }
}
