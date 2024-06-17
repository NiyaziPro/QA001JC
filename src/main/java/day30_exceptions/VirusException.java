package day30_exceptions;

public class VirusException extends RuntimeException{
    public VirusException(String msg) {
        super(msg);
    }

    public VirusException() {
        super();
    }
}
