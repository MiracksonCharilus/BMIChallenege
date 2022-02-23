import java.util.Scanner;
public class BMIHealth {


    public static void main(String[] args)
    {
        Person aPerson;
        aPerson = createPersonObject();
        showBMI(aPerson);
    }

    public static Person createPersonObject()
    {
        Person aPerson;
        String lastName;
        String firstName;
        double height;
        double weight;

        Scanner keyboard = new Scanner(System.in);
        // ask user for all variable info
        System.out.println("What is your last name?");
        lastName = keyboard.nextLine();
        System.out.println("What is your first name?");
        firstName = keyboard.nextLine();
        System.out.println("What is your height in inches?");
        height = keyboard.nextDouble();
        System.out.println("What is your weight in pounds?");
        weight = keyboard.nextDouble();
        //height in inches, weight in pounds
        aPerson = new Person(lastName, firstName, height, weight);



        return aPerson;
    }
    public static void showBMI(Person aPerson)
    {

        //print System.out.println(bPerson.Person);
        //print sout(bPerson.calculatBMI)
        //print sout(bPerson.recommendHealth)
        double testBMI = aPerson.calculateBMI();
        System.out.println(aPerson.toString());
        System.out.println("Your BMI is " + aPerson.calculateBMI() + " which is " + aPerson.determineHealth(testBMI));
        System.out.println("The recommended weight for you is " + aPerson.recommendedWeight());
    }
}
