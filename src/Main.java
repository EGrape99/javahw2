public class Main {
    public static void main(String[] args) {
        int ticket = 9590; //стоимость билета, рублей
        int bonus = 20; //количество рублей для одной бонусной мили
        int mile = ticket / bonus;
        System.out.println("Бонусных миль за билет:" + (mile));
    }
}