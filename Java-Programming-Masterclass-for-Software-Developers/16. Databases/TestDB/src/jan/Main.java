package jan;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\jasie\\IdeaProjects\\TestDB\\testjava.db");
//            Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\jasie\\IdeaProjects\\TestDB\\testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute( "CREATE TABLE IF NOT EXISTS contacts" +
                                    "(name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Jane',765757,'jane@gmail.com') ");
//
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Jim',908098,'Jim@gmail.com') ");

//            statement.execute("UPDATE contacts SET phone = 3213123 WHERE name ='Jane'");
//            statement.execute("DELETE FROM contacts WHERE name='Jim'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " " + results.getInt("phone") + " " + results.getString("email"));
            }

            results.close();

            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong!" + e.getMessage());
        }
    }
}
