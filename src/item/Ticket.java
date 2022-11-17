package item;

import java.util.ArrayList;
import exceptions.WrongAmountException;

public class Ticket {

    //Storing the all tickets in here maybe
    ArrayList<Ticket> stored =  new ArrayList<Ticket>();

    public int amount;
    public String description;
    public String status;

    public Ticket(int amount, String description) {
        //Amount exception to do
        this.amount = amount;
        this.description = description;
        this.status = "pending";
    }

    public void setAmount(){
        
    }
    public Integer getAmount(){
        return amount;
    }
}
