package JavaFxBMICalculatorMVC;


public class BMIController {
    
    public double getBMI(Person p){
        double length = p.getLength();
        double weight = p.getWeight();
        double lengthInMeter = length/100;
        return weight/(lengthInMeter*lengthInMeter);
    }
    
    public String getBMIInfo(Person p){
        return String.format("Hej %s. "+ "Ditt BMI är %.2f.", p.getName(),getBMI(p));
    }

}
