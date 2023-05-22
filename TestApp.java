package test;

public class TestApp {
    public static void main(String[] args) {
        
        
        
        Test hTest = new HeatingTest();
        
        if(hTest.test()){
            System.out.println("All heating tests passed !");
        }else{
            System.out.println("Some heating tests failed !");
        }

        System.out.println();
        
        
        Test sTest = new SpinningTest();
        if(sTest.test()){
            System.out.println("All spinning tests passed !");
        }else{
            System.out.println("Some spinning tests failed !");
        }
    }
}
