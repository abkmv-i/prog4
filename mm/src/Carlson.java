import enums.Gender;
import enums.Prank;
import exeptions.FlightExсeption;

public class Carlson extends HumanAbs {

    public Carlson() {
        this.setName("Карлсон");
        this.setGender(Gender.MAN);
        this.setHeight(130);
    }

    public class Fly {
        private String direction;
        private String duration;

        public void flightDirection() {

            if (Carlson.this.generate()) {
                direction = "направо";
            }
            else direction = "налево";
        }

        public void flightDuration() {
            duration = String.format("%.0f", (Math.random() * 10)+1);
        }

        public String getDuration() {
            return duration;
        }

        public String getDirection() {
            return direction;
        }
    }

    public void flight() throws FlightExсeption {
        if (this.generate()) {
            throw new FlightExсeption("Карлсон: Эх, пропеллер забился от курения(");
        } else {
            System.out.println("Карлсон: Юху, полетел!");
            Fly fly = new Fly();
            System.out.println("Полёт Карлсона:");
            for (int i = 0; i < 3; i++) {
                fly.flightDirection();
                fly.flightDuration();
                System.out.println(fly.getDuration() + " м " + fly.getDirection());
            }
        }
    }

    public void watch(Human hosp) {
        System.out.println(this.getName() + " пожал плечами");
        hosp.setHappy(hosp.generate());
        if (hosp.getHappy()) {
            System.out.println(hosp.getName() + " с сигарой выглядел счастливым");
        } else {
            System.out.println(hosp.getName() + " с сигарой не выглядел счастливым");
        }
        hosp.shakeOff();
    }


    public static class Pranking {
        private Prank prank;

        public Prank getPrank() {
            return prank;
        }

        public void generatePrank() {
            if (Math.random() * 2 > 1) {
                prank = Prank.CHANDELIER;
            } else prank = Prank.JAM;
        }

    }

    public void prank() {
        Pranking prank = new Pranking();
        prank.generatePrank();
        System.out.println(this.getName() + prank.getPrank() + "\nЧтобы мама не ругалась " + this.getName() + " решил улететь");
    }
}