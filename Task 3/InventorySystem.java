public class InventorySystem {
    public static void main(String[] args){
        String productName = "Aventador";
        short productQuantity = 100;
        double unitPrice = 1100.00;
        short reorderThreshold = 15;
        boolean forSale = true;

        double totalValue = productQuantity*unitPrice;

        if(productQuantity < reorderThreshold){
            System.out.println("Product quantity is below reorder threshold.");
        }

        if(productQuantity > reorderThreshold && forSale == true){
            System.out.println("Available");
        }

        if(productQuantity > reorderThreshold){
            productQuantity -= 1;
        }

        System.out.println("Stock : " + productQuantity);
    }
}
