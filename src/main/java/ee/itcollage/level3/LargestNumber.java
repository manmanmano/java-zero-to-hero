package ee.itcollage.level3;

public class LargestNumber {

    //todo make tests work

    public static int pickLargest(int x1, int x2){
        return (x1 > x2)? x1 : x2;
    }

    public static int pickLargest(int x1, int x2, int x3){
        return x1 > x2 ? (x1 > x3 ? x1 : x3):(x2 > x3 ? x2 : x3);
    }
}
