import java.sql.*;


public class JavaSQL {
    public static void main(String[] args) {
       try{
           Connection connection = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/test",
                   "example",
                   "123pass"
           );
           //String qry = "SELECT * FROM actor";
           String qry = "INSERT INTO actor(ActorID, Actor_Name, ACtor_Role) VALUES(2, \"Kelvin Hart\", \"Secondary\");";

           Statement statement = connection.createStatement();
           ResultSet rs = statement.executeQuery(qry);

           while(rs.next()){
               System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
