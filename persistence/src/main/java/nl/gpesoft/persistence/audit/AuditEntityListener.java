package nl.gpesoft.persistence.audit;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class AuditEntityListener {

    @PrePersist
    public void prePersist(AuditableEntity e) {

    }

    @PreUpdate
    public void preUpdate(AuditableEntity e) {

    }
}
