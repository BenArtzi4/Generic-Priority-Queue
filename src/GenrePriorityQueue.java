import java.util.ArrayList;
import java.util.Iterator;

public class GenrePriorityQueue <T>
{
    private final ArrayList<T>[] priorityQueue;
    private final int priorities;
    final int MIN_Priorities = 1;
    final int MAX_Priorities = 10;
    final int INITIALIZE = 0;
    final int NOT_FOUND = -1;



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
            return MIN_Priorities;
        }
        return priorities;
    }

    public void add(T element, int priority)
    {
        priorityQueue[priority].add(element);
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

    public boolean contains(T element)
    {
        return getPlace(element)[0] != NOT_FOUND;
    }

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

    public Iterator<T> iterator()
    {
        ArrayList<T> tempArr = new ArrayList<T>();
        for (int i = 1; i < this.priorities; i++)
        {
            tempArr.addAll(priorityQueue[i]);
        }
        return tempArr.iterator();
    }

    public int [] getPlace(T element)
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
