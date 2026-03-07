package ccamanager;

/**
 * Entry point for CCA Ledger.
 * Instantiates CcaLedger and starts the run loop.
 */
public class Main {
    public static void main(String[] args) {
        new CcaLedger().run();
    }
}
