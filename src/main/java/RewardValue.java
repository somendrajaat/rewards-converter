public class RewardValue {

    double CashValue;
    RewardValue (double CashValue){
            this.CashValue=CashValue;
    }
    public String getMilesValue() {
        double card=(CashValue/0.0035);
        System.out.println(card);
        return String.valueOf(card);
    }


    public double getCashValue() {
            return CashValue;
    }
}
