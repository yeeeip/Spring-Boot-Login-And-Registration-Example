# Spring-Boot-Login-And-Registration-Example

This web app demonstrates the process of registration and login with java Spring Boot framework

If you want to try it out, you will have to install MySQL Workbench on your machine and create schema for this application. In case you already have another DBMS, you will have to edit the pom.xml file to include the suitable DB driver.

Then you can start the application and hibernate will create three tables in your DB.

In order to start, open your browser and go to http://localhost:8080/api/v1/registration
Here you will see the following page:


![2022-07-22_14-08-42 (5)](https://user-images.githubusercontent.com/81825828/180518873-b20e91e0-f4a2-479f-ae86-508ee54c5bc1.png)


After entering the necessary data, you can click <b>Register</b> button

If everything is ok, you will see the corresponding message:

![2022-07-22_14-12-11](https://user-images.githubusercontent.com/81825828/180419932-0610a7d1-0014-453b-8228-66a8d4541c6f.png)

Then you can click the <b>Login</b> here button and you will see the login page:

![2022-07-22_14-13-38](https://user-images.githubusercontent.com/81825828/180420074-39682ca6-99fe-4500-b4f0-4daba5a282c2.png)


Here you can enter the credentials you used while registering to the app and then click the <b>Log in</b> button
If your credentials are correct, you will see the home page:

![2022-07-22_14-16-50](https://user-images.githubusercontent.com/81825828/180420099-a2b3ed6a-abf8-446b-b746-7e1d88a29c71.png)


This page shows welcoming message and your username. At the top of the home page you can also see the <b>Logout</b> button. After clicking it, you will be logged out the app. 
