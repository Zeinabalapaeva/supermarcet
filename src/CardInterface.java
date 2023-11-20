public interface CardInterface {




    Produkt [] deleteEndProduct(Produkt[] products);
    String payWithCard(double money, Produkt[] products, Client client);
    double getCartBalance(double money,Client client);
}


