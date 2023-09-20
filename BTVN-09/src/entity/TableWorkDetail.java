package entity;

import entity.BusRoutes;

public class TableWorkDetail {
    private BusRoutes busRoutes;
    private int quantity;

    public TableWorkDetail(BusRoutes busRoutes, int quantity) {
        this.busRoutes = busRoutes;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "TableWorkDetail{" +
                "busRoutes=" + busRoutes +
                ", quantity=" + quantity +
                '}';
    }
}
