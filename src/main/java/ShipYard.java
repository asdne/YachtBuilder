public class ShipYard implements Builder {
    private YachtType yachtType;
    private int yachtLength;
    private Engine yachtEngine;
    private int sailQuantity;

    public void setType(YachtType yachtType) {
        this.yachtType = yachtType;
    }

    public void setLength(int length) {
        this.yachtLength = length;
    }

    public void setEngine(Engine engine) {
        this.yachtEngine = engine;
    }

    public void setSailQuantity(int sails) {
        this.sailQuantity = sails;
    }

    public Yacht yachtLaunch() {
        return new Yacht(yachtType, yachtLength, yachtEngine, sailQuantity);
    }
}
