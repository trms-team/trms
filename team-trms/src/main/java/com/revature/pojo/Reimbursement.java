package com.revature.pojo;

import java.time.LocalDateTime;

public class Reimbursement {
	public enum EventType {
		UNIVERSITY_COURSE, SEMINAR, CERTIFICATION_PREP_CLASS, CERTIFICATION,
		TECHNICAL_TRAINING, OTHER;
	}
	
	public enum GradeFormat {
		LETTER, PERCENT, PRESENTATION;
	}
	
	public enum Status {
		PENDING, REJECTED, ACCEPTED;
	}
	
	private int reimbursementId;
	
	private String employeeUsername;
	
	private String email;
	
	private String phone;
	
	private LocalDateTime eventTime;
	
	private String location;
	
	private String eventName;
	
	private EventType eventType;
	
	private String description;
	
	private double cost;
	
	private GradeFormat gradingFormat;
	
	private String workRelatedJustification;
	
	private double workHoursMissed;
	
	private double awardedAmount;
	
	private LocalDateTime submissionTime;
	
	private Status directSupervisorStatus;
	
	private Status departmentHeadStatus;
	
	private Status bencoStatus;
	
	private String rejectedReason;
	
	private LocalDateTime directSupervisorTime;
	
	private LocalDateTime departmentHeadTime;
	
	private LocalDateTime bencoTime;
	
	public Reimbursement() {
		super();
	}

	public Reimbursement(String employeeUsername, String email, String phone,
			LocalDateTime eventTime, String location, String eventName, EventType eventType, String description,
			double cost, GradeFormat gradingFormat, String workRelatedJustification, double workHoursMissed,
			double awardedAmount, LocalDateTime submissionTime, Status directSupervisorStatus,
			Status departmentHeadStatus, Status bencoStatus, String rejectedReason, LocalDateTime directSupervisorTime,
			LocalDateTime departmentHeadTime, LocalDateTime bencoTime) {
		super();
		this.employeeUsername = employeeUsername;
		this.email = email;
		this.phone = phone;
		this.eventTime = eventTime;
		this.location = location;
		this.eventName = eventName;
		this.eventType = eventType;
		this.description = description;
		this.cost = cost;
		this.gradingFormat = gradingFormat;
		this.workRelatedJustification = workRelatedJustification;
		this.workHoursMissed = workHoursMissed;
		this.awardedAmount = awardedAmount;
		this.submissionTime = submissionTime;
		this.directSupervisorStatus = directSupervisorStatus;
		this.departmentHeadStatus = departmentHeadStatus;
		this.bencoStatus = bencoStatus;
		this.rejectedReason = rejectedReason;
		this.directSupervisorTime = directSupervisorTime;
		this.departmentHeadTime = departmentHeadTime;
		this.bencoTime = bencoTime;
	}
	
