public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int costTicket = 27890;
        int bonusMiles = service.calculate(costTicket);
        System.out.println("За покупку билета стоимостью "+ (costTicket) + " ₽, вам было начислено " + bonusMiles + " бонусных мили ");
    }
}


