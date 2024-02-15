# Hackathon Project Requirements

# The outcomes of Hackathon deliverables are:

Explore the Innovative Implementations.
Implement Best practices such as creating Smoke and Regression suite.
Implement Maven on the created automation test scripts
Explore Jenkins to execute the test scripts periodically on Selenium Grid.
Explore Selenium Grid to run test scripts on different platforms and against different browsers.
Integrate Jenkins with version controller (GIT) and scheduled builds to run automatically.

Identify Car Wash Services

Problem Statement : Identify Car Wash Services
Display 5 Car washing services name and phone numbers
1. Car washing services near you with highest rating on top.
2. Rating should be more than 4*
3. Customer Votes should be more than 20

Detailed Description: Hackath Ideas
1. Display 5 Car washing services name and phone numbers, near your location with highest rating (more than 4) on top & Customer Votes more than 20
2. Try to register for Free Listing, fill the form with any one input invalid (example: phone); Capture the error message & display 
3. From Fitness, go to Gym and retrieve all sub-menu items and store in a List; Display the same
(Suggested Site: justdial.com however  you are free to choose any other legitimate  site)

Key Automation Scope
-Handling Alert, search option
-Multiple navigation path for one page
-Filling form (in different objects in web page)
-Capture warning message
-Extract menu items & store in collections
-Navigating back to home page

# Selenium Automation Testing Project: Identify car wash services
 
## Project Overview
This Selenium automation testing project focuses on automating tasks on asklaila.com
The primary objectives include capturing user information, navigating through the portal, verifying the presence of specific elements. 
The project uses various dependencies and libraries to facilitate automation.


## Project Structure
 
### 1. Maven Repository
 
- *Maven Version*: 3.9.3
 
### 2. Dependencies
 
- *Apache POI*
  - Version: 5.2.2
  - Purpose: Used for reading and writing Excel files, facilitating data-driven testing.
 
- *TestNG*
  - Version: 7.8.0
  - Purpose: Framework for test automation that allows for parallel execution and flexible test configuration.
 
- *Extent Report*
  - Version: 5.1.1
  - Purpose: Generates interactive and detailed HTML reports to enhance test result analysis.
  
- *WebDriverManager*
  - Version: 5.6.2
  - Purpose: Used to run the automation script on browser
 
- *Selenium*
  - Version: 4.15.0
  - Purpose: Enables interaction with web elements, navigation, and form submission in the browser.
 
- *Loggers*
  - Version: 2.22.0
  - Purpose: Provides logging capabilities for better debugging and traceability.
 
## Automation Test Flow
 
1. *Open asklaila.com*
   - Navigate to the asklaila.com
 
 
2. *Select country then city*
   - Click on country and city .
 
4. *Search for car washing services*
   - Type car washing services on the search bar
   - Click on Search
   
5. *Filter services based on ratings*
   - Click on services with a rating of 4 and above 
   - Print 5 top services along with their numbers and ratings
   
6. *Go to Free-Listing*
   - click on register
   - try filling the form with invalid input 
   - capture the error message and print it
 
7. *Go to Gym Services*
   - Scroll down and click on Gym
   - Get all sub-menu items 
   - Store the items in a list and print them

 
8. *Close the window*
   - Close the window 

 
## How to Run the Tests
 
1. *Open Eclipse IDE:*
   - Launch Eclipse IDE on your machine.
 
2. *Import Project:*
   - Select File -> Import from the menu.
   - Choose Existing Maven Projects and click Next.
   - Browse to the directory where you cloned the repository and select the project.
 
3. *Update Maven Project:*
   - Right-click on the project in the Project Explorer.
   - Choose Maven -> Update Project.
   - Click OK to update dependencies.
 
4. *Set Up Configuration:*
   - Open the src/test/resources/config.properties file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.
 
5. *Run Test Suite:*
   - Locate the test suite file (e.g., src/test/java/TestSuite.java).
   - Right-click on the file and choose Run As -> TestNG Suite.
 
6. *View Reports:*
   - After execution, open the test-output folder.
   - Find the Extent Report HTML file (index.html) for detailed test reports.
 
## Author Information
 
- *Vaibhav Tiwari (2303497)*
 
## Disclaimer
 
This project is intended for educational and testing purposes only. The authors are not responsible for any unauthorized use or modification of the code. Use at your own risk.