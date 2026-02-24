package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("Server outage in computer lab", 1));
        issues.add(new Issue("Missing assignment submission", 3));
        issues.add(new Issue("Scholarship document delay", 2));
        issues.add(new Issue("Course registration conflict", 2));
        issues.add(new Issue("Transcript processing request", 4));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        if (!issues.isEmpty()) {
            System.out.println("Most Urgent Issue: " + issues.peek().getDescription());
        } else {
            System.out.println("No pending issues.");
        }
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        for (int d = 0; d < 2; d++) {
            if (!issues.isEmpty()) {
                Issue resolved = issues.poll();
                System.out.println("Resolved: " + resolved.getDescription());
            }
        }
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        Iterator<Issue> it = issues.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getDescription());
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue("Not enough places", 3));
    }
}
