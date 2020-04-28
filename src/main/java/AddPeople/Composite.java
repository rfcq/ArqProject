package AddPeople;

import java.util.ArrayList;
import java.util.List;

public class Composite implements People {

    private String tag;

    private List<People> person;

    public Composite(String tag){
        this.tag = tag;
        this.person = new ArrayList<People>();
    }

    public void printPerson() {
        person.forEach(People::printPerson);
    }

    public void addPerson(People people){
        person.add(people);
    }

    public void removePerson(People people){
        person.remove(people);
    }

}
