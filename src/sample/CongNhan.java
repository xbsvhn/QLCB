package sample;

public class CongNhan extends CanBo{
    private int level;

    public CongNhan(String name, int age, String sex, String address, int level) {
        super(name, age, sex, address);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", level=" + level +
                '}';
    }
}
