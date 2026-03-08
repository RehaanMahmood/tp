package ccamanager.exceptions;

/**
 * Throws exception if a invalid CCA is queried
 */
public class CcaNotFoundException extends Exception {
    public CcaNotFoundException(String message) {
        super(message);
    }

}
