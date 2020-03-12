public class GovernmentOfficial extends Citizen implements Comparable {
    private String governmentPosition;

    public GovernmentOfficial(String firstName, String lastName, String politicalParty, String governmentPosition){
        super(firstName, lastName, politicalParty);
        this.governmentPosition = governmentPosition;
    }
    //unique methods:
    public String makeCake(String type){
        return this.getFirstName() + " made a " + type + " cake, yay!";
    }
    @Override
    public String makePancakes(){
        return this.getFirstName() + " made some amazing pancakes!";
    }
    //comparable
    //governmentOfficial
    public int compareTo(Object other){
        GovernmentOfficial someone = (GovernmentOfficial) other;
        return this.governmentPosition.compareTo(someone.governmentPosition);
    }
    //getters, setters, toString:
    public String getGovernmentPosition() {
        return governmentPosition;
    }

    public void setGovernmentPosition(String governmentPosition) {
        this.governmentPosition = governmentPosition;
    }

    @Override
    public String toString(){
        return "Name: " + super.getFirstName() + " " + super.getLastName() +
                "\nPolitical Party: " + super.getPoliticalParty() +
                "\n Government Position: " + governmentPosition;
    }
}
