package Converter;

import AddPeople.People;
import com.moandjiezana.toml.Toml;
import com.moandjiezana.toml.TomlWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringToToml implements Formatters{

    private ArrayList<People> people;

    public StringToToml() {

    }

    public StringToToml(ArrayList<People> people) {
        this.people = people;
    }

    @Override
    public void StringToFormat() {

    }
}
