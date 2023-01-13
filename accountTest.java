   public Account(String name , double a){
      this.name = name;
      this.balance = a;
   }
   public void deposit(double depositAmount) 
   {      
      if (depositAmount > 0.0) // if the depositAmount is valid
         balance = balance + depositAmount; // add it to the balance 
   }
   public void withdraw(double withdrawAmount){
      if (withdrawAmount > 0.0){
         balance = balance - withdrawAmount;
      }
   }
   public double getBalance() {
      return balance;
   } 
   public void setName(String name) {
      this.name = name; 
   } 
   public String getName(){
   return name;
   } 
} 
