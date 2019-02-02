$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Guru99PaymentGteway/Paymentgate.feature");
formatter.feature({
  "name": "Payment Gateway",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "To Generate Card Details",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User to go to GurupaymentGateway Page",
  "keyword": "Given "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_go_to_GurupaymentGateway_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to click Generate Card number option",
  "keyword": "And "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_click_Generate_Card_number_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Store the Card details.",
  "keyword": "Then "
});
formatter.match({
  "location": "PagementGatewayMain.store_the_Card_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to click cart",
  "keyword": "And "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_click_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Buy the item in Payment Gateway",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.step({
  "name": "User to click on Buy now",
  "keyword": "Given "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_click_on_Buy_now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to enter the card details",
  "keyword": "When "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_enter_the_card_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Payment button",
  "keyword": "And "
});
formatter.match({
  "location": "PagementGatewayMain.click_on_the_Payment_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to verify the payment successful message",
  "keyword": "Then "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_verify_the_payment_successful_message()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "To Generate Card Details",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User to go to GurupaymentGateway Page",
  "keyword": "Given "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_go_to_GurupaymentGateway_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to click Generate Card number option",
  "keyword": "And "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_click_Generate_Card_number_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Store the Card details.",
  "keyword": "Then "
});
formatter.match({
  "location": "PagementGatewayMain.store_the_Card_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to click cart",
  "keyword": "And "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_click_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Check the Credit card balance",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@second"
    }
  ]
});
formatter.step({
  "name": "User to click on Check the Credit tab",
  "keyword": "Given "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_click_on_Check_the_Credit_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to enter the card number",
  "keyword": "When "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_enter_the_card_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Submit Button",
  "keyword": "And "
});
formatter.match({
  "location": "PagementGatewayMain.click_on_the_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to check Card balance amount",
  "keyword": "Then "
});
formatter.match({
  "location": "PagementGatewayMain.user_to_check_Card_balance_amount()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});