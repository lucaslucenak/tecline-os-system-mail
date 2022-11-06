# TecLine E-mail Sender Microservice

![TecLine](tecline.png)

In addition to my necessity to manage my own technical assistance I have observed that I can extend that idea with Spring Mail! This Microservice can send any e-mail to my clients, with work orders information and their status, can also send a Greek Meetings e-mail if they are new.


## Usage
To use that microservice, you need to create a PostgreSQL database called "os_mail_system" and send the following HTTP request using JSON:
![Request Body](src/main/resources/static/assets/img/request.png)

### Example using Postman:
![Request Body](src/main/resources/static/assets/img/example.png)

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
