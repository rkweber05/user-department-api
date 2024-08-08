package userdeptapi.userdeptapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import userdeptapi.userdeptapi.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
