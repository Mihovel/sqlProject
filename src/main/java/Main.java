import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class Main {

    public static DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    public static JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    public static void main(String[] args) {
        ForNameStatement.usingStatement();
        JdbcTemplate jdbcTemplate = jdbcTemplate(dataSource());
        EmployeeRepositoryImpl employeeRepository = new EmployeeRepositoryImpl(jdbcTemplate);
        employeeRepository.updateSalary(1);
        System.out.println(employeeRepository.findOne("1"));

    }
}


