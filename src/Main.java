public class Main {
    public static void main(String[] args) {

        employé emp1= new employé(2,"khalil","hamdi","mecanique",700);
        employé emp2 = new employé(1,"mohssen","benabdallah","info",900);
        SocieteArrayList s1=new SocieteArrayList();
        s1.ajouterEmploye(emp1);
        s1.ajouterEmploye(emp2);

       /* System.out.println(emp2);
        System.out.println(emp1.equals(emp2));*/
        s1.displayEmploye();
        s1.trierEmployeParId();
        s1.displayEmploye();





    }

}