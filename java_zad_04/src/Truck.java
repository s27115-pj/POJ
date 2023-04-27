public class Truck extends Car implements Purchase
{
    private int weight;

    @Override
    public double getSalePrice()
    {
        if(weight > 2000){
            return super.getSalePrice()*0.90;
        }
        return super.getSalePrice();
    }


    @Override
    public String getPurchaseInfo() {
        return "TRUCK: ";
    }
}
