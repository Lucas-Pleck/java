package exo8.eval;


public class Eval {
    public static void main(String args[]) {
        int nbr = getRandomNumberInRange(40,99);
        String detail="";
        String note = "";

        if (nbr<60){
            note="F";
        }
        else if (nbr<70){
            note="D";
        }
        else if (nbr<80){
            note="C";
        }
        else if (nbr<90){
            note="B";
        }
        else{
            note="A";
        }

        String convertedNbr = Integer.toString(nbr);


        if(convertedNbr.endsWith("8")||convertedNbr.endsWith("9")) {
            detail="+";
        }
        if(convertedNbr.endsWith("0")||convertedNbr.endsWith("1")) {
            detail="-";
        }
        System.out.println("votre note de "+nbr+" vous donne le classement "+note+detail);
    }
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }


}
