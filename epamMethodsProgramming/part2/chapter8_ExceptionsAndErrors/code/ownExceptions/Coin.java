package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.code.ownExceptions;

/**
 * Created by Alexander on 9/4/2016.
 */
public class Coin {
    private double diameter;
    private double weight;
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double value) throws CoinLogicException {
        if(value <= 0) {
            throw new CoinLogicException("diameter is incorrect");
        }
        diameter = value;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }
}
