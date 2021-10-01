public class BonusMilesService {
     public int calculate(int ticketPriceRUB){
         int milePrice = 20;
         int bonus = ticketPriceRUB / milePrice;
         return bonus;
     }
}

