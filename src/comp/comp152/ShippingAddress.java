package comp.comp152;

public class ShippingAddress {
    private String AddressLine1;
    private String AddressLine2;
    private String city;
    private String State;
    private String PostalCode;

    public ShippingAddress(String line1, String line2, String cityName, String stateName, String zipCode) {
        AddressLine1 = line1;
        AddressLine2 = line2;
        city = cityName;
        State = stateName;
        PostalCode = zipCode;

    }
    public String toString(){
        return AddressLine1 + AddressLine2 + city + State + PostalCode;
    }


}


