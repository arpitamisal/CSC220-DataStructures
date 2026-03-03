package assignment04PartE;

/**
 *
 * Part E
 *
 */

import java.util.PriorityQueue;

public class SFSUOneStop {
    public static void display(PriorityQueue<Student> oneStopPQ, String priority) {
        // header for each different priority order
        System.out.println("Priority: " + priority);
        // this is how you loop through a queue
        while (!oneStopPQ.isEmpty()) {
            Student nextStudent = oneStopPQ.remove();
            System.out.println(nextStudent.toString());
        }
        // spacing between each priority version
        System.out.println();
    }
}
