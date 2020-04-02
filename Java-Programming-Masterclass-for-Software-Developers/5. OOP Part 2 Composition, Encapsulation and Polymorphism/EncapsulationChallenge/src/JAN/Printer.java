package JAN;

public class Printer
{
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLever, boolean isDuplex)
    {
        if(tonerLever > -1 && tonerLever <= 100)
        {
            this.tonerLevel = tonerLever;
        }
        else
        {
            this.tonerLevel = -1;
        }

        this.numberOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount)
    {
        if(tonerLevel > 0 && tonerAmount <= 100)
        {
            if(this.tonerLevel + tonerAmount > 100)
            {
                return -1;
            }
            else
            {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }
        else
        {
            return -1;
        }
    }

    public int printPages(int pages)
    {
        int pagesToPrint = pages;
        if(this.isDuplex)
        {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }

        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted()
    {
        return numberOfPagesPrinted;
    }
}
