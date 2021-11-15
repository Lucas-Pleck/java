package exo37.exception4;

public class DoublonException extends Exception{
    public DoublonException(Cycliste cycliste){
        super( "Doublon exception is already in : "+cycliste.toString());
    }

}
