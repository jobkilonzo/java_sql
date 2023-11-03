import java.sql.*;
public class JavaDeleteSQL {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "example",
                    "123pass"
            );
            //String qry = "SELECT * FROM actor";
            String qry = "DELETE FROM actor WHERE ActorID=?;";

            PreparedStatement statement = connection.prepareStatement(qry);
            statement.setInt(1, 3);


            statement.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
