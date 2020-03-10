public class GovernmentOfficial extends Citizen {
    private String governmentPosition;

    public GovernmentOfficial(String governmentPosition, String firstName, String lastName, String politicalParty){
        super(firstName, lastName, politicalParty);
        this.governmentPosition = governmentPosition;
    }
    //unique methods:

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
