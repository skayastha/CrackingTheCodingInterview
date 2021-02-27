package ClassFiles;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LearningArrayList {

    private ArrayList<Integer> integerArrayList;

    public void setIntArrayList(ArrayList<Integer> intArrayList) {
        this.integerArrayList = intArrayList;
    }

    public ArrayList<Integer> getIntArrayList() {
        return integerArrayList;
    }

    public void FirsExampleOfArrayList()
    {
        this.integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(2);

        for (Integer a:integerArrayList)
        {
            System.out.println(a);
        }
    }

}
