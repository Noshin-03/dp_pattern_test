package prototype;

public class Main {
    public static void main(String[] args) {
        InvoiceTemplate originalInvoice = new InvoiceTemplate("Client A", 1000.0);
        ReportTemplate originalReport = new ReportTemplate("Quarterly Report", "Revenue grew by 15%.");

        InvoiceTemplate clonedInvoice = originalInvoice.clone();
        ReportTemplate clonedReport = originalReport.clone();

        System.out.println("Original and Cloned Documents:");
        originalInvoice.printDocument();
        clonedInvoice.printDocument();

        originalReport.printDocument();
        clonedReport.printDocument();
    }
}
