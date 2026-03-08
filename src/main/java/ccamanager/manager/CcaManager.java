package ccamanager.manager;

import ccamanager.model.Cca;

import java.util.ArrayList;

public class CcaManager {
    private ArrayList<Cca> ccaList =  new ArrayList<>();

    /**
     * Creates and adds the CCA to CCAList
     * @param ccaName Name of the CCA
     */
    public void addCCA(String ccaName) {
        Cca cca = new Cca(ccaName);
        ccaList.add(cca);
    }

    /**
     * Return the list of all the CCAs
     * @return List of CCAs
     */
    public ArrayList<Cca> getCCAList() {
        return ccaList;
    }
}
