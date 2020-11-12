/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Customer;
import entity.Product;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PersonManager {
    private Scanner scanner = new Scanner(System.in);
   
    public Customer createCustomer() {
        
        System.out.println("Введите имя: ");
        String firstname = scanner.nextLine();
        System.out.println("Фамилия: ");
        String lastname = scanner.nextLine();
        System.out.println("Телефон: ");
        String phone = scanner.nextLine();
        System.out.println("Ваш кошелёк: ");
        int money = scanner.nextInt();
        Customer customer = new Customer();
        return customer;             
    }

    public void addPersonToList(Customer customer, List<Customer> listPersons) {
        listPersons.add(customer);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.saveToFile(listPersons, "listProduct");
    }
    
    public void printListProduct(List<Customer> listPersons) { 
        for (int i = 0; i < listPersons.size(); i++) {
            if(listPersons.get(i) != null){
                Customer customer = listPersons.get(i);
                System.out.printf("%d. %s %s%n"
                    ,i+1
                    ,customer.getFirtname()
                    ,customer.getLastname()
                    ,customer.getPhone()
                    ,customer.getMoney()
            );
                      

        }
    }     
}

}
