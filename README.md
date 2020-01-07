# [![SODALITE](images/sodalite-logo.png)](https://www.sodalite.eu/) Sodalite project: IDE

This repository contains the Sodalite IDE (based on Eclipse).

## Repository structure

- dsl: This folder contains the Eclipse plugins of the Sodalite IDE: DSL Editor for AADM and Resource Models (RMs)
- PoCs: This folder contains some PoCs developed to test XText technologies and model Tosca metamodels

## IDE build and installation

Follow the following procedure to download the SODALITE IDE, build and install it into your Eclipse installation:

1. Clone SODALITE IDE repository from GitHub: `git clone https://github.com/SODALITE-EU/ide.git` . This will create a local folder, hereafter referenced as *$IDE_REPO*
2. Open a CLI and go to *$IDE_REPO/dsl/org.sodalite.IDE.parent*. Build the SODALITE IDE Eclipse repository (i.e. update site) using Maven, with this command: `mvn clean verify`
3. Once complete, open an Eclipse Modeling Tools instance (you can install it from [here](https://www.eclipse.org/downloads/packages/release/2019-12/r/eclipse-modeling-tools), version 2019-09 R (4.13.0) or above).
4. Select menu option: *Help/Install New Software...*. Click on *Add* button. In the dialog, give the name "SODALITE IDE" and click on *Local* button. Navigate to the path *$IDE_REPO/dsl/org.sodalite.IDE.parent/org.sodalite.IDE.repository/target/repository/*. Then, click on *Add* button. In the former dialog, in the *Work with* combo box, select the *SODALITE IDE* entry. In the below panel, mark the *SODALITE IDE* checkbox. Click twice the *Next* button. Accept the license, and finish the dialog. When prompted, accept. Restart Eclipse once the SODALITE IDE has been installed.

Main contact: Jesús Gorroñogoitia <jesus.gorronogoitia@atos.net>

![Project funded by the European Union](images/european.union.logo.png)
