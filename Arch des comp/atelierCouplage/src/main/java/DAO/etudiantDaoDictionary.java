package DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class etudiantDaoDictionary implements etudiantDaoInterface
{

    public Map<Integer,etudiant> etudiantsMap=new HashMap<>();

    /*public etudiantDaoDictionary() {
        etudiantsMap = new HashMap<>(); // Initialisation de la Map
    }*/

    public Map<Integer, etudiant> getEtudiants() {


        return etudiantsMap;
    }

    public etudiant ajouterEtudiant(etudiant etudiant) {
        etudiantsMap.put(etudiant.getId(),etudiant);
        return etudiant;
    }

    @Override
    public etudiant getEtudiant(int id) {
        return etudiantsMap.get(id);
    }

    @Override
    public void supprimerEtudiant(etudiant etud) {
        etudiantsMap.remove(etud.getId());
    }

    @Override
    public void getAllEtudiants() {
        if (etudiantsMap.isEmpty()) {
            System.out.println("Aucun étudiant dans la liste.");
        } else {
            etudiantsMap.values().forEach(System.out::println);
        }
    }

    @Override
    public etudiant modifierEtudiant(int id, etudiant etd) {
        if (etudiantsMap.containsKey(id)) {
            etudiantsMap.put(id, etd);  // Remplace les informations tout en conservant le même ID
            return etd;
        }
        return null;
    }


}
