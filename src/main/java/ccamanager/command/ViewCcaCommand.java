package ccamanager.command;

import java.util.ArrayList;
import ccamanager.manager.CcaManager;
import ccamanager.manager.ResidentManager;
import ccamanager.model.Cca;
import ccamanager.ui.Ui;


/**
 * Command to view the list of all the CCAs
 */
public class ViewCcaCommand extends Command {

    public ViewCcaCommand() {
    }

    @Override
    public void execute(CcaManager ccaManager, ResidentManager residentManager, Ui ui) {
        ArrayList<Cca> ccaList = ccaManager.getCCAList();
        ui.showCcaList(ccaList);
    }
}
