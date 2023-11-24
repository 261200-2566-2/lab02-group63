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
    public String getModel() {
        AirPurifier.modelCount++; //count model
        return model;
    }
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    public String getSerialNo() {
        return serialNo;
    }
    public void setLevel(int level) {
        if (level >= 1 && level <= 200) {
            this.level = level;
        } else {
            throw new IllegalArgumentException("level between 1-200 !!!");
        }
    }
    public void output() {
        if (level >= 100 && power) {
            System.out.println("--> The air purifier is currently filtering the air !");
        } else {
            System.out.println("--> The air purifier is not currently filtering the air !");
        }
    }

}
