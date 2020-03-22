package AddPeople;

public class Person implements People {

    private int id;
    private String name = null;
    private String hierarchy = null;

    public Person(int id, String name, String hierarchy) {
        this.id = id;
        this.name = name;
        this.hierarchy = hierarchy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    public void printPerson() {
        System.out.println(name + ", " + hierarchy);
    }

}
