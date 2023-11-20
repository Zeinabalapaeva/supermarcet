import java.util.Arrays;
import java.util.Scanner;

public class Basced extends Produkt{
        private Produkt[] productsInBasked = new Produkt[0];
        private double priceZAKG;
        public Basced() {
        }

        public Basced(Produkt[] basked) {
            this.productsInBasked = basked;
        }


        public Produkt[] getProductsInBasked() {
            return productsInBasked;
        }

        public void setProductsInBasked(Produkt[] productsInBasked) {
            this.productsInBasked = productsInBasked;
        }

        public double getPriceZAKG() {
            return priceZAKG;
        }

        public void setPriceZAKG(double priceZAKG) {
            this.priceZAKG = priceZAKG;
        }

        public Produkt[] getBasked() {
            return productsInBasked;
        }

        public void setBasked(Produkt[] basked) {
            this.productsInBasked = basked;
        }

        public Produkt[] getKarzina(long id, Produkt[] products) {
            double kg = 0;
            Scanner scanner = new Scanner(System.in);
            Produkt[] allproducts = Produkt.getProducts();
            for (int i = 0; i < Produkt.getProducts().length; i++) {
                if (allproducts[i].getId() == id) {
                    System.out.println("Сколька кг хотите купить? ");
                    String kgg = scanner.nextLine();
                    if (kgg.contains("1") || kgg.contains("2") || kgg.contains("3")||kgg.contains("4")||kgg.contains("5")||kgg.contains("6")||kgg.contains("7")||kgg.contains("8")||kgg.contains("9")||kgg.contains("0")){
                        kg = Double.parseDouble((kgg));
                    }else System.out.println("Сколька кг хотите купить? ");
                    double price = allproducts[i].getPrice();
                    allproducts[i].setPriceZAKG(price*kg);
                    products = Arrays.copyOf(products, products.length + 1);
                    products[products.length - 1] = allproducts[i];
                    allproducts[i].dayar();
                }
            }
            return products;
        }
        public Basced(Produkt[] productsInBasked, double priceZAKG) {
            this.productsInBasked = productsInBasked;
            this.priceZAKG = priceZAKG;
        }

        public Basced(String productName, double price, int id, Produkt[] productsInBasked, double priceZAKG) {
            super(productName, price, id,priceZAKG);
            this.productsInBasked = productsInBasked;
            this.priceZAKG = priceZAKG;
        }
    }


