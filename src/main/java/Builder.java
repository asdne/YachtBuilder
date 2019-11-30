enum YachtType {
    SAIL, MOTOR
}

public interface Builder {
    void setType(YachtType yachtType);

    void setLength(int length);

    void setEngine(Engine engine);

    void setSailQuantity(int sails);


}