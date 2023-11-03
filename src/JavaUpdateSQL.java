import java.sql.*;


public class JavaUpdateSQL {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "example",
                    "123pass"
            );
            //String qry = "SELECT * FROM actor";
            String qry = "INSERT INTO actor(ActorID, Actor_Name, ACtor_Role) VALUES(?, ?, ?);";

           PreparedStatement statement = connection.prepareStatement(qry);
           statement.setInt(1, 3);
           statement.setString(2, "Kelvin Hart");
           statement.setString(3, "Main");

           statement.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
