
public class AgeCounter {

    public String count(int age) {
        return String.valueOf(age);
    }

    public static void main(String[] args) {
        AgeCounter counter = new AgeCounter();
        int age = 27;
        System.out.println(counter.count(age));
    }
}
