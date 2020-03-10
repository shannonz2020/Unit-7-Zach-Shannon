public class President extends GovernmentOfficial{
    private String vicePresident;

    public President(String firstName, String lastName, String politicalParty, String vicePresident){
        super("President", firstName, lastName, politicalParty);
        this.vicePresident = vicePresident;
    }
    //unique methods:

    //getters, setters, toString:

    public String getVicePresident(){
        return vicePresident;
    }

    @Override
    public String toString(){
        return "Name: " + super.getFirstName() + " " + super.getLastName() +
                "\nPolitical Party: " + super.getPoliticalParty() +
                "\n Government Position: President" +
                "\n Vice President" + vicePresident;
    }


}
