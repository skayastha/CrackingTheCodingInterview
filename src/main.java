import java.util.HashMap;

public class main {
    public static void main (String[] args)
    {
//        System.out.println("Hello World!");
//        LearningArrayList object = new LearningArrayList();
//        object.FirsExampleOfArrayList();
//
//        HashMap<Integer,String> sample = new HashMap<Integer,String>();
//
//        LearningHashMap hashMap = new LearningHashMap(sample);
//
//        hashMap.AddToHashmap(1,"Summit");
//
//        String value = sample.get(1);
//        System.out.println(value);
//        sample.put(1,"Sunny");
//        value = sample.get(1);
//        System.out.println(value);

        SingletonClass sampleSingleton = SingletonClass.get_instance();
        String singletonValue = sampleSingleton.getName();
        System.out.println(singletonValue);

    }

    public static class SampleClass
    {
        private int classId;

        public SampleClass(int id)
        {
            this.classId = id;
        }
        public void Write()
        {
            System.out.println(this.classId);
        }

        public int AddIntegers(int a, int b)
        {
            return a+b;
        }
    }

}
