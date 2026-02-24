package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        // TODO: Add 1 urgent appointment at the beginning
        appointments.add("Math lesson");
        appointments.add("Python Lab");
        appointments.add("Linear Algebra lesson");

        appointments.addFirst("Meeting with principal");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        appointments.removeLast();
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        System.out.println("First: " + appointments.getFirst());
        System.out.println("Last: " + appointments.getLast());
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        Iterator<String> it = appointments.iterator();
        while ((it.hasNext())) {
            System.out.println(it.next());
        }
    }
}
