
/* 2> Problem Statement:

You are managing products in an e-commerce system.

Each product has:

name
price

Store products using ArrayList
Tasks:
Add multiple products
Find product with highest price
Sort products by price (ascending & descending)
Filter products with price > 500
Search product by name
Remove duplicate product names
   */
  
import java.util.ArrayList;

class Products {
    private String name;
    private double price;
    private int quantity;

    ArrayList<Products> productsList = new ArrayList<>();

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        Products product1 = new Products("Laptop", 999.99, 10);
        Products product2 = new Products("Smartphone", 499.99, 20);
        Products product3 = new Products("Headphones", 199.99, 15);

   // Adding products to the list
        product1.productsList.add(product1);
        product1.productsList.add(product2);
        product1.productsList.add(product3);

   // Finding product with highest price
        Products highestPricedProduct = product1.productsList.get(0);
        for (Products product : product1.productsList) {
            if (product.getPrice() > highestPricedProduct.getPrice()) {
                highestPricedProduct = product;
            }
        }

        System.out.println("Product with the highest price: " + highestPricedProduct.getName() + " - $" + highestPricedProduct.getPrice());

   // Sort product by price Asscending
        product1.productsList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Products sorted by price (ascending):");
        for (Products product : product1.productsList) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }

   // Sort product by price Descending
        product1.productsList.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        System.out.println("Products sorted by price (descending):");
         for (Products product : product1.productsList) {
               System.out.println(product.getName() + " - $" + product.getPrice());
         }

   // Filter products with price greater than 500
        System.out.println("Products with price greater than 500:");
        for (Products product : product1.productsList) {
            if (product.getPrice() > 500) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
        }

   // Search for a product by name
        String searchName = "Smartphone";
        System.out.println("Searching for product: " + searchName);
        boolean found = false;
        for (Products product : product1.productsList) {
            if (product.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Product found: " + product.getName() + " - $" + product.getPrice());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found: " + searchName);
        }

   // Remove duplicate products based on name
        ArrayList<Products> uniqueProducts = new ArrayList<>();
        for (Products product : product1.productsList) {
            boolean isDuplicate = false;
            for (Products uniqueProduct : uniqueProducts) {
                if (product.getName().equalsIgnoreCase(uniqueProduct.getName())) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueProducts.add(product);
            }
        }

        System.out.println("Unique products:");
        for (Products product : uniqueProducts) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
}