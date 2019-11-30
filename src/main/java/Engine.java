enum EngineProduser {
    YANMAR, VOLVO
}

public class Engine {
    private int power;
    private EngineProduser engineProduser;

    public Engine(EngineProduser engineProduser, int power) {
        this.power = power;
        this.engineProduser = engineProduser;
    }

    public int getPower() {
        return power;
    }

    public EngineProduser getEngineProduser() {
        return engineProduser;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", engineProduser=" + engineProduser +
                '}';
    }
}