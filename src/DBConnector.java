import java.sql.*;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    static Connection connection = null;
    public int methodChoiceDB = 1;
    String JdbcUrl = "jdbc:mysql://localhost/Bibliotek?" + "autoReconnect=true&useSSL=false";
    String username = "root";
    String password = "NY9hcW7DAZ!+-qg1:]G6";

    public void createConnection() {
        System.out.println("Entered Create Connection");

        try {
            connection = DriverManager.getConnection(JdbcUrl, username, password);

            switch (methodChoiceDB) {

                case 1 -> { //PrintOut DBData on Screen
                    //printOutDBData(teamList);
                    connection.close();
                }

                case 2 -> { //Save Team data to DB
                    System.out.println("Inside of SaveTeamList");
                    //insertTeamToDB(teamList);
                    connection.close();
                }

                case 3 -> { //Clear DB Data
                    cleanDBData();
                    connection.close();
                }

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void cleanDBData() { //TODO: Ændre team + playerName til at passe med bibliotek

        String query1 = "TRUNCATE TABLE team";
        try {
            PreparedStatement statement1 = connection.prepareStatement(query1);

            statement1.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query2 = "TRUNCATE TABLE playerName";
        try {
            PreparedStatement statement2 = connection.prepareStatement(query2);

            statement2.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertBooktoDB(ArrayList<Bog> bogliste){
        String navn;
        int antalBøger;
        boolean erUdlånt;

        for (Bog b : bogliste){
            navn = b.title;
            antalBøger = b.antal;
            erUdlånt = b.erUdlånt;

            String insertBookToDB = "INSERT into bog ('" + navn + "','" + antalBøger + "','" + erUdlånt +"')";
            try{
                PreparedStatement query1 = connection.prepareStatement(insertBookToDB);
                var query1Result = query1.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

