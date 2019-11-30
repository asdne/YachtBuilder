public class YachtBuilder {
    public static void main(String[] args) {
        ShipYardDirector director = new ShipYardDirector();
        ShipYard shipYard = new ShipYard();
        director.buildSailYacht(shipYard);
        Yacht yacht = shipYard.yachtLaunch();
        director.buildMotorYacht(shipYard);
        Yacht yacht1 = shipYard.yachtLaunch();
        System.out.println(yacht);
        System.out.println(yacht1);

    }
}
