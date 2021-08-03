package sample;

public class KySu extends CanBo{
    private String major;

    public KySu(String name, int age, String sex, String address, String major) {
        super(name, age, sex, address);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
