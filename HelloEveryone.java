import java.util.List;

public class HelloEveryone{
    private String person;

    public HelloEveryone(String person) {
        this.person = person;
    }

    public void execute() {
        System.out.println("Hello " + person);
    }

    public static void main(String[] args) {
        List<HelloEveryone> everyone = List.of(new HelloEveryone("Aansh"), new HelloEveryone("Ananay"));
        for (HelloEveryone person : everyone) {
            person.execute();
        }
    }

}

