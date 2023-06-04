import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double opening = 10, priceByKm = 2.20, minPrice = 20, ride, totalPrice;

        Scanner input = new Scanner(System.in);
        System.out.print("kaç KM yol Gittiniz: ");
        ride = input.nextDouble();
        totalPrice = (ride * priceByKm) < minPrice ? minPrice : (opening + ride * priceByKm);
        System.out.print("Your total price: " + totalPrice);
        input.close();
    }
}