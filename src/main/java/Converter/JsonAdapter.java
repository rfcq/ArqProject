package Converter;

public class JsonAdapter implements Formatters {

    private StringToJson json;

    public JsonAdapter(StringToJson people) {
        this.json = people;
    }

    @Override
    public void StringToFormat(People people) {
        json.StringToFormat(people);
    }
}
