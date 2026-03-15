package ccamanager.manager;

import ccamanager.exceptions.CcaNotFoundException;
import ccamanager.model.Cca;

import java.util.ArrayList;

public class CcaManager {
    private ArrayList<Cca> ccaList =  new ArrayList<>();

    /**
     * Creates and adds the CCA to CCAList
     * @param ccaName Name of the CCA
     */
    public void addCCA(String ccaName) {
        assert ccaList != null : "ccaList should be initialized";
        Cca cca = new Cca(ccaName);
        ccaList.add(cca);
    }

    /**
     * Return the list of all the CCAs
     * @return List of CCAs
     */
    public ArrayList<Cca> getCCAList() {
        assert ccaList != null : "ccaList should be initialized";
        return ccaList;
    }

    /**
     * Delete a CCA from the CCA list
     * @param ccaName Name of the CCA
     * @throws CcaNotFoundException Exception if invalid CCA name is given
     */
    public void deleteCca(String ccaName) throws CcaNotFoundException {
        for (int i = 0; i < ccaList.size(); i++) {
            if (ccaList.get(i).getName().equals(ccaName)) {
                ccaList.remove(i);
                return;
            }
        }
        throw new CcaNotFoundException("The CCA " + ccaName + " does not exist, please enter a valid CCA name.");
    }
}
