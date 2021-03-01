package TestCases;

import ClassFiles.Recursion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursionTest {

    private Recursion recursion;
    @BeforeEach
    void setUp() {
        recursion = new Recursion();
    }

    @Test
    void sum() {
        assertEquals(10, recursion.sum(4));
    }

    @Test
    void sum_edgecase_success()
    {
        assertEquals(0,recursion.sum(0));
    }

    @Test
    void sum_negativenumber_success()
    {
        assertEquals(0,recursion.sum(-1));
    }

    @Test
    void pairSumSequence() {
        assertEquals(16, recursion.pairSumSequence(4));
    }

    @Test
    void pairSum() {
        assertEquals(2,recursion.pairSum(1,1));
    }

    @Test
    void factorial() {
        assertEquals(120, recursion.factorial(5));
    }

    @Test
    void calculateSumAndProduct(){
        int[] array = {1,2,3,4};
        Recursion.sumAndProd result = new Recursion.sumAndProd();
        result= recursion.calculateSumAndProduct(array);

        assertEquals(10,result.totalSum);
        assertEquals(24, result.totalProduct);
    }
}