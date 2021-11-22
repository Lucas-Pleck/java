package exo48.designPattern3;

public class FormatEntier implements FormatValidator{

    @Override
    public boolean validator(String stringToTest) {
        try {
            Integer.parseInt(stringToTest);

        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
