package bai2;

class Stock extends Subject {
    private String stockName;
    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyObservers("Giá cổ phiếu " + stockName + " thay đổi thành: " + newPrice);
    }
}
