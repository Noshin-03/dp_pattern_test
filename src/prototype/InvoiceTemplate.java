package prototype;


public class InvoiceTemplate implements Document{
    public String clientName;
    public double amount;
    
    public InvoiceTemplate(String clientName, double amount) {
        this.clientName = clientName;
        this.amount = amount;
    }

    public InvoiceTemplate(InvoiceTemplate original) {
        this.clientName = original.clientName;
        this.amount = original.amount;
    }

    @Override
    public InvoiceTemplate clone() {
        return new InvoiceTemplate(this);
    }

    @Override
    public void printDocument() {
        System.out.println("Client Name: " + clientName + "\nAmount = " + amount);
    }
}
