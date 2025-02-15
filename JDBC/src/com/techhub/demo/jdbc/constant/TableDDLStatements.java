package com.techhub.demo.jdbc.constant;

/**
 * The TableDDLStatements class
 * 
 * @author ramniwash
 *
 */
public class TableDDLStatements {

	/** Private constructor to avoid object creation */
	private TableDDLStatements() {
	}

	/** The SUPPLIERS_TABLE_DDL */
	public static final String SUPPLIERS_TABLE_CREATE_DDL = "CREATE TABLE IF NOT EXISTS SUPPLIERS (SUP_ID INTEGER NOT NULL, SUP_NAME VARCHAR(40) NOT NULL, STREET VARCHAR(40) NOT NULL, CITY VARCHAR(20) NOT NULL, STATE CHAR(2) NOT NULL, ZIP CHAR(5), PRIMARY KEY (SUP_ID));";

	/** The COFFEES_TABLE_DDL */
	public static final String COFFEES_TABLE_CREATE_DDL = "CREATE TABLE IF NOT EXISTS COFFEES(COF_NAME VARCHAR(32) NOT NULL, SUP_ID INT NOT NULL, PRICE NUMERIC(10,2) NOT NULL, SALES INTEGER NOT NULL,TOTAL INTEGER NOT NULL,PRIMARY KEY (COF_NAME),FOREIGN KEY (SUP_ID) REFERENCES SUPPLIERS (SUP_ID));";

	/** The COF_INVENTORY_TABLE_DDL */
	public static final String COF_INVENTORY_TABLE_CREATE_DDL = "CREATE TABLE IF NOT EXISTS COF_INVENTORY(WAREHOUSE_ID INTEGER NOT NULL,COF_NAME VARCHAR(40) NOT NULL,SUP_ID INT NOT NULL,QUAN INT NOT NULL, DATE_VAL DATE NOT NULL, FOREIGN KEY(SUP_ID) REFERENCES SUPPLIERS(SUP_ID));";

	/** The MERCH_INVENTORY_TABLE_DDL */
	public static final String MERCH_INVENTORY_TABLE_CREATE_DDL = "CREATE TABLE IF NOT EXISTS MERCH_INVENTORY(ITEM_ID INTEGER NOT NULL, ITEM_NAME VARCHAR(40) NOT NULL, SUP_ID INT NOT NULL, QUAN INT  NOT NULL, DATE DATE NOT NULL, PRIMARY KEY (ITEM_ID), FOREIGN KEY (SUP_ID) REFERENCES SUPPLIERS (SUP_ID));";

	/** The COFFEE_HOUSES_TABLE_DDL */
	public static final String COFFEE_HOUSES_TABLE_CREATE_DDL = "CREATE TABLE IF NOT EXISTS COFFEE_HOUSES(STORE_ID INTEGER NOT NULL, CITY VARCHAR(40) NOT NULL, COFFEE INT NOT NULL, MERCH INT NOT NULL, TOTAL INT NOT NULL, PRIMARY KEY (STORE_ID));";

	/** The CUSTOMER_TABLE_CREATE_DDL */
	public static final String CUSTOMER_TABLE_CREATE_DDL = "CREATE TABLE IF NOT EXISTS CUSTOMER(CUSTOMER_ID INTEGER AUTO_INCREMENT, CUSTOMER_NAME VARCHAR(40) NOT NULL, CUSTOMER_ACCOUNT_NUMBER INTEGER NOT NULL, ACCOUNT_BALANCE DOUBLE NOT NULL, PRIMARY KEY (CUSTOMER_ID));";

	/** The USER_TABLE_CREATE_DDL */
	public static final String USER_TABLE_CREATE_DDL = "CREATE TABLE IF NOT EXISTS USER(USER_ID INTEGER AUTO_INCREMENT,USER_NAME VARCHAR(40) NOT NULL,USER_DOB DATE NOT NULL, PROFILE_IMAGE LONGBLOB NULL, PRIMARY KEY (USER_ID));";
	
	/** The SUPPLIERS_TABLE_DROP_DDL */
	public static final String SUPPLIERS_TABLE_DROP_DDL = "DROP TABLE IF EXISTS SUPPLIERS";

	/** The COFFEES_TABLE_DROP_DDL */
	public static final String COFFEES_TABLE_DROP_DDL = "DROP TABLE IF EXISTS COFFEES";

	/** The COF_INVENTORY_TABLE_DROP_DDL */
	public static final String COF_INVENTORY_TABLE_DROP_DDL = "DROP TABLE IF EXISTS COF_INVENTORY";

	/** The MERCH_INVENTORY_TABLE_DROP_DDL */
	public static final String MERCH_INVENTORY_TABLE_DROP_DDL = "DROP TABLE IF EXISTS MERCH_INVENTORY";

	/** The COFFEE_HOUSES_TABLE_DROP_DDL */
	public static final String COFFEE_HOUSES_TABLE_DROP_DDL = "DROP TABLE IF EXISTS COFFEE_HOUSES";

	/** The COFFEE_HOUSES_TABLE_DROP_DDL */
	public static final String CUSTOMER_TABLE_DROP_DDL = "DROP TABLE IF EXISTS CUSTOMER";
	
	/** The COFFEE_HOUSES_TABLE_DROP_DDL */
	public static final String USER_TABLE_DROP_DDL = "DROP TABLE IF EXISTS USER";
}