public class Main {
    public static void main(String[] args) {

        AirPurifier Number1 = new AirPurifier(true, "A", "000", 1);
        System.out.println(AirPurifier.modelCount);
        AirPurifier Number2 = new AirPurifier(false, "B", "111", 1);
        System.out.println(AirPurifier.modelCount);

    }
}