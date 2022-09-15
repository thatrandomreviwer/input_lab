//NAME - parker tipton

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        double dubOne, dubTwo;
        float floOne, floTwo;
        short shoOne,shoTwo;
        String strOne, strTwo;

        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        System.out.println("Enter an double :: ");
        dubOne = keyboard.nextDouble();

        System.out.println("Enter an double :: ");
        dubTwo = keyboard.nextDouble();

        System.out.println("Enter a float :: ");
        floOne = keyboard.nextFloat();

        System.out.println("Enter a float :: ");
        floTwo = keyboard.nextFloat();

        System.out.println("Enter a short :: ");
        shoOne = keyboard.nextShort();

        System.out.println("Enter a short :: ");
        shoTwo = keyboard.nextShort();

        keyboard.nextLine();

        System.out.println("Enter a String :: ");
        strOne = keyboard.nextLine();

        System.out.println("Enter a String :: ");
        strTwo = keyboard.nextLine();

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println("double one = " + dubOne );
        System.out.println("double two = " + dubTwo);
        System.out.println("float one = " + floOne);
        System.out.println("float two = " + floTwo);
        System.out.println("short one = " + shoOne);
        System.out.println("short two = " + shoTwo);
        System.out.println("string one = " + strOne);
        System.out.println("string two = " + strTwo);


    }
}