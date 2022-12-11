package fr.efrei.domain;
public class Employees {
    private String firstName;
    private String lastName;
    private int employeesNumber;

    public Employees() {
    }

    public Employees(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.employeesNumber=builder.employeesNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeesNumber=" + employeesNumber +
                '}';
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int employeesNumber;
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setEmployeesNumber(int employeesNumber) {
            this.employeesNumber = employeesNumber;
            return this;
        }

        public Builder copy(Employees contact){
            this.firstName = contact.firstName;
            this.lastName = contact.lastName;
            this.employeesNumber = contact.employeesNumber;
            return this;
        }


        public Employees build() {
            return new Employees(this);
        }
    }
}