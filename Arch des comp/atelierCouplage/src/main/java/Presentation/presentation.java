package Presentation;

import DAO.etudiant;
import DAO.etudiantDao;
import DAO.etudiantDaoDictionary;

public class presentation {
    public static void main(String[] args) {
        etudiantDao etd= new etudiantDao();

        etudiant et=new etudiant(1,"test","test","test@gmail.com");
        etudiant et2=new etudiant(2,"test2","test","test@gmail.com");
        etudiant et3=new etudiant(3,"test3","test","test@gmail.com");
        etudiant et4=new etudiant(4,"test4","test","test@gmail.com");

        etd.etudiants.add(et);
        etd.etudiants.add(et2);
        etd.etudiants.add(et3);
        etd.etudiants.add(et4);

        System.out.println("Liste Normale");
        for(etudiant et1: etd.etudiants){
            System.out.println(et1);
        }


        //etudiantDaoDict

        etudiantDaoDictionary etud= new etudiantDaoDictionary();

        etud.ajouterEtudiant(et);
        etud.ajouterEtudiant(et2);
        etud.ajouterEtudiant(et3);

        System.out.println(etud.getEtudiants());

    }
}