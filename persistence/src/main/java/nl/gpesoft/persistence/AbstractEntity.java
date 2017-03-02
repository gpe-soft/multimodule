package nl.gpesoft.persistence;

import nl.gpesoft.persistence.type.Action;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "ID", updatable = false, nullable = false)
    private Long id;

    @Column (name="USER_PROFILE")
    private String userProfile;

    @Column (name="TIMESTAMP")
    private long timeStamp;

    @Column (name="ACTION")
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