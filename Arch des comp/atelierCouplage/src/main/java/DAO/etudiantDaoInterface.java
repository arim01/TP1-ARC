package DAO;

import java.util.List;

public interface etudiantDaoInterface {

    //Creation d'une interface que nous allons implementer par la suite dans les differentes classes DAO
    etudiant ajouterEtudiant(etudiant etud);
    etudiant getEtudiant(int id);
    void supprimerEtudiant(etudiant etud);

    void getAllEtudiants();
    etudiant modifierEtudiant(int id,etudiant etd);


}
