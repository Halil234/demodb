# Set up the docker mysql image

Please user Spring Boot Database with Lombok

# To generate  the docker container
    docker-compose -f docker-compose-mysql.yml up
    
# To reach the database please download MySQL Workbench.

# To search for special containers:

``docker search mysql```

# Set up the connection :

Von Friedl Lesch an Alle: (03:31 PM)
 ![Alt text](/Connection_Settings.png?raw=true "Optional Title") 

# Take a look on the screenshot :

# to get the dependency :

`mvn clean install`

# To download the dependecys from qaware:

mvn de.qaware.maven:go-offline-maven-plugin:resolve-dependencies -DdownloadSources`

# To create an entry in the table

INSERT INTO demo_devacademy.t_person (id,name)
VALUES ('2','chris');

# To see the entrys in the db:

SELECT * FROM demo_devacademy.t_person 

# to build usually:

`mvn clean install`

# To start without test:

`mvn install -DskipTests`





