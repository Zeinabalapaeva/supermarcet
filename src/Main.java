import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("test");
                Produkt[] products = new Produkt[0];
                double summa = 0;
                long ee  = 0;
                String [] historiBuy = new String[0];
                Card card = new Card("Zyu", "Alapaeva", "784559157485", 5000, 1545);
                Client client = new Client("Zeinab", "All", (byte) 43, card, products);
                Scanner scannerStr = new Scanner(System.in);
                while (true) {
                    System.out.println("""
                    1.Список всех продуктов!
                    2.Моя корзинка
                    3.Купит все товары из моего корзинка
                    4.Мой баланс на карта
                    0.Выход
                    """);
                    String action = scannerStr.nextLine();
                    if (action.equals("1")) {
                        for (int i = 0; i < Produkt.getProducts().length; i++) {
                            System.out.println(Produkt.getProducts()[i].getPrice());
                        }
                    } else if (action.equals("2")) {
                        System.out.println(Arrays.toString(Produkt.getProducts()));
                        System.out.println("Введите айди продукта!: ");
                        String id = scannerStr.nextLine();
                        if (id.contains("1") || id.contains("2") || id.contains("3")||id.contains("4")||id.contains("5")||id.contains("6")||id.contains("7")||id.contains("8")||id.contains("9")||id.contains("0")){
                            ee = Long.parseLong((id));
                        }else System.out.println("Введите айди продукта!: ");
                        products = new Basced().getKarzina(ee, products);
                        summa = 0;
                    } else if (action.equals("3") && products.length > 0) {
                        summa = 0;
                        for (Produkt product : products) {
                            summa += product.getPriceZAKG();
                        }
                        if (!(client.payWithCard(summa, products, client)).equals("null")){
                            products = client.deleteEndProduct(products);
                        }else summa = 0;
                    } else if (action.equals("4")) {
                        System.out.println("На вашем балансе есть: ");
                        card.setBalance(client.getCartBalance(summa, client));
                        System.out.println("Все оплаты: ");
                        System.out.println(Arrays.toString(historiBuy));
                        summa = 0;

                    } else if (action.equals("0")) {
                        System.out.println("Программа зовершена!");
                        break;
                    } else System.out.println("Нет такой команды!");

                }
            }
        }



































