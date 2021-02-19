package ee.itcollage.level9;

public class StringMaker {

    //todo fix tests
    /**
     * Gives you a text containing of x times of string c.
     * @param s the string to repeat
     * @param x how many times you want the string
     */
    public static String make(String s, int x) {
        String chars = "";
        for (int i = 0; i < x; i++){
            chars += s;
        }
        return chars;
    }

    /**
     * Gives you a text containing of x times of string c plus y times of string c.
     */
    public static String make(String s1, int x1, String s2, int x2) {
        String chars = "";
        for (int i = 0; i < x1; i++){
            chars += s1;
        }
        for (int i = 0; i < x2; i++){
            chars += s2;
        }
        return chars;
    }
}
