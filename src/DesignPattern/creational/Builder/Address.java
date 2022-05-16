package DesignPattern.creational.Builder;

public class Address {

    private String houseNumber;
    private String city;
    private String district;
    private String state;
    private String pin;
    private String country;

    public static Builder builder() {
        return new Builder();
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }

    public String getPin() {
        return pin;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class Builder {
        private String houseNumber;
        private String city;
        private String district;
        private String state;
        private String pin;
        private String country;

        public Builder withHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withDistrict(String district) {
            this.district = district;
            return this;
        }

        public Builder withState(String state) {
            this.state = state;
            return this;
        }

        public Builder withPin(String pin) {
            this.pin = pin;
            return this;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Address build() {

            Address address = new Address();
            address.houseNumber = houseNumber;
            address.city = city;
            address.district = district;
            address.state = state;
            address.pin = pin;
            address.country = country;

            return address;
        }
    }
}
