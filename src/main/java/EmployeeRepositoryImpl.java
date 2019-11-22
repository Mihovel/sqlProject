import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeRepository.class);

    private final JdbcTemplate jdbcTemplate;

    public EmployeeRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> findAll() {
        return jdbcTemplate.query("select * from employee", ROW_MAPPER);
    }

    public Employee findOne(String employeeID) {
        Employee employee = null;
        try {
            employee = jdbcTemplate.queryForObject("select * from employee where employeeID = ?",
                    new Object[]{employeeID}, ROW_MAPPER);
        } catch (DataAccessException dataAccessException) {
            LOGGER.debug("Couldn't find entity of type employee with employeeID {}", employeeID);
        }
        return employee;
    }

    @Override
    public void save(Employee person) {

    }

    @Override
    public void updateSalary(int employeeID) {
        jdbcTemplate.update("update employee set salary = salary * 10 where employeeID = ?", employeeID);
    }

    @Override
    public int delete(String employeeID) {
        return jdbcTemplate.update("delete from employee where employeeID = ?", employeeID);
    }
}
