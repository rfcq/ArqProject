package Converter;

public class TomlAdapter extends StringToYaml{

    private StringToToml toml;

    public TomlAdapter(StringToToml toml) {
        super();
        this.toml = toml;
    }

    public StringToToml getToml() {
        return toml;
    }
}
