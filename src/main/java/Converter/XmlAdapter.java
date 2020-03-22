package Converter;

public class XmlAdapter implements Formatters {

    private StringToXML xml;

    public XmlAdapter(StringToXML people) {
        this.xml = people;
    }

    @Override
    public void StringToFormat(String people) {
        xml.StringToFormat(people);
    }
}
