
public class Main {
    public static void main(String[] args) {
        String[] car = {"Mazda3", "Kia K5", "ВАЗ 2101", "MersBens"};
        boolean mar = false;
        for (String marka : car) {

            if (marka.matches("ВАЗ 2101")) {
                mar = true;
            }

        }
        if (mar){
            System.out.println("Машина ожидает Вас в автосалоне");
        }
        else {
            System.out.println("Машина на стадии сборки");
        }
    }
}