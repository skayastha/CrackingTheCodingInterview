package SpringDIProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySpringBeanWithDependency {
    private IWriter writer;

    /**
     * @param writer
     * Here we are setting the writer property through the setter which creates a dependency when the program is executed
     * Providing the annotation @Autowired on the setWriter method means that the method parameter writer will be autowired by Spring
     * @Autowired will tell spring to search for a Spring bean which implements the required interface and places it automatically into the setter
     */
    @Autowired
    public void setWriter(IWriter writer)
    {
        this.writer = writer;
    }

    public void run()
    {
        String s = "This is my test.";
        writer.write(s);
    }
}
