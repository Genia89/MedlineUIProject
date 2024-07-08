# Selenium Testing Framework with TestNG, Java, and Maven
## Overview
This project is a Selenium-based testing framework that uses TestNG for test management and Maven for project management. The framework is designed to be robust, maintainable, and reusable, providing a clean structure for web testing.

## Features
- **TestNG Integration**: Organize and manage tests using TestNG.
- **Selenium WebDriver**: Automate browser interactions.
- **Page Object Model (POM)**: Maintain a clean separation between test logic and page elements.
- **Maven**: Manage dependencies and build processes.
- **Logging**: Use SLF4J for logging actions and errors.

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
