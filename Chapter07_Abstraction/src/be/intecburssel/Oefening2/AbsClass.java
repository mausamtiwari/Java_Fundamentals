package be.intecburssel.Oefening2;

abstract class AbsClass {
    public AbsClass(){
        System.out.println("This is consturctor of abstract class.");
    }

    public abstract void aMethod();

    public void cMethod(){
        System.out.println("This is a normal method of abstract class.");
    }
}
