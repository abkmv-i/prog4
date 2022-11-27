import enums.Gender;
import interfaces.HumanInt;

public abstract class HumanAbs implements HumanInt {
    private String name;
    private Gender gender;
    private int height;


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public boolean generate() {
        if (Math.random() * 2 > 1) {
            return true;
        }
        return false;
    }
}
