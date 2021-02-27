public class SingletonClass {
    private static SingletonClass _instance=null;
    private String name;


    public static SingletonClass get_instance() {
        if (_instance == null)
            return new SingletonClass();
        else
            return _instance;
    }

    private SingletonClass()
    {
        this.name = "Singleton";
    }

    public String getName() {
        return name;
    }
}
