package Converter;

import com.google.gson.Gson;

public class StringToJson {

    public void StringToFormat(String people) {

        Gson gson = new Gson();

        String json = gson.toJson(people);

        System.out.println(json);
    }
}