package bank;
public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 0, "1");
    accountTwo = new CheckingAccount("Hades", 0, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    
    bankOfGods.accountTwo.setBalance(500);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(566);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.setBalance(5666);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(125);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(785);
    System.out.println(bankOfGods.accountOne.getBalance());
   
    bankOfGods.accountOne.consignar(250);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(300);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(333);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(200);
    System.out.println(bankOfGods.accountOne.getBalance());

    System.out.println("**********************************************************");
    System.out.println("**********************************************************");
    
    bankOfGods.accountTwo.consignar(2000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(566);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.setBalance(3000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(3000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(125);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(3000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(785);
    System.out.println(bankOfGods.accountTwo.getBalance());
   
    bankOfGods.accountTwo.consignar(250);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(300);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(333);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(200);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
  }
}