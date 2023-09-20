package entity;

import statics.DrivingLevel;

import java.util.Scanner;

public class Drive extends Person {
    private static int nextIdDrive = 10000;
    private int idDrive ;
    private DrivingLevel drivingLevel;

    public Drive() {
        this.idDrive=nextIdDrive;
        nextIdDrive++;
    }

    public static int getNextIdDrive() {
        return nextIdDrive;
    }

    public static void setNextIdDrive(int nextIdDrive) {
        Drive.nextIdDrive = nextIdDrive;
    }

    public int getIdDrive() {
        return idDrive;
    }

    public void setIdDrive(int idDrive) {
        this.idDrive = idDrive;
    }

    public DrivingLevel getDrivingLevel() {
        return drivingLevel;
    }

    public void setDrivingLevel(DrivingLevel drivingLevel) {
        this.drivingLevel = drivingLevel;
    }

    @Override
    public String toString() {
        return "entity.Drive{" +
                "idDrive=" + idDrive +
                ", drivingLevel=" + drivingLevel.value +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
    public void inputInfo(){
        input();
        System.out.println("Chọn bằng lái xe của lái xe mới");
        System.out.println("1. Bằng lái xe hạng A");
        System.out.println("2. Bằng lái xe hạng B");
        System.out.println("3. Bằng lái xe hạng C");
        System.out.println("4. Bằng lái xe hạng D");
        System.out.println("5. Bằng lái xe hạng E");
        System.out.println("6. Bằng lái xe hạng F");
        int license = new Scanner(System.in).nextInt();
        switch (license){
            case 1:
                this.setDrivingLevel(DrivingLevel.LICENSE_A);
//                                System.out.println(" Bằng lái xe của bạn không đủ điều kiện để trở thành lái xe mới");
                break;
            case 2:
                this.setDrivingLevel(DrivingLevel.LICENSE_B);
//                                System.out.println(" Bằng lái xe của bạn không đủ điều kiện để trở thành lái xe mới");
                break;
            case 3:
                this.setDrivingLevel(DrivingLevel.LICENSE_C);
//                                System.out.println(" Bằng lái xe của bạn không đủ điều kiện để trở thành lái xe mới");
                break;
            case 4:
                this.setDrivingLevel(DrivingLevel.LICENSE_D);
//                                System.out.println(" Bằng lái xe của bạn không đủ điều kiện để trở thành lái xe mới");
                break;
            case 5:
                this.setDrivingLevel(DrivingLevel.LICENSE_E);
                break;
            case 6:
                this.setDrivingLevel(DrivingLevel.LICENSE_F);
                break;

        }
    }
}
