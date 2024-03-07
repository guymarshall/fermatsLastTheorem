import java.math.BigInteger;

public class Main
{
    public static void main(String[] args)
    {
        final BigInteger limit = BigInteger.valueOf(8);

        BigInteger exponent = BigInteger.valueOf(3);
        BigInteger x = BigInteger.ONE;
        BigInteger y = BigInteger.ONE;
        BigInteger z = BigInteger.ONE;

        while (exponent.compareTo(limit) < 1)
        {
            while (x.compareTo(limit) < 1)
            {
                boolean xIsEven = x.mod(BigInteger.TWO).equals(BigInteger.ZERO);
                boolean xIsOdd = !x.mod(BigInteger.TWO).equals(BigInteger.ZERO);

                while (y.compareTo(limit) < 1)
                {
                    boolean yIsEven = y.mod(BigInteger.TWO).equals(BigInteger.ZERO);
                    boolean yIsOdd = !y.mod(BigInteger.TWO).equals(BigInteger.ZERO);

                    while (z.compareTo(limit) < 1)
                    {
                        boolean zIsEven = z.mod(BigInteger.TWO).equals(BigInteger.ZERO);
                        boolean zIsOdd = !z.mod(BigInteger.TWO).equals(BigInteger.ZERO);

                        if (xIsEven && yIsOdd && zIsEven)
                        {
                            continue;
                        }

                        if (xIsOdd && yIsEven && zIsOdd)
                        {
                            continue;
                        }

                        final BigInteger xPowered = x.pow(exponent.intValue());
                        final BigInteger yPowered = y.pow(exponent.intValue());
                        final BigInteger zPowered = z.pow(exponent.intValue());

                        if (xPowered.add(yPowered).equals(zPowered))
                        {
                            System.out.printf("%d^%d + %d^%d = %d^%d%n", x, exponent, y, exponent, z, exponent);
                        }

                        z = z.add(BigInteger.ONE);
                    }
                    y = y.add(BigInteger.ONE);
                }
                x = x.add(BigInteger.ONE);
            }
            exponent = exponent.add(BigInteger.ONE);
        }
    }
}