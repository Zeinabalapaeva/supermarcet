import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Scanner;
public class Client implements CardInterface {

    private String firstName;
    private String lastName;
    private byte age;
    private Card card;
    private Produkt[] basket;

    public Client(String firstName, String lastName, byte age, Card card, Produkt[] basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    @Override
    public Produkt[] deleteEndProduct(Produkt[] products) {
        return products = new Produkt[0];
    }

    @Override
    public String payWithCard(double money, Produkt[] products, Client client) {
        Scanner scanner = new Scanner(System.in);
        if (money > 100) {
            if (money < client.getCard().getBalance()) {
                System.out.println("У вас в корзине:");
                for (Produkt product : products) {
                    System.out.println("Продукт{" +
                            "Имя продукта: '" + product.getProductName() + '\'' +
                            ", Цена на кг: " + product.getPrice() +
                            ", Цена =" + product.getPriceZAKG() + "\n");
                }
                System.out.println("Общая сумма:  " + money);
                System.out.println("Введите пароль для покупки: ");
                int password = scanner.nextInt();
                if (password == getCard().getPassword()) {
                    System.out.println("Успешно!");
                    System.out.println("                            Чек:       ");
                    System.out.println("Дата :" + ZonedDateTime.now());
                    for (Produkt product : products) {
                        System.out.println("Продукт{" +
                                "Имя продукта: '" + product.getProductName() + '\'' +
                                ", Цена на кг: " + product.getPrice() +
                                ", Цена =" + product.getPriceZAKG() + "\n");
                    }
                    System.out.println("Общая сумма:  " + money);
                } else {
                    System.out.println("Пароль не верен, повторите попытку: ");
                    return "null";
                }
            } else {
                System.out.println("У вас на карте недостаточно средств!");
            }
        } else {
            System.out.println("Успешно");
        }
        return "Повторите попытку позже!";
    }

    @Override
    public double getCartBalance(double money, Client client) {
        System.out.println(money - client.getCard().getBalance());
        return client.getCard().getBalance();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Produkt[] getBasket() {
        return basket;
    }

    public void setBasket(Produkt[] basket) {
        this.basket = basket;
    }


}