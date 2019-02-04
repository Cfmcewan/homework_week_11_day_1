import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 40);
    }

    @Test
    public void hasPaperLeft(){
        assertEquals(50, printer.getPaperSheetsLeft());
    }

    @Test
    public void hasToner(){
        assertEquals(40, printer.getToner());
    }

    @Test
    public void enoughPaperForPrintTrue(){
        assertEquals(true, printer.enoughPaperForPrint(2, 8));
    }

    @Test
    public void enoughPaperForPrintFalse(){
        assertEquals(false, printer.enoughPaperForPrint(10,11));
    }

    @Test
    public void willPrintTrue(){
        printer.willPrint(2, 6);
        assertEquals(38, printer.getPaperSheetsLeft());
    }

    @Test
    public void willPrintFalse(){
        printer.willPrint(12, 14);
        assertEquals(50, printer.getPaperSheetsLeft());
    }

    @Test
    public void canRefillPaper(){
        printer.refillPaper();
        assertEquals(50, printer.getPaperSheetsLeft());
    }

    @Test
    public void checkTonerReduced(){
        printer.willPrint(4, 5);
        assertEquals(20, printer.getToner());
    }

}
