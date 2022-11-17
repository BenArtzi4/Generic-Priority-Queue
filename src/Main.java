import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {

        GenrePriorityQueue<CustomerTicket> queue = new GenrePriorityQueue<CustomerTicket>(5);

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

        System.out.println(queue.poll());

    }
}
