package np.com.pantbinod.employeeManagementSystem.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class UserDto {


    @NotNull(message = "First name should not be null")
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private LocalDate joinDate;
    @NotNull
    private String course;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public UserDto() {
    }

    public UserDto(String firstName, String lastName, LocalDate joinDate, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
        this.course = course;
    }


    @Override
    public String toString() {
        return "UserDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", joinDate=" + joinDate +
                ", course='" + course + '\'' +
                '}';
    }
}
