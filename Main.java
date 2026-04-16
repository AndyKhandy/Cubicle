

public class Main{
    public static void main(String[] args){
    PropertySystem system = new PropertySystem();

        system.addMockProperty(new House(
    "1990 Blue Lake Blvd Arlington TX, 76040",
    2,
    6,
    4,
    3,
    500000.0,
    "Pool, Solar Panels",
    1.2,
    2,
    2, Status.CONSIDERING
        ));

       system.addMockProperty(new Apartment(
    "1241 Super Lake Ave",
    1,
    4,
    2,
    2,
    20000.0,
    "Gym, Parking, Pet Friendly",
    "Johnson Realty",
    1500.0,
    3, Status.NEW
    ));

    system.addMockProperty(new House(
        "88 Cedar Ridge Dr",
        3,
        8,
        5,
        4,
        750000.0,
        "Basement, Fireplace",
        1.5,
        3,
        3, Status.WITHDRAWN
    ));

    /*system.addMockProperty(new Apartment(
        "550 Downtown Heights",
        1,
        3,
        1,
        1,
        18000.0,
        "Rooftop access, Gym",
        "Skyline Properties",
        1200.0,
        12, Status.CONSIDERING
    )); */

    system.addProperty();
    system.displayAllPlaces();
    system.displayAllPlacesShorthand();
    system.removeProperty();
    system.displayAllPlaces();
    }
}