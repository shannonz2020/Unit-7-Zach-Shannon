public class President extends GovernmentOfficial implements Comparable{
    private String vicePresident;

    public President(String firstName, String lastName, String politicalParty, String vicePresident){
        super( firstName, lastName, politicalParty, "President");
        this.vicePresident = vicePresident;
    }
    //unique methods:
    public String askCongressForWar(String something){
        int yeetums = (int)(2*Math.random());
        if(yeetums == 0){
            return "Congress has declared war on " + something + "!";
        }else{
            return "Congress will not declare war on " + something + "";
        }
    }

    public String makeMistake(){
        String returnVal = "";
        int number = (int) (10*Math.random());
        if(number == 7){
            returnVal += "You have been impeached";
            number = (int) (10*Math.random());
            if(number == 7){
                returnVal += ", and removed from office";
                number = (int) (10*Math.random());
                if(number == 7){
                    returnVal += ", and arrested";
                }else{
                    return returnVal + "!";
                }
            }else{
                return returnVal + "!";
            }
        }
        return "Congress found a couple Benjamins and let it slide...";
    }

    @Override
    public String makeCake(String type){
        return this.getFirstName() + " made a wonderful " + type + " cake!";
    }
    //comparable
    //vicePresident
    public int compareTo(Object other){
        President someone = (President) other;
        return this.vicePresident.compareTo(someone.vicePresident);

    }
    //getters, setters, toString:

    public String getVicePresident(){
        return vicePresident;
    }

    @Override
    public String toString(){
        return "Name: " + super.getFirstName() + " " + super.getLastName() +
                "\nPolitical Party: " + super.getPoliticalParty() +
                "\n Government Position: President" +
                "\n Vice President: " + vicePresident;
    }
}
