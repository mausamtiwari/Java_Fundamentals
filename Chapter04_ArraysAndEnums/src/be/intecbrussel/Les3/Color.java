package be.intecbrussel.Les3;

public enum Color {

    //Constanten
    RED(100,500),
    YELLOW(200,400),
    BLUE(300,600);

    //Field
    private final int colorCode;
    private final int colorCode2;

    //Constructor
    Color(int colorCode, int colorCode2){
        this.colorCode = colorCode;
        this.colorCode2 = colorCode2;
    }

    //Methods
    int getColorCode(){
        return colorCode;
    }

    int getColorCode2(){
        return colorCode2;
    }

    public void colorInfo(){
        System.out.println("Universal Color");
    }


}
