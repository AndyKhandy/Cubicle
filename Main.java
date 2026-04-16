import java.util.*;

public class Main{
    public static void main(String[] args){
        List<Property> places = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        places.add(new House(
    "1990 Blue Lake Blvd Arlington TX, 76040",
    2,
    6,
    4,
    3,
    true,
    500000.0,
    "Pool, Solar Panels",
    "1.2%",
    2,
    2
        ));

        places.add(new Apartment(
    "1241 Super Lake Ave",
    1,
    4,
    2,
    2,
    false,
    20000.0,
    "Gym, Parking, Pet Friendly",
    "Johnson Realty",
    1500.0,
    3
    ));

    places.add(new House(
        "88 Cedar Ridge Dr",
        3,
        8,
        5,
        4,
        true,
        750000.0,
        "Basement, Fireplace",
        "1.5%",
        3,
        3
    ));

    places.add(new Apartment(
        "550 Downtown Heights",
        1,
        3,
        1,
        1,
        false,
        18000.0,
        "Rooftop access, Gym",
        "Skyline Properties",
        1200.0,
        12
    ));

    System.out.println("After a property is displayed press enter to load the next one!");
    for(Property property : places){
        property.displayPicture();
        property.displayProperty();
        input.nextLine();
    }

    }
}