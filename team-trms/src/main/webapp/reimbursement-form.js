class Form{
	
	constructor(email, phone, eventName, eventType, location, eventTime, description, cost, 
			gradingFormat, workRelJust, workHoursMissed, files){
	
	this.email = email;
	this.phone = phone;
	this.eventName = eventName;
	this.eventType = eventType;
	this.location = location;
	this.eventTime = eventTime;
	this.description = description;
	this.cost = cost;
	this.gradingFormat = gradingFormat;
	this.workRelJust = workRelJust;
	this.workHoursMissed = workHoursMissed;
	this.files = files
	}
}

function calculateReim() {
    let e = document.getElementById("input-event-type");
    let eventType = e.options[e.selectedIndex].value;
    let cost = document.getElementById("input-cost").value;

    let rate = 0.0;

    if (eventType === 'UNIVERSITY_COURSE') {
        rate = 0.8;
    }
    else if (eventType === 'SEMINAR') {
        rate = 0.6;
    }
    else if (eventType === 'CERTIFICATION_PREP_CLASS') {
        rate = 0.75;
    }
    else if (eventType === 'CERTIFICATION') {
        rate = 1.0;
    }
    else if (eventType === 'TECHNICAL_TRAINING') {
        rate = 0.9;
    }
    else {
        rate = 0.3;
    }

    // For truncating after two decimal points
    let reimAmount = cost * rate;
    let re = new RegExp('^-?\\d+(?:\.\\d{0,' + (2 || -1) + '})?');
    
    reimAmount = `$${reimAmount.toString().match(re)[0]}`;

    let indexDecimalPoint = reimAmount.indexOf(".");
    
    if (indexDecimalPoint === -1) {
    	reimAmount += ".00";
    }
    else if (reimAmount.length - 2 === indexDecimalPoint) {
    	reimAmount += "0";
    }
    
    document.getElementById("read-reimburse").value = reimAmount;
}

function getFiles(){
	let myFiles = [];
	let files = document.getElementById("input-files").files;
	for(let i = 0; i < files.length; i++){
		myFiles[i] = files[i];
	}
	return myFiles;
}

function formUpload(){
	let xhr = new XMLHttpRequest();
	let attachments = getFiles() || null;
	let form = new Form(
			document.getElementById("input-email").value,
			document.getElementById("input-phone").value,
			document.getElementById("input-event-name").value,
			document.getElementById("input-event-type").value,
			document.getElementById("input-location").value,
			document.getElementById("input-event-date-time").value,
			document.getElementById("input-description").value,
			document.getElementById("input-cost").value,
			document.getElementById("input-grading-format").value,
			document.getElementById("input-work-rel-justification").value,
			document.getElementById("input-work-hours-missed").value,
			attachments
	);
	xhr.onreadystatechange = function(){
		if(xhr.readyState === 4){
	    	if(xhr.status === 200){
	    		window.location.replace("employee-home.html");
	    		console.log(form);
	    		console.log(JSON.stringify(form));
	    	}
	    }
	}
	xhr.open("POST", "reimbursement-form", true);
    xhr.send(JSON.stringify(form));
}

window.onload = function() {
    this.document.getElementById("input-event-type").addEventListener("change", calculateReim, false);
    this.document.getElementById("input-cost").addEventListener("change", calculateReim, false);
    this.document.getElementById("submit-btn").addEventListener("click", formUpload, false);
};