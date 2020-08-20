
public class Test {
    public void pupAge() {
        int age = 1;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        Test test = new Test();
        test.pupAge();
    }
}