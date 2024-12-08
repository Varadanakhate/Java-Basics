package JDBC;
//Dao data access object : has all the steps in it so we if have any changes we only change the dao layer

import java.sql.*;

public class DemoClass {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        // Updated database URL, username, and password
        String jdbcUrl = "jdbc:oracle:thin:@//uschlorods2001d.corporate.ingrammicro.com:1521/ODSR01.CORPORATE.INGRAMMICRO.COM"; // Use the correct format for your database
        String username = "DB2ODSAPL";
        String password = "gKZu#t1uV";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish the connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Execute a query
            String sql = "SELECT * FROM ODS.TBXVNDAM WHERE VNDAM_COMPANY = ?"; // Replace 'your_table' with your actual table name
            // Create a statement
           // statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(sql);
            //instead use the below

            //prepared statement for updation

            //PreparedStatement = connection.prepareStatement();
            //set the values for the query changed that it the data to be inserted into db
            //st.setInt(1,userid);




            // Set the parameter value for the query
            preparedStatement.setString(1, "MD");
            System.out.println("Executing query: " + sql + " with parameter MD");

            resultSet = preparedStatement.executeQuery();
//for inserting data
            //ddl-change structure of db,dml-change or update values , dql-fire the query,tcl-grant revoke permissions

            //resultSet = statement.executeUpdate(sql); //no need of while loop

            //directly print the statemnt

            //for this we use prepared statemnt for updation

            // Get the ResultSet metadata to retrieve column names
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Process the result set
            //rs.next() to fetch the data from the table and store it
            while (resultSet.next()) {
                // Retrieve data from the result set

         /*       String id = resultSet.getString("BUS_REGN_CD"); // Update column name as needed
                String name = resultSet.getString("VNDAM_COMPANY");// Update column name as needed
                String Colname = resultSet.getString("VNDAM_VENDOR");
                String ISRT = resultSet.getString("ODS_ISRT_TS");
                String UPD = resultSet.getString("ODS_UPD_TS");
                System.out.println("ID: " + id + ", Name: " + name +" ,Colname : "+Colname +"ODS_ISRT_TS"+ISRT+"ODS_UPD_TS"+UPD);*/

                for (int i = 1; i <= columnCount; i++) {
                    // Retrieve column name and value
                    String columnName = metaData.getColumnName(i);
                    String columnValue = resultSet.getString(i);
                    System.out.print(columnName + ": " + columnValue + " | ");
                }
                System.out.println();


            }
        } catch (ClassNotFoundException e) {
            System.err.println("Oracle JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println("SQL Exception during resource closing: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
