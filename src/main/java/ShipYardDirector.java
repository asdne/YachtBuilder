public class ShipYardDirector {
    public void buildSailYacht(Builder builder) {
        builder.setType(YachtType.SAIL);
        builder.setLength(15);
        builder.setEngine(new Engine(EngineProduser.YANMAR, 60));
        builder.setSailQuantity(3);
    }

    public void buildMotorYacht(Builder builder) {
        builder.setType(YachtType.MOTOR);
        builder.setLength(14);
        builder.setEngine(new Engine(EngineProduser.VOLVO, 500));
        builder.setSailQuantity(3);
    }
}
