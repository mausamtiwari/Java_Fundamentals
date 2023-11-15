package be.intecbrussel.Oefeningen;


public class MathClass {
    private int num1;
    private int num2;

    public MathClass(int num1, int num2) {           // All args constructor
        this.num1 = num1;
        this.num2 = num2;

    }

    public int getNum1() {
        return num1;
    }

    public int getNUm2() {
        return num2;
    }

    public void setNum1(int num1) {

        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public class MathFunctions implements be.intecbrussel.Oefeningen.MathFunctions {     // Interface implementation in innner class
        public int sum() {
            return num1 +num2;
        }

        public int min() {
            if (num1 < num1) {
                return num1;
            } else {
                return num2;
            }
        }

        public int max() {
            if (num1< num2) {
                return num2;
            } else {
                return num1;
            }
        }


        @Override
        public double product() {            // Product method from Interface
            return num1+num2;
        }

        @Override
        public double division() {           // Divison method from Interface

            if( num2 ==0) {
                System.out.println("Divisor can't be 0");
            }
            return (double)num1/num2;
        }
    }
}
