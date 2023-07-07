import java.util.Scanner;
public class Product {
String productName;
double price;
String command;
double totalAmount;
String orderList;
int numberOfGuests;
Scanner scanner=new Scanner(System.in);
void basicProgram() {
while (true) {
numberOfGuests = scanner.nextInt();
if (numberOfGuests > 1){
    groceryList();
    break;
} else {
    System.out.println("Введено некорректное значение, попробуйте еще раз.");
    }
}
}
void groceryList() {
    while (true) {
        System.out.println("Введите название товара");
        productName = scanner.next();
        orderList = orderList + productName + "\n";
        System.out.println("Введите стоимость товара в формате:рубли.копейки.");
        price = scanner.nextDouble();
        totalAmount = totalAmount + price;
        System.out.println("Товар успешно добавлен. Хотите ли вы добавить еще один товар?" + "\n"+ "Если да то введите любое слово или букву" +"\n"+ "Если нет-введите команду:Завершить");
        command = scanner.next();
        String complete = "завершить";
        if (command.equalsIgnoreCase(complete)) {
            System.out.println("Добавленные товары:" +"\n" + orderList);
            double finalScore = totalAmount/numberOfGuests;
            System.out.println(String.format("%.2f", finalScore) + "рублей");
           break;
        }
}
}
}