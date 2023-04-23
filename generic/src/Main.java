import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Generic2List<String> genericList = new Generic2List<>();
        genericList.add("a");
        genericList.add("b");

        for (String item : genericList) {
            System.out.println(item);
        }

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");
        for (String item : collection
        ) {
            System.out.println(item);
        }

//        Instructure instructure1 = new Instructure(30);
//        Instructure instructure2 = new Instructure(40);
//
//        Users user1 = instructure1;
//        Users user2 = instructure2;
//
//
//        GenericList<Users> genericList = new GenericList<>();
//        genericList.add(user1);
//        genericList.add(user2);
//        genericList.add(instructure1);
//
//        Util.printUser(genericList);
    }
}
