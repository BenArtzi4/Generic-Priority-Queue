public class Main {

    public static void main(String[] args)
    {
        CustomerTicket ticket1 = new CustomerTicket("Olivia", 11223344, "Product is out of stock");
        CustomerTicket ticket2 = new CustomerTicket("Liam", 12123434, "Defective product");
        CustomerTicket ticket3 = new CustomerTicket("Noah", 1999199, "Product is out of stock");
        CustomerTicket ticket4 = new CustomerTicket("Oliver", 98765432, "Preferred payment not accepted");
        CustomerTicket ticket5 = new CustomerTicket("Charlotte", 244455555, "Long Wait on Hold");
        CustomerTicket ticket6 = new CustomerTicket("Theodore", 98465154, "Needing to repeat information");
        CustomerTicket ticket7 = new CustomerTicket("Isabella", 561489852, " Lack of support channel variety");
        CustomerTicket ticket8 = new CustomerTicket("William", 4365153, "Needing to repeat information");
        CustomerTicket ticket9 = new CustomerTicket("Evelyn", 45326145, "Long Wait on Hold");
        CustomerTicket ticket10 = new CustomerTicket("Harper", 2332451, "No answer");

        GenrePriorityQueue<CustomerTicket> queue = new GenrePriorityQueue<CustomerTicket>(5);

        queue.add(ticket1, 4);





    }
}
