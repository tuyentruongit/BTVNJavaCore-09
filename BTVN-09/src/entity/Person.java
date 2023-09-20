package entity;

import java.util.Scanner;

public  class Person implements Inputable {

    protected String name;
    protected String address;
    protected int phone;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "entity.Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
    public void input(){
        System.out.println("Nhập họ tên bạn lái xe mới");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ bạn lái xe mới");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại bạn lái xe mới");
        this.setPhone(new Scanner(System.in).nextInt());
    }
}
