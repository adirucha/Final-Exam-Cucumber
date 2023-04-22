$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ChangeBackground.feature");
formatter.feature({
  "name": "Change to Sky Blue Background",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to  set the SkyBlue background",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on the todolist page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.BackgroundStepDefinition.user_is_on_the_todolist_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the skyblue backgroud button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BackgroundStepDefinition.user_click_on_the_skyblue_backgroud_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BackgroundStepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to  set the White background",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on the todolist page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.BackgroundStepDefinition.user_is_on_the_todolist_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the white backgroud button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BackgroundStepDefinition.user_click_on_the_white_backgroud_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BackgroundStepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "status": "passed"
});
});