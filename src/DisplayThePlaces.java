import static java.lang.System.out;
import java.util.Scanner;

public class DisplayThePlaces {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        PlaceToLive place1 = new PlaceToLive();
        place1.setAddress("проспект Независимости, 67");
        place1.setNumberOfBedrooms(1);
        place1.setArea(65.44);
        System.out.println("Стоимость " + place1.getAddress() + ": ");
        double cost1 = keyboard.nextDouble();

        PlaceToLive place2 = new PlaceToLive();
        place2.setAddress("улица Беды, 10");
        place2.setNumberOfBedrooms(2);
        place2.setArea(122.5);
        System.out.println("Стоимость " + place2.getAddress() + ": ");
        double cost2 = keyboard.nextDouble();


        out.println("Адрес: " + place1.getAddress());
        out.println("Стоимость квадратного метра: " + cost1/place1.getArea());
        out.println("Стоимость спальни: " + cost1/place1.getNumberOfBedrooms());

        out.println("Адрес: " + place2.getAddress());
        out.println("Стоимость квадратного метра: " + cost2/place2.getArea());
        out.println("Стоимость спальни: " + cost2/place2.getNumberOfBedrooms());

        keyboard.close();










    }






}
