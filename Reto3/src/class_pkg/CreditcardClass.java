/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

/**
 *
 * @author andre
 */
public class CreditcardClass {
    private int card_number;
    private String card_holder;
    private int balance;

    public CreditcardClass(int card_number, String card_holder, int balance) {
        this.card_number = card_number;
        this.card_holder = card_holder;
        this.balance = balance;
    }

    /**
     * @return the card_number
     */
    public int getCard_number() {
        return card_number;
    }

    /**
     * @param card_number the card_number to set
     */
    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    /**
     * @return the card_holder
     */
    public String getCard_holder() {
        return card_holder;
    }

    /**
     * @param card_holder the card_holder to set
     */
    public void setCard_holder(String card_holder) {
        this.card_holder = card_holder;
    }

    /**
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
