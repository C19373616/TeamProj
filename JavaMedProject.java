/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamedproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author sosin
 */
public class JavaMedProject {

    /**
     * @param args the command line arguments
     */
     public static ArrayList<String> login(String usr, String pass){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String msAccDB = "MedStore1.accdb"; // path to the DB file
        String dbURL = "jdbc:ucanaccess://" + msAccDB;
        int p=0;
        ArrayList<String> loginArray = new ArrayList<String>();

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException cnfex) {
            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }
        
            try {

                //String sqlStr = "SELECT user, passwd FROM Users WHERE usr='"+usr+"' AND passwd='"+pass+"'";
                String sqlStr = "Select usr, passwd from Users Where ID = 1";
                // Step 2.A: Create and get connection using DriverManager class
                connection = DriverManager.getConnection(dbURL);

                // Step 2.B: Creating JDBC Statement
                statement = connection.createStatement();

                // Step 2.C: Executing SQL &amp; retrieve data into ResultSet
                resultSet = statement.executeQuery(sqlStr);

                // hardcoded header
                //System.out.println("#\t\tName\t\tLocation\tDept#");
                //System.out.println("=====\t\t=========\t=======\t\t=======");
                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                // display the names of the columns in the ResultSet
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", metaData.getColumnName(i));
                }
                System.out.println("");
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", "=========");
                }
                // processing returned data and printing into console
                // Step 2.D: use data from ResultSet
                // use metadata
                while (resultSet.next()) {
                    System.out.println("");
                    for (int i = 1; i <= numberOfColumns; i++) {
                        //System.out.printf("%-8s\t", resultSet.getString(i));
                        loginArray.add(resultSet.getString(i));
                        
                    }
                }

            } catch (SQLException sqlex) {
                System.err.println("SQL statement issue " + sqlex.getMessage());
            } finally {

                // Step 3: Closing database connection
                try {
                    if (null != resultSet) {
                        // cleanup resources, once after processing
                        resultSet.close();
                    }
                    if (null != statement) {
                        // cleanup resources, once after processing
                        statement.close();
                    }
                    if (null != connection) {
                        // and then finally close connection
                        connection.close();
                    }
                } catch (SQLException sqlex) {
                    System.err.println(sqlex.getMessage());
                }
            }
        //System.out.println("Hello");
        System.out.println(loginArray);
        return loginArray;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaMedProject();
    }
    
}
