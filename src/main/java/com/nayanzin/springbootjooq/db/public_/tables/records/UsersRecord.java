/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.records;


import com.nayanzin.springbootjooq.db.public_.enums.UserStatus;
import com.nayanzin.springbootjooq.db.public_.tables.Users;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record18<Long, Long, String, String, String, String, String, String, Integer, Timestamp, Timestamp, String, String, Timestamp, String, Short, UserStatus, String> {

    private static final long serialVersionUID = -124656618;

    /**
     * Setter for <code>public.users.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.users.org_id</code>.
     */
    public void setOrgId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.users.org_id</code>.
     */
    public Long getOrgId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.users.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.users.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.users.last_name</code>.
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.users.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.users.username</code>.
     */
    public void setUsername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.users.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.users.password_hash</code>.
     */
    public void setPasswordHash(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.users.password_hash</code>.
     */
    public String getPasswordHash() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.users.mobile</code>.
     */
    public void setMobile(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.users.mobile</code>.
     */
    public String getMobile() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.users.email</code>.
     */
    public void setEmail(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.users.email</code>.
     */
    public String getEmail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.users.public_source_id</code>.
     */
    public void setPublicSourceId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.users.public_source_id</code>.
     */
    public Integer getPublicSourceId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.users.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.users.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>public.users.modified_date</code>.
     */
    public void setModifiedDate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.users.modified_date</code>.
     */
    public Timestamp getModifiedDate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>public.users.created_user</code>.
     */
    public void setCreatedUser(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.users.created_user</code>.
     */
    public String getCreatedUser() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.users.modified_user</code>.
     */
    public void setModifiedUser(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.users.modified_user</code>.
     */
    public String getModifiedUser() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.users.expired_date</code>.
     */
    public void setExpiredDate(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.users.expired_date</code>.
     */
    public Timestamp getExpiredDate() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>public.users.reset_code</code>.
     */
    public void setResetCode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.users.reset_code</code>.
     */
    public String getResetCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.users.attempts</code>.
     */
    public void setAttempts(Short value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.users.attempts</code>.
     */
    public Short getAttempts() {
        return (Short) get(15);
    }

    /**
     * Setter for <code>public.users.status</code>.
     */
    public void setStatus(UserStatus value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.users.status</code>.
     */
    public UserStatus getStatus() {
        return (UserStatus) get(16);
    }

    /**
     * Setter for <code>public.users.target</code>.
     */
    public void setTarget(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.users.target</code>.
     */
    public String getTarget() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, Long, String, String, String, String, String, String, Integer, Timestamp, Timestamp, String, String, Timestamp, String, Short, UserStatus, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, Long, String, String, String, String, String, String, Integer, Timestamp, Timestamp, String, String, Timestamp, String, Short, UserStatus, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Users.USERS.ORG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Users.USERS.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Users.USERS.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Users.USERS.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Users.USERS.PASSWORD_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Users.USERS.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Users.USERS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Users.USERS.PUBLIC_SOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Users.USERS.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Users.USERS.MODIFIED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Users.USERS.CREATED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Users.USERS.MODIFIED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return Users.USERS.EXPIRED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Users.USERS.RESET_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field16() {
        return Users.USERS.ATTEMPTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UserStatus> field17() {
        return Users.USERS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Users.USERS.TARGET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPasswordHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getPublicSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getModifiedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCreatedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getModifiedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getExpiredDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getResetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value16() {
        return getAttempts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserStatus value17() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(Long value) {
        setOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value5(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value6(String value) {
        setPasswordHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value7(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value8(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value9(Integer value) {
        setPublicSourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value10(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value11(Timestamp value) {
        setModifiedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value12(String value) {
        setCreatedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value13(String value) {
        setModifiedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value14(Timestamp value) {
        setExpiredDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value15(String value) {
        setResetCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value16(Short value) {
        setAttempts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value17(UserStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value18(String value) {
        setTarget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, String value8, Integer value9, Timestamp value10, Timestamp value11, String value12, String value13, Timestamp value14, String value15, Short value16, UserStatus value17, String value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Long id, Long orgId, String firstName, String lastName, String username, String passwordHash, String mobile, String email, Integer publicSourceId, Timestamp createdDate, Timestamp modifiedDate, String createdUser, String modifiedUser, Timestamp expiredDate, String resetCode, Short attempts, UserStatus status, String target) {
        super(Users.USERS);

        set(0, id);
        set(1, orgId);
        set(2, firstName);
        set(3, lastName);
        set(4, username);
        set(5, passwordHash);
        set(6, mobile);
        set(7, email);
        set(8, publicSourceId);
        set(9, createdDate);
        set(10, modifiedDate);
        set(11, createdUser);
        set(12, modifiedUser);
        set(13, expiredDate);
        set(14, resetCode);
        set(15, attempts);
        set(16, status);
        set(17, target);
    }
}
