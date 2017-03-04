package nl.gpesoft.persistence.audit;

import nl.gpesoft.persistence.base.PersistableEntity;
import nl.gpesoft.persistence.type.Action;

import javax.persistence.*;

@MappedSuperclass
@EntityListeners(value = { AuditEntityListener.class })
public class AuditableEntity extends PersistableEntity {

    @Column(name="USER_PROFILE")
    private String userProfile;

    @Column (name="ACTION")
    @Enumerated(EnumType.STRING)
    private Action action;

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
