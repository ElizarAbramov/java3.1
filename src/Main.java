public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int ticketPriceRUB = 10_000;
        int bonus = service.calculate(ticketPriceRUB);
        System.out.println(bonus);
    }
}
