import ClassFiles.Arrays;

public class mainClass {

    public static void main (String[] args)
    {
//        System.out.println("Hello World!");
//        ClassFiles.LearningArrayList object = new ClassFiles.LearningArrayList();
//        object.FirsExampleOfArrayList();
//
//        HashMap<Integer,String> sample = new HashMap<Integer,String>();
//
//        ClassFiles.LearningHashMap hashMap = new ClassFiles.LearningHashMap(sample);
//
//        hashMap.AddToHashmap(1,"Summit");
//
//        String value = sample.get(1);
//        System.out.println(value);
//        sample.put(1,"Sunny");
//        value = sample.get(1);
//        System.out.println(value);
//
//        ClassFiles.SingletonClass sampleSingleton = ClassFiles.SingletonClass.get_instance();
//        String singletonValue = sampleSingleton.getName();
//        System.out.println(singletonValue);
//
//        BlackJackGame cardGame = (BlackJackGame) CardGame.createCardGame(GameType.BlackJack);
//        cardGame.setNameOfGame("BlackJack");
//        System.out.println(cardGame.getNameOfGame());
        Arrays a = new Arrays();
        a.permutation("abc");
    }

}
