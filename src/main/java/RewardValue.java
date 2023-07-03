public class RewardValue {
    double cashValue;
    int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return milesValue * .0035;
    }

    public int getMilesValue() {
        return (int)(cashValue/.0035);
    }
}
