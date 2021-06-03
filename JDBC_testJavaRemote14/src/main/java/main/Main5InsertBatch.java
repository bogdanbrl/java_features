package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * queries in batches
 */
public class Main5InsertBatch {

    public static void main(String[] args) {

        // ensure database state by executing these queries
//        create table person(id int primary key, name varchar(20));
//        insert into person(id,name) values (1,'ion');
//        insert into person(id,name) values (2,'gheorghe');
//        select * from person;

        // credentials and connectivity configuration
        String machine = "localhost";// machine ip or localhost if the database is locally installed
        String port = "3306";
        String databaseName = "persoane";// or schema name
        String url = "jdbc:mysql://" + machine + ":" + port + "/" + databaseName;
        String username = "bogdan";
        String password = "bogdan";

        // SQL string to execute in batch
        String sql1 = "insert into persoana(id,name,age) values (44,'marcu44',44)";
        String sql2 = "insert into persoana(id,name,age) values (55,'andrei55',55)";

        // connection to use
        Connection connection = null;

        try {

            // create database connection
            connection = DriverManager.getConnection(url, username, password);

            // create SQL statement
            Statement statement = connection.createStatement();

            // execute SQL statements in batch
            statement.addBatch(sql1);
            statement.addBatch(sql2);
            statement.executeBatch();

            // optional
            statement.close();

        } catch (SQLException e) {

            // process or not
            throw new RuntimeException(e);

        } finally {

            // always close the connection
            try {

                // safety check always
                if (connection != null) {
                    connection.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        // verify result by checking database table data
        // run twice this method and check exception is raised when running the second time if the table row already exists
    }

}
