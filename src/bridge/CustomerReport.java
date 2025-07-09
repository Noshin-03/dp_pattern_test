package bridge;


public class CustomerReport extends Report {

    public CustomerReport(Formatter formatter) {
        super(formatter);
    }

    @Override
    public void generate() {
        String title = "Customer Report : ";
        String content = "Total Customers: 250\nActive Members: 180";
        System.out.println(formatter.format(title, content));
    }
}
