public class BonusMilesService {
    public int calculate(int cost){
        int difference = 20; // кол-во рублей до единицы миль

        int miles = cost / difference; // кол-во миль
        return miles;
    }
}
