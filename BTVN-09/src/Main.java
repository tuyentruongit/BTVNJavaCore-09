import entity.BusRoutes;
import entity.Drive;
import entity.TableWork;
import entity.TableWorkDetail;

import java.util.Scanner;

public class Main {

        public static Drive[] drives = new Drive[100];
        public static BusRoutes[] busRoutes = new BusRoutes[100];
        public static TableWork[] tableWorks = new TableWork[100];
    public static void main(String[] args) {
        while (true){
           prinMenu();
           int funtion = choiseFuntion();

            switch (funtion){
                case 1:
                    inputDriver();
                    showDriver();
                    break;
                case 2:
                    inputBusrouters();
                    showBusrouters();
                    break;
                case 3:
                    managenmentTableWork();
                    showTableWork();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    return;

            }

        }
    }

    private static void showTableWork() {
        for (int k = 0; k < tableWorks.length; k++) {
            if (tableWorks[k]!=null){
                System.out.println(tableWorks[k]);
            }

        }
    }

    private static void managenmentTableWork() {
        System.out.println("Có bao nhiêu tài xế ");
        int numberDriver = new  Scanner(System.in).nextInt();
        for (int i = 0; i < numberDriver; i++) {
            System.out.println("Nhập thông tin cho tài xế thứ "+(i+1));
            Drive drive= inputDriverForTableWork();
            TableWorkDetail[] tableWorkDetails = inputTabWorkDetails();
            TableWork tableWork = new TableWork(drive,tableWorkDetails);
            saveTableWork(tableWork);
        }
    }

    private static TableWorkDetail[] inputTabWorkDetails() {
        System.out.println("Tài xế này sẽ chạy bao nhiêu tuyến ");
        int numberRoutes = new Scanner(System.in).nextInt();
        TableWorkDetail [] details = new TableWorkDetail[numberRoutes];
        int count = 0 ;
        for (int j = 0; j <numberRoutes ; j++) {
            System.out.println("Nhập thông tin cho tuyến thứ"+(j+1));
            System.out.println("Nhập Id tuyến bus");
            int idRoutes;
            BusRoutes busRoutes1 = null;
            do {
                idRoutes = new Scanner(System.in).nextInt();
                for (int k = 0; k < busRoutes.length; k++) {
                    if (busRoutes[j]!= null && busRoutes[k].getIdRoutes()==idRoutes){
                        busRoutes1=busRoutes[k];
                        break;
                    }
                }
                if (busRoutes1!=null){
                    break;
                }
                System.out.println("Id bạn vừa nhập không đúng, vui lòng nhập lại");
            }while (true);
            System.out.println("Tài xế sẽ chạy bao nhiêu lượt trong tuyến ");
            int quantity;
            do{
                quantity = new Scanner(System.in).nextInt();
                if (quantity>0&&quantity<16){
                    break;
                }
                System.out.println("Số lượt trên mỗi tuyến là một số dương nhỏ hơn 16, Vui lòng nhập lại");
            }while(true);
            TableWorkDetail tableWorkDetail = new TableWorkDetail(busRoutes1,quantity);
            details[count]=tableWorkDetail;
            count++;
        }return details;
    }

    private static Drive inputDriverForTableWork() {
        System.out.println("Nhập ID tài xế đã được thêm mới");
        int idDriver;
        Drive drive = null;
        do {
            idDriver = new Scanner(System.in).nextInt();
            for (int j = 0; j < drives.length; j++) {
                if (drives[j]!= null && drives[j].getIdDrive()==idDriver){
                    drive=drives[j];
                    break;
                }
            }
            if (drive!=null){
                break;
            }
            System.out.println("Id bạn vừa nhập không đúng, vui lòng nhập lại");
        }while (true);
        return drive;
    }

    private static void saveTableWork(TableWork tableWork) {
        for (int j = 0; j < tableWorks.length ; j++) {
            if (tableWorks[j]==null){
                tableWorks[j]=tableWork;
                break;
            }
        }
    }

    private static void inputBusrouters() {
        System.out.println("Nhập số lượng tuyến mới cần thêm vào");
        int routers = new Scanner(System.in).nextInt();
        for (int i = 0; i < routers; i++) {
            System.out.println("Nhập thông tin cho tuyến thứ "+(i+1));
            BusRoutes busRoute = new BusRoutes();
            busRoute.inputInforBusrouters();
            saveBusrouters(busRoute);
        }
    }

    private static void showBusrouters() {
        for (int k = 0; k < busRoutes.length; k++) {
            if (busRoutes[k]!=null){
                System.out.println(busRoutes[k]);
            }

        }
    }

    private static void saveBusrouters(BusRoutes busRoute ) {
        for (int j = 0; j < busRoutes.length ; j++) {
            if (busRoutes[j]==null){
                busRoutes[j]=busRoute;
                break;
            }
        }
    }

    private static void inputDriver() {
        System.out.println("Nhập số lượng lái xe mới mà bạn muốn thêm vào ");
        int numberDriver = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberDriver; i++) {
            System.out.println("Nhập thông tin bạn lái xe mới thứ "+ (i+1));
            Drive drive= new Drive();
            drive.inputInfo();
            saveDriver(drive);
        }
    }

    private static void saveDriver(Drive drive) {
        for (int j = 0; j <drives.length; j++) {
            if ( drives [j] == null ){
                drives[j]= drive;
                break;
            }
        }
    }


    private static void showDriver() {
        for (int j = 0; j < drives.length; j++) {
            if ( drives [j] !=null)
                System.out.println(drives[j]);
        }
    }

    private static int choiseFuntion() {
        System.out.print("Mời bạn chọn những tính năng trên :");
        int funtion ;
        do {
            funtion = new Scanner(System.in).nextInt();
            if (funtion>0&&funtion<8){
                break;
            }
            System.out.println("Chức năng bạn vừa chọn không hợp lệ, vui lòng nhập lại");
        }while (true);
        return funtion;
    }

    private static void prinMenu() {
        System.out.println("---------- PHẦN MỀM QUẢN LÝ LÁI XE BUÝT ----------");
        System.out.println("1. Nhập danh sách lái xe mới");
        System.out.println("2. Nhập danh sách tuyến mới");
        System.out.println("3. Nhập danh sách phân công cho mỗi lái xe ");
        System.out.println("4. In danh sách phân công lái xe");
        System.out.println("5. Sắp xếp danh sách phân công");
        System.out.println("6. Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe");
        System.out.println("7. Thoát");
    }
}
