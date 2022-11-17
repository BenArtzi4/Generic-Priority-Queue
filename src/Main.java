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


        System.out.println(queue.poll());
        System.out.println(queue.contains(ticket1));
        System.out.println(queue.remove(ticket2));
        System.out.println(queue.size());

        Iterator<CustomerTicket> iterator = queue.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }




    }
}
