package np.com.pantbinod.employeeManagementSystem.model;


import lombok.Getter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@MappedSuperclass
public class AbstractEntity {

    @Id
    @NonNull
    private String id;


    @Basic(optional = false)
    @Column(name = "created_date")
    private LocalDate createdDate;


    @Basic
    @Column(name = "updated_date")
    private LocalDate updatedDate;

    @Version
    @Column(name = "version")
    private int version;


    @PrePersist
    public void prePersist() {
        this.createdDate = LocalDate.now();
        this.id = UUID.randomUUID().toString();
    }
}
