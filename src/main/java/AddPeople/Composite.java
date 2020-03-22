package AddPeople;

import java.util.ArrayList;
import java.util.List;

public class Composite implements People {

    private int id;
    private String hierarchy;

    private List<People> person;

    public Composite(int id, String hierarchy){
        this.id = id;
        this.hierarchy = hierarchy;
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