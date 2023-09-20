package entity;

import java.util.Arrays;
import java.util.Scanner;

public class BusRoutes {
    private static int nextIdRoutes = 100;
    private int idRoutes;
    private String distance ;

    private int numberStops;

    public int getNumberStops() {
        return numberStops;
    }

    public void setNumberStops(int numberStops) {
        this.numberStops = numberStops;
    }

    public BusRoutes() {
        this.idRoutes=nextIdRoutes;
        nextIdRoutes++;
    }

    public static int getNextIdRoutes() {

        return nextIdRoutes;
    }

    public static void setNextIdRoutes(int nextIdRoutes) {
        BusRoutes.nextIdRoutes = nextIdRoutes;
    }

    public int getIdRoutes() {
        return idRoutes;
    }

    public void setIdRoutes(int idRoutes) {
        this.idRoutes = idRoutes;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "BusRoutes{" +
                "idRoutes=" + idRoutes +
                ", distance='" + distance + '\'' +
                ", numberStops=" + numberStops +
                '}';
    }
    public void inputInforBusrouters (){
        System.out.println("Nhập khoảng cách của tuyến");
        this.setDistance(new Scanner(System.in).nextLine());
        System.out.println("Nhập số lượng những điểm dừng trên tuyến");
        this.setNumberStops(new Scanner(System.in).nextInt());
    }
}
