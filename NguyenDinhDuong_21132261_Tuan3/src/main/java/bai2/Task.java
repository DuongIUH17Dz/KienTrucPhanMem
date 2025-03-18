package bai2;

class Task extends Subject {
    private String taskName;
    private String status;

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = "Chưa bắt đầu";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        notifyObservers("Công việc '" + taskName + "' đã cập nhật trạng thái: " + newStatus);
    }
}
