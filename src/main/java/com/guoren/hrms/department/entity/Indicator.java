package com.guoren.hrms.department.entity;

//部门下-科室指标使用表
public class Indicator {
	// 科室指标使用-id
	private Integer id;
	// 科室指标使用-年份
	private String year;
	// 科室指标使用-月份
	private String month;
	// 科室指标使用-床位数
	private Integer bedAmount;
	// 科室指标使用-医生目标数
	private Integer doctorTargetAmount;
	// 科室指标使用-护士目标数
	private Integer nurseTargetAmount;
	// 科室指标使用-其它目标数
	private Integer otherTargetAmount;
	// 科室指标使用-目标总数
	private Integer targetSum;
	// 科室指标使用-医生实际数
	private Integer doctorRealityAmount;
	// 科室指标使用-护士实际数
	private Integer nurseRealityAmount;
	// 科室指标使用-其它实际数
	private Integer otherRealityAmount;
	// 科室指标使用-实际总数
	private Integer realitySum;
	// 科室指标使用-医生结余数
	private Integer doctorSurplusAmount;
	// 科室指标使用-护士结余数
	private Integer nurseSurplusAmount;
	// 科室指标使用-其它结余数
	private Integer otherSurplusAmount;
	// 科室指标使用-结余总数
	private Integer surplusSum;
	// 科室指标使用-备注1
	private String remarkOne;
	// 科室指标使用-备注2
	private String remarkTwo;
	// 科室指标使用状态：1-存在 0-删除
	private Integer state;
	// 科室指标使用-所属部门id
	private Integer belongToDeptId;
	// 分页
	private int pageNum;
	private int pageSize;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Integer getBedAmount() {
		return bedAmount;
	}

	public void setBedAmount(Integer bedAmount) {
		this.bedAmount = bedAmount;
	}

	public Integer getDoctorTargetAmount() {
		return doctorTargetAmount;
	}

	public void setDoctorTargetAmount(Integer doctorTargetAmount) {
		this.doctorTargetAmount = doctorTargetAmount;
	}

	public Integer getNurseTargetAmount() {
		return nurseTargetAmount;
	}

	public void setNurseTargetAmount(Integer nurseTargetAmount) {
		this.nurseTargetAmount = nurseTargetAmount;
	}

	public Integer getOtherTargetAmount() {
		return otherTargetAmount;
	}

	public void setOtherTargetAmount(Integer otherTargetAmount) {
		this.otherTargetAmount = otherTargetAmount;
	}

	public Integer getTargetSum() {
		return targetSum;
	}

	public void setTargetSum(Integer targetSum) {
		this.targetSum = targetSum;
	}

	public Integer getDoctorRealityAmount() {
		return doctorRealityAmount;
	}

	public void setDoctorRealityAmount(Integer doctorRealityAmount) {
		this.doctorRealityAmount = doctorRealityAmount;
	}

	public Integer getNurseRealityAmount() {
		return nurseRealityAmount;
	}

	public void setNurseRealityAmount(Integer nurseRealityAmount) {
		this.nurseRealityAmount = nurseRealityAmount;
	}

	public Integer getOtherRealityAmount() {
		return otherRealityAmount;
	}

	public void setOtherRealityAmount(Integer otherRealityAmount) {
		this.otherRealityAmount = otherRealityAmount;
	}

	public Integer getRealitySum() {
		return realitySum;
	}

	public void setRealitySum(Integer realitySum) {
		this.realitySum = realitySum;
	}

	public Integer getDoctorSurplusAmount() {
		return doctorSurplusAmount;
	}

	public void setDoctorSurplusAmount(Integer doctorSurplusAmount) {
		this.doctorSurplusAmount = doctorSurplusAmount;
	}

	public Integer getNurseSurplusAmount() {
		return nurseSurplusAmount;
	}

	public void setNurseSurplusAmount(Integer nurseSurplusAmount) {
		this.nurseSurplusAmount = nurseSurplusAmount;
	}

	public Integer getOtherSurplusAmount() {
		return otherSurplusAmount;
	}

	public void setOtherSurplusAmount(Integer otherSurplusAmount) {
		this.otherSurplusAmount = otherSurplusAmount;
	}

	public Integer getSurplusSum() {
		return surplusSum;
	}

	public void setSurplusSum(Integer surplusSum) {
		this.surplusSum = surplusSum;
	}

	public String getRemarkOne() {
		return remarkOne;
	}

	public void setRemarkOne(String remarkOne) {
		this.remarkOne = remarkOne;
	}

	public String getRemarkTwo() {
		return remarkTwo;
	}

	public void setRemarkTwo(String remarkTwo) {
		this.remarkTwo = remarkTwo;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getBelongToDeptId() {
		return belongToDeptId;
	}

	public void setBelongToDeptId(Integer belongToDeptId) {
		this.belongToDeptId = belongToDeptId;
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

	public Indicator(Integer id, String year, String month, Integer bedAmount, Integer doctorTargetAmount,
			Integer nurseTargetAmount, Integer otherTargetAmount, Integer targetSum, Integer doctorRealityAmount,
			Integer nurseRealityAmount, Integer otherRealityAmount, Integer realitySum, Integer doctorSurplusAmount,
			Integer nurseSurplusAmount, Integer otherSurplusAmount, Integer surplusSum, String remarkOne,
			String remarkTwo, Integer state, Integer belongToDeptId, int pageNum, int pageSize) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.bedAmount = bedAmount;
		this.doctorTargetAmount = doctorTargetAmount;
		this.nurseTargetAmount = nurseTargetAmount;
		this.otherTargetAmount = otherTargetAmount;
		this.targetSum = targetSum;
		this.doctorRealityAmount = doctorRealityAmount;
		this.nurseRealityAmount = nurseRealityAmount;
		this.otherRealityAmount = otherRealityAmount;
		this.realitySum = realitySum;
		this.doctorSurplusAmount = doctorSurplusAmount;
		this.nurseSurplusAmount = nurseSurplusAmount;
		this.otherSurplusAmount = otherSurplusAmount;
		this.surplusSum = surplusSum;
		this.remarkOne = remarkOne;
		this.remarkTwo = remarkTwo;
		this.state = state;
		this.belongToDeptId = belongToDeptId;
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public Indicator() {
		super();
	}

}
