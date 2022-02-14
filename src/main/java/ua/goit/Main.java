package ua.goit;

import ua.goit.config.DatabaseManagerConnector;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

    DatabaseManagerConnector dbConnector = new DatabaseManagerConnector("localhost", 5432, "goit_practice",
            "postgres", "password");
    Connection connection = dbConnector.getConnection();


    }
}
