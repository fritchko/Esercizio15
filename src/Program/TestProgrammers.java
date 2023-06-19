package Program;

public class TestProgrammers {
    public static void main(String[] args) {

        //Creo i due oggetti Programmer
        Programmer programmer1 = new Programmer("Giancarlo",25,false);
        Programmer programmer2 = new Programmer("Claudia",22,true);


        //Eseguo i metodi drinkCoffee e printDetails per il primo programmatore:
        programmer1.drinkCoffee();
        programmer1.printDetails();


        //Eseguo i metodi printDetails e hasGlasses per il secondo programmatore:
        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
