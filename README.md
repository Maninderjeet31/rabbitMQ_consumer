# rabbitMQ - Consumer code

## Prerequisites
1. JDK 11 or later
2. Maven
3. IDE (IntelliJ IDEA, Eclipse, etc)
4. Rabbit MQ Server - Docker (used in this project).
5. rabbitMQ - Producer project running along side.

 Rabbit MQ is open-source messaging and streaming broker. It could be deployed on your local machine, on-premise or could also be hosted on cloud. It implements the Advanced essage Queuing Protocol (AMQP).It has a flexible implementation option as it can be used with any language of your choice. It allows application to send message from a producer server to one or more consumers. Rabbit MQ helps develop a scalable and fault-tolerant distributed systems.

 ## Steps To Run

 1. As I am using Docker Desktop, I ran RabbitMQ server on docker. The command used to run the server is
    
      " *docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management* "

 2.  A peredefined Rabbit MQ producer server with configuration setup (like host, port, username, password) for consumer to subscribe to.
 3.  Simply install the dependencies and run the maven project in IDE.
 4.  Test on postman with url

       a. Welcome page - " *http://localhost:8080/api/welcome* "

       b. After clicking *send message* button or using url " *http://localhost:8080/api/home* "

           Sample JSON example to send :

               {
                   "fName": "John",
                   "lName": "Doe",
                   "city": "Toronto",
                   "age": 60
               }

       c. After filling details in form and pressing send, you will see user details in IDE logs with all the user details.


## Future upgradation.
  Few future implementations are currently in progress to add new features and upgrade the functionality of the project to handle complex functions.

### Thank you!
