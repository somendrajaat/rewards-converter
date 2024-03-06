public class RewardValue {

     private double CashValue;

    public static double cash_to_miles=0.0035;
    RewardValue (double CashValue){
            this.CashValue=CashValue;
    }
    RewardValue (int mValue){
        this.CashValue=convertToCash(mValue);
    }
    public double getMilesValue() {
        return convertToMiles(CashValue);
    }
    public static int convertToMiles(double CashValue){
        return (int)(CashValue/cash_to_miles);
    }

    public static double convertToCash(double mileValue){
        return mileValue*cash_to_miles;
    }
    public double getCashValue() {
        return CashValue;
    }
}
