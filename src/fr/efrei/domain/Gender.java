package fr.efrei.domain;

public class Gender {
    private String type;

    public Gender() {
    }

    public Gender(Builder builder) {
        this.type = builder.type;
    }



    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Gender{" +
                ", type='" + type + '\'' +
                '}';
    }

    public static class Builder {

        private String type;
        //setters, not getters


        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder copy(Gender gender){
            this.type = gender.type;
            return this;
        }


        public Gender build() {
            return new Gender(this);
        }
    }
}
