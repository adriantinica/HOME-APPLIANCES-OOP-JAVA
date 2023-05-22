package test;

import appliances.CanHeatWater;
import appliances.WashMachine;
import appliances.Boiler;


public class HeatingTest implements Test {

    @Override
    public boolean test() {
        return testHeating(new Boiler()) && testHeating(new WashMachine()) ;
    }

    // Helper method
    
    public boolean testHeating(CanHeatWater testable){
        byte tempBefore = testable.getTemperature();
        testable.heat();
        byte tempAfter = testable.getTemperature();
        if(tempAfter>tempBefore){
            System.out.println("HEATING TEST: Passed !");
            return true;
        }else{
            System.out.println("HEATING TEST: Failed ! \n REASON : \t Temperature before test: " + tempBefore + 
            "\n\t\t Temperature after test: " + tempAfter 
            );
            return false;
        }
    }
}
