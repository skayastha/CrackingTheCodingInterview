package SchoolSystem;

public interface IBilling {
    String generateBill(int studentID);
    String generateReceipt(int studentID);
    String updateDatabase(int studentID);

}
