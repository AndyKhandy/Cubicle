public class House extends Property {
    private String propertyTax;
    private int floors;
    private int garages;

    public House(String address, int minPeople, int maxPeople, int bedrooms, int bathrooms, boolean hasBackyard, double yearlyCost, String otherFeatures, String propertyTax, int floors, int garages){
                super(address, minPeople, maxPeople, bedrooms, bathrooms, hasBackyard, yearlyCost, otherFeatures);
                this.propertyTax = propertyTax;
                this.floors = floors;
                this.garages = garages;
    }

    public String getPropertyTax() {
    return propertyTax;
    }

    public void setPropertyTax(String propertyTax) {
        this.propertyTax = propertyTax;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getGarages() {
        return garages;
    }

    public void setGarages(int garages) {
        this.garages = garages;
    }

    public void displayPicture(){
        System.out.println("    ___________________     ");
        System.out.println("  /                     \\  ");
        System.out.println(" /_______________________\\ ");
        System.out.println("  |  __     __     __   |    ");
        System.out.println("  | |__|   |__|   |__|  |    ");
        System.out.println("  |                     |    ");
        System.out.println("  |       _________     |    ");
        System.out.println("  |      |   __   |     |    ");
        System.out.println("  |      |  |  |  |     |    ");
        System.out.println("  |______|__|__|__|_____|    ");
        System.out.println("        |          |          ");
        System.out.println("        |__________|          \n");
    }

    @Override
    public void displayProperty(){
        System.out.printf("%d FLOOR HOUSE\n", floors);
        super.displayProperty();
        System.out.println("Property Tax: " + propertyTax);
        System.out.println("Garages: " + garages);
        System.out.println("Other Information: " + getOtherFeatures());
    }
}
