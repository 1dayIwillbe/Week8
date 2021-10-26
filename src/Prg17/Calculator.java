package Prg17;

public class Calculator {
    private double floor;
    private double carpet;

    public Calculator()
    { floor =0;carpet=0;
    }

    public Calculator(double floor, double carpet) {
        this.carpet=carpet;
        this.floor=floor;
    }

    public double getTotalCost()
    {
        return (this.floor*this.carpet);
    }
}


