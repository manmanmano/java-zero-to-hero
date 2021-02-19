package ee.itcollage.level7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateRemover {

    //todo fix tests
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.isEmpty() ? numbers : new ArrayList<>(new HashSet<>(numbers));

//        same as:
//        if(numbers.isEmpty()){
//            return numbers;
//        }
//        HashSet<Integer> set = new HashSet<>(numbers);
//        List<Integer> nodup = new ArrayList<>(set);
//        return nodup;

    }
}
