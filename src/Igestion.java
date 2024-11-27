public interface Igestion <T>{
    public void ajouterEmploye(T t);
    public boolean rechercherEmployer(String nom);
    public boolean rechercherEmploye(T t);
    public void supprimerEmploye(T t);
    public void displayEmploye();
    public void trierEmployeParId(); //Comparable
    public void trierEmployeParNomDepartementEtGrade(); //Comparator

}
