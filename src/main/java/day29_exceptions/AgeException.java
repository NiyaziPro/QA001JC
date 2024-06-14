package day29_exceptions;

public class AgeException extends RuntimeException{
    public AgeException(){
        super();
    }
    public AgeException(String msg){
        super(msg);
    }
}
