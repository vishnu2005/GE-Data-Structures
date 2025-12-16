public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String phoneNumber;
    String email;
    int pin;

    public Contact(String firstName, String lastName, String address, String city, String state, String phoneNumber, String email, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", pin=" + pin +
                '}';
    }
}
