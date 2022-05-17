package exercise31;

class Swiggy{

   String food_name;
   int price;
   double deliverytime;

   void foodName(String food_name) {

   this.food_name=food_name;

   }

   void foodPrice(int price) {

   this.price=price;

   }

   void foodDelivery(double deliverytime) {

   this.deliverytime=deliverytime;

   }

   void display_details(){

   System.out.println("Name of the order  " + food_name);

   System.out.println("Price for the order  " + price);

   System.out.println("Expected delivery time  " + deliverytime);

   }

   }

class Dinner extends Swiggy{


  String food_name;
  int price;
  double deliverytime;


  void foodName(String food_name) {

  this.food_name=food_name;

  }


  void foodPrice(int price) {

  this.price=price;

  }

  void foodDelivery(double deliverytime) {

  this.deliverytime=deliverytime;

  }
 
  void display_details(){

   System.out.println("Name of the order " + food_name);

   System.out.println("Price for the order " + price);

   System.out.println("Expected delivery time " + deliverytime);

}
}


 class Snacks extends Swiggy {


   String food_name;
   int price;
   double deliverytime;


  void foodName(String food_name) {

    this.food_name=food_name;

    }


  void foodPrice(int price) {

    this.price=price;
 
    }

  void foodDelivery(double deliverytime) {

   this.deliverytime=deliverytime;

    }

  void display_details(){

   System.out.println("Name of the order " + food_name);

   System.out.println("Price for the order  " + price);

   System.out.println("Expected delivery time  " + deliverytime);

  }
  }


   class Coderunner {
 
    public static void main(String[] args) {

     Dinner objDinner = new Dinner();

       objDinner.foodName("Noodles");
  
       objDinner.foodPrice(150);
  
       objDinner.foodDelivery(4.5);
  
       objDinner.display_details();

     Snacks objSnacks = new Snacks();

       objSnacks.foodName("Chicken65");
  
       objSnacks.foodPrice(60);
  
       objSnacks.foodDelivery(1.5);
  
       objSnacks.display_details();
 
 }

 }
