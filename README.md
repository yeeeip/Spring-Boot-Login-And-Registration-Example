# Spring-Boot-Login-And-Registration-Example

This web app demonstrates the process of registration and login with java Spring Boot framework

If you want to try it out, you will have to install MySQL Workbench on your machine and create schema for this application. In case you already have another DBMS, you will have to edit the pom.xml file to include the suitable DB driver.

Then you can start the application and hibernate will create three tables in your DB.

In order to start, open your browser and go to http://localhost:8080/api/v1/registration

Here you will see the following page:

![2022-07-22_14-08-42 (5)](https://user-images.githubusercontent.com/81825828/180518873-b20e91e0-f4a2-479f-ae86-508ee54c5bc1.png)


After entering the necessary data, you can click <b>Register</b> button

If everything is ok, you will see the corresponding message:

![2022-07-22_14-12-11 (2)](https://user-images.githubusercontent.com/81825828/180519062-0d39e15c-4bed-4c98-aba0-1bcf1e26ac6f.png)


Then you can click the <b>Login</b> here button and you will see the login page:

![2022-07-22_14-16-50 (4)](https://user-images.githubusercontent.com/81825828/180519458-2c48a8fa-4ceb-45ae-9247-1512baeabd8a.png)


Here you can enter the credentials you used while registering to the app and then click the <b>Log in</b> button
If your credentials are correct, you will see the home page:




This page shows welcoming message and your username. At the top of the home page you can also see the <b>Logout</b> button. After clicking it, you will be logged out the app. 
