import java.sql.*;

public class RemedoTestExercise{

     public static void main(String []args){
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        
        Class.forName("com.mysql.jdbc.Driver");
  
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3303/remedo-test-exercise",
                "root", "1234");
  
        try {
  
            String sql = "select usr.user_id, usr.address, tr.total_invoice_amount, tr.invoice_amount_paid, tr.remedo_commission from users as usr join transactions as tr on usr.user_id = tr.user_id where user_id = u1";
            prepStmt = con.prepareStatement(sql);
            rs = p.executeQuery();
            
            while (rs.next()) {
                int userId = rs.getInt(1);
                String address = rs.getString(2);
                Double invoiceAmount = rs.getDouble(3);
                Double invoiceAmtPaid = rs.getDouble(4);
                Double remedoCommission = rs.getDouble(5);
                
                System.out.println("User_id --> " + userId + ", Invoice Amt --> " + invoiceAmount +
                 ", Invoice Amt Paid --> " + invoiceAmtPaid + ", remedoCommission --> " + remedoCommission);
            
            }
        }catch (SQLException e) {
            System.out.println(e);
        }finally {
            if(con != null){
                con.close();
            }
        }
     }
}