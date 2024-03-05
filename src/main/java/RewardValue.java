public class RewardValue {

    double CashValue;
    RewardValue (double CashValue){
            this.CashValue=CashValue;
    }
    public String getMilesValue() {
        double card=(83.3334*CashValue);
        System.out.println(card);
        return String.valueOf(card);
    }


    public double getCashValue() {
            return CashValue;
    }
}
