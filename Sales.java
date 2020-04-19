
public class Sales{
    int productNo, quantity;
    double total;

    public void addProduct(int productNo, int quantity){
        switch(productNo){
            case 1:
                total += (2.98 * quantity);
                break;
            case 2:
                total += (4.50 * quantity);
                break;
            case 3:
                total += (9.98 * quantity);
                break;
            case 4:
                total += (4.49 * quantity);
                break;
            case 5:
                total += (6.89 * quantity);
                break;
            default:
                break;
        }
    }

    // GETTERS
    public double getTotal(){
        return total;
    }
}
