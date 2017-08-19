package myexception;

public class InvalidNodeReferenceException extends RuntimeException {

    public InvalidNodeReferenceException(String error) {
        super(error);
    }

}

