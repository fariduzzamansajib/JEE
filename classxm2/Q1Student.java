package classxm2;

public class Q1Student extends Q1Teacher {

    int id;
    String email;
    int round;
    String address;

    public String ShowAddress() {
        return "The Address is: " + address;
    }

    public Q1Student() {
    }

    public Q1Student(int id, String email, int round, String address) {
        this.id = id;
        this.email = email;
        this.round = round;
        this.address = address;
    }

}
