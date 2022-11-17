import java.util.Iterator;

public class Main {

    public static void main(String[] args)
    {

        GenericPriorityQueue<CustomerTicket> queue = new GenericPriorityQueue<CustomerTicket>(5);

        queue.add(new CustomerTicket("Liam", 12123434, "Defective product"),1);
        queue.add(new CustomerTicket("Harper", 2332451, "No answer"),4);
        queue.add(new CustomerTicket("Evelyn", 45326145, "Long Wait on Hold"),2);
        queue.add(new CustomerTicket("William", 4365153, "Needing to repeat information"),3);
        queue.add(new CustomerTicket("Theodore", 98465154, "Needing to repeat information"),2);
        queue.add(new CustomerTicket("Isabella", 561489852, " Lack of support channel variety"),1);
        queue.add(new CustomerTicket("Charlotte", 244455555, "Long Wait on Hold"),0);
        queue.add(new CustomerTicket("Oliver", 98765432, "Preferred payment not accepted"),4);
        queue.add(new CustomerTicket("Noah", 1999199, "Product is out of stock"),3);
        queue.add(new CustomerTicket("Olivia", 11223344, "Product is out of stock"), 3);

        CustomerTicket ticket1 = new CustomerTicket("Liam", 12123434, "Defective product");
        CustomerTicket ticket2 = new CustomerTicket("Harper", 2332451, "No answer");
        CustomerTicket ticket3 = new CustomerTicket("Jhon", 11111111, "Long waiting");



        System.out.println("Poll command - returns the highest priority ticket: " + queue.poll());
        System.out.println("Contains command - should return true: " + queue.contains(ticket1) + "\n");
        System.out.println("Contains command - should return false: " + queue.contains(ticket3) + "\n");
        System.out.println("Size command - should return 10: " + queue.size() + "\n");
        System.out.println("Contains command - should return true: " + queue.remove(ticket2) + "\n");
        System.out.println("Contains command - should return false: " + queue.remove(ticket3) + "\n");
        System.out.println("Size command - should return 9: " + queue.size() + "\n");

        Iterator<CustomerTicket> iterator = queue.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }
    }
}
