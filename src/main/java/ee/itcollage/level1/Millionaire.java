package ee.itcollage.level1;

import java.util.ArrayList;
import java.util.List;

public class Millionaire {

    public static void main(String[] args) {
        //todo create a Garage.
        // create a Garage and put Ferrari in it.
        // print out Ferrari and make it print out sth nice (other than ee.itcollage.level1.Ferrari@1c20c684)
        // add a list of cars to Garage
        // add another Ferrari to Garage
        // make Garage print out a list of cars in it
        Garage garage = new Garage();
        garage.setFerrari(new Ferrari());
        System.out.println(garage.getFerrari());

        List<Ferrari> ferraris = List.of(new Ferrari(), new Ferrari());
        garage.setCars(ferraris);

        // add another Ferrari to Garage
        // make Garage print out a list of cars in it

        System.out.println(garage);
    }
}
