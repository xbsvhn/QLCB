package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
    ArrayList<CanBo> danhsach = new ArrayList<CanBo>();

    public void add(CanBo canbo){
        this.danhsach.add(canbo);
    }
    public List<CanBo> searchByName(String name) {
        return this.danhsach.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showdanhsachcanbo() {
        this.danhsach.forEach(o -> System.out.println(o.toString()));
    }

}
