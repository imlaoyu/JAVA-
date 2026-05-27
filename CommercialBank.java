public class CommercialBank extends Bank {
    double year;
    public double computerInterest() {
        super.year = (int) this.year;
        double r = this.year - (int) this.year;
        int day = (int) (r * 1000);

        double yearInterest = super.computerInterest();
        double dayInterest = day * 0.00015 * savedMoney;
        interest = yearInterest + dayInterest;

        System.out.printf("%d元存在商业银行%d年零%d天的利息：%.2f元\n",
                savedMoney, super.year, day, interest);
        return interest;
    }
}