package day29_exceptions;

public class HealtProblemException extends RuntimeException{
    public HealtProblemException(){
        super();
    }
    public HealtProblemException(String msg){
        super(msg);
    }
}
