import java.util.Arrays;

public class CarMain {
    public static void main(String[] args) {
            Car car = new Car();
            Garage garage = new Garage();
        teddFelATeliGumikat(car, garage);
        teddFelANyariGumikat(car, garage);
        teddFelATeliGumikat(car, garage);
    }
    public static void teddFelATeliGumikat (Car car, Garage garage) {

            if (car.getTireArray()[0].isWinterTyre()) {
                System.out.println("Nem kell kicserélni a gumit, mert téli gumi van rajta");
            } else {
                for (int i = 0; i < 4; i++) {
                    car.getTireArray()[i].setWinterTyre(true);
                    garage.getTireArray()[i].setWinterTyre(false);
                }
                System.out.println("kicseréltük " + (car.getTireArray()[0].isWinterTyre() ? "télire" : "nyárira" ));
            }
    }

    public static void teddFelANyariGumikat (Car car, Garage garage) {

        if (!car.getTireArray()[0].isWinterTyre()) {
            System.out.println("Nem kell kicserélni a gumit, mert nyári gumi van rajta");
        } else {
            for (int i = 0; i < 4; i++) {
                car.getTireArray()[i].setWinterTyre(false);
                garage.getTireArray()[i].setWinterTyre(true);
            }
            System.out.println("kicseréltük " + (car.getTireArray()[0].isWinterTyre() ? "télire" : "nyárira"));
        }
    }
}


