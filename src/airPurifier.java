public class airPurifier {
    String model;
    String serialNo;
    String airCondition;
    boolean power;

    void turn_on() {
        power = true;
    }

    void turn_off() {
        power = false;
    }

    public airPurifier(String model, String srNo) {
        this.model = model;
        this.serialNo = srNo;
        System.out.println("Air Purifier: " + model + " " + serialNo);
    }

    public void purify(String airCondition) {
        if (power && airCondition.equals("bad")) {
            System.out.println("Purifying...");
            this.airCondition = "good";
        }

    }
}
