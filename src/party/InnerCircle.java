package party;

import java.util.*;

public class InnerCircle {
    public List<Person> getFriends(Person person, int level) {
        ArrayList<Person> result = new ArrayList<>(); // *visited* in Folien genannt
        HashMap<Person, Integer> distance = new HashMap<>();
        ArrayDeque<Person> queue = new ArrayDeque<>();

        queue.add(person);
        distance.put(person, 0);

        while (!queue.isEmpty()) {
            // Liefern des ersten Elements aus Queue und löschen aus der Queue
            Person current = queue.remove(); // beim 1. Durchlauf = Andy
            result.add(current);

            //In current.frends beim 1. Durchlauf die Freunde von Andi gespeichert
            for (Person friend : current.friends) {
                //Prüfen, ob man Person schon besucht hat
                if (result.contains(friend)) {
                    continue;
                }
                queue.add(friend); //Reihenfolge EGAL
                distance.put(friend, distance.get(current) + 1);

            }
        }

        return result;
    }
}
