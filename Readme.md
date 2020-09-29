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

# To start the Spring Boot application in  terminal:

`java -jar target/demodb-0.0.1-SNAPSHOT.jar`

# To start the ui 

## naviate to the ui folder an start the ui with the ng serve command:

```
cd angularclient
ng serve
```

## Create a new database table demo_devacademy.t_notes
SELECT * FROM demo_devacademy.t_notes

### Here the statement to insert one role in the database . Please take care that the id 
### is now autoincremented :

INSERT INTO demo_devacademy.t_notes (generate_date,notes,title,owner)
VALUES ('2020-09-29 00:01:00' , 'notes_sample','title_sample','testowner');












