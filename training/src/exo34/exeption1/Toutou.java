package exo34.exeption1;

public class Toutou {
    String name;
    int fleaNbr;

    public Toutou(String name, int fleaNbr) throws NameNullException, FleaNbrNegativeException {
        if(name .equals("")){
            throw new NameNullException("Error name is null");
        }
        else if(fleaNbr<0){
            throw new FleaNbrNegativeException("Error flea number is negative");
        }
        this.name = name;
        this.fleaNbr = fleaNbr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFleaNbr() {
        return fleaNbr;
    }

    public void setFleaNbr(int fleaNbr) {
        this.fleaNbr = fleaNbr;
    }

    @Override
    public String toString() {
        return "Toutou{" +
                "name='" + name + '\'' +
                ", fleaNbr=" + fleaNbr +
                '}';
    }
}

