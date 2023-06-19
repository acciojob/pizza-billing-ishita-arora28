package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean containsCheese;
    private Boolean containsTopping;
    private Boolean bagAdded;
    public Boolean finalPrice;

    
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
       
      if(isVeg){
        this.price=300;
      
      }
      else{
        this.price=400;
      }
      this.containsCheese=false;
      this.containsTopping=false;
      this.bagAdded=false;
      this.finalPrice=false;
       setBill("Base Price Of the Pizza: "+this.price+"\n"); 

    }

    public Boolean getIsVeg() {
        return isVeg;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setBill(String bill) {
    
        this.bill=bill;
    }


    public void setIsVeg(Boolean isVeg) {
        this.isVeg = isVeg;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!containsCheese){
        this.price+=80;
         setBill(getBill()+"Extra Cheese Added: "+80+"\n"); 
         this.containsCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
       
        if(!containsTopping){
        
        if(getIsVeg()){
            this.price+=70;

            setBill(getBill()+"Extra Toppings Added: "+70+"\n");
        }
        else{
            this.price+=120;
            setBill(getBill()+"Extra Toppings Added: "+120+"\n"); 
        }

        this.containsTopping=true;
    }
         
    }

    public void addTakeaway(){
        // your code goes here
        
        if(!bagAdded){
            this.price+=20; 
          setBill(getBill()+"Paperbag Added: "+20+"\n"); 
            
          this.bagAdded=true;
        }
        
    }

    public String getBill(){
        // your code goes here
       if(this.finalPrice){
        this.bill+="Total Price: "+this.price+"\n";
        this.finalPrice=false;
       }
        return this.bill;
    }
    public void totalBill(){
        System.out.println("Total Price: "+this.price+"\n");

    }

}
