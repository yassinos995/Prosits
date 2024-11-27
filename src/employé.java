public class employé implements Comparable<employé> {
    int identifiant;
    String nom;
    String prénom;

    String nomDepartement;
    int grade;
    public employé(){}
    public employé(int identifiant,String nom,String prénom,String nomDepartement,int grade){
        this.identifiant=identifiant;
        this.nom=nom;
        this.prénom=prénom;
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

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
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
         employé employe =(employé) obj;
        return identifiant == employe.identifiant && nom.equals(employe.nom);
    }

    @Override
    public String toString() {
        return "employe { id :"+identifiant+
                ", nom: "+nom+",prénom: "+prénom+
                ",de département: "+nomDepartement+
                "avec la grade: "+grade+"}";
    }

    @Override
    public int compareTo(employé otherEmploye) {
        return Integer.compare(this.identifiant ,otherEmploye.identifiant);
    }
}
