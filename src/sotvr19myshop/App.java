/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sotvr19myshop;

import entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tools.ProductManager;

/**
 *
 * @author user
 */
public class App {
    private Scanner scanner = new Scanner(System.in);
    
    private  List<Product> listProducts = new ArrayList<>(); 
    
    private ProductManager productManager = new ProductManager();
    
    public void run() {
        System.out.println("---- Продуктовый магазин ----");
        boolean repeat = true;
        do {
            System.out.println("Здравствуйе! Что вам нужно? Выберите задачу: ");
            System.out.println("0. Выйти ");
            System.out.println("1. Добавить товар ");
            System.out.println("2. Cписок наших товаров");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список покупателей");
            System.out.println("5. Купить товар");
            System.out.println("Выберите задачу:");
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("---- Выход ----");
                    repeat = false;
                    break; 
            //----------------------------------------------------------------//        
                case "1":
                    System.out.println("---- Добавить товар ----");
                    Product product = productManager.createProduct();
                    productManager.addProductToList(product, listProducts);
                    break;
            //----------------------------------------------------------------//      
                case "2":
                    System.out.println("---- Список наших товаров ----");
                    productManager.printListProduct(listProducts);
                    break;
            //----------------------------------------------------------------//
                case "3":
                    System.out.println("---- Добавить покупателя ----");
                    
                    break;
                case "4":
                    break;
                case "5":
                    break;
            }
            
        }while(repeat);      
    }
    
}
