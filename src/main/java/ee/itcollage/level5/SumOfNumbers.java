package ee.itcollage.level5;

import java.util.List;

public class SumOfNumbers {

    //todo make tests work
    public static Integer sum(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) {
            return null;
        }
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        return sum;
    }

}
