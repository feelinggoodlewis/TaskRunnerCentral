# Task Runner Central (TRC)
TRC is a framework that can be used to aggregate and run tasks. Typical tasks might include
* Running applications (.exe files) on a server
* Connecting to a database, running a stored procedure/sql and storing/retrieving information
* Connecting to a RESTful service to read or write data
* Connecting to a location via FTP and reading or writing data
These tasks could be run standalone or as a set of tasks, where output from one task is used as input to another. For e.g. A file read from an FTP location could be written into the database or a value read via the RESTful service could be used as a parameter to open the application. This behaviour could be extended with multiple tasks forming a task set. As TRC is a framework, it would have contracts that a developer can use to write their own versions of task runners.
## Project Scope
The scope of this project is limited to 2 aspects
The framework itself. This is the contract developed for all developers to implement task runners
Implementation of some of the task runners, specifically
* Run executable on a server
* Connect to a relational database and retrieve data (this can be either by running a sql script or a stored procedure)
* Connect to a relational database and store data
* Connect to a MongoDB database and retrieve data
* Connect to a MongoDB database and store data
* Connect to a RESTful service and store data (Use an example API from the internet like weather)
* Connect to a RESTful service and retrieve data
* Connect to an FTP location and write a file
* Connect to an FTP location and read a file
* Connect to a cloud service (AWS, Google Cloud) and run tasks a – g
* Connect to multiple databases and compare a table of the same name
## TRC Features
Features of TRC are as below:
* Multiple tasks can be run in parallel
* Multiple task sets can be run in parallel
* There will be a UI that the users can use to configure tasks and tasksets as well as run them or schedule them to be run
* Users are authenticated and assigned groups with different privileges
* Some users will have permission to create tasks, while others with permission to create tasks can also create private ones for their own use
* The parameters on some tasks cannot be edited
* Some users will be able to edit other people’s tasks and save/run them as theirs
* Parameters can be tied to tasks or users From a user's perspective, only Task packs can be run. So if the user wants to run a specific task alone, they would have to create a Tasp Pack & Task Set and then add the task to it to run it.
