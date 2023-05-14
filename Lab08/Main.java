package Lab08;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main( String args[] ) {
        /*Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");*/

        //tworzenie tablicy
            /*Statement stmt = null;
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:test.db");
                System.out.println("Opened database successfully");
                stmt = c.createStatement();
                String sql = "CREATE TABLE COMPANY " +
                        "(ID INT PRIMARY KEY NOT NULL," +
                        " NAME TEXT NOT NULL, " +
                        " AGE INT NOT NULL, " +
                        " ADDRESS CHAR(50), " +
                        " SALARY REAL)";
                stmt.executeUpdate(sql);
                stmt.close();
                c.close();
            } catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            System.out.println("Table created successfully");*/
            //INSERT
            /*Connection c = null;
            Statement stmt = null;
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:test.db");
                c.setAutoCommit(false);
                System.out.println("Opened database successfully");
                stmt = c.createStatement();
                String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
                        "VALUES (1, 'Paul', 32, 'California', 20000.00 );";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
                        "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
                        "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
                        "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
                stmt.executeUpdate(sql);
                stmt.close();
                c.commit();
                c.close();
            } catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            System.out.println("Records created successfully");*/
        //UPDATE
            /*Connection c = null;
            Statement stmt = null;
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:test.db");
                c.setAutoCommit(false);
                System.out.println("Opened database successfully");
                stmt = c.createStatement();
                String sql = "UPDATE COMPANY set SALARY = 25000.00 where ID=1;";
                stmt.executeUpdate(sql);
                c.commit();
                ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
                while ( rs.next() ) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    String address = rs.getString("address");
                    float salary = rs.getFloat("salary");
                    System.out.println( "ID = " + id );
                    System.out.println( "NAME = " + name );
                    System.out.println( "AGE = " + age );
                    System.out.println( "ADDRESS = " + address );
                    System.out.println( "SALARY = " + salary );
                    System.out.println();
                }
                rs.close();
                stmt.close();
                c.close();
            } catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            System.out.println("Operation done successfully");*/
        //DELETE
            /*Connection c = null;
            Statement stmt = null;
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:test.db");
                c.setAutoCommit(false);
                System.out.println("Opened database successfully");
                stmt = c.createStatement();
                String sql = "DELETE from COMPANY where ID=2;";
                stmt.executeUpdate(sql);
                c.commit();
                ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
                while ( rs.next() ) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    String address = rs.getString("address");
                    float salary = rs.getFloat("salary");
                    System.out.println( "ID = " + id );
                    System.out.println( "NAME = " + name );
                    System.out.println( "AGE = " + age );
                    System.out.println( "ADDRESS = " + address );
                    System.out.println( "SALARY = " + salary );
                    System.out.println();
                }
                rs.close();
                stmt.close();
                c.close();
            } catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            System.out.println("Operation done successfully");*/
        //Zadania
        setupDataBase();

        Scanner scanner =new Scanner(System.in);
        System.out.format("Wprowadz imie nauczyciela: ");
        String teacherName = scanner.next();
        System.out.format("Wprowadz nazwe przedmiotu: ");
        String subject = scanner.next();
        System.out.format("Wprowadz date: ");
        char[] date = new char[10];
        date = scanner.next().toCharArray();
        System.out.format("Wprowadz czas startu: ");
        char[] startTime = new char[8];
        startTime = scanner.next().toCharArray();


        addStudent(teacherName,subject,date,startTime);
        displayAttendance();


    }
    static void setupDataBase(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            String sql = "CREATE TABLE ATTENDANCE_LIST1" +
                    "(TEACHER TEXT NOT NULL, "
                    + " SUBJECT TEXT NOT NULL, "
                    + " STUDENTS TEXT NOT NULL, "
                    + " ALBUM INT NOT NULL, "
                    + " DATE CHAR(10), "
                    + " LOG_IN_TIME CHAR(8), "
                    + " LOG_OUT_TIME CHAR(8), "
                    + " TIME_IN INT )";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

    static void addStudent (String teacher, String subject, char[] date, char[] startTime) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("\n\nWprowadz imie i nazwisko studenta : ");
        String studentsName = scanner.next();
        System.out.format("Wprowadz numer albumu:");
        int album = scanner.nextInt();

        //Append to data base
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO ATTENDANCE_LIST1 (TEACHER,SUBJECT,DATE,LOG_IN_TIME,STUDENTS,ALBUM,LOG_IN_TIME) " +
                    "VALUES ('"+teacher+"','"+subject+"','"+date+"','"+startTime+"','"+studentsName+"',"+album+",'"+startTime+"');";
            stmt.executeUpdate(sql);
            stmt.close();

            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records created successfully");


    }

    static void displayAttendance (){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM ATTENDANCE_LIST1;" );

            int index=0;
            while ( rs.next() ) {
                index++;
                int album = rs.getInt("album");
                String students = rs.getString("students");
                String logOutTime =rs.getString("log_out_time");

                System.out.format("student %d :\n  album: %d\n  students name: %s\n\n\n",index,album,students);

            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
