public class employe implements Comparable<employe> {
    int identifiant;
    String nom;
    String prenom;

    String nomDepartement;
    int grade;
    public employe(){}
    public employe(int identifiant,String nom,String prenom,String nomDepartement,int grade){
        this.identifiant=identifiant;
        this.nom=nom;
        this.prenom=prenom;
        this.nomDepartement=nomDepartement;
        this.grade=grade;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if (obj == null || getClass()!=obj.getClass()) return false;
         employe employe =(employe) obj;
        return identifiant == employe.identifiant && nom.equals(employe.nom);
    }

    @Override
    public String toString() {
        return "employe { id :"+identifiant+
                ", nom: "+nom+",prenom: "+prenom+
                ",de departement: "+nomDepartement+
                "avec la grade: "+grade+"}";
    }

    @Override
    public int compareTo(employe otherEmploye) {
        return Integer.compare(this.identifiant ,otherEmploye.identifiant);
    }
}
