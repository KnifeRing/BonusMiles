public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int cost = 100; // стоимость билета
//        int difference = 20; // кол-во рублей до единицы миль

        int miles = service.calculate(cost); // кол-во миль

        System.out.println("Количество начисленных миль за купленный билет:" + miles);

    }
}