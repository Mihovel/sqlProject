import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ForNameStatement {
    public static void usingStatement() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
            Statement stmt = con.createStatement();

            stmt.execute("insert into employee(employeeID, name, surname, email, phoneNumber, hireDate, jobID, salary, commisionPCT, managerID, departmentID)\n" +
                    "values(6, \"Zlatan\", \"Burevich\", \"burevvich@yahoo.com\", \"+35.4400.47.82\", '2006-01-24', 1, 140000, 15000, 1, 1);");
            stmt.execute("insert into employee(employeeID, name, surname, email, phoneNumber, hireDate, jobID, salary, commisionPCT, managerID, departmentID)\n" +
                    "values(7, \"David\", \"Tetruashvilli\", \"dt2005@mail.com\", \"+985.772.4704\", '2006-01-28', 3, 750000, 6500, 3, 3);");
            stmt.execute("insert into employee(employeeID, name, surname, email, phoneNumber, hireDate, jobID, salary, commisionPCT, managerID, departmentID)\n" +
                    "values(8, \"David\", \"Lester\", \"dlester@bing.com\", \"+1.213.470.281.229\", '2006-01-28', 2, 820000, 7200, 2, 2);");
            stmt.execute("insert into employee(employeeID, name, surname, email, phoneNumber, hireDate, jobID, salary, commisionPCT, managerID, departmentID)\n" +
                    "values(9, \"Evgeniy\", \"Ternovoi\", \"euguneternov@yandex.com\", \"925.875.6893\", '2006-02-12', 4, 110000, 12000, 4, 4);");
            stmt.execute("insert into employee(employeeID, name, surname, email, phoneNumber, hireDate, jobID, salary, commisionPCT, managerID, departmentID)\n" +
                    "values(10, \"Vasiliy\", \"Skvortsov\", \"skvortsov@yandex.com\", \"910.221.2292\", '2006-02-14', 1, 105000, 11500, 1, 1);");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
