public class Main
{
    public static void main(String[] args)
    {
        final int limit = 8;

        for (int exponent = 3; exponent <= limit; exponent++)
        {
            for (int x = 1; x <= limit; x++)
            {
                boolean xIsEven = x % 2 == 0;
                boolean xIsOdd = x % 2 != 0;

                for (int y = 1; y <= limit; y++)
                {
                    boolean yIsEven = y % 2 == 0;
                    boolean yIsOdd = y % 2 != 0;

                    for (int z = 1; z <= limit; z++)
                    {
                        boolean zIsEven = z % 2 == 0;
                        boolean zIsOdd = z % 2 != 0;

                        if (xIsEven && yIsOdd && zIsEven)
                        {
                            continue;
                        }

                        if (xIsOdd && yIsEven && zIsOdd)
                        {
                            continue;
                        }

                        final int xPowered = (int) Math.pow(x, exponent);
                        final int yPowered = (int) Math.pow(y, exponent);
                        final int zPowered = (int) Math.pow(z, exponent);

                        if (xPowered + yPowered == zPowered)
                        {
                            System.out.printf("%d^%d + %d^%d = %d^%d%n", x, exponent, y, exponent, z, exponent);
                        }
                    }
                }
            }
        }
    }
}