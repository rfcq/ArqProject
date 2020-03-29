package AddPeople;

import Converter.StringToJson;
import Converter.StringToXML;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Demo {
    public static void main(String args[]) throws IOException, SAXException, ParserConfigurationException {

        People person1 = new Person(1, "John Doe", "Grandpa");
        People person2 = new Person(2, "Johnny", "Father");

        Composite composite = new Composite(1, "Father Side");

        composite.addPerson(person1);
        composite.addPerson(person2);
        StringToJson toJson = new StringToJson(person1);
        StringToXML toXML = new StringToXML(person1);
        composite.printPerson();
        toJson.StringToFormat();
        //toXML.stringToDom();
    }
}
