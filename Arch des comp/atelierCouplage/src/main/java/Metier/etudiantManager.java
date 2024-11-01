package Metier;

import DAO.etudiant;

import java.util.List;

public class etudiantManager {
    DAO.etudiantDao etudiantDao ;

    public etudiant ajouterEtudiant(etudiant etudiant) {

        for(DAO.etudiant et : etudiantDao.etudiants){
            if(et.getEmail() == etudiant.getEmail()){
                return etudiantDao.ajouterEtudiant(etudiant);
            }

        }
        return etudiant;
    }

    public List<etudiant> getAllEtudiants(){
        return etudiantDao.etudiants;
    }

}
