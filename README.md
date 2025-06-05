AmazonAutomationFramework

This is a Selenium-based automation framework developed for testing an e-commerce website ([Amazon.in](https://www.amazon.in)).

 Project Objective

Automate and validate key functionalities of an e-commerce site:

- Search for products (valid and invalid)
- Add products to the cart
- Update product quantity
- Remove products from the cart

Features Tested

| Step | Description | Expected Outcome |
|------|-------------|------------------|
| 1    | Search for a non-existing product (e.g., `ld345tsxslfer`) | "No results found" message displayed |
| 2    | Search for a valid product (e.g., `Laptop`) | List of laptops is displayed |
| 3    | Add 4th product to cart | Product is added with correct quantity and price |
| 4    | Update quantity to 2 | Quantity and price are updated in the cart |
| 5    | Remove product from cart | Cart becomes empty |
 Tech Stack

- **Language**: Java
- **Automation Tool**: Selenium WebDriver
- **Test Framework**: TestNG
- **Build Tool**: Maven
- **Design Pattern**: Page Object Model (POM)
- **Reporting**: TestNG Reports
 How to Run

1. Clone or download the project.
2. Import as Maven project in Eclipse or IntelliJ.
3. Update the path to ChromeDriver in `BaseTest` class.
4. Run the test class `SearchTests.java` as a TestNG Test.

 Folder Structure

- `pages/` – Page Object classes
- `tests/` – Test classes
- `resources/` – Configuration files
- `pom.xml` – Maven dependencies

 Author

**Dhanashri Bhor**  
QA Engineer | Manual & Automation Testing | SDET Trainee  
 dhanashribhor1202@gmail.com  
 Pune, Maharashtra

---

_This project is part of my SDET training and showcases key concepts in test automation._
