package project.kasus;

class User {

    int noUser = 0;
    String name;
    String phone;
    String gender;
    String email;
    String password;

    void NoUser(int newValue) {
        noUser = newValue;
    }

    void Name(String newValue) {
        name = newValue;
    }

    void Phone(String newValue) {
        phone = newValue;
    }

    void Gender(String newValue) {
        gender = newValue;
    }

    void Email(String newValue) {
        email = newValue;
    }

    void Password(String newValue) {
        password = newValue;
    }

    void printStates() {
        System.out.println("Email: " + email + " Password: " + password + " Phone: " + phone + " Nama: " + name);
    }
}
