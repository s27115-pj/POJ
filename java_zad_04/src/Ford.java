public class Ford extends Car implements Purchase{
    private int year;
    private int manufacturedDiscount;
    @Override
    public double getSalePrice(){
    return (super.getSalePrice()-manufacturedDiscount);
    }

    @Override
    public String getPurchaseInfo() {
        return "FORD: ";
    }

}
