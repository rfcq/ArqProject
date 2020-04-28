package Converter;

import AddPeople.People;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.ArrayList;

public class StringToXml implements Formatters{

    private ArrayList<People> person;

    public StringToXml() {

    }

    public StringToXml(ArrayList<People> person) {
        this.person = person;
    }

    @Override
    public void StringToFormat() {
        
    }
}
