public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 10.0;
        double salesTax = purchasePrice * 0.05;
        double totalPrice;
        System.out.println("The item you purchased costs: $" + purchasePrice);
        System.out.println("The sales tax is 5%, so you will be taxed: $" + salesTax + " on your purchase of: $" + purchasePrice);
        totalPrice = purchasePrice + salesTax;
        System.out.println("This brings your total to: $" + totalPrice);
    }
}