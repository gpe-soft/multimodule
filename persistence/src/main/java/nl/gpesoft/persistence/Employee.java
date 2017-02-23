package nl.gpesoft.persistence;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Date employedDate;
}
