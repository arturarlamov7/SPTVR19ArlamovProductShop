/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Product;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProductManager {
    private Scanner scanner = new Scanner(System.in);

    public Product createProduct() {
           scanner.nextLine();
           System.out.println("Введите имя товара: ");
           String name = scanner.nextLine();
           System.out.println("Введите кол-во: ");
           int quantity = scanner.nextInt();
           System.out.println("Введиет цену товара: ");
           int price = scanner.nextInt();
           Product product = new Product(name, price, quantity);  
           return product;
    }

    public void addProductToList(Product product, List<Product> listProducts) {
        listProducts.add(product);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.saveToFile(listProducts, "listProduct");
    }

    public void printListProduct(List<Product> listProducts) { 
        for (int i = 0; i < listProducts.size(); i++) {
            if(listProducts.get(i) != null){
                Product product = listProducts.get(i);
                System.out.printf("%d. %s %s%n"
                    ,i+1
                    ,product.getName()
                    ,product.getPrice()
                    ,product.getQuantity()
            );
                      

        }
    }
}



    





    
}
