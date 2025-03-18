package bai2;

class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(" Nhà đầu tư " + name + " nhận thông báo: " + message);
    }
}
