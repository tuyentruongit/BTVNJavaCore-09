package entity;

import java.util.Arrays;

public class TableWork {


    private Drive drive;
    private TableWorkDetail[] tableWorkDetails;

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public TableWorkDetail[] getTableWorkDetails() {
        return tableWorkDetails;
    }

    public void setTableWorkDetails(TableWorkDetail[] tableWorkDetails) {
        this.tableWorkDetails = tableWorkDetails;
    }

    public TableWork(Drive drive, TableWorkDetail[] tableWorkDetails) {
        this.drive = drive;
        this.tableWorkDetails = tableWorkDetails;
    }

    @Override
    public String toString() {
        return "TableWork{" +
                "drive=" + drive +
                ", tableWorkDetails=" + Arrays.toString(tableWorkDetails) +
                '}';
    }
}
