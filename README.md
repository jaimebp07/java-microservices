### MICROSERVICES PROJECT

## steps to get started
1. Install docker on your computer
2. Access the config folder and run the following command in the terminal, this comand will create a container for postgresql and a container for pgadmin.
```sh
Docker compose up
```
3. In the browser access to the path [http://localhost:80](http://localhost:80), there you will see a form for that you to log in with the variables configurated in the docker-compose file.
``` yml
PGADMIN_DEFAULT_EMAIL: 'admin@admin.com' 
PGADMIN_DEFAULT_PASSWORD: 'admin'
```
4. Createa connection to the database by entering the 'add new server' option and entering the following data.
``` txt
name: docker  (The name can be anything)
Host name / Address: postgresql ← (Este es el nombre del servicio en docker-compose)
Port: 5432
Maintenance database: companies
Username: admin
Password: 1234
```

5. Run the following query
```sql
select * from company c join web_site ws on c.id = ws.id_company where c."name" = 'Huesosparati';
```

6. [swagger](http://localhost:8081/companies-crud/swagger-ui/index.html)
