import java.util.Objects;

public class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString(){

        //return "Nombre: " + name + " | Teléfono: " + phone + " | Email: " + email;
        //return String.format("Nombre: %s | Teléfono: %s | Email: %s",name,phone,email);

        return "Nombre: " + Objects.toString(name, "N/A")
                + " | Teléfono: " + Objects.toString(phone, "N/A")
                + " | Email: " + Objects.toString(email, "N/A");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
