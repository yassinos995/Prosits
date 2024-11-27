public class Main {
    public static void main(String[] args) {

        employe emp1= new employe(2,"khalil","hamdi","mecanique",700);
        employe emp2 = new employe(1,"mohssen","benabdallah","info",900);
        SocieteArrayList s1=new SocieteArrayList();
        s1.ajouterEmploye(emp1);
        s1.ajouterEmploye(emp2);

        System.out.println(emp2);
        System.out.println(emp1.equals(emp2));
        s1.displayEmploye();
        s1.trierEmployeParId();
        s1.displayEmploye();
    }

}