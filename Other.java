public class Other extends Property {
    private String orignalType;

    public Other(String address, int minPeople, int maxPeople, int bedrooms, int bathrooms, boolean hasBackyard, double yearlyCost, String otherFeatures, String originalTypeString){
        super(address, minPeople, maxPeople, bedrooms, bathrooms, hasBackyard, yearlyCost, otherFeatures);
        this.orignalType = originalTypeString;
    }

    public String getOriginalType(){
        return orignalType;
    }

    public void setOriginalType(String originalType){
        this.orignalType = originalType;
    }

    public void displayPicture(){
        System.out.println("    _________");
        System.out.println("   /         \\");
        System.out.println("  |     ?     |");
        System.out.println("  |           |");
        System.out.println("  |___________|");
        System.out.println("      |   |");
        System.out.println("      |___|  \n");
    }

    public void displayProperty(){
        System.out.printf("%s\n", orignalType);
        super.displayProperty();
        System.out.println("Other Information: " + getOtherFeatures());
    }
}
