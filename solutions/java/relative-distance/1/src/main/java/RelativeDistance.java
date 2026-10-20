import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class RelativeDistance {
    Map<String, List<String>> tree;
    String topOfTree;


    RelativeDistance(Map<String, List<String>> familyTree) {
        this.tree = familyTree;
        this.topOfTree = getTopOfTree();
    }

    int degreeOfSeparation(String personA, String personB) {
        String commonAncestor = commonAncestor(personA, personB);
        int personADistFromTop = getDistFromCommonAncestor(personA, personB, commonAncestor);
        int personBDistFromTop = getDistFromCommonAncestor(personB, personA, commonAncestor);

        if ((personADistFromTop == -1) || (personBDistFromTop == -1)) {
            return -1;
        }

        return (personADistFromTop + personBDistFromTop) - (((isDirectParent(personA, personB))) || (isDirectParent(personB, personA)) ? 0 : 1) ;
    }

    private String getTopOfTree() {
        for (String person1: tree.keySet()) {
            boolean hasAppeared = false;
            for (String person2: tree.keySet()) {
                if (tree.get(person2).contains(person1)) {
                    hasAppeared = true;
                }
            }
            if (!hasAppeared) {
                return person1;
            }
        }
        return "not found";
    }

    private int getDistFromCommonAncestor(String MainPerson,String personB, String commonAncestor) {
        int distFromTop = 0;
        String currentPerson = MainPerson;
        while (!currentPerson.equals(commonAncestor)) {
            for (String parent: tree.keySet()) {
                boolean hasBeenFound = false;
                for (String kid: tree.get(parent)) {
                    if (kid.equals(currentPerson)) {
                        currentPerson = parent;
                        distFromTop++;
                        hasBeenFound = true;
                        break;
                    }
                }
                if (hasBeenFound) {
                    break;
                }
            }
            if (currentPerson == MainPerson) {
                return -1;
            }
        }
        return distFromTop;
    }

    private int getDistFromTop(String person) {
        int distFromTop = 0;
        String currentPerson = person;
        while (!currentPerson.equals( topOfTree)) {
            for (String parent: tree.keySet()) {
                for (String kid: tree.get(parent)) {
                    if (kid.equals(currentPerson)) {
                        currentPerson = parent;
                        distFromTop++;
                        break;
                    }
                }
            }
            if (currentPerson == person) {
                return -1;
            }
        }
        return distFromTop;
    }

    private String commonAncestor(String personA , String personB) {
        List<String> hasVisited = new ArrayList<>();
        String currentPerson = personA;
        while (!currentPerson.equals(topOfTree)) {
            for (String parent: tree.keySet()) {
                for (String kid: tree.get(parent)) {
                    if (kid.equals(currentPerson)) {
                        currentPerson = parent;
                        hasVisited.add(parent);
                        break;
                    }
                }
            }
            if (currentPerson.equals(personA)) {
                return "no common ancestor 1";
            }
        }

        currentPerson = personB;
        while (!currentPerson.equals(topOfTree)) {
            for (String parent: tree.keySet()) {
                for (String kid: tree.get(parent)) {
                    if (kid.equals(currentPerson)) {
                        currentPerson = parent;
                        if (hasVisited.contains(currentPerson)) {
                            return currentPerson;
                        }
                        break;
                    }
                }
            }
            if (currentPerson == personB) {
                return "no common ancestor 2";
            }
        }

        return topOfTree;
    }

    private boolean isDirectParent(String personA, String personB) {
        List<String> hasVisited = new ArrayList<>();
        String currentPerson = personA;
        while (!currentPerson.equals(topOfTree)) {
            for (String parent: tree.keySet()) {
                for (String kid: tree.get(parent)) {
                    if (kid.equals(currentPerson)) {
                        currentPerson = parent;
                        hasVisited.add(parent);
                        break;
                    }
                }
            }
            if (currentPerson.equals(personA)) {
                return false;
            }
        }
        return hasVisited.contains(personB);
    }


}
