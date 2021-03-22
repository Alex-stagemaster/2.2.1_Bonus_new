public class Main {
    public static void main(String[] args) {
        float costTicket = 27890.50f; // стоимость билета в ₽
        int coef = 20;
        int bonusMiles = (int) (costTicket / coef); // расчёт бонусных миль (1 миля за каждые 20 рублей)
        String numberAsString = String.format ("%.2f", costTicket);
        System.out.println("За покупку билета стоимостью "+ (numberAsString) + " ₽, вам было начислено " + bonusMiles + " бонусных мили ");
    }
}


