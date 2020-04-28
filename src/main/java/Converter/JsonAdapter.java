package Converter;

public class JsonAdapter extends StringToToml{

    private StringToJson json;

    public JsonAdapter(StringToJson json) {
        super();

        this.json = json;
    }

    public StringToJson getJson() {
        return json;
    }

}
