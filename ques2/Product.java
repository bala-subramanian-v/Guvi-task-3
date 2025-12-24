// Product class
class Product implements Taxable {

    int pid;
    double price;
    int quantity;

    // Constructor
    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate sales tax on unit price
    public double calcTax() {
        return price * salesTax;
    }
}
