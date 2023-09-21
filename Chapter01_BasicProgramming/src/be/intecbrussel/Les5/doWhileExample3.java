package be.intecbrussel.Les5;

public class doWhileExample3 {
    public static void main(String[] args){
        int x= 12, sum= 0;
        do{
            sum+=x;
            x--;
        }while(x>10);
        System.out.println("Summation: " +sum);
    }
}
