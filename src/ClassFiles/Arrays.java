package ClassFiles;

import java.util.ArrayList;

import static java.lang.Math.sqrt;

public  class Arrays {

    /*
    Print pairs of an array using String builder.
     */
    public void printPairs(int[] array)
    {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i< array.length; i++)
        {
            for (int j=0; i<array.length; j++)
            {
                sb.append(array[i]+":"+array[j]);
            }
        }
        System.out.println(sb);
    }

    /*
    Reverse an arrayr in half the iteration
     */
    public void reverse()
    {
        int[] array = {1,2,3,4,5};
        for (int i=0; i<array.length/2; i++)
        {
            int other = array.length - i -1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
    }

    public boolean isPrime(int n)
    {
        for (int x=2; x<=sqrt(n); x++)
        {
            if (n%x ==0)
                return false;
        }
        return true;
    }

    public void permutation(String str)
    {
        permutation(str, "");
    }

    public void permutation(String str, String prefix)
    {
        if (str.length() == 0)
            System.out.println(prefix);
        else
        {
            for (int i=0; i< str.length(); i++)
            {
                String rem = str.substring(0,i) + str.substring(i+1);
                permutation(rem, prefix+str.charAt(i));
            }
        }
    }

    public ArrayList<String> merge(String[]words, String[] morewords)
    {
        ArrayList<String> sampleArrayList = new ArrayList<String>();
        for (String i: words)
        {
            sampleArrayList.add(i);
        }
        for (String j: morewords)
        {
            sampleArrayList.add(j);
        }
        return sampleArrayList;
    }

    public String joinWords(String[] words)
    {
        StringBuilder sb = new StringBuilder();
        for (String i: words)
        {
            sb.append(i);
        }
        return sb.toString();
    }




}
