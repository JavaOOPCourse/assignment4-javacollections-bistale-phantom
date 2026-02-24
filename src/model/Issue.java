package model;

public class Issue implements Comparable<Issue> {

    // TODO: declare fields
    private String description;
    private int urgencyLevel; // 1 = most urgent

    public String getDescription() {
        return description;
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }

    // TODO: create constructor
    public Issue() {}
    public Issue(String description, int urgencyLevel) {
        this.description = description;
        this.urgencyLevel = urgencyLevel;
    }

    // TODO: implement compareTo()
    @Override
    public int compareTo(Issue other) {
        // TODO: implement priority logic
        return Integer.compare(this.urgencyLevel, other.getUrgencyLevel());
    }

    // TODO: override toString()
    public String toString() {
        return "Priority: " + urgencyLevel + " - " + description;
    }
}
