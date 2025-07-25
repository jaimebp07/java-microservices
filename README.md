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
