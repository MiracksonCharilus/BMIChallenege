public class Person {

    private String lastName;
    private String firstName;
    private double height;
    private double weight;

    public Person ()
    {
        this.lastName = "";
        this.firstName = "";
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Person (String lastName, String firstName, double height, double weight)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.height = height;
        this.weight = weight;
    }
    // getters
    public String getLastName() {return this.lastName;}
    public String getFirstName() {return this.firstName;}
    public double getHeight() {return this.height;}
    public double getWeight() {return this.weight;}

    //setters
    public void setLastName(String lastName) {this.lastName = lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setHeight(double height) {this.height = height;}
    public void setWeight(double weight) {this.weight = weight;}





    public String toString()
    { //can change height and weight to make readable like feet/inches
        double readHeightFeet = height / 12;
        double readHeightInches = height % 12;
        //the comment toString is the regular version while the one shown is the toString that is more readable.
        // return firstName + " " + lastName + " weighs " + weight + " and is " + height + " tall" ;
        return firstName + " " + lastName + " weighs " + weight + "lbs and is " + readHeightFeet + "ft " + readHeightInches + "in tall." ;
    }

    public double calculateBMI()
    {
        // use the instance variables to do the calculations
        //return bmi value
        //Formula: weight (lb) / [height (in)]2 x 703
        return (weight / Math.pow(height, 2)) * 703;

    }
    public String determineHealth(double aBMI)
    {
        String healthType = " ";
        //use if statements for healthy, underweight, overweight, obese, extremely obese
        if (aBMI < 18.5)
        {healthType = "underweight";}
        if (aBMI >= 18.5 && aBMI < 25)
        { healthType = "healthy";}
        if (aBMI >= 25 && aBMI < 30)
        { healthType = "overweight";}
        if (aBMI >= 30 && aBMI < 39.9)
        { healthType = "obese";}
        else
        { healthType = "extremely obese";}

        return healthType;
    }
    public double recommendedWeight()
    {
        double goodWeight;
        //formula to know weight
        // not real formalua, change it
        //goodWeight = height / 55656 * 4;
        goodWeight = (25 * Math.pow(height, 2)) / 703;
        return goodWeight;


    }

}
