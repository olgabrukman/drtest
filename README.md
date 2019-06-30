
Goal
-------
In this task you are requested to implement a simple free text search engine service.
We are looking for a working solution with a clean design.
Requirements
The engine should at least supply the following capabilities:
  *Index – an ability to add a new document/s that later can be surfaced during search.
  *search(query) – an ability to provide a query and receive as output a ranked list of documents based on their similarity to the query.

Implementation Details
-------
* Provide a generic option for using different similarity algorithms, and implement two
options yourself
* Provide a generic option for using different tokenization methods, and implement
two options yourself
* Notice, the system can be used by numerous users in parallel.

Example
-----
In this example the similarity function is number of shared tokens, and the tokenization is
done by splitting the string by spaces:
```ssh
curl -d "the cow says moo" -X POST http://127.0.0.1:5000/index
curl -d "the cat and the hat" -X POST http://127.0.0.1:5000/index
curl -d " the dish ran away with the spoon" -X POST http://127.0.0.1:5000/index
curl -d " a cat ran away" -X POST http://127.0.0.1:5000/se
```


Usage
-----
Build: ```mvn clean install```

Access: 
- http://localhost:8080/list
- http://localhost:8080/index
- http://localhost:8080/search



 
