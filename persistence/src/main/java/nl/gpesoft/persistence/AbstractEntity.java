package nl.gpesoft.persistence;

import nl.gpesoft.type.Action;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String userProfile;

    @Column
    private long timeStamp;

    @Enumerated(EnumType.STRING)
    private Action action;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}