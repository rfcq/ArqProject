package Converter;

public class YamlAdapter extends StringToXml{

    private StringToYaml yaml;

    public YamlAdapter(StringToYaml yaml) {
        super();
        this.yaml = yaml;
    }

    public StringToYaml getYaml(){
        return yaml;
    }
}
