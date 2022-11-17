import java.util.ArrayList;
import java.util.Iterator;

public class GenrePriorityQueue <T>
{
    // The priority queue object
    private final ArrayList<T>[] priorityQueue;
    // The number of priorities
    private final int priorities;

    final int MIN_Priorities = 1;
    final int MAX_Priorities = 10;
    final int INITIALIZE = 0;
    final int NOT_FOUND = -1;


    /*
    Constructor that create an empty queue in the size of the received number
    if the received number is not between 1 to 10 - a queue of maximum size will create
     */
    public GenrePriorityQueue(int priorities)
    {
        this.priorities = generateNumberOfPriorities(priorities);
        this.priorityQueue = new ArrayList[this.priorities];
    }


    /*
    Method make sure that the number received is within the defined range
     */
    public int generateNumberOfPriorities(int priorities)
    {
        if (priorities < MIN_Priorities || priorities > MAX_Priorities)
        {
            return MAX_Priorities;
        }
        return priorities;
    }


    /*
    Adds a variable to the priority queue
     */
    public void add(T element, int priority)
    {
        // If the priority is higher then number of priorities so the object's priority will be the last one
        if (priority >= priorities)
        {
            priority = priorities - MIN_Priorities;
        }

        // If the priority is less the 0 (the highest priority) the object's priority will be the highest
        if (priority < INITIALIZE)
        {
            priority = INITIALIZE;
        }
        priorityQueue[priority-1].add(element);
    }


    /*
    Returns the variable at the top of the queue (with the highest priority)
     */
    public T poll()
    {
        for (int i = 0 ; i < priorities ; i++)
        {
            if (priorityQueue[i].size() != 0)
            {
                return priorityQueue[i].get(0);
            }
        }
        return null;
    }


    /*
    Returns whether the variable is in the priority queue
     */
    public boolean contains(T element)
    {
        return getPlace(element)[0] != NOT_FOUND;
    }


    /*
    Removes the objects received
    If the Object was successfully removed, "true" will be returned.
    If it is not found, "false" will be returned.
     */
    public boolean remove(T element)
    {
        int [] temp_place= getPlace(element);
        if (temp_place[0] == NOT_FOUND)
        {
            return false;
        }
        priorityQueue[temp_place[0]].remove(temp_place[1]);
        return true;
    }


    /*
    Returns the total number of objects
     */
    public int size()
    {
        int counter = INITIALIZE;
        for (int i = 0; i < priorities; i++)
        {
            for (int j = 0; j < priorityQueue[i].size(); j++)
            {
                counter++;
            }
        }
        return counter;
    }


    /*
    Returns an object of type iterator containing all members of the queue
     */
    public Iterator<T> iterator()
    {
        ArrayList<T> tempArr = new ArrayList<T>();
        for (int i = 1; i < this.priorities; i++)
        {
            tempArr.addAll(priorityQueue[i]);
        }
        return tempArr.iterator();
    }


    /*
    Gets an object and returns its priority number and its priority inside the specific priority
     */
    private int [] getPlace(T element)
    {
        for (int i = 0; i < priorities; i++)
        {
            for (int j = 0; j < priorityQueue[i].size(); j++)
            {
                if (priorityQueue[i].get(j).equals(element))
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{NOT_FOUND, NOT_FOUND};
    }
}
