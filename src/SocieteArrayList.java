import java.util.ArrayList;
import java.util.Collections;

public class SocieteArrayList implements Igestion<employé>{
    private ArrayList<employé> employés =new ArrayList<>();


    @Override
    public void ajouterEmploye(employé emp) {
        if(!employés.contains(emp)){
     employés.add(emp);
        }else{
            System.out.println("Employé déjà existant !");
        }
    }

    @Override
    public boolean rechercherEmployer(String nom) {
        for(employé e :employés){
            if(e.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean rechercherEmploye(employé emp) {

        return employés.contains(emp);
    }

    @Override
    public void supprimerEmploye(employé emp) {
        employés.remove(emp);

    }

    @Override
    public void displayEmploye() {
        for(employé e : employés){

            System.out.println(e);
        }

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employés);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }
}
