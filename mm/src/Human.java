import enums.Gender;
import enums.KindShaking;
import exeptions.PoliceExeption;
import interfaces.HumanInt;

import java.util.Objects;

public class Human extends HumanAbs {
    private boolean happy;

    public Human() {
        this.setName("Господин");
        this.setGender(Gender.MAN);
        this.setHeight(185);
    }

    public Human(String name, Gender gender, int height) {
        this.setName(name);
        this.setGender(gender);
        this.setHeight(height);
    }

    public boolean getHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public void shakeOff() {
        class KindShak {
            private KindShaking shaking = KindShaking.LONG_AND_THOROUGHLY;

            public KindShaking getShaking() {
                return shaking;
            }

            public void generateShaking() {
                if (Math.random() * 2 > 1) {
                    shaking = KindShaking.LONG_AND_THOROUGHLY;
                } else shaking = KindShaking.FAST_AND_CAREFULLY;
            }
        }
        KindShak shaking = new KindShak();
        shaking.generateShaking();
        System.out.println(this.getName() + shaking.getShaking() + " отряхивался!");
    }

    public void call() throws PoliceExeption {
        int count = 0;
        HumanInt police = new HumanInt() {
            @Override
            public boolean generate() {
                return Math.random() * 3 > 1.3;
            }
        };

        System.out.println(this.getName() + " вызвал полицейского!");

        while (!police.generate()) {
            count++;
            System.out.println("Свободных полицейских не оказалось, но " + this.getName() + " попробовал ещё раз!");
            if (count > 3) {
                System.out.println("Не удалось вызвать полицейского!");
                throw new PoliceExeption();
            }
        }
        System.out.println("Полицейского удалось вызвать с " + (count + 1) + " раза!");
        System.out.println("Полицейский приехал!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return (getHappy() == human.getHappy() &&
                getGender().equals(human.getGender()) &&
                getHeight() == human.getHeight() &&
                getName().equals(human.getName()));
    }

    @Override
    public String toString() {
        return "\nName: " + this.getName() + "\nenums.Gender: " + this.getGender() + "\nHeight: " + this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getHeight());
    }
}


