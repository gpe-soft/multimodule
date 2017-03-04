package nl.gpesoft.persistence.audit;

import nl.gpesoft.persistence.type.Action;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class AuditEntityListener {

    public AuditEntityListener() {

    }

    @PrePersist
    public void prePersist(AuditableEntity auditableEntity) {
        auditableEntity.setAction(Action.REGISTRATION);
        auditableEntity.setUserProfile("Tom");
        auditableEntity.setTimeStamp(new Date());
    }

    @PreUpdate
    public void preUpdate(AuditableEntity auditableEntity) {

    }
}
