package fr.efrei.domain;
public class Identity {
    private String identityName;
    private String identityValue;
    public Identity() {
    }

    public Identity(Builder builder) {
        this.identityName = builder.identityName;
        this.identityValue = builder.identityValue;
    }


    public String getIdentityName() {
        return identityName;
    }

    public String getIdentityValue() {
        return identityValue;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "identityName='" + identityName + '\'' +
                ", identityValue=" + identityValue +
                '}';
    }

    public static class Builder {
        private String identityName;
        private String identityValue;

        public Builder setIdentityName(String identityName) {
            this.identityName = identityName;
            return this;
        }

        public Builder setIdentityValue(String identityValue) {
            this.identityValue = identityValue;
            return this;
        }

        public Builder copy(Identity identity){
            this.identityName = identity.identityName;
            this.identityValue = identity.identityValue;
            return this;
        }


        public Identity build() {
            return new Identity(this);
        }
    }
}