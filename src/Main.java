public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 86_545;
        int miles = service.calculate(price);
        System.out.println("Количество миль" + miles);
    }
}