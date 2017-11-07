public class Plant {
    private String name;
    private Specification specification;

    Plant(String name, Specification specification) {
        this.name = name;
        this.specification = specification;
    }

    public String getName() {
        return name;
    }

    public Specification getSpecification() {
        return specification;
    }
}
