import static org.junit.jupiter.api.Assertions.*;
import com.sun.tools.javac.util.Assert;
import org.junit.Test;

class mainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void AddIntegersTest()
    {
        main.SampleClass sample = new main.SampleClass(99);
        assertEquals(2, sample.AddIntegers(1,1));

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }
}