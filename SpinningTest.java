package test;

import appliances.Blender;
import appliances.CanSpin;
import appliances.WashMachine;

public class SpinningTest implements Test{
    public boolean test(){
    return testSpinning(new Blender()) && testSpinning(new WashMachine());
    }

     // Helper method

    public boolean testSpinning (CanSpin testable){
        int rpmBefore = testable.getRpm();
        testable.spin();
        int rpmAfter = testable.getRpm();
        if(rpmAfter > rpmBefore) {
            System.out.println("SPINNING TEST: Passed !");
            return true;
        } else {
            System.out.println("SPINNING TEST: Failed ! \n REASON : \t RPM before test: " + rpmBefore + 
            "\n\t\t RPM after test: " + rpmAfter
            );
            return false;
        }   
    }
}
