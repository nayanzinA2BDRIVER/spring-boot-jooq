/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog;


import com.nayanzin.springbootjooq.db.DefaultCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAggregate;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAm;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAmop;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAmproc;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAttrdef;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAttribute;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAuthMembers;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAuthid;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAvailableExtensionVersions;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAvailableExtensions;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgCast;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgClass;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgCollation;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgConfig;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgConstraint;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgConversion;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgCursors;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgDatabase;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgDbRoleSetting;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgDefaultAcl;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgDepend;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgDescription;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgEnum;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgEventTrigger;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgExtension;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgFileSettings;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgForeignDataWrapper;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgForeignServer;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgForeignTable;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgGroup;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgHbaFileRules;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgIndex;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgIndexes;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgInherits;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgInitPrivs;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgLanguage;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgLargeobject;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgLargeobjectMetadata;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgLocks;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgMatviews;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgNamespace;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgOpclass;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgOperator;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgOpfamily;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPartitionedTable;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPltemplate;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPolicies;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPolicy;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPreparedStatements;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPreparedXacts;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgProc;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPublication;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPublicationRel;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPublicationTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgRange;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgReplicationOrigin;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgReplicationOriginStatus;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgReplicationSlots;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgRewrite;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgRoles;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgRules;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSeclabel;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSeclabels;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSequence;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSequences;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSettings;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgShadow;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgShdepend;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgShdescription;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgShseclabel;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatActivity;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatAllIndexes;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatAllTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatArchiver;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatBgwriter;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatDatabase;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatDatabaseConflicts;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatProgressVacuum;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatReplication;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatSsl;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatSubscription;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatSysIndexes;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatSysTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatUserFunctions;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatUserIndexes;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatUserTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatWalReceiver;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatXactAllTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatXactSysTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatXactUserFunctions;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatXactUserTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioAllIndexes;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioAllSequences;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioAllTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioSysIndexes;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioSysSequences;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioSysTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioUserIndexes;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioUserSequences;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioUserTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatistic;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatisticExt;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStats;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSubscription;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSubscriptionRel;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTables;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTablespace;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTimezoneAbbrevs;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTimezoneNames;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTransform;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTrigger;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsConfig;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsConfigMap;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsDict;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsParser;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsTemplate;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgType;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgUser;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgUserMapping;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgUserMappings;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgViews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class PgCatalog extends SchemaImpl {

    private static final long serialVersionUID = 1169118918;

    /**
     * The reference instance of <code>pg_catalog</code>
     */
    public static final PgCatalog PG_CATALOG = new PgCatalog();

    /**
     * The table <code>pg_catalog.pg_aggregate</code>.
     */
    public final PgAggregate PG_AGGREGATE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAggregate.PG_AGGREGATE;

    /**
     * The table <code>pg_catalog.pg_am</code>.
     */
    public final PgAm PG_AM = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAm.PG_AM;

    /**
     * The table <code>pg_catalog.pg_amop</code>.
     */
    public final PgAmop PG_AMOP = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAmop.PG_AMOP;

    /**
     * The table <code>pg_catalog.pg_amproc</code>.
     */
    public final PgAmproc PG_AMPROC = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAmproc.PG_AMPROC;

    /**
     * The table <code>pg_catalog.pg_attrdef</code>.
     */
    public final PgAttrdef PG_ATTRDEF = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAttrdef.PG_ATTRDEF;

    /**
     * The table <code>pg_catalog.pg_attribute</code>.
     */
    public final PgAttribute PG_ATTRIBUTE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAttribute.PG_ATTRIBUTE;

    /**
     * The table <code>pg_catalog.pg_auth_members</code>.
     */
    public final PgAuthMembers PG_AUTH_MEMBERS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAuthMembers.PG_AUTH_MEMBERS;

    /**
     * The table <code>pg_catalog.pg_authid</code>.
     */
    public final PgAuthid PG_AUTHID = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAuthid.PG_AUTHID;

    /**
     * The table <code>pg_catalog.pg_available_extension_versions</code>.
     */
    public final PgAvailableExtensionVersions PG_AVAILABLE_EXTENSION_VERSIONS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS;

    /**
     * The table <code>pg_catalog.pg_available_extensions</code>.
     */
    public final PgAvailableExtensions PG_AVAILABLE_EXTENSIONS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS;

    /**
     * The table <code>pg_catalog.pg_cast</code>.
     */
    public final PgCast PG_CAST = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgCast.PG_CAST;

    /**
     * The table <code>pg_catalog.pg_class</code>.
     */
    public final PgClass PG_CLASS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgClass.PG_CLASS;

    /**
     * The table <code>pg_catalog.pg_collation</code>.
     */
    public final PgCollation PG_COLLATION = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgCollation.PG_COLLATION;

    /**
     * The table <code>pg_catalog.pg_config</code>.
     */
    public final PgConfig PG_CONFIG = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgConfig.PG_CONFIG;

    /**
     * The table <code>pg_catalog.pg_constraint</code>.
     */
    public final PgConstraint PG_CONSTRAINT = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgConstraint.PG_CONSTRAINT;

    /**
     * The table <code>pg_catalog.pg_conversion</code>.
     */
    public final PgConversion PG_CONVERSION = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgConversion.PG_CONVERSION;

    /**
     * The table <code>pg_catalog.pg_cursors</code>.
     */
    public final PgCursors PG_CURSORS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgCursors.PG_CURSORS;

    /**
     * The table <code>pg_catalog.pg_database</code>.
     */
    public final PgDatabase PG_DATABASE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgDatabase.PG_DATABASE;

    /**
     * The table <code>pg_catalog.pg_db_role_setting</code>.
     */
    public final PgDbRoleSetting PG_DB_ROLE_SETTING = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgDbRoleSetting.PG_DB_ROLE_SETTING;

    /**
     * The table <code>pg_catalog.pg_default_acl</code>.
     */
    public final PgDefaultAcl PG_DEFAULT_ACL = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgDefaultAcl.PG_DEFAULT_ACL;

    /**
     * The table <code>pg_catalog.pg_depend</code>.
     */
    public final PgDepend PG_DEPEND = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgDepend.PG_DEPEND;

    /**
     * The table <code>pg_catalog.pg_description</code>.
     */
    public final PgDescription PG_DESCRIPTION = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgDescription.PG_DESCRIPTION;

    /**
     * The table <code>pg_catalog.pg_enum</code>.
     */
    public final PgEnum PG_ENUM = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgEnum.PG_ENUM;

    /**
     * The table <code>pg_catalog.pg_event_trigger</code>.
     */
    public final PgEventTrigger PG_EVENT_TRIGGER = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgEventTrigger.PG_EVENT_TRIGGER;

    /**
     * The table <code>pg_catalog.pg_extension</code>.
     */
    public final PgExtension PG_EXTENSION = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgExtension.PG_EXTENSION;

    /**
     * The table <code>pg_catalog.pg_file_settings</code>.
     */
    public final PgFileSettings PG_FILE_SETTINGS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgFileSettings.PG_FILE_SETTINGS;

    /**
     * The table <code>pg_catalog.pg_foreign_data_wrapper</code>.
     */
    public final PgForeignDataWrapper PG_FOREIGN_DATA_WRAPPER = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER;

    /**
     * The table <code>pg_catalog.pg_foreign_server</code>.
     */
    public final PgForeignServer PG_FOREIGN_SERVER = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgForeignServer.PG_FOREIGN_SERVER;

    /**
     * The table <code>pg_catalog.pg_foreign_table</code>.
     */
    public final PgForeignTable PG_FOREIGN_TABLE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgForeignTable.PG_FOREIGN_TABLE;

    /**
     * The table <code>pg_catalog.pg_group</code>.
     */
    public final PgGroup PG_GROUP = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgGroup.PG_GROUP;

    /**
     * The table <code>pg_catalog.pg_hba_file_rules</code>.
     */
    public final PgHbaFileRules PG_HBA_FILE_RULES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgHbaFileRules.PG_HBA_FILE_RULES;

    /**
     * The table <code>pg_catalog.pg_index</code>.
     */
    public final PgIndex PG_INDEX = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgIndex.PG_INDEX;

    /**
     * The table <code>pg_catalog.pg_indexes</code>.
     */
    public final PgIndexes PG_INDEXES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgIndexes.PG_INDEXES;

    /**
     * The table <code>pg_catalog.pg_inherits</code>.
     */
    public final PgInherits PG_INHERITS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgInherits.PG_INHERITS;

    /**
     * The table <code>pg_catalog.pg_init_privs</code>.
     */
    public final PgInitPrivs PG_INIT_PRIVS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgInitPrivs.PG_INIT_PRIVS;

    /**
     * The table <code>pg_catalog.pg_language</code>.
     */
    public final PgLanguage PG_LANGUAGE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgLanguage.PG_LANGUAGE;

    /**
     * The table <code>pg_catalog.pg_largeobject</code>.
     */
    public final PgLargeobject PG_LARGEOBJECT = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgLargeobject.PG_LARGEOBJECT;

    /**
     * The table <code>pg_catalog.pg_largeobject_metadata</code>.
     */
    public final PgLargeobjectMetadata PG_LARGEOBJECT_METADATA = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA;

    /**
     * The table <code>pg_catalog.pg_locks</code>.
     */
    public final PgLocks PG_LOCKS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgLocks.PG_LOCKS;

    /**
     * The table <code>pg_catalog.pg_matviews</code>.
     */
    public final PgMatviews PG_MATVIEWS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgMatviews.PG_MATVIEWS;

    /**
     * The table <code>pg_catalog.pg_namespace</code>.
     */
    public final PgNamespace PG_NAMESPACE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgNamespace.PG_NAMESPACE;

    /**
     * The table <code>pg_catalog.pg_opclass</code>.
     */
    public final PgOpclass PG_OPCLASS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgOpclass.PG_OPCLASS;

    /**
     * The table <code>pg_catalog.pg_operator</code>.
     */
    public final PgOperator PG_OPERATOR = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgOperator.PG_OPERATOR;

    /**
     * The table <code>pg_catalog.pg_opfamily</code>.
     */
    public final PgOpfamily PG_OPFAMILY = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgOpfamily.PG_OPFAMILY;

    /**
     * The table <code>pg_catalog.pg_partitioned_table</code>.
     */
    public final PgPartitionedTable PG_PARTITIONED_TABLE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPartitionedTable.PG_PARTITIONED_TABLE;

    /**
     * The table <code>pg_catalog.pg_pltemplate</code>.
     */
    public final PgPltemplate PG_PLTEMPLATE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPltemplate.PG_PLTEMPLATE;

    /**
     * The table <code>pg_catalog.pg_policies</code>.
     */
    public final PgPolicies PG_POLICIES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPolicies.PG_POLICIES;

    /**
     * The table <code>pg_catalog.pg_policy</code>.
     */
    public final PgPolicy PG_POLICY = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPolicy.PG_POLICY;

    /**
     * The table <code>pg_catalog.pg_prepared_statements</code>.
     */
    public final PgPreparedStatements PG_PREPARED_STATEMENTS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPreparedStatements.PG_PREPARED_STATEMENTS;

    /**
     * The table <code>pg_catalog.pg_prepared_xacts</code>.
     */
    public final PgPreparedXacts PG_PREPARED_XACTS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPreparedXacts.PG_PREPARED_XACTS;

    /**
     * The table <code>pg_catalog.pg_proc</code>.
     */
    public final PgProc PG_PROC = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgProc.PG_PROC;

    /**
     * The table <code>pg_catalog.pg_publication</code>.
     */
    public final PgPublication PG_PUBLICATION = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPublication.PG_PUBLICATION;

    /**
     * The table <code>pg_catalog.pg_publication_rel</code>.
     */
    public final PgPublicationRel PG_PUBLICATION_REL = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPublicationRel.PG_PUBLICATION_REL;

    /**
     * The table <code>pg_catalog.pg_publication_tables</code>.
     */
    public final PgPublicationTables PG_PUBLICATION_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPublicationTables.PG_PUBLICATION_TABLES;

    /**
     * The table <code>pg_catalog.pg_range</code>.
     */
    public final PgRange PG_RANGE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgRange.PG_RANGE;

    /**
     * The table <code>pg_catalog.pg_replication_origin</code>.
     */
    public final PgReplicationOrigin PG_REPLICATION_ORIGIN = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgReplicationOrigin.PG_REPLICATION_ORIGIN;

    /**
     * The table <code>pg_catalog.pg_replication_origin_status</code>.
     */
    public final PgReplicationOriginStatus PG_REPLICATION_ORIGIN_STATUS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgReplicationOriginStatus.PG_REPLICATION_ORIGIN_STATUS;

    /**
     * The table <code>pg_catalog.pg_replication_slots</code>.
     */
    public final PgReplicationSlots PG_REPLICATION_SLOTS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgReplicationSlots.PG_REPLICATION_SLOTS;

    /**
     * The table <code>pg_catalog.pg_rewrite</code>.
     */
    public final PgRewrite PG_REWRITE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgRewrite.PG_REWRITE;

    /**
     * The table <code>pg_catalog.pg_roles</code>.
     */
    public final PgRoles PG_ROLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgRoles.PG_ROLES;

    /**
     * The table <code>pg_catalog.pg_rules</code>.
     */
    public final PgRules PG_RULES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgRules.PG_RULES;

    /**
     * The table <code>pg_catalog.pg_seclabel</code>.
     */
    public final PgSeclabel PG_SECLABEL = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSeclabel.PG_SECLABEL;

    /**
     * The table <code>pg_catalog.pg_seclabels</code>.
     */
    public final PgSeclabels PG_SECLABELS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSeclabels.PG_SECLABELS;

    /**
     * The table <code>pg_catalog.pg_sequence</code>.
     */
    public final PgSequence PG_SEQUENCE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSequence.PG_SEQUENCE;

    /**
     * The table <code>pg_catalog.pg_sequences</code>.
     */
    public final PgSequences PG_SEQUENCES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSequences.PG_SEQUENCES;

    /**
     * The table <code>pg_catalog.pg_settings</code>.
     */
    public final PgSettings PG_SETTINGS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSettings.PG_SETTINGS;

    /**
     * The table <code>pg_catalog.pg_shadow</code>.
     */
    public final PgShadow PG_SHADOW = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgShadow.PG_SHADOW;

    /**
     * The table <code>pg_catalog.pg_shdepend</code>.
     */
    public final PgShdepend PG_SHDEPEND = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgShdepend.PG_SHDEPEND;

    /**
     * The table <code>pg_catalog.pg_shdescription</code>.
     */
    public final PgShdescription PG_SHDESCRIPTION = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgShdescription.PG_SHDESCRIPTION;

    /**
     * The table <code>pg_catalog.pg_shseclabel</code>.
     */
    public final PgShseclabel PG_SHSECLABEL = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgShseclabel.PG_SHSECLABEL;

    /**
     * The table <code>pg_catalog.pg_stat_activity</code>.
     */
    public final PgStatActivity PG_STAT_ACTIVITY = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatActivity.PG_STAT_ACTIVITY;

    /**
     * The table <code>pg_catalog.pg_stat_all_indexes</code>.
     */
    public final PgStatAllIndexes PG_STAT_ALL_INDEXES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatAllIndexes.PG_STAT_ALL_INDEXES;

    /**
     * The table <code>pg_catalog.pg_stat_all_tables</code>.
     */
    public final PgStatAllTables PG_STAT_ALL_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatAllTables.PG_STAT_ALL_TABLES;

    /**
     * The table <code>pg_catalog.pg_stat_archiver</code>.
     */
    public final PgStatArchiver PG_STAT_ARCHIVER = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatArchiver.PG_STAT_ARCHIVER;

    /**
     * The table <code>pg_catalog.pg_stat_bgwriter</code>.
     */
    public final PgStatBgwriter PG_STAT_BGWRITER = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatBgwriter.PG_STAT_BGWRITER;

    /**
     * The table <code>pg_catalog.pg_stat_database</code>.
     */
    public final PgStatDatabase PG_STAT_DATABASE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatDatabase.PG_STAT_DATABASE;

    /**
     * The table <code>pg_catalog.pg_stat_database_conflicts</code>.
     */
    public final PgStatDatabaseConflicts PG_STAT_DATABASE_CONFLICTS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS;

    /**
     * The table <code>pg_catalog.pg_stat_progress_vacuum</code>.
     */
    public final PgStatProgressVacuum PG_STAT_PROGRESS_VACUUM = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM;

    /**
     * The table <code>pg_catalog.pg_stat_replication</code>.
     */
    public final PgStatReplication PG_STAT_REPLICATION = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatReplication.PG_STAT_REPLICATION;

    /**
     * The table <code>pg_catalog.pg_stat_ssl</code>.
     */
    public final PgStatSsl PG_STAT_SSL = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatSsl.PG_STAT_SSL;

    /**
     * The table <code>pg_catalog.pg_stat_subscription</code>.
     */
    public final PgStatSubscription PG_STAT_SUBSCRIPTION = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatSubscription.PG_STAT_SUBSCRIPTION;

    /**
     * The table <code>pg_catalog.pg_stat_sys_indexes</code>.
     */
    public final PgStatSysIndexes PG_STAT_SYS_INDEXES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatSysIndexes.PG_STAT_SYS_INDEXES;

    /**
     * The table <code>pg_catalog.pg_stat_sys_tables</code>.
     */
    public final PgStatSysTables PG_STAT_SYS_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatSysTables.PG_STAT_SYS_TABLES;

    /**
     * The table <code>pg_catalog.pg_stat_user_functions</code>.
     */
    public final PgStatUserFunctions PG_STAT_USER_FUNCTIONS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatUserFunctions.PG_STAT_USER_FUNCTIONS;

    /**
     * The table <code>pg_catalog.pg_stat_user_indexes</code>.
     */
    public final PgStatUserIndexes PG_STAT_USER_INDEXES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatUserIndexes.PG_STAT_USER_INDEXES;

    /**
     * The table <code>pg_catalog.pg_stat_user_tables</code>.
     */
    public final PgStatUserTables PG_STAT_USER_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatUserTables.PG_STAT_USER_TABLES;

    /**
     * The table <code>pg_catalog.pg_stat_wal_receiver</code>.
     */
    public final PgStatWalReceiver PG_STAT_WAL_RECEIVER = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatWalReceiver.PG_STAT_WAL_RECEIVER;

    /**
     * The table <code>pg_catalog.pg_stat_xact_all_tables</code>.
     */
    public final PgStatXactAllTables PG_STAT_XACT_ALL_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES;

    /**
     * The table <code>pg_catalog.pg_stat_xact_sys_tables</code>.
     */
    public final PgStatXactSysTables PG_STAT_XACT_SYS_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatXactSysTables.PG_STAT_XACT_SYS_TABLES;

    /**
     * The table <code>pg_catalog.pg_stat_xact_user_functions</code>.
     */
    public final PgStatXactUserFunctions PG_STAT_XACT_USER_FUNCTIONS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatXactUserFunctions.PG_STAT_XACT_USER_FUNCTIONS;

    /**
     * The table <code>pg_catalog.pg_stat_xact_user_tables</code>.
     */
    public final PgStatXactUserTables PG_STAT_XACT_USER_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatXactUserTables.PG_STAT_XACT_USER_TABLES;

    /**
     * The table <code>pg_catalog.pg_statio_all_indexes</code>.
     */
    public final PgStatioAllIndexes PG_STATIO_ALL_INDEXES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioAllIndexes.PG_STATIO_ALL_INDEXES;

    /**
     * The table <code>pg_catalog.pg_statio_all_sequences</code>.
     */
    public final PgStatioAllSequences PG_STATIO_ALL_SEQUENCES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES;

    /**
     * The table <code>pg_catalog.pg_statio_all_tables</code>.
     */
    public final PgStatioAllTables PG_STATIO_ALL_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioAllTables.PG_STATIO_ALL_TABLES;

    /**
     * The table <code>pg_catalog.pg_statio_sys_indexes</code>.
     */
    public final PgStatioSysIndexes PG_STATIO_SYS_INDEXES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioSysIndexes.PG_STATIO_SYS_INDEXES;

    /**
     * The table <code>pg_catalog.pg_statio_sys_sequences</code>.
     */
    public final PgStatioSysSequences PG_STATIO_SYS_SEQUENCES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioSysSequences.PG_STATIO_SYS_SEQUENCES;

    /**
     * The table <code>pg_catalog.pg_statio_sys_tables</code>.
     */
    public final PgStatioSysTables PG_STATIO_SYS_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioSysTables.PG_STATIO_SYS_TABLES;

    /**
     * The table <code>pg_catalog.pg_statio_user_indexes</code>.
     */
    public final PgStatioUserIndexes PG_STATIO_USER_INDEXES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioUserIndexes.PG_STATIO_USER_INDEXES;

    /**
     * The table <code>pg_catalog.pg_statio_user_sequences</code>.
     */
    public final PgStatioUserSequences PG_STATIO_USER_SEQUENCES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioUserSequences.PG_STATIO_USER_SEQUENCES;

    /**
     * The table <code>pg_catalog.pg_statio_user_tables</code>.
     */
    public final PgStatioUserTables PG_STATIO_USER_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioUserTables.PG_STATIO_USER_TABLES;

    /**
     * The table <code>pg_catalog.pg_statistic</code>.
     */
    public final PgStatistic PG_STATISTIC = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatistic.PG_STATISTIC;

    /**
     * The table <code>pg_catalog.pg_statistic_ext</code>.
     */
    public final PgStatisticExt PG_STATISTIC_EXT = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatisticExt.PG_STATISTIC_EXT;

    /**
     * The table <code>pg_catalog.pg_stats</code>.
     */
    public final PgStats PG_STATS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStats.PG_STATS;

    /**
     * The table <code>pg_catalog.pg_subscription</code>.
     */
    public final PgSubscription PG_SUBSCRIPTION = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSubscription.PG_SUBSCRIPTION;

    /**
     * The table <code>pg_catalog.pg_subscription_rel</code>.
     */
    public final PgSubscriptionRel PG_SUBSCRIPTION_REL = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgSubscriptionRel.PG_SUBSCRIPTION_REL;

    /**
     * The table <code>pg_catalog.pg_tables</code>.
     */
    public final PgTables PG_TABLES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTables.PG_TABLES;

    /**
     * The table <code>pg_catalog.pg_tablespace</code>.
     */
    public final PgTablespace PG_TABLESPACE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTablespace.PG_TABLESPACE;

    /**
     * The table <code>pg_catalog.pg_timezone_abbrevs</code>.
     */
    public final PgTimezoneAbbrevs PG_TIMEZONE_ABBREVS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS;

    /**
     * The table <code>pg_catalog.pg_timezone_names</code>.
     */
    public final PgTimezoneNames PG_TIMEZONE_NAMES = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTimezoneNames.PG_TIMEZONE_NAMES;

    /**
     * The table <code>pg_catalog.pg_transform</code>.
     */
    public final PgTransform PG_TRANSFORM = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTransform.PG_TRANSFORM;

    /**
     * The table <code>pg_catalog.pg_trigger</code>.
     */
    public final PgTrigger PG_TRIGGER = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTrigger.PG_TRIGGER;

    /**
     * The table <code>pg_catalog.pg_ts_config</code>.
     */
    public final PgTsConfig PG_TS_CONFIG = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsConfig.PG_TS_CONFIG;

    /**
     * The table <code>pg_catalog.pg_ts_config_map</code>.
     */
    public final PgTsConfigMap PG_TS_CONFIG_MAP = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsConfigMap.PG_TS_CONFIG_MAP;

    /**
     * The table <code>pg_catalog.pg_ts_dict</code>.
     */
    public final PgTsDict PG_TS_DICT = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsDict.PG_TS_DICT;

    /**
     * The table <code>pg_catalog.pg_ts_parser</code>.
     */
    public final PgTsParser PG_TS_PARSER = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsParser.PG_TS_PARSER;

    /**
     * The table <code>pg_catalog.pg_ts_template</code>.
     */
    public final PgTsTemplate PG_TS_TEMPLATE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsTemplate.PG_TS_TEMPLATE;

    /**
     * The table <code>pg_catalog.pg_type</code>.
     */
    public final PgType PG_TYPE = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgType.PG_TYPE;

    /**
     * The table <code>pg_catalog.pg_user</code>.
     */
    public final PgUser PG_USER = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgUser.PG_USER;

    /**
     * The table <code>pg_catalog.pg_user_mapping</code>.
     */
    public final PgUserMapping PG_USER_MAPPING = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgUserMapping.PG_USER_MAPPING;

    /**
     * The table <code>pg_catalog.pg_user_mappings</code>.
     */
    public final PgUserMappings PG_USER_MAPPINGS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgUserMappings.PG_USER_MAPPINGS;

    /**
     * The table <code>pg_catalog.pg_views</code>.
     */
    public final PgViews PG_VIEWS = com.nayanzin.springbootjooq.db.pg_catalog.tables.PgViews.PG_VIEWS;

    /**
     * No further instances allowed
     */
    private PgCatalog() {
        super("pg_catalog", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            PgAggregate.PG_AGGREGATE,
            PgAm.PG_AM,
            PgAmop.PG_AMOP,
            PgAmproc.PG_AMPROC,
            PgAttrdef.PG_ATTRDEF,
            PgAttribute.PG_ATTRIBUTE,
            PgAuthMembers.PG_AUTH_MEMBERS,
            PgAuthid.PG_AUTHID,
            PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS,
            PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS,
            PgCast.PG_CAST,
            PgClass.PG_CLASS,
            PgCollation.PG_COLLATION,
            PgConfig.PG_CONFIG,
            PgConstraint.PG_CONSTRAINT,
            PgConversion.PG_CONVERSION,
            PgCursors.PG_CURSORS,
            PgDatabase.PG_DATABASE,
            PgDbRoleSetting.PG_DB_ROLE_SETTING,
            PgDefaultAcl.PG_DEFAULT_ACL,
            PgDepend.PG_DEPEND,
            PgDescription.PG_DESCRIPTION,
            PgEnum.PG_ENUM,
            PgEventTrigger.PG_EVENT_TRIGGER,
            PgExtension.PG_EXTENSION,
            PgFileSettings.PG_FILE_SETTINGS,
            PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER,
            PgForeignServer.PG_FOREIGN_SERVER,
            PgForeignTable.PG_FOREIGN_TABLE,
            PgGroup.PG_GROUP,
            PgHbaFileRules.PG_HBA_FILE_RULES,
            PgIndex.PG_INDEX,
            PgIndexes.PG_INDEXES,
            PgInherits.PG_INHERITS,
            PgInitPrivs.PG_INIT_PRIVS,
            PgLanguage.PG_LANGUAGE,
            PgLargeobject.PG_LARGEOBJECT,
            PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA,
            PgLocks.PG_LOCKS,
            PgMatviews.PG_MATVIEWS,
            PgNamespace.PG_NAMESPACE,
            PgOpclass.PG_OPCLASS,
            PgOperator.PG_OPERATOR,
            PgOpfamily.PG_OPFAMILY,
            PgPartitionedTable.PG_PARTITIONED_TABLE,
            PgPltemplate.PG_PLTEMPLATE,
            PgPolicies.PG_POLICIES,
            PgPolicy.PG_POLICY,
            PgPreparedStatements.PG_PREPARED_STATEMENTS,
            PgPreparedXacts.PG_PREPARED_XACTS,
            PgProc.PG_PROC,
            PgPublication.PG_PUBLICATION,
            PgPublicationRel.PG_PUBLICATION_REL,
            PgPublicationTables.PG_PUBLICATION_TABLES,
            PgRange.PG_RANGE,
            PgReplicationOrigin.PG_REPLICATION_ORIGIN,
            PgReplicationOriginStatus.PG_REPLICATION_ORIGIN_STATUS,
            PgReplicationSlots.PG_REPLICATION_SLOTS,
            PgRewrite.PG_REWRITE,
            PgRoles.PG_ROLES,
            PgRules.PG_RULES,
            PgSeclabel.PG_SECLABEL,
            PgSeclabels.PG_SECLABELS,
            PgSequence.PG_SEQUENCE,
            PgSequences.PG_SEQUENCES,
            PgSettings.PG_SETTINGS,
            PgShadow.PG_SHADOW,
            PgShdepend.PG_SHDEPEND,
            PgShdescription.PG_SHDESCRIPTION,
            PgShseclabel.PG_SHSECLABEL,
            PgStatActivity.PG_STAT_ACTIVITY,
            PgStatAllIndexes.PG_STAT_ALL_INDEXES,
            PgStatAllTables.PG_STAT_ALL_TABLES,
            PgStatArchiver.PG_STAT_ARCHIVER,
            PgStatBgwriter.PG_STAT_BGWRITER,
            PgStatDatabase.PG_STAT_DATABASE,
            PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS,
            PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM,
            PgStatReplication.PG_STAT_REPLICATION,
            PgStatSsl.PG_STAT_SSL,
            PgStatSubscription.PG_STAT_SUBSCRIPTION,
            PgStatSysIndexes.PG_STAT_SYS_INDEXES,
            PgStatSysTables.PG_STAT_SYS_TABLES,
            PgStatUserFunctions.PG_STAT_USER_FUNCTIONS,
            PgStatUserIndexes.PG_STAT_USER_INDEXES,
            PgStatUserTables.PG_STAT_USER_TABLES,
            PgStatWalReceiver.PG_STAT_WAL_RECEIVER,
            PgStatXactAllTables.PG_STAT_XACT_ALL_TABLES,
            PgStatXactSysTables.PG_STAT_XACT_SYS_TABLES,
            PgStatXactUserFunctions.PG_STAT_XACT_USER_FUNCTIONS,
            PgStatXactUserTables.PG_STAT_XACT_USER_TABLES,
            PgStatioAllIndexes.PG_STATIO_ALL_INDEXES,
            PgStatioAllSequences.PG_STATIO_ALL_SEQUENCES,
            PgStatioAllTables.PG_STATIO_ALL_TABLES,
            PgStatioSysIndexes.PG_STATIO_SYS_INDEXES,
            PgStatioSysSequences.PG_STATIO_SYS_SEQUENCES,
            PgStatioSysTables.PG_STATIO_SYS_TABLES,
            PgStatioUserIndexes.PG_STATIO_USER_INDEXES,
            PgStatioUserSequences.PG_STATIO_USER_SEQUENCES,
            PgStatioUserTables.PG_STATIO_USER_TABLES,
            PgStatistic.PG_STATISTIC,
            PgStatisticExt.PG_STATISTIC_EXT,
            PgStats.PG_STATS,
            PgSubscription.PG_SUBSCRIPTION,
            PgSubscriptionRel.PG_SUBSCRIPTION_REL,
            PgTables.PG_TABLES,
            PgTablespace.PG_TABLESPACE,
            PgTimezoneAbbrevs.PG_TIMEZONE_ABBREVS,
            PgTimezoneNames.PG_TIMEZONE_NAMES,
            PgTransform.PG_TRANSFORM,
            PgTrigger.PG_TRIGGER,
            PgTsConfig.PG_TS_CONFIG,
            PgTsConfigMap.PG_TS_CONFIG_MAP,
            PgTsDict.PG_TS_DICT,
            PgTsParser.PG_TS_PARSER,
            PgTsTemplate.PG_TS_TEMPLATE,
            PgType.PG_TYPE,
            PgUser.PG_USER,
            PgUserMapping.PG_USER_MAPPING,
            PgUserMappings.PG_USER_MAPPINGS,
            PgViews.PG_VIEWS);
    }
}