	public Reimbursement(int reimbursement_id, String employeeUsername, String email, String phone,
			LocalDateTime eventTime, String location, String eventName, EventType eventType, String description,
			double cost, GradeFormat gradingFormat, String workRelatedJustification, double workHoursMissed,
			double awardedAmount, LocalDateTime submissionTime, Status directSupervisorStatus,
			Status departmentHeadStatus, Status bencoStatus, String rejectedReason, LocalDateTime directSupervisorTime,
			LocalDateTime departmentHeadTime, LocalDateTime bencoTime) {
		super();
		this.reimbursementId = reimbursement_id;
		this.employeeUsername = employeeUsername;
		this.email = email;
		this.phone = phone;
		this.eventTime = eventTime;
		this.location = location;
		this.eventName = eventName;
		this.eventType = eventType;
		this.description = description;
		this.cost = cost;
		this.gradingFormat = gradingFormat;
		this.workRelatedJustification = workRelatedJustification;
		this.workHoursMissed = workHoursMissed;
		this.awardedAmount = awardedAmount;
		this.submissionTime = submissionTime;
		this.directSupervisorStatus = directSupervisorStatus;
		this.departmentHeadStatus = departmentHeadStatus;
		this.bencoStatus = bencoStatus;
		this.rejectedReason = rejectedReason;
		this.directSupervisorTime = directSupervisorTime;
		this.departmentHeadTime = departmentHeadTime;
		this.bencoTime = bencoTime;
	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public String getEmployeeUsername() {
		return employeeUsername;
	}

	public void setEmployeeUsername(String employeeUsername) {
		this.employeeUsername = employeeUsername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public GradeFormat getGradingFormat() {
		return gradingFormat;
	}

	public void setGradingFormat(GradeFormat gradingFormat) {
		this.gradingFormat = gradingFormat;
	}

	public String getWorkRelatedJustification() {
		return workRelatedJustification;
	}

	public void setWorkRelatedJustification(String workRelatedJustification) {
		this.workRelatedJustification = workRelatedJustification;
	}

	public double getWorkHoursMissed() {
		return workHoursMissed;
	}

	public void setWorkHoursMissed(double workHoursMissed) {
		this.workHoursMissed = workHoursMissed;
	}

	public double getAwardedAmount() {
		return awardedAmount;
	}

	public void setAwardedAmount(double awardedAmount) {
		this.awardedAmount = awardedAmount;
	}

	public LocalDateTime getSubmissionTime() {
		return submissionTime;
	}

	public void setSubmissionTime(LocalDateTime submissionTime) {
		this.submissionTime = submissionTime;
	}

	public Status getDirectSupervisorStatus() {
		return directSupervisorStatus;
	}

	public void setDirectSupervisorStatus(Status directSupervisorStatus) {
		this.directSupervisorStatus = directSupervisorStatus;
	}

	public Status getDepartmentHeadStatus() {
		return departmentHeadStatus;
	}

	public void setDepartmentHeadStatus(Status departmentHeadStatus) {
		this.departmentHeadStatus = departmentHeadStatus;
	}

	public Status getBencoStatus() {
		return bencoStatus;
	}

	public void setBencoStatus(Status bencoStatus) {
		this.bencoStatus = bencoStatus;
	}

	public String getRejectedReason() {
		return rejectedReason;
	}

	public void setRejectedReason(String rejectedReason) {
		this.rejectedReason = rejectedReason;
	}

	public LocalDateTime getDirectSupervisorTime() {
		return directSupervisorTime;
	}

	public void setDirectSupervisorTime(LocalDateTime directSupervisorTime) {
		this.directSupervisorTime = directSupervisorTime;
	}

	public LocalDateTime getDepartmentHeadTime() {
		return departmentHeadTime;
	}

	public void setDepartmentHeadTime(LocalDateTime departmentHeadTime) {
		this.departmentHeadTime = departmentHeadTime;
	}

	public LocalDateTime getBencoTime() {
		return bencoTime;
	}

	public void setBencoTime(LocalDateTime bencoTime) {
		this.bencoTime = bencoTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(awardedAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((bencoStatus == null) ? 0 : bencoStatus.hashCode());
		result = prime * result + ((bencoTime == null) ? 0 : bencoTime.hashCode());
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((departmentHeadStatus == null) ? 0 : departmentHeadStatus.hashCode());
		result = prime * result + ((departmentHeadTime == null) ? 0 : departmentHeadTime.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((directSupervisorStatus == null) ? 0 : directSupervisorStatus.hashCode());
		result = prime * result + ((directSupervisorTime == null) ? 0 : directSupervisorTime.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((employeeUsername == null) ? 0 : employeeUsername.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + ((eventTime == null) ? 0 : eventTime.hashCode());
		result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
		result = prime * result + ((gradingFormat == null) ? 0 : gradingFormat.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + reimbursementId;
		result = prime * result + ((rejectedReason == null) ? 0 : rejectedReason.hashCode());
		result = prime * result + ((submissionTime == null) ? 0 : submissionTime.hashCode());
		temp = Double.doubleToLongBits(workHoursMissed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((workRelatedJustification == null) ? 0 : workRelatedJustification.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		if (Double.doubleToLongBits(awardedAmount) != Double.doubleToLongBits(other.awardedAmount))
			return false;
		if (bencoStatus != other.bencoStatus)
			return false;
		if (bencoTime == null) {
			if (other.bencoTime != null)
				return false;
		} else if (!bencoTime.equals(other.bencoTime))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (departmentHeadStatus != other.departmentHeadStatus)
			return false;
		if (departmentHeadTime == null) {
			if (other.departmentHeadTime != null)
				return false;
		} else if (!departmentHeadTime.equals(other.departmentHeadTime))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (directSupervisorStatus != other.directSupervisorStatus)
			return false;
		if (directSupervisorTime == null) {
			if (other.directSupervisorTime != null)
				return false;
		} else if (!directSupervisorTime.equals(other.directSupervisorTime))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employeeUsername == null) {
			if (other.employeeUsername != null)
				return false;
		} else if (!employeeUsername.equals(other.employeeUsername))
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		if (eventTime == null) {
			if (other.eventTime != null)
				return false;
		} else if (!eventTime.equals(other.eventTime))
			return false;
		if (eventType != other.eventType)
			return false;
		if (gradingFormat != other.gradingFormat)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (reimbursementId != other.reimbursementId)
			return false;
		if (rejectedReason == null) {
			if (other.rejectedReason != null)
				return false;
		} else if (!rejectedReason.equals(other.rejectedReason))
			return false;
		if (submissionTime == null) {
			if (other.submissionTime != null)
				return false;
		} else if (!submissionTime.equals(other.submissionTime))
			return false;
		if (Double.doubleToLongBits(workHoursMissed) != Double.doubleToLongBits(other.workHoursMissed))
			return false;
		if (workRelatedJustification == null) {
			if (other.workRelatedJustification != null)
				return false;
		} else if (!workRelatedJustification.equals(other.workRelatedJustification))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbursement_id=" + reimbursementId + ", employeeUsername=" + employeeUsername
				+ ", email=" + email + ", phone=" + phone + ", eventTime=" + eventTime + ", location=" + location
				+ ", eventName=" + eventName + ", eventType=" + eventType + ", description=" + description + ", cost="
				+ cost + ", gradingFormat=" + gradingFormat + ", workRelatedJustification=" + workRelatedJustification
				+ ", workHoursMissed=" + workHoursMissed + ", awardedAmount=" + awardedAmount + ", submissionTime="
				+ submissionTime + ", directSupervisorStatus=" + directSupervisorStatus + ", departmentHeadStatus="
				+ departmentHeadStatus + ", bencoStatus=" + bencoStatus + ", rejectedReason=" + rejectedReason
				+ ", directSupervisorTime=" + directSupervisorTime + ", departmentHeadTime=" + departmentHeadTime
				+ ", bencoTime=" + bencoTime + "]";
	}
	
}