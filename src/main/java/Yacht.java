public class Yacht {
    private YachtType yachtType;
    private int yachtLength;
    private Engine yachtEngine;
    private int sailQuantity;

    public Yacht(YachtType yachtType, int yachtLength, Engine yachtEngine, int sailQuantity) {
        this.yachtType = yachtType;
        this.yachtLength = yachtLength;
        this.yachtEngine = yachtEngine;
        this.sailQuantity = (yachtType == YachtType.SAIL) ? sailQuantity : 0;
    }

    @Override
    public String toString() {
        return "Yacht{" +
                "yachtType=" + yachtType +
                ", yachtLength=" + yachtLength +
                ", yachtEngine=" + yachtEngine +
                ", sailQuantity=" + sailQuantity +
                '}';
    }
}
