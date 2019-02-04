public class Printer {

    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner){
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public int getPaperSheetsLeft() {
        return this.sheetsLeft;
    }

    public int getToner(){
        return this.toner;
    }

    public boolean enoughPaperForPrint(int pages, int copies){
        if( (pages * copies) <= this.sheetsLeft){
            return true;
        }
        return false;
    }

    public void willPrint(int pages, int copies){
        if (this.enoughPaperForPrint(pages, copies)){
            this.sheetsLeft -= (pages * copies);
            this.toner -= (pages * copies);
        }
        else {
            getPaperSheetsLeft();
        }
    }

    public void refillPaper(){
        this.sheetsLeft = 50;
    }
}

