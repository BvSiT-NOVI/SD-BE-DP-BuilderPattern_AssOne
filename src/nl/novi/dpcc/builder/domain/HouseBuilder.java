package nl.novi.dpcc.builder.domain;

public class HouseBuilder {
    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;

    public HouseBuilder(String streetName, int housenumber, String houseNumberAddition, String postalCode) {
        this.streetName = streetName;
        this.housenumber = housenumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
        this.hasGarden = false;
    }

    public HouseBuilder withProvince(String province) {
        this.province = province;
        return this;
    }

    public HouseBuilder withGarden() {
        this.hasGarden=true;
        return this;
    }

    public House build(){
        return new House(streetName,housenumber,houseNumberAddition,postalCode,province,hasGarden);
    }

}
