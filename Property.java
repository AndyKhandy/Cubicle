

public abstract class Property {
    private String address;
    private int minPeopleCapacity;
    private int maxPeopleCapacity;
    private int bedrooms;
    private int bathrooms;
    private boolean backyard;
    private double yearlyCost;
    private String otherFeatures;

    public Property(String address, int minPeople, int maxPeople, int bedrooms, int bathrooms, boolean hasBackyard, double yearlyCost, String otherFeatures){
        this.address = address;
        this.minPeopleCapacity = minPeople;
        this.maxPeopleCapacity = maxPeople;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.backyard = hasBackyard;
        this.yearlyCost = yearlyCost;
        this.otherFeatures = otherFeatures;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMinPeopleCapacity() {
        return minPeopleCapacity;
    }

    public void setMinPeopleCapacity(int minPeopleCapacity) {
        this.minPeopleCapacity = minPeopleCapacity;
    }

    public int getMaxPeopleCapacity() {
        return maxPeopleCapacity;
    }

    public void setMaxPeopleCapacity(int maxPeopleCapacity) {
        this.maxPeopleCapacity = maxPeopleCapacity;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean hasBackyard() {
        return backyard;
    }

    public void setBackyard(boolean hasBackyard) {
        this.backyard = hasBackyard;
    }

    public double getYearlyCost() {
        return yearlyCost;
    }

    public void setYearlyCost(double yearlyCost) {
        this.yearlyCost = yearlyCost;
    }

    public String getOtherFeatures() {
        return otherFeatures;
    }

    public void setOtherFeatures(String otherFeatures) {
        this.otherFeatures = otherFeatures;
    }

    public void displayProperty(){
        System.out.printf("For %d-%d People\n", minPeopleCapacity, maxPeopleCapacity);
        System.out.println("Address: " + address);
        System.out.printf("Bedrooms: %d | Bathrooms: %d\n", bedrooms, bathrooms);
        System.out.printf("Yearly Cost: $%.2f\n",yearlyCost);
    }

    public abstract void displayPicture();
}
