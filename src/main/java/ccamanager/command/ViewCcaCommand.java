package ccamanager.command;

import java.util.ArrayList;
import ccamanager.manager.CcaManager;
import ccamanager.manager.ResidentManager;
import ccamanager.model.Cca;
import ccamanager.ui.Ui;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ViewCcaCommand extends Command {

    public ViewCcaCommand() {
    }

    @Override
    public void execute(CcaManager ccaManager, ResidentManager residentManager, Ui ui) {
        ArrayList<Cca> ccaList = ccaManager.getCCAList();
        ui.showCcaList(ccaList);
    }
}
