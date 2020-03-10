public class Citizen {
    private String firstName;
    private String lastName;
    private String politicalParty;

    public Citizen(String firstName, String lastName, String politicalParty){
        this.firstName = firstName;
        this.lastName = lastName;
        this.politicalParty = politicalParty;
    }
    //unique methods:
    public void vote

    //getters, setters, toString:
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty){
        this.politicalParty = politicalParty;
    }

    public String toString(){
        return "Name: " + firstName + " " + lastName + "\nPolitical Party: " + politicalParty;
    }
}
