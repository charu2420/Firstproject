Feature:JBK login page

@jbk
Scenario Outline: Login test

Given user should be on login page
When  user enters "<userName>" and "<pass>"
Then  user will be on home page

Examples:
|userName|pass|
|kiran@gmail.com | 123456 |
|mangesh@gmail.com| 123456q|


@jbk1
Scenario:JBK LOGO Test
Given user should be on login page
Then user should see JBK LOGO