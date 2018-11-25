/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrkSystems implements Serializable {

    private static final long serialVersionUID = -1789893505;

    private Integer id;
    private String  name;
    private Long    operatorForInfopolus;
    private Long    systemIdentifier;

    public TrkSystems() {}

    public TrkSystems(TrkSystems value) {
        this.id = value.id;
        this.name = value.name;
        this.operatorForInfopolus = value.operatorForInfopolus;
        this.systemIdentifier = value.systemIdentifier;
    }

    public TrkSystems(
        Integer id,
        String  name,
        Long    operatorForInfopolus,
        Long    systemIdentifier
    ) {
        this.id = id;
        this.name = name;
        this.operatorForInfopolus = operatorForInfopolus;
        this.systemIdentifier = systemIdentifier;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOperatorForInfopolus() {
        return this.operatorForInfopolus;
    }

    public void setOperatorForInfopolus(Long operatorForInfopolus) {
        this.operatorForInfopolus = operatorForInfopolus;
    }

    public Long getSystemIdentifier() {
        return this.systemIdentifier;
    }

    public void setSystemIdentifier(Long systemIdentifier) {
        this.systemIdentifier = systemIdentifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TrkSystems (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(operatorForInfopolus);
        sb.append(", ").append(systemIdentifier);

        sb.append(")");
        return sb.toString();
    }
}