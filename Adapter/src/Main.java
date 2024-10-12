import adapters.PrinterAdapter;
import adapters.ScannerAdapter;
import models.NewPrinter;
import models.NewScanner;

public class Main {
    public static void main(String[] args) {
        NewScanner newScanner = new NewScanner();
        NewPrinter newPrinter = new NewPrinter();

        PrinterAdapter printerAdapter = new PrinterAdapter(newPrinter);
        ScannerAdapter scannerAdapter = new ScannerAdapter(newScanner);

        System.out.println(printerAdapter.print());
        System.out.println(scannerAdapter.scan());
    }
}