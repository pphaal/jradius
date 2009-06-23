package net.jradius.dal.model;

import com.coova.dal.Example;
import com.coova.dal.ExampleCriteria;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadGroupReplyExample extends Example {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    protected String groupByClause;

    protected Integer startRow;

    protected Integer rowCount;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public RadGroupReplyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    protected RadGroupReplyExample(RadGroupReplyExample example) {
        this.orderByClause = example.orderByClause;
        this.groupByClause = example.groupByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public void setGroupByClause(String groupByClause) {
        this.groupByClause = groupByClause;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public String getGroupByClause() {
        return groupByClause;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public Criteria appendCriteria() {
        if (oredCriteria.size() == 0) {
            return createCriteria();
        }
        return oredCriteria.get(0);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table radgroupreply
     *
     * @abatorgenerated Mon May 04 09:56:56 CEST 2009
     */
    public static class Criteria extends ExampleCriteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("groupname is null");
            return this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupname is not null");
            return this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupname =", value, "groupname");
            return this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupname <>", value, "groupname");
            return this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupname >", value, "groupname");
            return this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupname >=", value, "groupname");
            return this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupname <", value, "groupname");
            return this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupname <=", value, "groupname");
            return this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupname like", value, "groupname");
            return this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupname not like", value, "groupname");
            return this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupname in", values, "groupname");
            return this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupname not in", values, "groupname");
            return this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupname between", value1, value2, "groupname");
            return this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupname not between", value1, value2, "groupname");
            return this;
        }

        public Criteria andAttributeIsNull() {
            addCriterion("attribute is null");
            return this;
        }

        public Criteria andAttributeIsNotNull() {
            addCriterion("attribute is not null");
            return this;
        }

        public Criteria andAttributeEqualTo(String value) {
            addCriterion("attribute =", value, "attribute");
            return this;
        }

        public Criteria andAttributeNotEqualTo(String value) {
            addCriterion("attribute <>", value, "attribute");
            return this;
        }

        public Criteria andAttributeGreaterThan(String value) {
            addCriterion("attribute >", value, "attribute");
            return this;
        }

        public Criteria andAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("attribute >=", value, "attribute");
            return this;
        }

        public Criteria andAttributeLessThan(String value) {
            addCriterion("attribute <", value, "attribute");
            return this;
        }

        public Criteria andAttributeLessThanOrEqualTo(String value) {
            addCriterion("attribute <=", value, "attribute");
            return this;
        }

        public Criteria andAttributeLike(String value) {
            addCriterion("attribute like", value, "attribute");
            return this;
        }

        public Criteria andAttributeNotLike(String value) {
            addCriterion("attribute not like", value, "attribute");
            return this;
        }

        public Criteria andAttributeIn(List<String> values) {
            addCriterion("attribute in", values, "attribute");
            return this;
        }

        public Criteria andAttributeNotIn(List<String> values) {
            addCriterion("attribute not in", values, "attribute");
            return this;
        }

        public Criteria andAttributeBetween(String value1, String value2) {
            addCriterion("attribute between", value1, value2, "attribute");
            return this;
        }

        public Criteria andAttributeNotBetween(String value1, String value2) {
            addCriterion("attribute not between", value1, value2, "attribute");
            return this;
        }

        public Criteria andOpIsNull() {
            addCriterion("op is null");
            return this;
        }

        public Criteria andOpIsNotNull() {
            addCriterion("op is not null");
            return this;
        }

        public Criteria andOpEqualTo(String value) {
            addCriterion("op =", value, "op");
            return this;
        }

        public Criteria andOpNotEqualTo(String value) {
            addCriterion("op <>", value, "op");
            return this;
        }

        public Criteria andOpGreaterThan(String value) {
            addCriterion("op >", value, "op");
            return this;
        }

        public Criteria andOpGreaterThanOrEqualTo(String value) {
            addCriterion("op >=", value, "op");
            return this;
        }

        public Criteria andOpLessThan(String value) {
            addCriterion("op <", value, "op");
            return this;
        }

        public Criteria andOpLessThanOrEqualTo(String value) {
            addCriterion("op <=", value, "op");
            return this;
        }

        public Criteria andOpLike(String value) {
            addCriterion("op like", value, "op");
            return this;
        }

        public Criteria andOpNotLike(String value) {
            addCriterion("op not like", value, "op");
            return this;
        }

        public Criteria andOpIn(List<String> values) {
            addCriterion("op in", values, "op");
            return this;
        }

        public Criteria andOpNotIn(List<String> values) {
            addCriterion("op not in", values, "op");
            return this;
        }

        public Criteria andOpBetween(String value1, String value2) {
            addCriterion("op between", value1, value2, "op");
            return this;
        }

        public Criteria andOpNotBetween(String value1, String value2) {
            addCriterion("op not between", value1, value2, "op");
            return this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return this;
        }
    }
}