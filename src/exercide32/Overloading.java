package exercide32;

class Swiggy{

	   String food_name;
	   int price;
	   double deliverytime;

   void foodName(String food_name) {

	   this.food_name = food_name;

	   }

   void foodPrice(int price) {

	   this.price = price;

	   }
   void foodPrice(int realprice,int offer) {
	   
	   this.price = realprice-offer;
	   
   }

   void foodDelivery(double deliverytime) {

	   this.deliverytime = deliverytime;

	   }
   
   void foodDelivery(double preparingtime,int deliverytime) {
	   
	   this.deliverytime = preparingtime+deliverytime;
	   
   }
   

   void display_details(){

	   System.out.println("Name of the food " + food_name);

	   System.out.println("Price should be paid " + price + " rupees only.");

	   System.out.println("Superfast delivery within " + deliverytime + " hours.");

	   }

	   }
