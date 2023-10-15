package be.intecbrussel.Les3;


public class ColorAPP {
    public static void main(String[] args) {
        /*Color c1 = Color.RED;
        System.out.println(c1);

        Color[] myColorArr = Color.values();

        for(Color col: myColorArr){
            System.out.println(col + " at index " + col.ordinal());
        }*/

        System.out.println(Color.BLUE);
        System.out.println(Color.BLUE.getColorCode());
        System.out.println(Color.BLUE.getColorCode2());
        Color.BLUE.colorInfo();

        Color c1 = Color.YELLOW;
        System.out.println("\n" + c1);
        System.out.println(c1.getColorCode());
        System.out.println(c1.getColorCode2());
        c1.colorInfo();

        Color c2 = Color.RED;
        System.out.println("\n" + c2);
        System.out.println(c2.getColorCode());
        System.out.println(c2.getColorCode2());
        c2.colorInfo();


    }
}
