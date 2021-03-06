package com.revature.service;

import static com.revature.util.LoggerUtil.info;

import java.util.LinkedList;
import java.util.List;

import com.revature.dao.ReimbursementDAO;
import com.revature.dao.ReimbursementDAOImpl;
import com.revature.pojo.Reimbursement;
import com.revature.pojo.User.Role;

public class ReimbursementServiceImpl implements ReimbursementService {
	private static ReimbursementDAO reimbursementDAO = new ReimbursementDAOImpl();
	
	@Override
	public void addReimbursement(Reimbursement reimbursement) {
		reimbursementDAO.createReimbursement(reimbursement);
		info("added reimbursement by employee " + reimbursement.getEmployeeUsername());
	}
	
	@Override
	public List<Reimbursement> showEmployeePending(String username) {
		info("showing pending requests by employee " + username);
		return reimbursementDAO.getPendingReimbursementsByEmployee(username);
	}

	@Override
	public List<Reimbursement> showEmployeeAccepted(String username) {
		info("showing accepted requests by employee " + username);
		return reimbursementDAO.getAcceptedReimbursementsByEmployee(username);
	}

	@Override
	public List<Reimbursement> showEmployeeRejected(String username) {
		info("showing rejected requests by employee " + username);
		return reimbursementDAO.getRejectedReimbursementsByEmployee(username);
	}

	@Override
	public List<Reimbursement> showSupervisorPending(String username) {
		info("showing pending requests by supervisor " + username);
		return reimbursementDAO.getPendingReimbursementsBySupervisor(username);
	}

	@Override
	public List<Reimbursement> showSupervisorInProgress(String username) {
		info("showing in progress requests by supervisor " + username);
		return reimbursementDAO.getInProgressReimbursementsBySupervisor(username);
	}
	
	@Override
	public List<Reimbursement> showSupervisorAccepted(String username) {
		info("showing accepted requests by supervisor " + username);
		return reimbursementDAO.getAcceptedReimbursementsBySupervisor(username);
	}

	@Override
	public List<Reimbursement> showSupervisorRejected(String username) {
		info("showing rejected requests by supervisor " + username);
		return reimbursementDAO.getRejectedReimbursementsBySupervisor(username);
	}
	
	@Override
	public List<Reimbursement> showDepartmentHeadPending(String username) {
		info("showing pending requests by department head " + username);
		return reimbursementDAO.getPendingReimbursementsByDepartmentHead(username);
	}

	@Override
	public List<Reimbursement> showDepartmentHeadInProgress(String username) {
		info("showing in progress requests by department head " + username);
		return reimbursementDAO.getInProgressReimbursementsByDepartmentHead(username);
	}

	@Override
	public List<Reimbursement> showDepartmentHeadAccepted(String username) {
		info("showing accepted requests by department head " + username);
		return reimbursementDAO.getAcceptedReimbursementsByDepartmentHead(username);
	}

	@Override
	public List<Reimbursement> showDepartmentHeadRejected(String username) {
		info("showing rejected requests by department head " + username);
		return reimbursementDAO.getRejectedReimbursementsByDepartmentHead(username);
	}
	
	@Override
	public List<Reimbursement> showBenCoPending(String username) {
		info("showing pending requests by benco " + username);
		return reimbursementDAO.getPendingReimbursementsByBenCo(username);
	}

	@Override
	public List<Reimbursement> showBenCoAccepted(String username) {
		info("showing accepted requests by benco " + username);
		return reimbursementDAO.getAcceptedReimbursementsByBenCo(username);
	}

	@Override
	public List<Reimbursement> showBenCoRejected(String username) {
		info("showing rejected requests by benco " + username);
		return reimbursementDAO.getRejectedReimbursementsByBenCo(username);
	}
	
	@Override
	public void submitReimbursement(Reimbursement newReimbursement) {
		info("submitting reimbursement id#" + newReimbursement.getReimbursementId());
		reimbursementDAO.createReimbursement(newReimbursement);
	}
	
	@Override
	public void acceptReimbursement(Reimbursement reimbursement, List<Role> accepterRoles) {
		info("Accepting reimbursement id#" + reimbursement.getReimbursementId());
		reimbursementDAO.updateReimbursementToAccepted(reimbursement, accepterRoles);
	}

	@Override
	public void rejectReimbursement(Reimbursement reimbursement, List<Role> rejecterRoles, String reasonRejected) {
		info("Rejecting reimbursement id#" + reimbursement.getReimbursementId());
		reimbursementDAO.updateReimbursementToRejected(reimbursement, rejecterRoles, reasonRejected);
	}
	
	@Override
	public void updateReimbursementAmount(Reimbursement reimbursement) {
		info("Updating reimbursement id#" + reimbursement.getReimbursementId() 
			+ " to $" + reimbursement.getAwardedAmount());
		reimbursementDAO.updateReimbursementAmount(reimbursement);
	}
	
	@Override
	public List<Double> getPendingAndAwardedAmounts(String username) {
		List<Reimbursement> reimbursements = showEmployeePending(username);
		reimbursements.addAll(showEmployeeAccepted(username));
		
		List<Double> amounts = new LinkedList<>();
		
		for (Reimbursement r : reimbursements) {
			amounts.add(r.getAwardedAmount());
		}
		
		return amounts;
	}

}
