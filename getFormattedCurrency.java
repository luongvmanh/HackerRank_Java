import java.util.*;
import java.text.*;

public class getFormattedCurrency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = 12324.134;
        scanner.close();
        //Create Indian Locale(String en, String INDIA);
        Locale indiaLocale = new Locale("en", "IN");
        // Write your code here.
        NumberFormat dollarFormat =  NumberFormat.getCurrencyInstance(Locale.US);
        String us = dollarFormat.format(payment);

        NumberFormat rupee =  NumberFormat.getCurrencyInstance(indiaLocale);
        String india = rupee.format(payment);

        NumberFormat yuan =  NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = yuan.format(payment);

        NumberFormat franc =  NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franc.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}