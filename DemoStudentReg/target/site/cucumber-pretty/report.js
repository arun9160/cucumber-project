$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/arun/eclipse-workspace/DemoStudentReg/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Smoke test of the reg form",
  "description": "",
  "id": "smoke-test-of-the-reg-form",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "To submit the form by fillingthe data",
  "description": "",
  "id": "smoke-test-of-the-reg-form;to-submit-the-form-by-fillingthe-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is in reg page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of the page is Demo web",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user entyers the details",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is submited the form",
  "keyword": "And "
});
formatter.match({
  "location": "theReg_Stepdefination.user_is_in_reg_page()"
});
formatter.result({
  "duration": 8144167501,
  "status": "passed"
});
formatter.match({
  "location": "theReg_Stepdefination.title_of_the_page_is_Demo_web()"
});
formatter.result({
  "duration": 20040731999,
  "status": "passed"
});
formatter.match({
  "location": "theReg_Stepdefination.user_entyers_the_details()"
});
formatter.result({
  "duration": 1141866000,
  "status": "passed"
});
formatter.match({
  "location": "theReg_Stepdefination.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 1190311500,
  "status": "passed"
});
formatter.match({
  "location": "theReg_Stepdefination.user_is_submited_the_form()"
});
formatter.result({
  "duration": 4353612400,
  "status": "passed"
});
});