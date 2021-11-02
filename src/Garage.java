public class Garage {
    private Tire[] tireArray = new Tire[4];


    public Garage() {
        for (int i = 0; i < 4; i++) {
            tireArray[i] = new Tire(false);
        }
    }

    public Tire[] getTireArray() {
        return tireArray;
    }

    public void setTireArray(Tire[] tireArray) {
        this.tireArray = tireArray;
    }
}
