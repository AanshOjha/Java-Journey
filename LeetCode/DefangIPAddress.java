public class DefangIPAddress {
    public String defangIPaddr(String address) {
        String h= address.replace(".", "[.]");
        return h;
    }
    public static void main(String[] args) {
        DefangIPAddress defang =  new DefangIPAddress();
        System.out.println(defang.defangIPaddr("12.3.4.3"));
    }
}