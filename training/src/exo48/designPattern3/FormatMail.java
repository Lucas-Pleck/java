package exo48.designPattern3;

public class FormatMail implements FormatValidator{
    @Override
    public boolean validator(String stringToTest) {
        String regex = "^(.+)@(.+)$";
        return stringToTest.matches(regex);
    }
}
