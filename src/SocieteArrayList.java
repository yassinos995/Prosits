import java.util.ArrayList;
import java.util.Collections;

public class SocieteArrayList implements Igestion<employe>{
    private ArrayList<employe> employes =new ArrayList<>();


    @Override
    public void ajouterEmploye(employe emp) {
        if(!employes.contains(emp)){
     employes.add(emp);
        }else{
            System.out.println("Employe dejà existant !");
        }
    }

    @Override
    public boolean rechercherEmployer(String nom) {
        for(employe e :employes){
            if(e.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean rechercherEmploye(employe emp) {

        return employes.contains(emp);
    }

    @Override
    public void supprimerEmploye(employe emp) {
        employes.remove(emp);

    }

    @Override
    public void displayEmploye() {
        for(employe e : employes){

            System.out.println(e);
        }

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);

    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {

    }
}
