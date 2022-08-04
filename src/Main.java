public class Main
{
    public static void main(String[] args) {
        // loop to control the rows
        for(int i = 5; i >= 1; i--)
        {
            // loop to control the columns
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}