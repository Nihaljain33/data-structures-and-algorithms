package demos;

public class Runner {
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(100);
        ImmutableClass immutableClassTwo = new ImmutableClass(100);
        System.out.println(immutableClass.equals(immutableClassTwo));
    }
}
