package exo48.designPattern3;

public class FormatText implements FormatValidator {
    @Override
    public boolean validator(String stringToTest) {
        String regex = "^[A-Za-z]*$";
        return stringToTest.matches(regex);

    }
}
