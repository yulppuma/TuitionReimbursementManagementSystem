/**
 * 
 */

function submit(){
	event.preventDefault();
	var gradingFormat = $("#gradingFormat option:selected").text(); 
	var eventType = $("#eventType option:selected").text();
	var location = $("#location").val();
	var description = $("#description").val();
	var date = $("#datepicker").val();
	var justification = $("#justification").val();
	var cost = $("#c2").val();
	console.log(justification);
}

$("#tuitionForm").submit(submit);