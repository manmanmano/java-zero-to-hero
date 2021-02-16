package ee.itcollage.level2;

public class Multiplication {

    public static void main(String[] args) {
        //todo create function in this class that multiplies 2 inputs
        // call the function in the main method, for example with 5 and 4: 5x4 should be 20
        int z = Multiply(5, 4);
        System.out.println(z);
    }

    public static int Multiply(int x, int y){
        return x * y;
    }
}
