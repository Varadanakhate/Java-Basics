package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Class.forName() explained
public class classFornName {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        //object created to call the class and print
        //1:load the class : calll static block
        //2:call the object : call the insatnce block

        //Abc obj= new Abc();

        //for not making an instance/object

        //Class.forName("JDBC.Abc").newInstance(); // print both static and instance block

     /*   Class.forName("JDBC.Abc");//loads the class hence only prints the static block
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());//loads driver*/

        //instead of above code use this code below

        Class.forName("new oracle.jdbc.driver.OracleDriver()");



    }
}
class Abc{
    //STATIC BLOCK
    static{
        System.out.println("static block");

    }
    //instance block
    {
        System.out.println("in instance");
    }
}
