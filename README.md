Coverage: 81%
## Inventory Management System, 22AprEnable1

This is an Inventory Management System with Create, Read, Update and Delete funcitons for 'Customers', 'Items' and 'Orders'.

## Getting Started

Make an empty folder (i.e. "IMS")

Git bash in the folder, enter 'git init' to make a repository, enter 'git clone' + the SSH Key of your online repository to copy the contents of your online repository to your local system.

To run the applicaiton navigate into the folder you made, "IMS" in this example and then run a command prompt in the target subfolder.

In your command prompt, enter command 'java -jar "enter name of the jar-with-dependencies.jar here".

This should run the application through your command prompt.

### Prerequisites

You will need git bash to download the repository.

You will also want Eclipse for Java developers if you wish to develop on the code and also conducts tests.


### Installing
For installation and editing of this project, add the folder you made earlier into your \eclipse-workspace\ (i.e. "IMS" folder).

Once in Eclipse, select File/Open Projects from File System and select your folder.

From here, a development environment will be created, allowing you to edit the project.

To run this project, select the runner from your package explorer. This will be in 'src/main/java/com.qa.ims'.

Open the runner, right click in the terminal and select 'Run as' then 'Java application'.

The application should be open in the console.

## Running the tests

To run tests for this application, open 'src/test/java', select a test, right click and 'Run as' 'JUnit Test'


### Unit Tests 

These tests test the CRUD functionality of the application by testing the methods within you main java folder: CustomerController.java, ItemController.java, OrderController.java, CustomerDAO.java, ItemDAO.java and OrderDAO.java


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

##Jira Board

https://junleeqa.atlassian.net/jira/software/projects/SCFP/boards/4

## Acknowledgments

Please thank Cameron Guthrie and Richard Mansworth for their guidance on the project.