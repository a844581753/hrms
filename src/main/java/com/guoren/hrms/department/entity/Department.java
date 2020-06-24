package com.guoren.hrms.department.entity;

import java.util.List;

//部门表
public class Department {
	// 部门id
	private Integer deptId;
	// 部门名称
	private String deptName;
	// 部门负责人
	private String deptLead;
	// 部门性质
	private String deptNature;
	// 隶属关系
	private String membershipFunction;
	// 单位级别
	private String deptRank;
	// 所属行业
	private String industryInvolved;
	// 附属关系
	private String affiliation;
	// 经济类型
	private String economicType;
	// 部门经费来源
	private String financialResources;
	// 事业单位管理方式
	private String managementModeOfPublicInstitution;
	// 部门所在国家
	private String homeCountry;
	// 部门所在地
	private String homeCity;
	// 部门地址
	private String deptAddress;
	// 邮政编码
	private String postalCode;
	// 部门电话号码
	private String phoneNumber;
	// 部门传真号
	private String faxNumber;
	// 上级部门id
	private Integer deptParentId;
	// 部门状态
	private Integer deptState;
	// 查询所有部门集合树
	private List<Department> departmentChildren;
	// 分页
	private int pageNum;
	private int pageSize;

	public Department(Integer deptId, String deptName, String deptLead, String deptNature, String membershipFunction,
			String deptRank, String industryInvolved, String affiliation, String economicType,
			String financialResources, String managementModeOfPublicInstitution, String homeCountry, String homeCity,
			String deptAddress, String postalCode, String phoneNumber, String faxNumber, Integer deptParentId,
			Integer deptState, List<Department> departmentChildren, int pageNum, int pageSize) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLead = deptLead;
		this.deptNature = deptNature;
		this.membershipFunction = membershipFunction;
		this.deptRank = deptRank;
		this.industryInvolved = industryInvolved;
		this.affiliation = affiliation;
		this.economicType = economicType;
		this.financialResources = financialResources;
		this.managementModeOfPublicInstitution = managementModeOfPublicInstitution;
		this.homeCountry = homeCountry;
		this.homeCity = homeCity;
		this.deptAddress = deptAddress;
		this.postalCode = postalCode;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.deptParentId = deptParentId;
		this.deptState = deptState;
		this.departmentChildren = departmentChildren;
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public Department() {
		super();
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLead() {
		return deptLead;
	}

	public void setDeptLead(String deptLead) {
		this.deptLead = deptLead;
	}

	public String getDeptNature() {
		return deptNature;
	}

	public void setDeptNature(String deptNature) {
		this.deptNature = deptNature;
	}

	public String getMembershipFunction() {
		return membershipFunction;
	}

	public void setMembershipFunction(String membershipFunction) {
		this.membershipFunction = membershipFunction;
	}

	public String getDeptRank() {
		return deptRank;
	}

	public void setDeptRank(String deptRank) {
		this.deptRank = deptRank;
	}

	public String getIndustryInvolved() {
		return industryInvolved;
	}

	public void setIndustryInvolved(String industryInvolved) {
		this.industryInvolved = industryInvolved;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getEconomicType() {
		return economicType;
	}

	public void setEconomicType(String economicType) {
		this.economicType = economicType;
	}

	public String getFinancialResources() {
		return financialResources;
	}

	public void setFinancialResources(String financialResources) {
		this.financialResources = financialResources;
	}

	public String getManagementModeOfPublicInstitution() {
		return managementModeOfPublicInstitution;
	}

	public void setManagementModeOfPublicInstitution(String managementModeOfPublicInstitution) {
		this.managementModeOfPublicInstitution = managementModeOfPublicInstitution;
	}

	public String getHomeCountry() {
		return homeCountry;
	}

	public void setHomeCountry(String homeCountry) {
		this.homeCountry = homeCountry;
	}

	public String getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}

	public String getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public Integer getDeptParentId() {
		return deptParentId;
	}

	public void setDeptParentId(Integer deptParentId) {
		this.deptParentId = deptParentId;
	}

	public Integer getDeptState() {
		return deptState;
	}

	public void setDeptState(Integer deptState) {
		this.deptState = deptState;
	}

	public List<Department> getDepartmentChildren() {
		return departmentChildren;
	}

	public void setDepartmentChildren(List<Department> departmentChildren) {
		this.departmentChildren = departmentChildren;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
