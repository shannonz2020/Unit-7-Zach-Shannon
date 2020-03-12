import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class InheritanceTest {
    public static void main(String[] args) {
        Citizen ian = new Citizen("Julian", "Brinkley", "Constitution Party");
        GovernmentOfficial kate = new GovernmentOfficial("Kate", "Brown", "Democratic Party", "Governor");
        President donald = new President("Donald John", "Trump", "Republican Party", "Mike Pence");

        System.out.println(ian);
        System.out.println();

        System.out.println(kate);
        System.out.println();

        System.out.println(donald);
        System.out.println();

        System.out.println(ian.getPoliticalParty());
        System.out.println();

        System.out.println(kate.makeCake("Red Velvet"));
        System.out.println();

        System.out.println(donald.makeMistake());
        System.out.println();

        System.out.println(donald.askCongressForWar("China"));
    }
}
