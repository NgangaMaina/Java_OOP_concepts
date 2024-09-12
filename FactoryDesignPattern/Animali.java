public abstract class Animali {
    public abstract String getName();

    //Factory method:
    public static Animali createAnimali(String type){
        if(type.equals("caty")){
            return new Caty();
        }
        else if(type.equals("dogy")){
            return new Dogy();
        }
        else{
            throw new IllegalArgumentException("Invalid animal type: " +type);
        }
    }

    public static void main(String[] args) {

        /*Now, we can use the createAnimal() method to create objects
        Recap.Cat and Recap.Dog without directly instantiating them in the client code.
         */
        Animali caty= Animali. createAnimali("caty");
        System.out.println(caty.getName());

        Animali dogy = Animali.createAnimali("dogy");
        System.out.println(dogy.getName());
    }

}

//Concrete creators implementing the factory Method and create their respective objects:
class Caty extends Animali{

    @Override
    public String getName() {
        return "Caty";
    }
}

class Dogy extends Animali{

    @Override
    public String getName() {
        return "Dogy";
    }
}
