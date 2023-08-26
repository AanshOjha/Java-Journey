import java.math.BigDecimal;

public class TempConverter {
    //Declare the input in Celsius    
    BigDecimal celsius;   // // // // // // // //  // //  //           
                                                            //
    //Constructor for taking instance variable input          //
    public TempConverter(String celsius) {                      // // // // // //
        this.celsius = new BigDecimal(celsius); // important so as to initialize // to take up the String celsius as BigDecimal one's value is null RN.
    }

    //Method for Conversion
    public void celConverter() {
        BigDecimal fahrenheit = celsius.multiply(new BigDecimal(1.8)).add(new BigDecimal(32));
        System.out.println(celsius + "degree Celsius in Fahrenheit is: " + fahrenheit);
    }

    public static void main(String[] args) {
        TempConverter temp = new TempConverter("100");
        temp.celConverter();

    }
}
