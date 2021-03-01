package ClassFiles;

import java.util.ArrayList;

public class Recursion {

    //Basic recursive function to calculate the sum of numbers upto n.
    // Time complexity: O(n)
    // Space complexity: O(n)
    public int sum(int n)
    {
        //This is the base case
        if (n<=0)
            return 0;
        else
            return n + sum(n-1);
    }

    // Method to add adjacent numbers between 0 to n
    // Time complexity: O(n) Space Complexity: O(1)
    public int pairSumSequence(int n)
    {
        int sum =0;
        for (int i =0; i<n; i++)
        {
            sum += pairSum(i, i+1);
        }
        return sum;
    }

    //The space complexity of this method call is O(1)
    public int pairSum(int a, int b)
    {
        return a+b;
    }

    //Recursively calculate the factorial of a number
    public int factorial(int n)
    {
        if (n<=1)
        {
            return 1;
        }
        else
            return n * factorial(n-1);
    }


    //Here you add the runtime of the two for loops
    public void addRuntime()
    {
        ArrayList<Integer> arrayA = new ArrayList<Integer>();
        ArrayList<Integer> arrayB = new ArrayList<>();

        for(int a:arrayA)
        {
            System.out.println(a);
        }

        for(int b:arrayA)
        {
            System.out.println(b);
        }
    }

    // Since there is a for loop within a for loop the total runtime is multiplied
    public void multiplyRuntime()
    {
        ArrayList<Integer> arrayA = new ArrayList<>();
        ArrayList<Integer> arrayB = new ArrayList<>();

        for (int a:arrayA)
        {
            for(int b: arrayB)
            {
                System.out.println(a + b);
            }
        }
    }

    public static class sumAndProd {
        public int totalSum;
        public int totalProduct;
    }
    public sumAndProd calculateSumAndProduct( int[] array)
    {
        sumAndProd calculatedSumAndProduct = new sumAndProd();

        int sum = 0;
        int product = 1;

        for (int i =0;i<array.length;i++)
        {
            sum+= array[i];
        }

        for (int j=0;j<array.length;j++)
        {
            product*=array[j];
        }

        calculatedSumAndProduct.totalSum = sum;
        calculatedSumAndProduct.totalProduct= product;
        return calculatedSumAndProduct;
    }

}
