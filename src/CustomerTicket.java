public class CustomerTicket {
    String name;
    int id;
    String ticketContent;

    public CustomerTicket(String name, int id, String content)
    {
        this.name = name;
        this.id = id;
        this.ticketContent = content;
    }

    public boolean equals(CustomerTicket other)
    {
        return this.id == other.id && this.ticketContent.equals(other.ticketContent);
    }

}