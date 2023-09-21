package be.intecbrussel.Les5;

public class continueWhileExample {
    public static void main(String[] args){
        int index = 0;
        while(index<10){
            if(index==4){
                index++;
                continue;
            }
            System.out.println(index);
            index++;
        }
    }
}
