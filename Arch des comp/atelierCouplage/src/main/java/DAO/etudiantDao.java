package DAO;

import java.util.ArrayList;
import java.util.List;

public class etudiantDao implements etudiantDaoInterface
{
    public List<etudiant> etudiants = new ArrayList<etudiant>();



    public etudiant ajouterEtudiant(etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    @Override
    public etudiant getEtudiant(int id) {
        for(etudiant et : etudiants)
        {
            if(et.getId()==id)
                return et;
            else
                System.out.println("Etudiant introuvable");

        }
        return null;
    }

    @Override
    public void supprimerEtudiant(etudiant etud) {
        etudiants.removeIf(etudiant -> etudiant.getId() == etud.getId());
    }

    @Override
    public void getAllEtudiants()
    {
        for(etudiant et:etudiants)
            System.out.println(et);

    }

    @Override
    public etudiant modifierEtudiant(int id, etudiant etd)
    {
        for (int i = 0; i < etudiants.size(); i++) {
            if (etudiants.get(i).getId() == id) {
                etudiants.set(i, etd);
                return etd;
            }
        }
        return null;
    }
}
