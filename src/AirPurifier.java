public class AirPurifier {
    boolean power;
    public String model;
    public String serialNo;
    int level;
    static int modelCount = 0;

    public AirPurifier(boolean power, String model, String serialNo, int level){
        this.power = power;
        setModel(model);
        setSerialNo(serialNo);
        setLevel(level);
        getModel();
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void getModel() {
        AirPurifier.modelCount++; //count model
    }
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void setLevel(int level) {
        if (level >= 1 && level <= 200) {
            this.level = level;
        } else {
            throw new IllegalArgumentException("level between 1-200 !!!");
        }
    }

}
