package AddPeople;

public class Person implements People {

    private String name = null;
    private String hierarchy = null;

    public Person(String name, String hierarchy) {

        this.name = name;
        this.hierarchy = hierarchy;
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
