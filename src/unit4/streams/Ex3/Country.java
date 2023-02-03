package unit4.streams.Ex3;

public class Country {
    String name;
    Long population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Country(String name, Long population) {
        this.name = name;
        this.population = population;
    }
}
