public class ProgramClass
{
    //Function to find number is Prime(True) or not(False)
    public boolean primenumber(int n)
    {
        if (n % 2 == 0)
        {
            //Its not PrimeNumber
            return false;
        }
        else
        {
            int l = n / 2;
            for (int x = 3; x < l; x++)
            {
                if (n % x == 0)
                {
                    //its NotPrimeNumber
                    return false;
                }
            }
            //Its PrimeNumber
            return true;
        }
    }

    //Function to find number is Even(True) or Odd(False)
    public boolean evenodd(int n)
    {
        boolean c = false;
        if (n % 2 == 0)
        {
            //Its Even
            c = true;
        }
        return c;
    }

    //Function to find average of integer array
    public int arrayaverage(int[] na)
    {
        int l = na.length;
        int as = 0;

        for (int x = 0; x < l; x++)
        {
            as += na[x];
        }

        return (as / l);
    }

    //Function to convert celsius to fahrenheit and kelvin
    public double[] celsiusfahrenheitkelvin(double ct)
    {
        double ft = (ct * 1.8) + 32;
        double kt = ct + 273.15;

        return new double[]{ft, kt};
    }

    public boolean stringpalindrome(String sv)
    {
        String rs = new String(new StringBuilder(sv).reverse());
        boolean c = false;
        if (rs.equals(sv))
        {
            c = true;
        }
        return c;
    }
}
