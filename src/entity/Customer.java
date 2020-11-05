/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Customer {
    private String firtname;
    private String lastname;
    private String phone;
    private int money;

    public Customer() {
    }

    public Customer(String firtname, String lastname, String phone, int money) {
        this.firtname = firtname;
        this.lastname = lastname;
        this.phone = phone;
        this.money = money;
    }

    public String getFirtname() {
        return firtname;
    }

    public void setFirtname(String firtname) {
        this.firtname = firtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.firtname);
        hash = 29 * hash + Objects.hashCode(this.lastname);
        hash = 29 * hash + Objects.hashCode(this.phone);
        hash = 29 * hash + this.money;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.money != other.money) {
            return false;
        }
        if (!Objects.equals(this.firtname, other.firtname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Customer{" + "firtname=" + firtname + ", lastname=" + lastname + ", phone=" + phone + ", money=" + money + '}';
    }
    
    
}
