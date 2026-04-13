package ccamanager.command;

import ccamanager.enumerations.CcaLevel;
import ccamanager.manager.CcaManager;
import ccamanager.manager.EventManager;
import ccamanager.manager.ResidentManager;
import ccamanager.ui.Ui;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ViewMyEventsCommandTest {

    private CcaManager ccaManager;
    private ResidentManager residentManager;
    private EventManager eventManager;
    private Ui ui;

    @BeforeEach
    void setUp() {
        // Initialize fresh managers and UI for every test
        ccaManager = new CcaManager();
        residentManager = new ResidentManager();
        eventManager = new EventManager();
        ui = new Ui();
    }

    @Test
    void execute_viewMyEvents_residentNotFound() {
        // Attempt to view events for a resident that hasn't been added
        assertDoesNotThrow(() -> new ViewMyEventsCommand("A1234567X")
                .execute(ccaManager, residentManager, eventManager, ui));

        String output = ui.getLastMessage();
        assertTrue(output.contains("A1234567X") && output.contains("not found"),
                "Expected a 'not found' error for the resident but got: " + output);
    }

    @Test
    void execute_viewMyEvents_noEvents() {
        // Setup: Add resident, but don't add them to any events
        new AddResidentCommand("John Doe", "A1234567X")
                .execute(ccaManager, residentManager, eventManager, ui);

        assertDoesNotThrow(() -> new ViewMyEventsCommand("A1234567X")
                .execute(ccaManager, residentManager, eventManager, ui));

        String output = ui.getLastMessage();
        assertTrue(output.contains("no events") || output.contains("currently no events"),
                "Expected a message indicating no events but got: " + output);
    }

    @Test
    void execute_viewMyEvents_oneMatchingEvent() {
        // Setup: Build the environment
        new AddCcaCommand("Basketball", CcaLevel.HIGH).execute(ccaManager, residentManager, eventManager, ui);
        new AddResidentCommand("John Doe", "A1234567X").execute(ccaManager, residentManager, eventManager, ui);
        new AddEventCommand("Training", "Basketball", "2026-04-03").execute(ccaManager, residentManager, eventManager, ui);

        // Setup: Link the resident to the event
        new AddResidentToEventCommand("A1234567X", "Training", "Basketball")
                .execute(ccaManager, residentManager, eventManager, ui);

        // Execute target command
        assertDoesNotThrow(() -> new ViewMyEventsCommand("A1234567X")
                .execute(ccaManager, residentManager, eventManager, ui));

        String output = ui.getLastMessage();

        // Verify all the key details are present in the output
        assertTrue(output.contains("John Doe"), "Output should contain the resident's name.");
        assertTrue(output.contains("Training"), "Output should contain the event name.");
        assertTrue(output.contains("Basketball"), "Output should contain the CCA name.");
        assertTrue(output.contains("2026-04-03"), "Output should contain the date.");
    }

    @Test
    void execute_viewMyEvents_multipleMatchingEvents() {
        // Setup: Build the environment
        new AddCcaCommand("Basketball", CcaLevel.HIGH).execute(ccaManager, residentManager, eventManager, ui);
        new AddResidentCommand("John Doe", "A1234567X").execute(ccaManager, residentManager, eventManager, ui);

        // Add two events
        new AddEventCommand("Training", "Basketball", "2026-04-03").execute(ccaManager, residentManager, eventManager, ui);
        new AddEventCommand("Game", "Basketball", "2026-04-04").execute(ccaManager, residentManager, eventManager, ui);

        // Link the resident to both events
        new AddResidentToEventCommand("A1234567X", "Training", "Basketball").execute(ccaManager, residentManager, eventManager, ui);
        new AddResidentToEventCommand("A1234567X", "Game", "Basketball").execute(ccaManager, residentManager, eventManager, ui);

        // Execute target command
        assertDoesNotThrow(() -> new ViewMyEventsCommand("A1234567X")
                .execute(ccaManager, residentManager, eventManager, ui));

        String output = ui.getLastMessage();

        // Verify Event 1 is listed
        assertTrue(output.contains("Training"), "Output should contain the first event 'Training'.");
        assertTrue(output.contains("2026-04-03"), "Output should contain the first event's date.");

        // Verify Event 2 is listed
        assertTrue(output.contains("Game"), "Output should contain the second event 'Game'.");
        assertTrue(output.contains("2026-04-04"), "Output should contain the second event's date.");
    }
}