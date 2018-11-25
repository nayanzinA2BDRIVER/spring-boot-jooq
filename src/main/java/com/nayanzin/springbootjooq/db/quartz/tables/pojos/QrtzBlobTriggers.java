/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.quartz.tables.pojos;


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
public class QrtzBlobTriggers implements Serializable {

    private static final long serialVersionUID = 1728141925;

    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private byte[] blobData;

    public QrtzBlobTriggers() {}

    public QrtzBlobTriggers(QrtzBlobTriggers value) {
        this.schedName = value.schedName;
        this.triggerName = value.triggerName;
        this.triggerGroup = value.triggerGroup;
        this.blobData = value.blobData;
    }

    public QrtzBlobTriggers(
        String schedName,
        String triggerName,
        String triggerGroup,
        byte[] blobData
    ) {
        this.schedName = schedName;
        this.triggerName = triggerName;
        this.triggerGroup = triggerGroup;
        this.blobData = blobData;
    }

    public String getSchedName() {
        return this.schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getTriggerName() {
        return this.triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return this.triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    public byte[] getBlobData() {
        return this.blobData;
    }

    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("QrtzBlobTriggers (");

        sb.append(schedName);
        sb.append(", ").append(triggerName);
        sb.append(", ").append(triggerGroup);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}