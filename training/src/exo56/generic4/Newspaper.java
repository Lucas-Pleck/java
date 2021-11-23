package exo56.generic4;

public class Newspaper implements Media{
    private String name;

    public Newspaper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                '}';
    }
}
