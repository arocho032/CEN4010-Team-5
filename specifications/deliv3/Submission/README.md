# User Guide for Student Organization System (SOS)

## Setting up the Backend.

The included SOS-Backend.zip contains the exported SOS project. The project requires Maven to
load the dependencies. The Maven POM file is included. If you choose not to use Maven,
then make sure the following dependencies are given to the java compilation when run
(or are added to the path on the IDE of your choice):

	* org.json, version 20090211
	* netty-socketio, version 1.7.12, from https://github.com/mrniko/netty-socketio/releases/tag/netty-socketio-1.7.12
	* org.slf4j, version 1.7.21.
	* mysql-connector-java-8.0.18 (included in the zip).

The project uses Java SE 1.8 and JUnit 5 for testing.

To run the server, call SOSServer_Driver.java, or call SOSServer using your own
main function to give it any parameters you want.

### Project Structure

The whole contents of the project is within the src Folder. The design of the project can be found
in the several design documents.

The aurigadoclet folder contains a doclet jar which was used to generate the javadoc for this project.
This javadoc can be found in the SOS-javadoc.pdf file.

The resources folder contains the keystore used by the `TransferManager` class as well as a
dump of the SQL instance.

## Setting up the MySQL instance.

Create a SQL instance using your manager of choice. For development, we MySQL through
MySQL workbench v. 8.0. The instance should have a user 'root' whose password is 'SOSDBCEN4010'.
However, this can be customized by changing the password and user constant on the `DataStoreFacade`
class.

To create the schema, run the `Dump20191202.sql` file provided in the zip on the instance. It
should create the relevant tables and instantiate the relevant store procedures.

The default port for this instance (assumed by the backend) is 3306. If you choose to use
another port, make sure you update the `DataStoreFacade` class.

## Setting up the Frontend.

The included SOS-Frontend.zip contains the final version of the Node.js weppage for the project.
Your environment must have node.js installed. To run the front-end, extract the zip and do:

	*installation*
	npm run setup
	npm audit fix
	npm run cleanup

	*running*
	npm start

You MUST create a `.env` file containing the following:

	REACT_APP_GOOGLE_MAPS_API_KEY=AIzaSyAAZAZfjddG60FustylKDqGewPhz8uW6Ck
	SOCKET_URL=localhost:9000

The Google Maps API Key might expire, if that's the case, another one is required
for the location functionality. If you modify the location of the backend, you
must update the SOCKET_URL.


### Project structure.
This project used react-boilerplace (at https://github.com/react-boilerplate/react-boilerplate)
as a starting point, and for the most parts follows its design standards. Displayable pages
can be found in the `/app` folder, under two subfolders:

	/app/components, which describe elements which are meant to have only style in them.
	/app/containers, which describe elements which are meant to have structure and logic.

Each container usually have the following files:

	index.js, which describes the core page structure.
	Loadable.js, used to make page-loading asynchronous.
	constants.js, which define action constants.
	actions.js, which define action functions which are dispatched from the index.js object.
	reduce.js, which receives the dispatched action and applies an operation to the store.
	select.js, which extracts data from the store to be passed to the index.js object.

The connection to the backend is handled by the Redux middleware contained in
/app/utils/createSocketMiddleware, which is a modified version of https://github.com/itaylor/redux-socket.io.
The modifications where done to implement encryption between front and backend.

###############################################################################
## Project's Main GitHub Repository: https://github.com/arocho032/CEN4010-Team-5
## Front-end GitHub Repository: https://github.com/arocho032/CEN4010-React-App
## Back-end GitHub Repository: https://github.com/arocho032/CEN4010-Backend
## DataBase GitHub Repository: https://github.com/asanchezayra01/SOSDB
###############################################################################
