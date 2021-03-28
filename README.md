# spring-boot-rest-api
## Create A Rest API For The Employee Directory
### Rest Client Should Be Able To
* Get A List Of Employees
* Get A Single Employee By Id
* Add New Employee
* Update An Employee
* Delete An Employee


|Http Method | CRUD Action  | Explain
| --------------- | --------------- | --------------- |
| POST | /api/employees | Create A New Employee |
| GET | /api/employees | Read A List Of Employees |
| GET | /api/employees/{id} | Read A Single Employe |
| PUT | /api/employees | Update An Existing Employee |
| DELETE | /api/employees/{id} | Delete An Existing Employee |

# Development Process
* Set Up Database Dev Environment
* Create Spring Boot Project Using Spring Initializer
* Get A List Of Employees
* Get A Single Employee By Id
* Add New Employee
* Update An Employee
* Delete An Employee

Technologies<br>
⦁ MySQL Database <br>
⦁ Spring Boot<br>
⦁ Spring Data JPA<br>
⦁ Lombok<br>
⦁ Devtools<br>
⦁ Postman(For Testing)<br>
⦁ Build Tool (i.e. Maven) <br>

## Instructions To Run Backend
1- Just Extract The BACKEND Folder to Intellij and run it as (Java Application) on port=8080.<br>
2- For Database You can Excute the sql file in your Sql Editor (it contain database creation statement) OR Just create the database(name=employee_directory,username=springstudent,pass=springstudent) Maunally And Run The Application And It will create the Tables With It Objects.<br>
3- Then You Can Test It Using Postman.<br>

== Employee ==<br>
Return all Employees (GET : localhost:8080/api/v1/employees)<br>
Return Employee (GET : localhost:8080/api/v1/employees/{id})<br>
Add Employee (POST : localhost:8080/api/v1/employees) With Json Body <br>
Update Employee (PUT : localhost:8080/api/v1/employees) With Json Body <br>
Delete Employee (DELETE : localhost:8080/api/v1/employees/{id}) <br>
