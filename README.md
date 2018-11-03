# Companies Portfolio Management
This project attempts to implement the system for product requirements 
management on the highest possible level: Software Companies Holding
(further referred as "The Holding" for brevity)

## The Setup
The Holding buys Software Companies.

Every Company has its' own portfolio of Products.

Each Product has a set of Features.

Each Feature is composed from multiple Capabilities.

Each Capability is based on a set of Requirements.

## Problems
In this setup there are a lot of problems. To name a few:
1. I need to include the list of all Companies that The Holding
owns into the Form of my Application. Where do I get this list?
2. I need to validate the names of the Products that The Holding owns,
in the Request Form of my Application. Where do I get the correct names?
3. I want to get the list of the Features that are ordered
in this release across all the Products that The Holding owns.
Where do I get this list?

## The Project in a nutshell
Current Project exposes the RESTful API (basePath = `/api`) that solves 
the problem of getting the collections of:
1. Companies `GET /companies`
2. Products `GET /products`
3. Features `GET /features`
4. Capabilities `GET /capabilities`

This API also allows to use query string to search each 
of those 4 sets by the string in name (`name={yous_search_string}`)
and parent Id (`parent_id={some_valid_guid}`).

The project is built on Spring Boot and Hibernate ORM Framework.

The project uses embedded H2 Database.

The server inserts test data for Companies, Products, Features and Capabilities
at start-up. See [initial SQL insert script](
./src/main/resources/insert-initial-data.sql) for details.


## How to run?
1. Download `portfolio-manager-0.0.1.jar` from this Dropbox [folder](
https://www.dropbox.com/s/7wwm1q55jfn7q44/portfolio-manager-0.0.1.jar?dl=1)
3. Open Terminal
4. Run 
    ``` 
    java -jar capability-constructor-0.0.1.jar
    ```
5. Server will start on localhost, port 8080.
6. Send HTTP Request. Example:
```
curl -X GET \
  http://localhost:8080/api/companies \
```

## How to test?
1. Run the Server on localhost.
### Postman
1. [Download the collection of Postman Requests](
./docs/Portfolio_Management_1_Get_Collections.postman_collection.json).
2. Open Postman
3. Import the Collection (v2.1 format)
4. Use Postman collection runner to run requests and tests.
    1. IMPORTANT! Requests in Collection refer to `localhost`.
