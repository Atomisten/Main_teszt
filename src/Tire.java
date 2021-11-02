public class Tire {
    private boolean winterTyre;                 // true = winter, false = summer

    public Tire (boolean winterTyre) {
       this.winterTyre = winterTyre;
    }

    public boolean isWinterTyre() {
        return winterTyre;
    }

    public void setWinterTyre(boolean winterTyre) {
        this.winterTyre = winterTyre;
    }
}
