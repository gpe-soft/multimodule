package nl.gpesoft.persistence.base;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class PersistableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}