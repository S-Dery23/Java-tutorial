package src.main;

import src.main.model.Bank;
import src.main.model.account.Account;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    static Bank bank = new Bank();
   static String ACCOUNTS_FILE = "src/main/data/accounts.txt";            
   static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";

    public static void main(String[] args) {
        try{
            ArrayList<Account> accounts = returnAccount();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static Account createObject(String[] values){
        try {
        return (Account) Class.forName("src.main.model.account" + values[0])
                .getConstructor(String.class, String.class, double.class)
                .newInstance(values[1], values[2], Double.parseDouble(values[3]));
    }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<Account> returnAccount() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(ACCOUNTS_FILE);
        Scanner scan = new Scanner(fis);

        ArrayList<Account> accounts = new ArrayList<Account>();
        while (scan.hasNextLine()){
            accounts.add(createObject(scan.nextLine().split(",")));
        }
        return accounts;
    }

    public static void loadAccount(ArrayList<Account> accounts){
        for(Account account : accounts){
            bank.addAccount(account);
        }
    }
    /**
     * Function name: wait
     * @param milliseconds
     * 
     * Inside the function:
     *  1. Makes the code sleep for X milliseconds.
     */

     public static void wait(int milliseconds) {
         try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }

}
