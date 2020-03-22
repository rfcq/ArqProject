package Converter;

public class XmlAdapter implements Formatters {

    private StringToXML xml;

    public XmlAdapter(StringToXML stringToXML) {
    }

    @Override
    public void StringToFormat(People people) {
        xml.StringToFormat(people);
    }
}
