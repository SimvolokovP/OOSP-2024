package adapters;

import models.NewPrinter;
import models.Printer;

public class PrinterAdapter implements Printer {
    private NewPrinter newPrinter;

    public PrinterAdapter(NewPrinter newPrinter) {
        this.newPrinter = newPrinter;
    }

    @Override
    public String print() {
        return newPrinter.print();
    }
}
