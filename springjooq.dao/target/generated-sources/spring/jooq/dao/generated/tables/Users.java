/**
 * This class is generated by jOOQ
 */
package spring.jooq.dao.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends org.jooq.impl.TableImpl<spring.jooq.dao.generated.tables.records.UsersRecord> {

	private static final long serialVersionUID = -2064983986;

	/**
	 * The singleton instance of <code>user_mgmt.users</code>
	 */
	public static final spring.jooq.dao.generated.tables.Users USERS = new spring.jooq.dao.generated.tables.Users();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<spring.jooq.dao.generated.tables.records.UsersRecord> getRecordType() {
		return spring.jooq.dao.generated.tables.records.UsersRecord.class;
	}

	/**
	 * The column <code>user_mgmt.users.id</code>.
	 */
	public final org.jooq.TableField<spring.jooq.dao.generated.tables.records.UsersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>user_mgmt.users.username</code>.
	 */
	public final org.jooq.TableField<spring.jooq.dao.generated.tables.records.UsersRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

	/**
	 * The column <code>user_mgmt.users.password</code>.
	 */
	public final org.jooq.TableField<spring.jooq.dao.generated.tables.records.UsersRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

	/**
	 * The column <code>user_mgmt.users.email</code>.
	 */
	public final org.jooq.TableField<spring.jooq.dao.generated.tables.records.UsersRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>user_mgmt.users.address_id</code>.
	 */
	public final org.jooq.TableField<spring.jooq.dao.generated.tables.records.UsersRecord, java.lang.Integer> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>user_mgmt.users</code> table reference
	 */
	public Users() {
		this("users", null);
	}

	/**
	 * Create an aliased <code>user_mgmt.users</code> table reference
	 */
	public Users(java.lang.String alias) {
		this(alias, spring.jooq.dao.generated.tables.Users.USERS);
	}

	private Users(java.lang.String alias, org.jooq.Table<spring.jooq.dao.generated.tables.records.UsersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Users(java.lang.String alias, org.jooq.Table<spring.jooq.dao.generated.tables.records.UsersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, spring.jooq.dao.generated.UserMgmt.USER_MGMT, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<spring.jooq.dao.generated.tables.records.UsersRecord, java.lang.Integer> getIdentity() {
		return spring.jooq.dao.generated.Keys.IDENTITY_USERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<spring.jooq.dao.generated.tables.records.UsersRecord> getPrimaryKey() {
		return spring.jooq.dao.generated.Keys.KEY_USERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<spring.jooq.dao.generated.tables.records.UsersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<spring.jooq.dao.generated.tables.records.UsersRecord>>asList(spring.jooq.dao.generated.Keys.KEY_USERS_PRIMARY, spring.jooq.dao.generated.Keys.KEY_USERS_USERNAME_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<spring.jooq.dao.generated.tables.records.UsersRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<spring.jooq.dao.generated.tables.records.UsersRecord, ?>>asList(spring.jooq.dao.generated.Keys.ADDFK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public spring.jooq.dao.generated.tables.Users as(java.lang.String alias) {
		return new spring.jooq.dao.generated.tables.Users(alias, this);
	}

	/**
	 * Rename this table
	 */
	public spring.jooq.dao.generated.tables.Users rename(java.lang.String name) {
		return new spring.jooq.dao.generated.tables.Users(name, null);
	}
}
