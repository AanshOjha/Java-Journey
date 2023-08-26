import java.math.BigDecimal;

public class SimpleInterest {
    BigDecimal principal;
    BigDecimal rate;
    BigDecimal time;

    public SimpleInterest(String principal, String rate, String time) {
        this.principal = new BigDecimal(principal);
        this.rate = new BigDecimal(rate);
        this.time = new BigDecimal(time);
    }

    public BigDecimal amountValue() {
        BigDecimal prt = principal.multiply(rate).multiply(time);
        BigDecimal totalSum = principal.add(prt.divide(new BigDecimal(100)));
        return totalSum;
    }

    public static void main(String[] args) {
        SimpleInterest cal = new SimpleInterest("3090000", "8.9", "25");
        System.out.println(cal.amountValue());
        
        }

    

}