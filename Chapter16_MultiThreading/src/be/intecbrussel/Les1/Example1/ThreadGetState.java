package be.intecbrussel.Les1.Example1;

public class ThreadGetState {
    public static void main(String[] args) {
        MijnThread thread01 = new MijnThread("*");
        MijnThread thread02 = new MijnThread("-");

        //Status NEW
        System.out.println(thread01.getState());
        thread01.start();
        thread02.start();
        //status Runnable
        System.out.println(thread01.getState());
    }
}
