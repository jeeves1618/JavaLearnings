package Exercise01;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if (tonerLevel < 0 || tonerLevel > 100){
            tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {

        if (tonerAmount < 1 || tonerAmount > 100){
            System.out.println("Invalid Toner Amount " + tonerAmount);
            return -1;
        } else
        {
            int newTonerLevel = tonerAmount + this.tonerLevel;
            System.out.println("Existing toner level : " + this.tonerLevel);
            if (newTonerLevel > 100) {
                System.out.println("Excess toner added");
                return -1;
            } else {
                this.tonerLevel = newTonerLevel;
            }
        }
        return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint;

        if (duplex) {
            pagesToPrint = pages/2;
            if ((pages%2) == 1)
                pagesToPrint = pagesToPrint + 1;

        } else {
            pagesToPrint = pages;
        }

        this.pagesPrinted = this.pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}

