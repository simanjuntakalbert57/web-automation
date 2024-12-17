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
  "name": "\"THANKYOU FOR THE ORDER.\" message is displayed on confirmation page",
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
  "location": "stepDefenitions.StepDefenitionsImpl.landingPage()"
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
  "location": "stepDefenitions.StepDefenitionsImpl.buyerLogin(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add product ZARA COAT 3 to Create",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefenitions.StepDefenitionsImpl.buyerAddProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I checkout ZARA COAT 3 and submit order",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenitions.StepDefenitionsImpl.checkoutProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"THANKYOU FOR THE ORDER.\" message is displayed on confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefenitions.StepDefenitionsImpl.verifyConfirmationMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Seller can see Order History",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Buyer logged to website email \u003cemail\u003e and password \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I go to \"OrderPage\"",
  "keyword": "When "
});
formatter.step({
  "name": "Verify \u003cproduct\u003e exist in order history",
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
  "location": "stepDefenitions.StepDefenitionsImpl.landingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Seller can see Order History",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Buyer logged to website email simanjuntakalbert57@gmail.com and password XBf@rWNvByn!#K8",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenitions.StepDefenitionsImpl.buyerLogin(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to \"OrderPage\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefenitions.StepDefenitionsImpl.redirectHeader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify ZARA COAT 3 exist in order history",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefenitions.StepDefenitionsImpl.verifyProductOrder(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});