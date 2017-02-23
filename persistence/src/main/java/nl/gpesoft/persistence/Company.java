package nl.gpesoft.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Date foundationDate;

    @OneToMany
    private List<Employee> employees = new ArrayList<Employee>();
}
