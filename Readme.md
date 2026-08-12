\# 🚀 SauceDemo Retail E-Commerce Automation Framework



This project is an \*\*industry-oriented UI Automation Testing Framework\*\* developed for the \*\*SauceDemo Retail E-Commerce Application\*\* using \*\*Java, Selenium WebDriver, TestNG, Maven, and Page Object Model (POM)\*\*.



\---



\## 📌 Framework Highlights



\* ✔️ Page Object Model (POM) implementation

\* ✔️ Reusable BaseTest architecture

\* ✔️ Externalized configuration using `config.properties`

\* ✔️ ConfigReader Utility for dynamic test data retrieval

\* ✔️ FrameworkConstants for reusable static values

\* ✔️ Screenshot Utility for execution evidence and debugging

\* ✔️ Smoke, Sanity, and Regression Suite support

\* ✔️ TestNG HTML Reporting (`emailable-report.html`)

\* ✔️ Maven-based execution support

\* ✔️ Git \& GitHub integrated workflow



\---



\## 🛠️ Technology Stack



| Layer           | Technology              |

| --------------- | ----------------------- |

| Programming     | Java 17                 |

| Automation      | Selenium WebDriver 4    |

| Test Framework  | TestNG                  |

| Build Tool      | Apache Maven            |

| Design Pattern  | Page Object Model (POM) |

| Version Control | Git \& GitHub            |



\---



\## 📂 Project Architecture



```

src/test/java

├── com.saucedemo.base

├── com.saucedemo.pages

├── com.saucedemo.tests

├── com.saucedemo.utils

└── com.saucedemo.listeners



src/test/resources

└── config.properties

```



\---



\## 🧪 Automated Functional Coverage



\### Authentication Module



\* Valid Login Verification

\* Invalid Login Validation

\* Error Message Assertion



\### Inventory Module



\* Product Visibility Validation

\* Add-to-Cart Functionality

\* Cart Badge Count Verification



\### Cart Module



\* Added Product Validation

\* Remove Button Verification

\* Checkout Navigation Validation



\### Checkout Module



\* Checkout Information Validation

\* Checkout Overview Verification

\* Order Completion Assertion

\* End-to-End Purchase Flow Automation



\---



\## ⚙️ Test Suite Strategy



\### Smoke Suite



```bash

mvn clean test -DsuiteXmlFile=testng-smoke.xml

```



\### Sanity Suite



```bash

mvn clean test -DsuiteXmlFile=testng-sanity.xml

```



\### Regression Suite



```bash

mvn clean test -DsuiteXmlFile=testng-regression.xml

```



\---



\## 📸 Screenshot Utility



```java

ScreenshotUtility.captureScreenshot(driver, "LoginSuccess");

```



Screenshots are stored in:



```

screenshots/

```



\---



\## 📊 Reporting



TestNG automatically generates execution reports inside:



```

test-output/

├── emailable-report.html

├── index.html

└── testng-results.xml

```



These reports provide:



\* Execution summary

\* Pass/Fail statistics

\* Execution duration

\* Failed test traceability



\---



\## 🔄 Framework Workflow



```

TestNG Suite

&#x20;     ↓

BaseTest Initialization

&#x20;     ↓

ConfigReader loads environment data

&#x20;     ↓

Page Object execution

&#x20;     ↓

Assertions \& Validation

&#x20;     ↓

Screenshot Capture

&#x20;     ↓

TestNG Report Generation

```



\---



\## 🚀 Future Enhancements



\* 🌐 Cross-Browser Execution (Chrome, Edge, Firefox)

\* ⚡ Parallel Execution using TestNG

\* 📑 Data-Driven Testing using DataProvider \& Apache POI

\* 📊 Extent Reports Integration

\* 📉 Allure Reports Integration

\* 🤖 Jenkins CI/CD Pipeline Integration

\* ☁️ Selenium Grid / Remote Execution Support



\---



\## 👨‍💻 Author



\*\*Himanshu Singh\*\*



Automation Test Engineer | Selenium | TestNG | Maven | Java | POM Framework



This project demonstrates \*\*industry-oriented Selenium automation framework design, reusable utilities, suite management, configuration handling, reporting, and scalable test execution practices\*\*.



