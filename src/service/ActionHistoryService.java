package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.add("action 1");
        actions.add("action 2");
        actions.add("action 3");
        actions.add("action 4");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        if (!actions.isEmpty()) {
            actions.pollLast();
            System.out.println("successfully removed");
        }
        else {
            System.out.println("Empty");
        }
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.addLast("Requested Transcript");
    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        String first = actions.getFirst();
        String last = actions.getLast();
        System.out.println(" fisrt: " + first);
        System.out.println("last: " + last);
    }

    public void printHistory() {
        // TODO: Iterate through history
        Iterator<String> it = actions.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
