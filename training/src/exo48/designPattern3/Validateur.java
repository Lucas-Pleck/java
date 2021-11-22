package exo48.designPattern3;

public class Validateur {
    String stringToTest;
    FormatValidator formatValidator;

    public Validateur(String stringToTest, FormatValidator formatValidator) {
        this.stringToTest = stringToTest;
        this.formatValidator = formatValidator;
    }



    public boolean validate(){
        return formatValidator.validator(stringToTest);
    };



    public String getStringToTest() {
        return stringToTest;
    }

    public void setStringToTest(String stringToTest) {
        this.stringToTest = stringToTest;
    }

    public FormatValidator getFormatValidator() {
        return formatValidator;
    }

    public void setFormatValidator(FormatValidator formatValidator) {
        this.formatValidator = formatValidator;
    }
}
