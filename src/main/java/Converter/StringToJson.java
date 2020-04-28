package Converter;

import AddPeople.People;
import com.google.gson.Gson;

import java.util.ArrayList;

public class StringToJson implements Formatters{

    private ArrayList<People> person;

    public StringToJson(ArrayList<People> person) {
        super();
        this.person = person;
    }

    @Override
    public void StringToFormat() {

        Gson gson = new Gson();

        String json = gson.toJson(this.person);

        System.out.println(json);
    }

}
