package bridge;

public class SalesReport extends Report {

    public SalesReport(Formatter formatter) {
        super(formatter);
    }

    @Override
    public void generate() {
        String title = "Monthly Sales Report";
        String content = "Total Sales: $5000\nTop Product: Laptop";
        System.out.println(formatter.format(title, content));
    }
}
