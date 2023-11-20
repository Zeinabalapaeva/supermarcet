





   public class Produkt {
       private String productName;
       private double price;
       private int Id;
       private double priceZAKG;

       public Produkt() {
       }

       public Produkt(String productName, double price, int id, double priceZAKG) {
           this.productName = productName;
           this.price = price;
           this.Id = id;
           this.priceZAKG = priceZAKG;
       }

       public double getPriceZAKG() {
           return priceZAKG;
       }

       public void setPriceZAKG(double priceZAKG) {
           this.priceZAKG = priceZAKG;
       }

       public String getProductName() {
           return productName;
       }

       public void setProductName(String productName) {
           this.productName = productName;
       }

       public double getPrice() {
           return price;
       }

       public void setPrice(double price) {
           this.price = price;
       }

       public int getId() {
           return Id;
       }

       public void setId(int id) {
           Id = id;
       }

       @Override
       public String toString() {
           return "Продукт{" +
                   "Имя продукта ='" + productName + '\'' +
                   ", Цена на кг:=" + price +
                   ", Id=" + Id + "\n";
       }

       public void dayar() {
           System.out.println("Продукт{" +
                   "Имя продукта ='" + productName + '\'' +
                   ", Цена на  кг=" + price +
                   ", Цена =" + priceZAKG +
                   ", Id=" + Id + "\n");
       }

       public static Produkt[] getProducts() {

           Produkt product = new Produkt("Картошко", 35, 1, 0);
           Produkt product1 = new Produkt("Памодор", 50, 2, 0);
           Produkt product2 = new Produkt("Пияз", 25, 3, 0);
           Produkt product3 = new Produkt("Бадыран", 40, 4, 0);
           Produkt product4 = new Produkt("Туз", 50, 5, 0);
           Produkt product5 = new Produkt("Сабиз", 15, 6, 0);
           Produkt product6 = new Produkt("Сарымсак", 15, 7, 0);
           Produkt product7 = new Produkt("Ун", 75, 8, 0);
           Produkt product8 = new Produkt("Дарбыз", 20, 9, 0);
           Produkt product9 = new Produkt("Кhefsiojdifodsоон", 35, 10, 0);

           return new Produkt[]{product, product1, product2, product3, product4, product5, product6, product7, product8, product9};
       }

   }






