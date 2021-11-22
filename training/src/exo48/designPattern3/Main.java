package exo48.designPattern3;

public class Main {
    public static void main(String[] args) {
        FormatValidator formatValidatorEntier = new FormatEntier();
        FormatValidator formatValidatorText = new FormatText();
        FormatValidator formatValidatorMail = new FormatMail();


        String stringToTest1 ="coucou";
        String stringToTest2 ="cou15cou";
        String stringToTest3 ="cou@cou.com";

        Validateur validateur1 = new Validateur(stringToTest3,formatValidatorEntier);
        System.out.println(validateur1.validate());

        Validateur validateur2 = new Validateur(stringToTest3,formatValidatorText);
        System.out.println(validateur2.validate());

        Validateur validateur3 = new Validateur(stringToTest3,formatValidatorMail);
        System.out.println(validateur3.validate());

    }
}
