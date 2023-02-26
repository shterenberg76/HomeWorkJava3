public class ConvertEurToUsd {
    public static void main(String[] args) {
        // 1 eu = 1.06 Usd

        System.out.println(convertEurToUsd(35,1.06));
    }

    public static double convertEurToUsd(int eur, double course) {
        return eur * course;
    }


}
