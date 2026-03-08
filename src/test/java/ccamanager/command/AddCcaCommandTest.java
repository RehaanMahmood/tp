package ccamanager.command;

import ccamanager.manager.CcaManager;
import ccamanager.manager.ResidentManager;
import ccamanager.ui.Ui;
import ccamanager.model.Cca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddCcaCommandTest {

    @Test
    public void execute_addCca_success() {

        CcaManager ccaManager = new CcaManager();
        ResidentManager residentManager = new ResidentManager();
        Ui ui = new Ui();

        AddCcaCommand command = new AddCcaCommand("Basketball");

        command.execute(ccaManager, residentManager, ui);

        boolean found = false;

        for (Cca cca : ccaManager.getCCAList()) {
            if (cca.getName().equals("Basketball")) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }
}