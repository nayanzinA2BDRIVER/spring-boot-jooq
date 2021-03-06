/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.records;


import com.nayanzin.springbootjooq.db.public_.enums.ModerationStatus;
import com.nayanzin.springbootjooq.db.public_.enums.OrgType;
import com.nayanzin.springbootjooq.db.public_.enums.PreferredWaypoints;
import com.nayanzin.springbootjooq.db.public_.tables.Organizations;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class OrganizationsRecord extends UpdatableRecordImpl<OrganizationsRecord> implements Record13<Long, String, String, Timestamp, Timestamp, String, String, ModerationStatus, String, OrgType, PreferredWaypoints, String, String> {

    private static final long serialVersionUID = 599278017;

    /**
     * Setter for <code>public.organizations.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.organizations.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.organizations.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.organizations.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.organizations.country_code</code>.
     */
    public void setCountryCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.organizations.country_code</code>.
     */
    public String getCountryCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.organizations.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.organizations.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.organizations.modified_date</code>.
     */
    public void setModifiedDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.organizations.modified_date</code>.
     */
    public Timestamp getModifiedDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>public.organizations.created_user</code>.
     */
    public void setCreatedUser(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.organizations.created_user</code>.
     */
    public String getCreatedUser() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.organizations.modified_user</code>.
     */
    public void setModifiedUser(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.organizations.modified_user</code>.
     */
    public String getModifiedUser() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.organizations.moderation_status</code>.
     */
    public void setModerationStatus(ModerationStatus value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.organizations.moderation_status</code>.
     */
    public ModerationStatus getModerationStatus() {
        return (ModerationStatus) get(7);
    }

    /**
     * Setter for <code>public.organizations.description</code>.
     */
    public void setDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.organizations.description</code>.
     */
    public String getDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.organizations.org_type</code>.
     */
    public void setOrgType(OrgType value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.organizations.org_type</code>.
     */
    public OrgType getOrgType() {
        return (OrgType) get(9);
    }

    /**
     * Setter for <code>public.organizations.preferred_waypoints</code>.
     */
    public void setPreferredWaypoints(PreferredWaypoints value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.organizations.preferred_waypoints</code>.
     */
    public PreferredWaypoints getPreferredWaypoints() {
        return (PreferredWaypoints) get(10);
    }

    /**
     * Setter for <code>public.organizations.preferred_countries</code>.
     */
    public void setPreferredCountries(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.organizations.preferred_countries</code>.
     */
    public String getPreferredCountries() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.organizations.individual_groups</code>.
     */
    public void setIndividualGroups(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.organizations.individual_groups</code>.
     */
    public String getIndividualGroups() {
        return (String) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, Timestamp, Timestamp, String, String, ModerationStatus, String, OrgType, PreferredWaypoints, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, Timestamp, Timestamp, String, String, ModerationStatus, String, OrgType, PreferredWaypoints, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Organizations.ORGANIZATIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Organizations.ORGANIZATIONS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Organizations.ORGANIZATIONS.COUNTRY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Organizations.ORGANIZATIONS.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Organizations.ORGANIZATIONS.MODIFIED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Organizations.ORGANIZATIONS.CREATED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Organizations.ORGANIZATIONS.MODIFIED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ModerationStatus> field8() {
        return Organizations.ORGANIZATIONS.MODERATION_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Organizations.ORGANIZATIONS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OrgType> field10() {
        return Organizations.ORGANIZATIONS.ORG_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<PreferredWaypoints> field11() {
        return Organizations.ORGANIZATIONS.PREFERRED_WAYPOINTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Organizations.ORGANIZATIONS.PREFERRED_COUNTRIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Organizations.ORGANIZATIONS.INDIVIDUAL_GROUPS;
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCountryCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getModifiedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCreatedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getModifiedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModerationStatus value8() {
        return getModerationStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgType value10() {
        return getOrgType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PreferredWaypoints value11() {
        return getPreferredWaypoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPreferredCountries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getIndividualGroups();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value3(String value) {
        setCountryCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value4(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value5(Timestamp value) {
        setModifiedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value6(String value) {
        setCreatedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value7(String value) {
        setModifiedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value8(ModerationStatus value) {
        setModerationStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value9(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value10(OrgType value) {
        setOrgType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value11(PreferredWaypoints value) {
        setPreferredWaypoints(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value12(String value) {
        setPreferredCountries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord value13(String value) {
        setIndividualGroups(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationsRecord values(Long value1, String value2, String value3, Timestamp value4, Timestamp value5, String value6, String value7, ModerationStatus value8, String value9, OrgType value10, PreferredWaypoints value11, String value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrganizationsRecord
     */
    public OrganizationsRecord() {
        super(Organizations.ORGANIZATIONS);
    }

    /**
     * Create a detached, initialised OrganizationsRecord
     */
    public OrganizationsRecord(Long id, String name, String countryCode, Timestamp createdDate, Timestamp modifiedDate, String createdUser, String modifiedUser, ModerationStatus moderationStatus, String description, OrgType orgType, PreferredWaypoints preferredWaypoints, String preferredCountries, String individualGroups) {
        super(Organizations.ORGANIZATIONS);

        set(0, id);
        set(1, name);
        set(2, countryCode);
        set(3, createdDate);
        set(4, modifiedDate);
        set(5, createdUser);
        set(6, modifiedUser);
        set(7, moderationStatus);
        set(8, description);
        set(9, orgType);
        set(10, preferredWaypoints);
        set(11, preferredCountries);
        set(12, individualGroups);
    }
}
