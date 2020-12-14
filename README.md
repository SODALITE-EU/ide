# [![SODALITE](images/sodalite-logo.png)](https://www.sodalite.eu/) Sodalite project: IDE

This repository contains the Sodalite IDE (based on Eclipse).

## Repository structure

- dsl: This folder contains the Eclipse plugins of the Sodalite IDE: DSL Editor for AADM and Resource Models (RMs)
- PoCs: This folder contains some PoCs developed to test XText technologies and model Tosca metamodels
- Docker: image descriptor and scripts to build and pre-configure an IDE container
- scripts: scripts to publish the IDE during the dev-ops pipeline

## Requirements
- Java SDK 11.0:
Install the Java JDK 11.0 from [Oracle Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Eclipse Modeling Tools:
Install the Eclipse Modeling Tools instance from [Eclipse Downloads](https://www.eclipse.org/downloads/)
Note: SODALITE IDE has been tested in the version 2020-06 R (4.16.0) of the Eclipse Modeling Tools, which can be downloaded from [here](https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-modeling-tools)

## IDE Installation from the Sodalite IDE update site
### Add Software sites for Sodalite IDE and dependencies
1. In Eclipse, select the menu option: *Help/Install New Software...*. Click on the *Add* button. In the dialog, give the name *"SODALITE IDE"* and the following update site location: https://sodalite-eu.github.io/ide/. 
Then, click on *Add* button.  
2. Following the same procedure as before add the following external software repositories to your list of software sites:
Name: Sirius-XText integration, Location: https://altran-mde.github.io/xtext-sirius-integration.io/p2/
3. Make sure that in the *Install software* dialog window, in the *Work with* combo box, you also select the *SODALITE IDE* entry. In the below panel, mark the *SODALITE IDE* checkbox. Be sure the chekbox *Contact all updates sites during install to find required software* is selected. Click twice the *Next* button. Accept the license, and finish the dialog. When prompted, accept. Restart Eclipse once the SODALITE IDE has been installed.

## IDE Installation from the Sodalite IDE source code

Follow the following procedure to download the SODALITE IDE, build and install it into your Eclipse installation:

### Build the Sodalite IDE update site from sources

1. Clone SODALITE IDE repository from GitHub: `git clone https://github.com/SODALITE-EU/ide.git`. This will create a local folder, hereafter referenced as *$IDE_REPO*
2. Open a CLI and go to *$IDE_REPO/dsl/org.sodalite.IDE.parent* folder. Build the SODALITE IDE Eclipse repository (i.e. update site) using Maven, with this command: `mvn clean verify -U`
3. Once complete, open the Eclipse Modeling Tools instance.

### Add Software sites for Sodalite IDE and dependencies

1. In Eclipse, select the menu option: *Help/Install New Software...*. Click on the *Add* button. In the dialog, give the name *"SODALITE IDE"* and click on the *Local* button. Navigate to the path *$IDE_REPO/dsl/org.sodalite.IDE.parent/org.sodalite.IDE.repository/target/repository/*. Then, click on *Add* button. 
2. Following the same procedure as before add the following external software repositories to your list of software sites:
Name: Sirius-XText integration, Location: https://altran-mde.github.io/xtext-sirius-integration.io/p2/
3. In the former dialog, in the *Work with* combo box, select the *SODALITE IDE* entry. In the below panel, mark the *SODALITE IDE* checkbox. Be sure the chekbox *Contact all updates sites during install to find required software* is selected. Click twice the *Next* button. Accept the license, and finish the dialog. When prompted, accept. Restart Eclipse once the SODALITE IDE has been installed.

## IDE Documentation
[IDE tutorial](https://docs.google.com/document/d/1w6wYJbTZvBbt5LD6sXReXbx1uPDjefYFAU5KEv8X_8w/edit?usp=sharing) for users is available

Main contact: Jesús Gorroñogoitia <jesus.gorronogoitia@atos.net>

![Project funded by the European Union](images/european.union.logo.png) 
