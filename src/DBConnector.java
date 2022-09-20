import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

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

    public void cleanDBData() {
        String query1 = "TRUNCATE TABLE Bøger";
        try {
            PreparedStatement statement1 = connection.prepareStatement(query1);
            statement1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query2 = "TRUNCATE TABLE Lånere";
        try {
            PreparedStatement statement2 = connection.prepareStatement(query2);
            statement2.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query3 = "TRUNCATE TABLE Udlån";
        try {
            PreparedStatement statement2 = connection.prepareStatement(query3);
            statement2.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertBooktoDB (Map<Integer, Bog> bøger){
        String navn;
        boolean erUdlånt;

        for (Bog b : bøger.values()){
            navn = b.title;
            erUdlånt = b.erUdlånt;

            String insertBookToDB = "INSERT into bog ('" + navn + "','" + "','" + erUdlånt +"')";
            try{
                PreparedStatement query1 = connection.prepareStatement(insertBookToDB);
                var query1Result = query1.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void insertLåneretoDB(Map<Integer, Låner> lånere){
        String navn;

        for (Låner b : lånere.values()){
            navn = b.navn;

            String insertLåneretoDB = "INSERT into Låner ('" + navn + "','" + "','"+"')";
            try{
                PreparedStatement query1 = connection.prepareStatement(insertLåneretoDB);
                var query1Result = query1.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

