public class Sedan extends Car implements Purchase{
    private int length = 0;

    @Override
    public double getSalePrice() {
        if(this.length > 20){
            return(super.getSalePrice()*0.95);
        }
       return (super.getSalePrice()*0.9);
    }

    @Override
    public String getPurchaseInfo() {
        return "SEDAN: ";
    }

}
