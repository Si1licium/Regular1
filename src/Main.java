
public class Main {
    public static void main(String[] args) {
        String[] car = {"Mazda3", "Kia K5", "��� 2101", "MersBens"};
        boolean mar = false;
        for (String marka : car) {

            if (marka.matches("��� 2101")) {
                mar = true;
            }

        }
        if (mar){
            System.out.println("������ ������� ��� � ����������");
        }
        else {
            System.out.println("������ �� ������ ������");
        }
    }
}