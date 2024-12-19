public class Main {
    public static void main(String[] args){
        RentalAgency agency = new RentalAgency();
        Car car = new Car("E53","Mercedes-AMG",500.00,true,true);
        Motorcycle motorcycle = new Motorcycle("F3 800","Mercedes-AMG GT",200.0,true,false);
        Truck truck =  new Truck("Arocs 6×6","Mercedes-Benz",400.00,true,1500);

            agency.addVehicle(car);
            agency.addVehicle(motorcycle);
            agency.addVehicle(truck);

            Customer customer = new Customer("Kingsley Ofori-Atta");
            try{
                agency.rentVehicle("E53",customer,5);
                agency.rentVehicle("",customer,3);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            agency.returnVehicle(car,customer);
    }
}