import enums.Gender;
import exeptions.FlightExсeption;

public class Main {

    public static void main(String[] args) throws FlightExсeption {

        Carlson carlson = new Carlson();
        Human hum = new Human();
        Human hum2 = new Human("Алёна", Gender.WOMAN, 167);

        carlson.watch(hum);
        hum.call();
        carlson.prank();
        try {
            carlson.flight();
        } catch (FlightExсeption e) {
            System.out.println(e.getMessage());
        }


        System.out.println("\nСравнение людей: " + hum.equals(hum2));
        System.out.println(hum);
        System.out.println(hum2);
    }
}
