package JAN;

public class SimpleCalculator
{
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber()
    {
        return this.firstNumber;
    }

    public double getSecondNumber()
    {
        return this.secondNumber;
    }

    public void setFirstNumber(double number)
    {
        this.firstNumber = number;
    }

    public void setSecondNumber(double number)
    {
        this.secondNumber = number;
    }

    public double getAdditionResults()
    {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResults()
    {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResults()
    {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResults()
    {
        if(this.secondNumber == 0)
        {
            return 0;
        }
        else
        {
            return this.firstNumber / this.secondNumber;
        }
    }
}

