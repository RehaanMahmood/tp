package ccamanager.command;

import ccamanager.manager.CcaManager;
import ccamanager.manager.ResidentManager;
import ccamanager.ui.Ui;

/**
 * Command to create and add a new CCA to the CCA manager
 */
public class AddCcaCommand extends Command {
    private String ccaName;

    public AddCcaCommand(String ccaName) {
        this.ccaName = ccaName;
    }

    @Override
    public void execute(CcaManager ccaManager, ResidentManager residentManager, Ui ui) {
        ccaManager.addCCA(ccaName);
        ui.showMessage("CCA added: " + ccaName);
    }
}
