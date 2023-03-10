# BookingCovid-19VaccineSlotsOnline

- REST API for an Covid-19 Application

* We have developed this REST API for an Covid-19 Application. This API performs all the fundamental CRUD operations of any Covid-19 Application platform with user validation at every step.
* This project is developed by team of 5 Back-end Developers during project week in Masai School. 

## Tech Stack

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Swagger

## Modules

* SignUp Module
* Login, Logout Module
* User Module
* Admin Module

## Features

* User and Admin authentication & validation with session uuid having.
* Admin Features:
    * Administrator Role of the entire application
    * Only registered admins with valid session token can add/update/delete driver or customer from main database
    * Admin can access the details of different Appointment, Member ,Vaccine Center ,Vaccine Inventory and Vaccine Ragistration.
* User Features:
    * A user can register himself or herself on the platform.
    * He/She can check the vaccine centres and vaccine availabilty.
    * If vaccine is available, can book an appointment slot.
    * After booking an appointment, he will get appointment details for the vaccine dose.    


## Contributors

* [@Dhruv Gupta](https://github.com/Dhruva8878)
* [@Tayyab Ali](https://github.com/shoto2000)
* [@Humam Ul Islam](https://github.com/humamul)
* [@Nitish Kumar](https://github.com/nitish906)
* [@Yash Yerunkar](https://github.com/Yashhh08)


## Installation & Run

* Before running the API server, you should update the database config inside the [application.properties](https://github.com/nvFARHAN/cowin.gov.in/blob/master/src/main/resources/application.properties) file. 
* Update the port number, username and password as per your local database config.

```
    server.port=8888

    spring.datasource.url=jdbc:mysql://localhost:3306/covid19;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root

```

## AWS Deployed link
`http://covidvaccinerestapi-env.eba-bt8ve3ux.ap-south-1.elasticbeanstalk.com/swagger-ui/#/`

## API Root Endpoint

`https://localhost:8080/`

`http://localhost:8080/swagger-ui/`


## API Module Endpoints

### Login Module

* `POST //api/adminlogin` : Admin can login with mobile number and password provided at the time of registation



### Sample API Response for Admin Login

`POST   localhost:8080/login/adminlogin`

* Request Body

```
    {
        "mobileNo": "9065946031",
        "password": "Clickme@007"
    }
```

* Response

```
   CurrentAdminSession(id=11, adminId=10, uuid=ZaVLaK, localDateTime=2022-08-17T11:13:42.772910500)
   
```

 
 
### E-R Diagram Of Covid-19 Application
---
<div id="2F35A141C80C27E83741FB57B6789FAC1BF_2351"><div id="2F35A141C80C27E83741FB57B6789FAC1BF_2351_robot"><a href="https://cloud.smartdraw.com/share.aspx/?pubDocShare=2F35A141C80C27E83741FB57B6789FAC1BF" target="_blank"><img src="https://cloud.smartdraw.com/cloudstorage/2F35A141C80C27E83741FB57B6789FAC1BF/preview2.png"></a></div></div>

---

### Swagger UI

---

<img src="https://github.com/shivamgarg796/Spring-work/blob/master/Images/Swagger-ui.jpeg?raw=true" style="max-width: 100%; display: inline-block;" data-target="animated-image.originalImage">

---

### Login Controller

---

<img src="https://github.com/shivamgarg796/Spring-work/blob/master/Images/Login.png?raw=true" style="max-width: 100%; display: inline-block;" data-target="animated-image.originalImage">

---

### Admin Controller

---

<img src="https://github.com/shivamgarg796/Spring-work/blob/master/Images/Admin-Controller.jpeg?raw=true" style="max-width: 100%; display: inline-block;" data-target="animated-image.originalImage">

---

### User Controller

---

<img src="https://github.com/shivamgarg796/Spring-work/blob/master/Images/User.png?raw=true" style="max-width: 100%; display: inline-block;" data-target="animated-image.originalImage">

---

### Model Controller

---

<img src="https://github.com/shivamgarg796/Spring-work/blob/master/Images/mODELS.png?raw=true" style="max-width: 100%; display: inline-block;" data-target="animated-image.originalImage">

---
<img src="https://github.com/nitish906/BookingCovid-19VaccineSlotsOnline/blob/main/Thankyou.jpg?raw=true" style="max-width: 200%; align: center; display: inline-block;" data-target="animated-image.originalImage">







