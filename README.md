dropwizard-mssql-crud-example
=============================

Need MSSQL database:
	database: hello-world
	user: hello-world
	pass: 1234

Build:
	mvn package

database update:
	java -jar target\holdinarms-0.0.1.jar db migrate main.yml
	
run:
	java -jar target\holdinarms-0.0.1.jar server main.yml
	

And listen on :
	http://localhost:9000
