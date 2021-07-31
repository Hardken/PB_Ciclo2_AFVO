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
public class accountClass extends ClientClass{
    private int card_number;
    private String user_name;
    private int account_balance;
    public accountClass(String name, String address, String phone, String Email, String user_name, int account_balance, int card_number) {
        super(name, address, phone, Email);
        this.user_name = user_name;
        this.account_balance = account_balance;
        this.card_number = card_number;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the account_balance
     */
    public int getAccount_balance() {
        return account_balance;
    }

    /**
     * @param account_balance the account_balance to set
     */
    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
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
    
}
