package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Employee;



/*Spring Data JPA internally provides @Repository Annotations so we no need
 *  to add @Repository annotation to Employee Repository interface*/

public interface EmployeeRepository extends JpaRepository <Employee,Long> {

}
