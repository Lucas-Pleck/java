package exo34.exeption1;

public class Main {
    public static void main(String[] args) {
        try {
            Toutou dog = new Toutou("", -7);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
