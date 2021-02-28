package SpringDIProject;

public class Writer implements IWriter{
    @Override
    public void write(String str)
    {
        System.out.println(str);
    }
}
