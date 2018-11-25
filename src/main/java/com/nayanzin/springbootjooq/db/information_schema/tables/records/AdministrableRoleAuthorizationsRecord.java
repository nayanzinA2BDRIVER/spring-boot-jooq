/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables.records;


import com.nayanzin.springbootjooq.db.information_schema.tables.AdministrableRoleAuthorizations;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class AdministrableRoleAuthorizationsRecord extends TableRecordImpl<AdministrableRoleAuthorizationsRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 408542803;

    /**
     * Setter for <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    public void setGrantee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    public void setRoleName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    public String getRoleName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    public void setIsGrantable(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    public String getIsGrantable() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_GRANTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdministrableRoleAuthorizationsRecord value1(String value) {
        setGrantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdministrableRoleAuthorizationsRecord value2(String value) {
        setRoleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdministrableRoleAuthorizationsRecord value3(String value) {
        setIsGrantable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdministrableRoleAuthorizationsRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdministrableRoleAuthorizationsRecord
     */
    public AdministrableRoleAuthorizationsRecord() {
        super(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create a detached, initialised AdministrableRoleAuthorizationsRecord
     */
    public AdministrableRoleAuthorizationsRecord(String grantee, String roleName, String isGrantable) {
        super(AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS);

        set(0, grantee);
        set(1, roleName);
        set(2, isGrantable);
    }
}
