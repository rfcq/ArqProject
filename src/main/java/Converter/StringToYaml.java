package Converter;

import AddPeople.Composite;
import AddPeople.People;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.IOException;

public class StringToYaml implements Formatters {
    private People person;

    public StringToYaml() {

    }


    public void StringToFormat() {

    }
}
