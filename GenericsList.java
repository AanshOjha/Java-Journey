import java.util.ArrayList;

public class GenericsList<T> {

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public String toString() {
        return list.toString();
    }
    public static void main(String[] args) {
        GenericsList<String> list1 = new GenericsList<>();
        list1.addElement("Ananay"); 
        list1.addElement("Aansh");
        System.out.println(list1);

        GenericsList<Integer> list2 = new GenericsList<>();
        list2.addElement(Integer.valueOf(200)); 
        list2.addElement(Integer.valueOf(100));
        System.out.println(list2);
    }
}
