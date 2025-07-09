package bridge;

public class BridgeDemoFile {
    public static void main(String[] args) {
        Formatter pdf = new PDFFormatter();
        Formatter csv = new CSVFormatter();

        Report salesReport = new SalesReport(pdf);
        Report customerReport = new CustomerReport(csv);

        salesReport.generate();
        customerReport.generate();
    }
}
