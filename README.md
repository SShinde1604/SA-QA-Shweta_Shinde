Project Overview
----------------------------------------------------------------------------------------------------------------------------------------------
This project automates the key user flows of the SauceDemo e-commerce application using Selenium WebDriver, TestNG, and Java.

Target URL: https://www.saucedemo.com
----------------------------------------------------------------------------------------------------------------------------------------------

Folder Structure
automation
src/
  - pages: Page Object classes
  - testCases: TestNG test classes
  - utils: listeners, test data handlers, documents
  - src/test/resources: Configs 
  - Main.xml Test suite runner
  - pom.xml: Maven dependencies
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
  - Java 8 or above: https://www.oracle.com/java/technologies/javase-downloads.html
  - Maven 3.6 or above
      1. Download Maven: https://maven.apache.org/download.cgi
      2. Installation guide (Windows/macOS/Linux): https://maven.apache.org/install.html
  - Eclipse: https://www.eclipse.org/downloads/
  - Chrome Browser latest version (WebDriver auto-managed): https://www.google.com/chrome/
  
----------------------------------------------------------------------------------------------------------------------------------------------
Setup Instructions:
- Clone the Repository
    1. Open Command Prompt (Windows) or Terminal (Mac/Linux)
    2. Run the following command to clone the repo: git clone "https://github.com/your-username/SA-QA-ShwetaShinde.git"
  
  This will create a folder named SA-QA-Shweta_Shinde in your current directory.

- Open Project in Eclipse:
    1. Launch Eclipse IDE
    2. Go to File > Import > Existing Maven Project > Select root folder
    3. Browse to the cloned folder: .../SA-QA-Shweta_Shinde (root folder)
    4. Click Finish
Your project will be imported into Eclipse with all Maven configurations.

- Build the Project and Download Dependencies:

  In the terminal, run the following Maven command:  mvn clean install
  
  This will:
    1. Download Selenium, TestNG, and other required dependencies
    2. Compile the project
    3. Run any default test cases (if defined in testng.xml)

- Run the Automation Test Suite:

    Using Eclipse: Go to src/test/java > testCases> Main.xml > Right-click Main.xml > Run As > TestNG Suite

- View Test Reports:
    1. After test execution, TestNG generates an HTML report:
    2. SA-QA-Shweta_Shinde > test-output > emailable-report.html > Right click on emailable-report.html > Open with > Web Browser
    3. Open this file in any browser to view the test results.

- CI/CD Integration:
    1. This project can be integrated into Jenkins or GitHub Actions.
    2. Use the command mvn test in the CI pipeline.
    3. Reports will be available in the test-output folder.
  
  Note: CI/CD Integration is not done in this project.

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

