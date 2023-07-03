public class RewardValue {
     private double cashValue;
//     int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }



    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int)(cashValue/.0035);
    }

    public int convertCashToMiles(double cashValue){
        return (int)(cashValue/.0035);
    }

    public int convertMilesToCash(int milesValue){
        return (int)(milesValue * .0035);
    }
}
