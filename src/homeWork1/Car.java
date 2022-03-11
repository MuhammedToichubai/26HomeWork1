package homeWork1;

public class Car {
    private int id;
    private String numberAuto;

    public Car() {
    }

    public Car(int id, String numberAuto) {
        this.id = id;
        this.numberAuto = numberAuto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(String numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return "Key -> car:" +
                "\nid: " + id +
                "\nnumberAuto: " + numberAuto +
                "\n";
    }
}
