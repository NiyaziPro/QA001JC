package day29_exceptions;

public class WeightException extends RuntimeException{
    public WeightException(){
        super();
    }
    public WeightException(String msg){
        super(msg);
    }
}
