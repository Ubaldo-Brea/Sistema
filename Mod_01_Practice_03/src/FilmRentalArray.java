
public class FilmRentalArray {

    public int[] filmsRentedDiscount;
    public int filmsRented;

    public void setFilmRentalArray() {
        filmsRentedDiscount = new int[7];
        filmsRentedDiscount[0] = 0;
        filmsRentedDiscount[1] = 20;
        filmsRentedDiscount[2] = 30;
        filmsRentedDiscount[3] = 40;
        filmsRentedDiscount[4] = 50;
        filmsRentedDiscount[5] = 60;
        filmsRentedDiscount[6] = 70;
    }
    
    public void displayFilmRentalArray(){
        if(filmsRented >= 0 && filmsRented < 6){
            System.out.println ("Discount: " + filmsRentedDiscount[filmsRented]);
        }else if(filmsRented >= 6){
            System.out.println ("Discount: " + filmsRentedDiscount[6]);
        }
        else {
            System.out.println ("Invalid number of Films Rented");
        } 
    }
}
