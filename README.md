# [![SODALITE](images/sodalite-logo.png)](https://www.sodalite.eu/) Sodalite project: IDE

This repository contains the Sodalite IDE (based on Eclipse).

## Repository structure

- dsl: This folder contains the Eclipse plugins of the Sodalite IDE: DSL Editor for AADM and Resource Models (RMs)
- PoCs: This folder contains some PoCs developed to test XText technologies and model Tosca metamodels

## Requirements
Install the version 2019-09 R (4.13.0) of the Eclipse Modeling Tools instance from [here](https://www.eclipse.org/downloads/packages/release/2019-12/r/eclipse-modeling-tools) 

## IDE Installation from the Sodalite IDE update site
Install the Sodalite IDE into the Eclipse Modeling Tools instance using this [update site](https://raw.githubusercontent.com/SODALITE-EU/ide/master/dsl/org.sodalite.IDE.parent/org.sodalite.IDE.repository/target/repository). For that, select the menu option: *Help/Install New Software...*. Click on the *Add* button. In the dialog, give the name *"SODALITE IDE"* and the update site location given before. Then, click on *Add* button. 
Following the same procedure add the this external [repository for Sirius-XText integration](https://altran-mde.github.io/xtext-sirius-integration.io/p2/) to your list of software sites.
In the former dialog, in the *Work with* combo box, select the *SODALITE IDE* entry. In the below panel, mark the *SODALITE IDE* checkbox. Be sure the chekbox *Contact all updates sites during install to find required software* is selected. Click twice the *Next* button. Accept the license, and finish the dialog. When prompted, accept. Restart Eclipse once the SODALITE IDE has been installed.

## IDE Installation from the Sodalite IDE source code

Follow the following procedure to download the SODALITE IDE, build and install it into your Eclipse installation:

1. Clone SODALITE IDE repository from GitHub: `git clone https://github.com/SODALITE-EU/ide.git`. This will create a local folder, hereafter referenced as *$IDE_REPO*
2. Open a CLI and go to *$IDE_REPO/dsl/org.sodalite.IDE.parent* folder. Build the SODALITE IDE Eclipse repository (i.e. update site) using Maven, with this command: `mvn clean verify`
3. Once complete, open the Eclipse Modeling Tools instance.
4. Select the menu option: *Help/Install New Software...*. Click on the *Add* button. In the dialog, give the name *"SODALITE IDE"* and click on the *Local* button. Navigate to the path *$IDE_REPO/dsl/org.sodalite.IDE.parent/org.sodalite.IDE.repository/target/repository/*. Then, click on *Add* button. 
Following the same procedure add the this external [repository for Sirius-XText integration](https://altran-mde.github.io/xtext-sirius-integration.io/p2/) to your list of software sites.
In the former dialog, in the *Work with* combo box, select the *SODALITE IDE* entry. In the below panel, mark the *SODALITE IDE* checkbox. Be sure the chekbox *Contact all updates sites during install to find required software* is selected. Click twice the *Next* button. Accept the license, and finish the dialog. When prompted, accept. Restart Eclipse once the SODALITE IDE has been installed.

## IDE Documentation
[IDE tutorial](https://docs.google.com/document/d/1w6wYJbTZvBbt5LD6sXReXbx1uPDjefYFAU5KEv8X_8w/edit?usp=sharing) for users is available

Main contact: Jesús Gorroñogoitia <jesus.gorronogoitia@atos.net>

![Project funded by the European Union](images/european.union.logo.png) 
