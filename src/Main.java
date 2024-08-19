public class Main{
    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        car.drive();
        System.out.println(car.getDistanceDriven());

        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.println(nitroCar.getDistanceDriven());

        int distance = 1000;
        RaceTrack raceTrack = new RaceTrack(distance);
        System.out.println(raceTrack.carCanFinish(car));

    }

}