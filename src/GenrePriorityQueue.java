import java.util.ArrayList;

public class GenrePriorityQueue <T>
{
    ArrayList<T>[] priorityQueue;
    int priorities;
    final int MIN_Priorities = 1;
    final int MAX_Priorities = 10;



    public GenrePriorityQueue(int priorities)
    {
        this.priorities = generateNumberOfPriorities(priorities);
        priorityQueue = (ArrayList<T>[]) new ArrayList[4];
    }

    /*
    Method make sure that the number received is within the defined range
     */
    public int generateNumberOfPriorities(int priorities)
    {
        if (priorities < MIN_Priorities || priorities > MAX_Priorities)
        {
            return MIN_Priorities;
        }
        return priorities;
    }

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
}
