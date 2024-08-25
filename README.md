# Selenium Testing Framework with TestNG, Java, and Maven
## Overview
This project is a Selenium-based testing framework that uses TestNG for test management and Maven for project management. The framework is designed to be robust, maintainable, and reusable, providing a clean structure for web testing.

## Features
- **TestNG Integration**: Organize and manage tests using TestNG.
- **Selenium WebDriver**: Automate browser interactions.
- **Page Object Model (POM)**: Maintain a clean separation between test logic and page elements.
- **Maven**: Manage dependencies and build processes.
- **Logging**: Use SLF4J for logging actions and errors.
- **Singleton Design Pattern**: Ensure a single instance of WebDriver is used throughout the tests.

## Prerequisites
- Java JDK 8 or higher
- Maven
- Selenium WebDriver
- TestNG
- SLF4J for logging

## Setup Instructions
### 1.Clone the Repository
To get started, clone the repository to your local machine using the following command:

```sh
git clone https://github.com/Genia89/MedlineUIProject.git
cd MedlineUIProject
mvn clean install
mvn test
```
## Known Issues
### Text Encoding Issue in Search Box on Medline at Home Page
**Description:**
When entering "women's scrubs" in the search box on the Medline at Home page, the text is displayed as "women`&#039;`s scrub" after hitting enter. The apostrophe is improperly encoded as `&#039;`.

**Steps to Reproduce:**
1. Go to the Medline at Home page.
2. Enter "women's scrubs" or any word with the apostrophe in the search box.
3. Press enter.
4. Observe the search box displaying "women`&#039;`s scrub" instead of "women's scrubs."

**Expected Result:**
The search box should display "women's scrubs" without improper encoding.

**Actual Result:**
The search box displays "women`&#039;`s scrub" with improper encoding of the apostrophe.

## Testing Limitations
### Automation Blocked by Target Website
**Description:**
The target website blocks automation tools like Selenium, preventing WebDriver from running the automated tests.
This means that while the framework is set up and the test scripts are written the execution of these tests could not be performed.
