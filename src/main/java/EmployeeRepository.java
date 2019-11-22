import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.util.List;

public interface EmployeeRepository {
    RowMapper<Employee> ROW_MAPPER = (ResultSet resultSet, int rowNum) -> {
        return new Employee(resultSet.getInt("employeeID"), resultSet.getString("name"),
                resultSet.getString("surname"), resultSet.getString("email"),
                resultSet.getString("phoneNumber"), resultSet.getDate("hireDate"),
                resultSet.getInt("jobID"), resultSet.getInt("salary"),
                resultSet.getInt("commisionPCT"), resultSet.getInt("managerID"),
                resultSet.getInt("departmentID"));
    };

    List<Employee> findAll();

    Employee findOne(String id);

    void save(Employee person);

    int delete(String id);

    void updateSalary(int employeeID);
}
