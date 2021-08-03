package sample;

import sample.CanBo;
import sample.KySu;
import sample.QLCB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("Nhap 1: Them can bo");
            System.out.println("Nhap 2: Tim kiem can bo theo ten ");
            System.out.println("Nhap 3: Danh sach can bo");
            System.out.println("Nhap 4: Thoat chuong trinh");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhap KS: Them Ky Su");
                    System.out.println("Nhap CN: Them Cong Nhan");
                    System.out.println("Nhap NV: Them Nhan Vien");
                    String type = sc.nextLine();
                    switch (type) {
                        case "KS": {
                            System.out.print("Nhap ten: ");
                            String name = sc.nextLine();
                            System.out.print("Nhap tuoi:");
                            int age = sc.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            sc.nextLine();
                            String sex = sc.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String address = sc.nextLine();
                            System.out.print("Nhap nganh dao tao: ");
                            String major = sc.nextLine();
                            CanBo ks = new KySu(name, age, sex, address, major);
                            qlcb.add(ks);
                            System.out.println(ks.toString());
                            break;

                        }
                        case "CN": {
                            System.out.print("Nhap ten: ");
                            String name = sc.nextLine();
                            System.out.print("Nhap tuoi:");
                            int age = sc.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            sc.nextLine();
                            String sex = sc.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String address = sc.nextLine();
                            System.out.print("Nhap level: ");
                            int level = sc.nextInt();
                            CanBo cn = new CongNhan(name, age, sex, address, level);
                            qlcb.add(cn);
                            System.out.println(cn.toString());
                            sc.nextLine();
                            break;
                        }
                        case "NV": {
                            System.out.print("Nhap ten: ");
                            String name = sc.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int age = sc.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            sc.nextLine();
                            String sex = sc.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String address = sc.nextLine();
                            System.out.print("Nhao cong viec: ");
                            String work = sc.nextLine();
                            CanBo nv = new NhanVien(name, age, sex, address, work);
                            qlcb.add(nv);
                            System.out.println(nv.toString());
                            break;
                        }
                        default:
                            System.out.println("Khong hop le. Nhap lai.");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhap ten tim kiem: ");
                    String name = sc.nextLine();
                    qlcb.searchByName(name).forEach(canbo -> {
                        System.out.println(canbo.toString());
                    });
                    break;
                }
                case "3": {
                    qlcb.showdanhsachcanbo();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Khong hop le. Nhap lai.");
                    continue;
            }

        }
    }

}
