package exo56.generic4;

public class Video implements Media{
    private String name;

    public Video(String name) {
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
        return "Video{" +
                "name='" + name + '\'' +
                '}';
    }
}
