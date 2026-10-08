import javax.swing.plaf.TableHeaderUI;
import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        boolean notContains = !collection.contains(card);
        collection.add(card);
        return notContains;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }
        for (String myCard: myCollection) {
            for (String theirCard: theirCollection) {
                if (!theirCollection.contains(myCard) && !myCollection.contains(theirCard)) {
                    return true;
                }
            }
        }
        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        HashMap<String, Integer> hasAppeared = new HashMap<>();
        Set<String> commonCards = new HashSet<>();
        for (Set<String> collection: collections) {
            for (String card: collection) {
                if (hasAppeared.containsKey(card)) {
                    hasAppeared.replace(card, hasAppeared.get(card), hasAppeared.get(card) + 1);
                } else {
                    hasAppeared.put(card, 1);
                }
            }
        }
        hasAppeared.forEach((card, numOftime) -> {
            if (numOftime == collections.size()) {
                commonCards.add(card);
            }
        });
        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        HashSet<String> hasAppeared = new HashSet<>();
        for (Set<String> collection: collections) {
            for (String card: collection) {
                if (!hasAppeared.contains(card)) {
                    hasAppeared.add(card);
                }
            }
        }
        return hasAppeared;
    }
}
