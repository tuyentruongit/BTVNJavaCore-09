package statics;

public enum DrivingLevel {
    LICENSE_A("Bằng lái xe hạng A"),
    LICENSE_B("Bằng lái xe hạng b"),
    LICENSE_C("Bằng lái xe hạng C"),
    LICENSE_D("Bằng lái xe hạng D"),
    LICENSE_E("Bằng lái xe hạng E"),
    LICENSE_F("Bằng lái xe hạng F");
    public String value;

    DrivingLevel(String value) {
        this.value = value;
    }

}
