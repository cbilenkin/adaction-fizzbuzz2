package FizzBuzz2;

import java.util.*; 

/**
 * Hello!
 * The only reason I've done this with a list instead of just printing each word
 * or integer is to make it easier to test.
 */
public class App 
{
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        for (String value : fizzBuzz(1,20)) {
            builder.append(value + " ");
        }
        System.out.print(builder.toString());
    }

    public static List<String> fizzBuzz(int j, int k)
    {
        List<String> ans = new ArrayList<>();
        for(int i=j; i<=k; i++)
        {
            if(Integer.toString(i).contains("3"))
            {
                ans.add("lucky");
            }
            else if(i%15==0)
            {
                ans.add("fizzbuzz");
            }
            else if(i%5==0)
            {
                ans.add("buzz");
            }
            else if(i%3==0)
            {
                ans.add("fizz");
            }
            else
            {
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}
