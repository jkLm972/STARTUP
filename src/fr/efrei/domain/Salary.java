package fr.efrei.domain;
public class Salary {
    private String salari;
    public Salary() {
    }

    public Salary(Builder builder) {
        this.salari = builder.salari;
    }



    public String getSalari() {
        return salari;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salari=" + salari +
                '}';
    }

    public static class Builder {

        private String salari;
        public Builder setSalari(String salari) {
            this.salari = salari;
            return this;
        }

        public Builder copy(Salary salari){
            this.salari = salari.salari;
            return this;
        }


        public Salary build() {
            return new Salary(this);
        }
    }
}