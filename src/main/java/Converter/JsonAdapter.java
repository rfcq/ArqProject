package Converter;

public class JsonAdapter extends StringToXML{

    private StringToJson json;

    public JsonAdapter(StringToJson json) {
        this.json = json;
    }

    public StringToJson getJson() {
        return json;
    }

}
