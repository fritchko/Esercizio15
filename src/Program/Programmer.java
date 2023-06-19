package Program;

//Creo la classe Programmer:

public class Programmer {


    //Do le variabili "name", "age" e "wearsGlasses"
    private String name;
    private int age;
    private boolean wearsGlasses;

    //Do un costruttore alla classe:

    public Programmer(String name, int age, boolean wearsGlasses){
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }

    //Creo i metodi per la classe:

    void drinkCoffee(){
        System.out.println("Espresso is the secret!");
    }

    void printDetails(){
        System.out.println(name + " is a " + age + "-yo programmer");
    }

    void hasGlasses(){
        System.out.println("Is " + name + " wearing glasses? " + wearsGlasses);
    }
}
