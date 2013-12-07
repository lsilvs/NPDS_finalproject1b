package services;

import java.util.*;
import java.io.*;
import java.nio.file.FileSystems;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author lsilvs
 */
@Path("controlsAccount")
@RequestScoped
public class ControlsAccount {

  private Dictionary _accountsTable = new Hashtable ();

  public ControlsAccount () {
  }

  @GET
  @Produces("application/json")
  @Path("/returnAccount")
  public synchronized String returnAccount(@QueryParam("number") int number) {
    System.out.println (number);
    this.load();
    // Lookup the account in the account dictionary.
    Account account = (Account) _accountsTable.get (number);
    // If the account is not in the dictionary, create an account.
    if (account == null) {
     // Create the account implementation, given the balance.
     account = new Account(number);
     System.out.println ("Created new register for " + number);
     // Save the account in the account dictionary.
     _accountsTable.put (number, account); 
    }
    // Return the account.
    this.save();
    
    return account.toString();
  }

  @GET
  @Produces("application/json")
  @Path("/topUp")
  public synchronized String topUp(@QueryParam("number") int number, 
                                    @QueryParam("amount") float amount) {
    this.load();
    // Lookup the account in the account dictionary.
    Account account = (Account) _accountsTable.get (number);
    if(account == null) {
      System.out.println ("Account does not exist.");
      return null;
    } else if(amount < 0) {
      System.out.println ("The amount must be a positive value");
      return null;
    } else {
      account.setBalance(account.getBalance() + amount);
    }
    // Return the account.
    this.save();
    return account.toString();
  }

  @GET
  @Produces("application/json")
  @Path("/transfer")
  public synchronized String transfer(@QueryParam("numberOrig") int numberOrig, 
                                        @QueryParam("amount") float amount,
                                        @QueryParam("numberDest") int numberDest) {
    this.load();
    // Lookup the account in the account dictionary.
    Account accountOrig = (Account) _accountsTable.get (numberOrig);
    Account accountDest = (Account) _accountsTable.get (numberDest);
    if(accountOrig == null) {
      System.out.println ("Source account does not exist.");
      return null;
    } else if(accountOrig.getBalance() < amount) {
      System.out.println ("Source account does not have enough credit.");
      return null;
    } else if(accountDest == null) {
      System.out.println ("Destination account does not exist.");
      return null;
    } else {
      accountOrig.setBalance(accountOrig.getBalance() - amount);
      accountDest.setBalance(accountDest.getBalance() + amount);
    }
    this.save();
    // Return the account. 
    return accountOrig.toString();
  }

  @GET
  @Produces("application/json")
  @Path("/buyExtraOprion")
  public synchronized String buyExtraOprion(@QueryParam("number") int number, 
                                                @QueryParam("option") int option) {
    this.load();
    // Lookup the account in the account dictionary.
    Account account = (Account) _accountsTable.get (number);

    switch (option){
      case 1: // Option for top up
        account.setBalance(account.getBalance() - 2);
        account.setKamaradTalkKamarad100(account.getKamaradTalkKamarad100() + 100);
        break;
      case 2: // Option for transfer credit
        account.setBalance(account.getBalance() - 8);
        account.setKamaradTalkKamarad500(account.getKamaradTalkKamarad500() + 500);
        break;
      case 3:  // Option for buy extra options
        account.setBalance(account.getBalance() - 5);
        account.setKamaradTalkEveryone100(account.getKamaradTalkEveryone100() + 100);
        break;
      case 4:  // Option for view credit
        account.setBalance(account.getBalance() - 20);
        account.setKamaradTalkEveryone500(account.getKamaradTalkEveryone500() + 500);
        break;
      case 5:  // Option for view credit
        account.setBalance(account.getBalance() - 10);
        account.setKamaradInternet1GB(account.getKamaradInternet1GB() + 1000);
        break;
      case 6:  // Option for view credit
        account.setBalance(account.getBalance() - 1);
        account.setKamardText300(account.getKamardText300() + 300);
        break;
      case 7:  // Option for view credit
        account.setBalance(account.getBalance() - 10);
        account.setKamaradInternational100(account.getKamaradInternational100() + 100);
        break;
      default: 
        System.out.println("Invalid option!");
        break;
    }

    // Return the account.
    this.save();
    return account.toString();
  }

  private void save() {
    try{
      File as = new File ("accounts.db");
      if (!as.exists()) {
          as.createNewFile();
      }

      FileOutputStream fos = new FileOutputStream(as);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      oos.writeObject(_accountsTable);
      oos.close();  
    }catch(Exception ex){
      ex.printStackTrace();
   }
  }

  private void load() {
    try{
      File as = new File ("accounts.db");
      if (!as.exists()) {
          as.createNewFile();
      }

      FileInputStream fin = new FileInputStream(as);
      ObjectInputStream ois = new ObjectInputStream(fin);
      _accountsTable = (Hashtable) ois.readObject();
    }catch(Exception ex){
      ex.printStackTrace();
   }
  }

}