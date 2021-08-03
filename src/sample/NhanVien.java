package sample;

public class NhanVien extends CanBo{
    private String work;

    public NhanVien(String name, int age, String sex, String address, String work) {
        super(name, age, sex, address);
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
