package ccamanager.ui;

import ccamanager.model.Cca;
import ccamanager.model.Resident;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ui — the ONLY class that reads input and prints output.
 * <p>
 * ====================================================
 * FOR TEAMMATES ADDING NEW COMMANDS:
 * ====================================================
 * When your command needs to display something, add a method here.
 * NEVER use System.out.println anywhere outside this class.
 * <p>
 * Naming convention:
 * - showMessage(String msg)     → generic one-liner
 * - showError(String msg)       → error messages
 * - printCcaList(...)           → specific list display
 * - printResidentList(...)      → specific list display
 * <p>
 * Add your own print methods at the bottom of this file.
 * ====================================================
 */
public class Ui {

    private static final String DIVIDER = "____________________________________________________________";
    private final Scanner scanner;

    public Ui() {
        this.scanner = new Scanner(System.in);
    }

    // ----------------------------------------------------------------
    // INPUT
    // ----------------------------------------------------------------

    /**
     * Reads a line of input from the user.
     *
     * @return the trimmed input string
     */
    public String readInput() {
        System.out.print("> ");
        return scanner.nextLine().trim();
    }

    // ----------------------------------------------------------------
    // GENERAL OUTPUT
    // ----------------------------------------------------------------

    public void showWelcome() {
        System.out.println(DIVIDER);
        System.out.println(" Welcome to CCA Ledger!");
        System.out.println(" Type a command to get started. Type 'bye' to exit.");
        System.out.println(DIVIDER);
    }

    public void showGoodbye() {
        System.out.println(DIVIDER);
        System.out.println(" Bye! See you next time.");
        System.out.println(DIVIDER);
    }

    /**
     * Displays a generic success/info message.
     *
     * @param message the message to display
     */
    public void showMessage(String message) {
        System.out.println(DIVIDER);
        System.out.println(" " + message);
        System.out.println(DIVIDER);
    }

    /**
     * Displays an error message.
     *
     * @param message the error to display
     */
    public void showError(String message) {
        System.out.println(DIVIDER);
        System.out.println(" ERROR: " + message);
        System.out.println(DIVIDER);
    }

    // ----------------------------------------------------------------
    // CCA OUTPUT — Veer adds methods here
    // ----------------------------------------------------------------

    /**
     * Prints the full list of CCAs.
     *
     * @param ccaList the list to display
     */
    public void printCcaList(ArrayList<Cca> ccaList) {
        // TODO (Veer): implement display of CCA list
        throw new UnsupportedOperationException("printCcaList() not implemented yet");
    }

    // ----------------------------------------------------------------
    // RESIDENT OUTPUT — Rehaan adds methods here
    // ----------------------------------------------------------------

    /**
     * Prints the full list of residents.
     *
     * @param residentList the list to display
     */
    public void printResidentList(ArrayList<Resident> residentList) {
        // TODO (Rehaan): implement display of resident list
        throw new UnsupportedOperationException("printResidentList() not implemented yet");
    }
}
