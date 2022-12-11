package fr.efrei.domain;
public class Position {
    private String code;
    private String statut;
    public Position() {
    }

    public Position(Builder builder) {
        this.code = builder.code;
        this.statut = builder.statut;
    }



    public String getCode() {
        return code;
    }

    public String getStatut() {
        return statut;
    }

    @Override
    public String toString() {
        return "Position{" +
                ", code='" + code + '\'' +
                ", statut='" + statut + '\'' +
                '}';
    }

    public static class Builder {
        private String code;
        private String statut;
        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Builder setStatut(String statut) {
            this.statut = statut;
            return this;
        }

        public Builder copy(Position demographic){

            this.code = demographic.code;
            this.statut = demographic.statut;
            return this;
        }


        public Position build() {
            return new Position(this);
        }
    }

}