package model.vo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 19 12:50:14 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PAYROLL_LINES_VORowImpl extends ViewRowImpl {

    public static final int ENTITY_PAYROLL_LINES_EO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CreatedBy,
        CreationDate,
        EmployeeId,
        EmployeeName,
        EmployeeNumber,
        IncentiveRate,
        LastUpdateDate,
        LastUpdateLogin,
        LastUpdatedBy,
        OverTimeRate,
        PayrollHdrId,
        PayrollLineId,
        RegularRate,
        SubcontractRate,
        TotalRate;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int EMPLOYEENAME = AttributesEnum.EmployeeName.index();
    public static final int EMPLOYEENUMBER = AttributesEnum.EmployeeNumber.index();
    public static final int INCENTIVERATE = AttributesEnum.IncentiveRate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OVERTIMERATE = AttributesEnum.OverTimeRate.index();
    public static final int PAYROLLHDRID = AttributesEnum.PayrollHdrId.index();
    public static final int PAYROLLLINEID = AttributesEnum.PayrollLineId.index();
    public static final int REGULARRATE = AttributesEnum.RegularRate.index();
    public static final int SUBCONTRACTRATE = AttributesEnum.SubcontractRate.index();
    public static final int TOTALRATE = AttributesEnum.TotalRate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PAYROLL_LINES_VORowImpl() {
    }

    /**
     * Gets PAYROLL_LINES_EO entity object.
     * @return the PAYROLL_LINES_EO
     */
    public EntityImpl getPAYROLL_LINES_EO() {
        return (EntityImpl) getEntity(ENTITY_PAYROLL_LINES_EO);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @return the EMPLOYEE_ID
     */
    public BigDecimal getEmployeeId() {
        return (BigDecimal) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @param value value to set the EMPLOYEE_ID
     */
    public void setEmployeeId(BigDecimal value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for EMPLOYEE_NAME using the alias name EmployeeName.
     * @return the EMPLOYEE_NAME
     */
    public String getEmployeeName() {
        return (String) getAttributeInternal(EMPLOYEENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_NAME using the alias name EmployeeName.
     * @param value value to set the EMPLOYEE_NAME
     */
    public void setEmployeeName(String value) {
        setAttributeInternal(EMPLOYEENAME, value);
    }

    /**
     * Gets the attribute value for EMPLOYEE_NUMBER using the alias name EmployeeNumber.
     * @return the EMPLOYEE_NUMBER
     */
    public String getEmployeeNumber() {
        return (String) getAttributeInternal(EMPLOYEENUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_NUMBER using the alias name EmployeeNumber.
     * @param value value to set the EMPLOYEE_NUMBER
     */
    public void setEmployeeNumber(String value) {
        setAttributeInternal(EMPLOYEENUMBER, value);
    }

    /**
     * Gets the attribute value for INCENTIVE_RATE using the alias name IncentiveRate.
     * @return the INCENTIVE_RATE
     */
    public BigDecimal getIncentiveRate() {
        return (BigDecimal) getAttributeInternal(INCENTIVERATE);
    }

    /**
     * Sets <code>value</code> as attribute value for INCENTIVE_RATE using the alias name IncentiveRate.
     * @param value value to set the INCENTIVE_RATE
     */
    public void setIncentiveRate(BigDecimal value) {
        setAttributeInternal(INCENTIVERATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for OVER_TIME_RATE using the alias name OverTimeRate.
     * @return the OVER_TIME_RATE
     */
    public BigDecimal getOverTimeRate() {
        return (BigDecimal) getAttributeInternal(OVERTIMERATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OVER_TIME_RATE using the alias name OverTimeRate.
     * @param value value to set the OVER_TIME_RATE
     */
    public void setOverTimeRate(BigDecimal value) {
        setAttributeInternal(OVERTIMERATE, value);
    }

    /**
     * Gets the attribute value for PAYROLL_HDR_ID using the alias name PayrollHdrId.
     * @return the PAYROLL_HDR_ID
     */
    public BigDecimal getPayrollHdrId() {
        return (BigDecimal) getAttributeInternal(PAYROLLHDRID);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYROLL_HDR_ID using the alias name PayrollHdrId.
     * @param value value to set the PAYROLL_HDR_ID
     */
    public void setPayrollHdrId(BigDecimal value) {
        setAttributeInternal(PAYROLLHDRID, value);
    }

    /**
     * Gets the attribute value for PAYROLL_LINE_ID using the alias name PayrollLineId.
     * @return the PAYROLL_LINE_ID
     */
    public BigDecimal getPayrollLineId() {
        return (BigDecimal) getAttributeInternal(PAYROLLLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYROLL_LINE_ID using the alias name PayrollLineId.
     * @param value value to set the PAYROLL_LINE_ID
     */
    public void setPayrollLineId(BigDecimal value) {
        setAttributeInternal(PAYROLLLINEID, value);
    }

    /**
     * Gets the attribute value for REGULAR_RATE using the alias name RegularRate.
     * @return the REGULAR_RATE
     */
    public BigDecimal getRegularRate() {
        return (BigDecimal) getAttributeInternal(REGULARRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for REGULAR_RATE using the alias name RegularRate.
     * @param value value to set the REGULAR_RATE
     */
    public void setRegularRate(BigDecimal value) {
        setAttributeInternal(REGULARRATE, value);
    }

    /**
     * Gets the attribute value for SUBCONTRACT_RATE using the alias name SubcontractRate.
     * @return the SUBCONTRACT_RATE
     */
    public BigDecimal getSubcontractRate() {
        return (BigDecimal) getAttributeInternal(SUBCONTRACTRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBCONTRACT_RATE using the alias name SubcontractRate.
     * @param value value to set the SUBCONTRACT_RATE
     */
    public void setSubcontractRate(BigDecimal value) {
        setAttributeInternal(SUBCONTRACTRATE, value);
    }

    /**
     * Gets the attribute value for TOTAL_RATE using the alias name TotalRate.
     * @return the TOTAL_RATE
     */
    public BigDecimal getTotalRate() {
        return (BigDecimal) getAttributeInternal(TOTALRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TOTAL_RATE using the alias name TotalRate.
     * @param value value to set the TOTAL_RATE
     */
    public void setTotalRate(BigDecimal value) {
        setAttributeInternal(TOTALRATE, value);
    }


}
