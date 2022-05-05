import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
class prafifo {
    private static int pageFaults(int[] pageString, int pageSlots) {
        int faults = 0;
        // Set to store the elements present in queue, used to check if a page is present or not
        HashSet<Integer> set = new HashSet<>();
        // Queue to maintain the order of insertion
        Queue<Integer> queue = new LinkedList<>();
        // traverse the page string
        for (int i = 0; i < pageString.length; i++) {
            // if there are some empty slots
            if (queue.size() < pageSlots) {
                if (!set.contains(pageString[i])) {
                    // and the current page is missing
                    // add the page to set
                    set.add(pageString[i]);
                    // add the page to queue
                    queue.add(pageString[i]);
                    // it is a page fault, increment faults
                    faults++;
                }
            } else {
                // there are no empty slots and if current page is absent
                if (!set.contains(pageString[i])) {
                    // remove the first page in queue
                    int removedPage = queue.poll();
                    // remove the page from set
                    set.remove(removedPage);
                    // add the new page to set
                    set.add(pageString[i]);
                    // add the new page to queue
                    queue.add(pageString[i]);
                    // it is page fault, increment faults
                    faults++;
                }
            }
        }
        // return total number of page faults
        return faults;
    }
    public static void main(String[] args) {
        // Example
        int pageString[] = new int[] {1, 0, 1, 2, 5, 7, 3, 4, 3, 4, 1};
        int pageSlots = 4;
        System.out.println(pageFaults(pageString, pageSlots));
    }
}
