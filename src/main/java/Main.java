import jssc.SerialPort;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        int i = calculate.calA(1,3);
        System.out.println(i);
    }
}