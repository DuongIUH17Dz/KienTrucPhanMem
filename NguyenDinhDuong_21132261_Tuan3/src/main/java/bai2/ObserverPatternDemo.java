package bai2;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Tạo cổ phiếu và nhà đầu tư
        Stock stock = new Stock("ABC Corp", 100.0);
        Investor investor1 = new Investor("Huy");
        Investor investor2 = new Investor("Linh");

        // Đăng ký nhà đầu tư theo dõi cổ phiếu
        stock.addObserver(investor1);
        stock.addObserver(investor2);

        // Thay đổi giá cổ phiếu
        stock.setPrice(105.5);
        stock.setPrice(98.0);

        System.out.println("\n====================\n");

        // Tạo công việc và thành viên nhóm
        Task task = new Task("Thiết kế giao diện");
        TeamMember member1 = new TeamMember("Nam");
        TeamMember member2 = new TeamMember("Trang");

        // Đăng ký thành viên theo dõi công việc
        task.addObserver(member1);
        task.addObserver(member2);

        // Thay đổi trạng thái công việc
        task.updateStatus("Đang thực hiện");
        task.updateStatus("Hoàn thành");
    }
}
