$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateOrder.feature");
formatter.feature({
  "name": "Purchase the order from the ecommerce",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create Order positive case",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Buyer logged to website email \u003cemail\u003e and password \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I add product \u003cproduct\u003e to Create",
  "keyword": "When "
});
formatter.step({
  "name": "I checkout \u003cproduct\u003e and submit order",
  "keyword": "And "
});
formatter.step({
  "name": "\"THANKYOU FOR THE\" message is displayed on confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "product"
      ]
    },
    {
      "cells": [
        "simanjuntakalbert57@gmail.com",
        "XBf@rWNvByn!#K8",
        "ZARA COAT 3"
      ]
    }
  ]
});
formatter.background({
  "name": "Buyer Landed to website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Buyer landing to ecommerce",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefenitions.StepDefenitionImpl.landingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Order positive case",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Buyer logged to website email simanjuntakalbert57@gmail.com and password XBf@rWNvByn!#K8",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefenitions.StepDefenitionImpl.buyerLogin(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add product ZARA COAT 3 to Create",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefenitions.StepDefenitionImpl.buyerAddProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I checkout ZARA COAT 3 and submit order",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefenitions.StepDefenitionImpl.buyerCheckoutProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"THANKYOU FOR THE\" message is displayed on confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefenitions.StepDefenitionImpl.verifyConfirmationMessage(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:99)\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\n\tat org.testng.Assert.assertTrue(Assert.java:45)\n\tat org.testng.Assert.assertTrue(Assert.java:55)\n\tat stepdefenitions.StepDefenitionImpl.verifyConfirmationMessage(StepDefenitionImpl.java:58)\n\tat ✽.\"THANKYOU FOR THE\" message is displayed on confirmation page(file:///Users/bytedance/CourseQAAutomation/coursewebautomation/src/test/resources/features/CreateOrder.feature:11)\n",
  "status": "failed"
});
formatter.background({
  "name": "Buyer Landed to website",
  "description": "",
  "keyword": "Background"
});
});