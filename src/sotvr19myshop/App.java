/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sotvr19myshop;

import entity.Customer;
import entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tools.PersonManager;
import tools.ProductManager;
import tools.SaveToFile;

/**
 *
 * @author user
 */
public class App {
    private Scanner scanner = new Scanner(System.in);
    
    private  List<Product> listProducts = new ArrayList<>();
    private  List<Customer> listPersons = new ArrayList<>();
    
    private ProductManager productManager = new ProductManager();
    private PersonManager personManager = new PersonManager();
    private Product product;
    
    public App() {
        SaveToFile saveToFile = new SaveToFile();
        this.listPersons = saveToFile.loadFromFile("listPersons");
        this.listProducts = saveToFile.loadFromFile("listProduct");
    }
    
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
            System.out.print("Выберите задачу:");
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
                    Customer customer = personManager.createCustomer(); 
                    personManager.addPersonToList(customer, listPersons);
                    break;
            //----------------------------------------------------------------//
                case "4":
                    System.out.println("---- Список покупателей ----");
                    personManager.printListProduct(listPersons);
                    break;
            //----------------------------------------------------------------//       
                case "5":
                    System.out.println("---- Купить товар ----");
                    
                    break;
            //----------------------------------------------------------------//
                default:
                    System.out.println("Нет такой задачи. Повторите попытку!");
            //----------------------------------------------------------------//        
            }         
        }while(repeat);      
    }
    
}
