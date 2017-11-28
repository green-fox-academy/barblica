
public class AgeCounter {

    public String count(int age, int month) {
        return "Age and month: " + String.valueOf(age) + " " + String.valueOf(month);
    }

    public static void main(String[] args) {

        AgeCounter counter = new AgeCounter();
        int age = 27;
        int month = 8;
        System.out.println(counter.count(age, month));
    }
}
