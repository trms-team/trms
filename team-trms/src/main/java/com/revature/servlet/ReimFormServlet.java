package com.revature.servlet;

import static com.revature.util.LoggerUtil.info;
import static com.revature.util.LoggerUtil.warn;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.FileDAO;
import com.revature.dao.FileDAOImpl;
import com.revature.pojo.Form;
import com.revature.pojo.Reimbursement;
import com.revature.pojo.User;
import com.revature.pojo.User.Role;
import com.revature.service.ReimbursementServiceImpl;
import com.revature.util.ReimbursementValidator;

public class ReimFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static ReimbursementServiceImpl reimbursementService = new ReimbursementServiceImpl();

	private static ReimbursementValidator reimbursementValidator = new ReimbursementValidator();

	private static FileDAO fileDAO = new FileDAOImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReimFormServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = (User) (request.getSession().getAttribute("user"));

		if (user != null && user.getRoles().contains(Role.EMPLOYEE)) {
			String body = request.getReader().readLine();
			System.out.println(body);
			ObjectMapper om = new ObjectMapper();
			
			Form form = om.readValue(body, Form.class);
			
			String email = form.getEmail();
			String phone = form.getPhone();
			String eventName = form.getEventName();
			String eventType = form.getEventType();
			String eventTimeStr = form.getEventTime();
			String location = form.getLocation();
			String description = form.getDescription();
			String cost = form.getCost();
			String gradingFormat = form.getGradingFormat().toString();
			String workRelatedJustification = form.getWorkRelJust();
			String workHoursMissed = form.getWorkHoursMissed();

			info("the  reimbursement's fields are email: " + email + " phone: " + phone + " event Name: " + eventName
					+ " event type: " + eventType + " event time: " + eventTimeStr + " location: " + location
					+ " description: " + description + " cost: " + cost + " grading format: " + gradingFormat
					+ " workRelJust: " + workRelatedJustification + " work hours missed: " + workHoursMissed);

			Reimbursement checkedReimbursement = reimbursementValidator.validReimbursement(user.getUsername(), email,
					phone, eventName, eventType, eventTimeStr, location, description, cost, gradingFormat,
					workRelatedJustification, workHoursMissed);
			
			if (checkedReimbursement != null) {
				reimbursementService.addReimbursement(checkedReimbursement);
				File[] file = null;
				System.out.println(file);
			} else {
				warn("Reimbursement could not be saved");
			}
			response.sendRedirect("employee-home.html");
		}
	}
}