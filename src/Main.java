public class Main {
    public static void main(String []args) {
        airPurifier myAirPurifier = new airPurifier("Hataru","K9");
        myAirPurifier.turn_on();
        myAirPurifier.purify("bad");
        myAirPurifier.turn_off();
        System.out.println("Your air condition is "+myAirPurifier.airCondition );
    }
}