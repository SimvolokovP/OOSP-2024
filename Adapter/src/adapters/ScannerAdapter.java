package adapters;

import models.NewScanner;
import models.Scanner;

public class ScannerAdapter implements Scanner {
    private NewScanner newScanner;

    public ScannerAdapter(NewScanner newScanner) {
        this.newScanner = newScanner;
    }

    @Override
    public String scan() {
        return newScanner.scan();
    }
}
