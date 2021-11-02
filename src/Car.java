public class Car {
    private Tire[] tireArray = new Tire[4];

    public Car() {
        for (int i = 0; i < 4; i++) {
            tireArray[i] = new Tire(true);

        }
    }

    public Tire[] getTireArray() {
        return tireArray;
    }

    public void setTireArray(Tire[] tireArray) {
        this.tireArray = tireArray;
    }
}
