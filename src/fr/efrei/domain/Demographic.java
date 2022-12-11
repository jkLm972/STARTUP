package fr.efrei.domain;

public class Demographic {
    private String genderType;
    private String raceType;

    public Demographic() {
    }

    public Demographic(Builder builder) {
        this.genderType = builder.genderType;
        this.raceType = builder.raceType;
    }



    public String getGenderType() {
        return genderType;
    }

    public String getRaceType() {
        return raceType;
    }

    @Override
    public String toString() {
        return "Demographic{" +
                ", genderType='" + genderType + '\'' +
                ", raceType='" + raceType + '\'' +
                '}';
    }

    public static class Builder {
        private String genderType;
        private String raceType;



        public Builder setGenderType(String genderType) {
            this.genderType = genderType;
            return this;
        }

        public Builder setRaceType(String raceType) {
            this.raceType = raceType;
            return this;
        }

        public Builder copy(Demographic demographic){

            this.genderType = demographic.genderType;
            this.raceType = demographic.raceType;
            return this;
        }


        public Demographic build() {
            return new Demographic(this);
        }
    }

}
