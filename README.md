Project Overview
----------------------------------------------------------------------------------------------------------------------------------------------
This project automates the key user flows of the SauceDemo e-commerce application using Selenium WebDriver, TestNG, and Java.

Target URL: https://www.saucedemo.com
----------------------------------------------------------------------------------------------------------------------------------------------

Folder Structure
automation
src/
  - pages/ Page Object classes
  - tests/ TestNG test classes
  - utils/ Configs, listeners, test data handlers, documents
  - testng.xml Test suite runner
  - pom.xml Maven dependencies
  - README.md

----------------------------------------------------------------------------------------------------------------------------------------------
Features Automated
Positive Test
  - Log in with standard_user
  - Add item to cart
  - Complete checkout and verify the  success message

Negative Test
  - Log in with an invalid user
  - Verify the error message and blocked access
  
----------------------------------------------------------------------------------------------------------------------------------------------
Prerequisites
Tool and Version
  - Java 8 or above
  - Maven 3.6 or above
  - Eclipse or IntelliJ
  - Chrome Browser latest version (WebDriver auto-managed)
  
----------------------------------------------------------------------------------------------------------------------------------------------
Setup Instructions
- Clone the Repository
    git clone https://github.com/your-username/SA-QA-ShwetaShinde.git

- Open Project in Eclipse
    Go to File > Import > Existing Maven Project > Select root folder

- Download dependencies and compile
    Run the following command: mvn clean install

- Run the Test Suite
    Using Eclipse: Right-click testng.xml > Run As > TestNG Suite

----------------------------------------------------------------------------------------------------------------------------------------------
Test Report
- After test execution, TestNG generates an HTML report:
  project-root/test-output/emailable-report.html
  Open this file in any browser to view the test results.

- CI/CD Integration
  This project can be integrated into Jenkins or GitHub Actions.
  Use the command mvn test in the CI pipeline.
  Reports will be available in the test-output folder.

----------------------------------------------------------------------------------------------------------------------------------------------
Libraries and Dependencies
  - Selenium WebDriver
  - TestNG
  - WebDriverManager
  - Maven for build management
  
----------------------------------------------------------------------------------------------------------------------------------------------
Author

Shweta Shinde |
Automation Test Engineer

