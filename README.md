# Spring-Boot-Login-And-Registration-Example

This web app demonstrates the process of registration and login with java Spring Boot framework

If you want to try it out, you will have to install MySQL Workbench on your machine and create schema for this application. In case you already have another DBMS, you will have to edit the pom.xml file to include the suitable DB driver.

Then you can start the application and hibernate will create three tables in your DB.

In order to start, open your browser and go to http://localhost:8080/api/v1/registration
Here you will see the following page:
(https://user-images.githubusercontent.com/81825828/180419643-8d0edebe-e3f4-492b-92b1-7e2f993974b3.png)


After entering the necessary data, you can click <b>Register</b> button

If everything is ok, you will see the corresponding message
![](../../../../Downloads/2022-07-22_14-12-11.png)

Then you can click the <b>Login</b> here button and you will see the login page
![](../../../../Downloads/2022-07-22_14-13-38.png)

Here you can enter the credentials you used while registering to the app and then click the <b>Log in</b> button
If your credentials are correct, you will see the home page:
![](../../../../Downloads/2022-07-22_14-16-50.png)

This page shows welcoming message and your username. At the top of the home page you can also see the <b>Logout</b> button. After clicking it, you will be logged out the app. 
