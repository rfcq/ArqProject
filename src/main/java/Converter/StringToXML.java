package Converter;

import AddPeople.People;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

public class StringToXML {

    private People person;

    public StringToXML() {

    }

    public StringToXML(People person) {
        this.person = person;
    }

    public Document stringToDom() throws SAXException, ParserConfigurationException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        final Document parse = builder.parse(new InputSource(new StringReader(this.person.toString())));
        return parse;
    }
}
