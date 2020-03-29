package Converter;

import AddPeople.People;
import com.google.gson.Gson;

public class StringToJson {

    private People person;

    public StringToJson(People person) {
        this.person = person;
    }

    public void StringToFormat() {

        Gson gson = new Gson();

        String json = gson.toJson(this.person);

        System.out.println(json);
    }
}
