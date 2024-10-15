import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Animal lion=new Animal("fadeo","simba",100,true);
        Animal bird=new Animal("flyer","twiti",1,false);
        Animal betri9=new Animal("flyer","betri9",20,true);
        Animal dog=new Animal("fadeo","bobi",50,true);
        Animal zrafa=new Animal("mouton","z1",50,true);
        Animal dragon=new Animal("dragons","bob",40,true);
        Animal corcodille=new Animal("croco","crocoo",-4,true);
        Animal mouse=new Animal("mouses","jerry",4,true);
        Aquatiques AnimalAquatique=new Aquatiques();
        Terrests AnimalTerrest=new Terrests();
        Daulphine daulphine=new Daulphine();
        Penguin penguin=new Penguin();
        System.out.println("aquatic animal created: "+AnimalAquatique);
        System.out.println("terrest animal created: "+AnimalTerrest);
        System.out.println("daulphine created: "+daulphine);
        System.out.println("penguin created: "+penguin);


        Zoo myzoo=new Zoo("friguia","nabeul");
        System.out.println("Nom du zoo : " + myzoo.getName());
        myzoo.setName("");
        Zoo myzoo2=new Zoo("","nabeul");
        System.out.println("Nom du zoo : " + myzoo.getName());
        myzoo.setName("");
        if(!myzoo2.isFull()) {
            System.out.println("Ajout de mouse : " + myzoo2.addAnimal(mouse));}

        if(!myzoo.isFull()) {
            System.out.println("Ajout de lion : " + myzoo.addAnimal(lion));}
            if(!myzoo.isFull()){
            System.out.println("Ajout de betri9 : " + myzoo.addAnimal(betri9));}
            if(!myzoo.isFull()){
            System.out.println("Ajout de bird : " + myzoo.addAnimal(bird));
                if(!myzoo.isFull()){
                    System.out.println("ajout de dog :" + myzoo.addAnimal(dog));
                }if(!myzoo.isFull()){
                    System.out.println("ajout de zarafa :" + myzoo.addAnimal(zrafa));
                }
                if(!myzoo.isFull()){
                    System.out.println("ajout de dragon :" + myzoo.addAnimal(dragon));
                }
                if(!myzoo.isFull()){
                    System.out.println("ajout de dragon :" + myzoo.addAnimal(corcodille));
                }
        }
      myzoo.displayZooAnimals();
      String animalName="aziz";
      int index= myzoo.searchAnimal(animalName);
      if (index != -1){
          System.out.println("Animal trouvé"+myzoo.getAnimals()[index]+"de lindice "+index);
      }else{
          System.out.println("Animal : "+animalName+" n'existe pas");
      }
     //   System.out.println("you will delete "+cat.name);
      //myzoo.supprimerAnimal(cat);
        //myzoo.displayzooAnimals();
        myzoo.isFull();

    }

}
