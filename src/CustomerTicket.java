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

    public boolean equals(Object other)
    {
        if (other instanceof CustomerTicket)
        {
            return this.id == ((CustomerTicket) other).id && this.ticketContent.equals(((CustomerTicket) other).ticketContent);
        }
        return false;
   }

    public String toString()
    {
        return  "Name: " + this.name +
                "\nID: " + this.id +
                "\nTicket content: " +  this.ticketContent
                + "\n";
    }

}
