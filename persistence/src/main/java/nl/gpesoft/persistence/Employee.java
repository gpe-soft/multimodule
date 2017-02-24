package nl.gpesoft.persistence;

import javax.persistence.*;
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
