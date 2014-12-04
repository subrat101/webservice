Sample WebService in Spring Framework
==========
Notes:
>1. Create a database named employee_db in mysql
2. Change the database the DB credentials on:
   webservice/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml
3. Use postman to test the app since it requires the application/json header
    Content-Type > application/json
    Accept       > application/json


Testing:
1. Listing employees (GET)
    http://localhost:8080/employee/list
2. Creating a employee (POST)
    http://localhost:8080/employee/create
    expample parameter: 

    {
    "firstName": "Hoston",
    "lastName": "lindey",
    "email": "hl@gmail.com",
    "phone": "90908989899"
    },
    
3. Deleting a employee(GET)
   http://localhost:8080/employee/delete/{id}
