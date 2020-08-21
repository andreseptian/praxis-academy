package project.kasus;

public class Login {
    public static void main(String[] args) {

        // Create two different
        // Bicycle objects
        User user1 = new User();
        User user2 = new User();

        // Invoke methods on
        // those objects
        user1.Email("Andre@gmail.com");
        user1.Password("blackoi123");
        user1.Gender("Laki-laki");
        user1.Phone("087753810066");
        user1.Name("Andre Septian");
        user1.printStates();

        user2.Name("Septian Andre");
        user2.Email("Septian@gmailcom");
        user2.Password("black321");
        user2.Gender("Laki-laki");
        user2.Phone("086654210080");

        user2.printStates();
    }
}