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
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton _ngcontent-qaj-c33\u003d\"\" routerlink\u003d\"/dashboard/cart\" class\u003d\"btn btn-custom\" style\u003d\"margin-top: -10px;\" tabindex\u003d\"0\"\u003e...\u003c/button\u003e is not clickable at point (959, 26). Other element would receive the click: \u003cdiv _ngcontent-qaj-c31\u003d\"\" class\u003d\"ngx-spinner-overlay ng-tns-c31-1 ng-trigger ng-trigger-fadeIn ng-star-inserted ng-animating\" style\u003d\"background-color: rgba(51, 51, 51, 0.8); z-index: 99999; position: fixed;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d131.0.6778.140)\nBuild info: version: \u00274.27.0\u0027, revision: \u0027d6e718d134\u0027\nSystem info: os.name: \u0027Mac OS X\u0027, os.arch: \u0027aarch64\u0027, os.version: \u002715.1.1\u0027, java.version: \u002711.0.21\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [f2d0f44890b0eca664fa9aa6667a12e2, clickElement {id\u003df.72608105B7B3AE1326EBF0B04B67E9DB.d.6DC925C42DD5114F13C3F505E6426946.e.73}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 131.0.6778.140, chrome: {chromedriverVersion: 131.0.6778.69 (77e2244bbcda..., userDataDir: /var/folders/_8/v_b5zj050r7...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:61962}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:61962/devtoo..., se:cdpVersion: 131.0.6778.140, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on mac (f2d0f44890b0eca664fa9aa6667a12e2)] -\u003e css selector: [routerlink*\u003d\u0027cart\u0027]]\nSession ID: f2d0f44890b0eca664fa9aa6667a12e2\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:223)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:76)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy12.click(Unknown Source)\n\tat com.coursewebautomation.abstractcomponents.AbstractComponent.goToCart(AbstractComponent.java:33)\n\tat stepdefenitions.StepDefenitionImpl.buyerAddProduct(StepDefenitionImpl.java:37)\n\tat ✽.I add product ZARA COAT 3 to Create(file:///Users/bytedance/CourseQAAutomation/coursewebautomation/src/test/resources/features/CreateOrder.feature:9)\n",
  "status": "failed"
});
formatter.step({
  "name": "I checkout ZARA COAT 3 and submit order",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefenitions.StepDefenitionImpl.buyerCheckoutProduct(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"THANKYOU FOR THE ORDER.\" message is displayed on confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefenitions.StepDefenitionImpl.verifyConfirmationMessage(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Buyer Landed to website",
  "description": "",
  "keyword": "Background"
});
});