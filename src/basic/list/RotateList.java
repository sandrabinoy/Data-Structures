package basic.list;

import java.util.Collections;
import java.util.List;

public class RotateList {

    public List<Integer> rotateList(int d, List<Integer> arr) {

        Collections.rotate(arr, arr.size()-d);
        return arr;

    }

}
