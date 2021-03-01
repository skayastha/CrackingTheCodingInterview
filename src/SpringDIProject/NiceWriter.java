package SpringDIProject;

import org.springframework.stereotype.Service;

@Service
public class NiceWriter implements IWriter{
    @Override
    public void write(String str)
    {
        System.out.println("The string is : "+str);
    }
}
