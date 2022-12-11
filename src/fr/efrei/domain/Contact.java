package fr.efrei.domain;
public class Contact {
    private String email;
    private String phone;
    private int homeNumber;
    public Contact() {
    }

    public Contact(Builder builder) {
        this.email = builder.email;
        this.phone = builder.phone;
        this.homeNumber=builder.homeNumber;
    }


    public String getStreetAdress() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", homeNumber=" + homeNumber +
                '}';
    }

    public static class Builder {
        private String email;
        private String phone;
        private int homeNumber;
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder setHomeNumber(int homeNumber) {
            this.homeNumber = homeNumber;
            return this;
        }

        public Builder copy(Contact contact){
            this.email = contact.email;
            this.phone = contact.phone;
            this.homeNumber = contact.homeNumber;
            return this;
        }


        public Contact build() {
            return new Contact(this);
        }
    }
}