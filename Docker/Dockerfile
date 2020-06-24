FROM ubuntu:latest
WORKDIR /sodalite
RUN apt-get update && apt-get install openjdk-8-jdk wget libgtk-3-0 -y

#Eclipse Modeling 2019-09
RUN wget https://www.mirrorservice.org/sites/download.eclipse.org/eclipseMirror/technology/epp/downloads/release/2019-09/R/eclipse-modeling-2019-09-R-linux-gtk-x86_64.tar.gz
RUN tar xf eclipse-modeling-2019-09-R-linux-gtk-x86_64.tar.gz

#Sodalite IDE dependencies
RUN ./eclipse/eclipse -application org.eclipse.equinox.p2.director -noSplash -repository http://download.eclipse.org/releases/2019-09 -installIUs org.eclipse.xtext.sdk.feature.group,org.eclipse.sirius.runtime.ide.xtext.feature.group,org.eclipse.sirius.specifier.properties.feature.feature.group,org.eclipse.sirius.samples.feature.group

RUN ./eclipse/eclipse -application org.eclipse.equinox.p2.director -noSplash -repository https://altran-mde.github.io/xtext-sirius-integration.io/p2/,http://updates.yakindu.com/statecharts/releases/,http://download.eclipse.org/releases/oxygen,http://download.eclipse.org/tools/orbit/downloads/drops/R20170919201930/repository -installIUs com.altran.general.integration.xtextsirius.design.feature.feature.group,com.altran.general.integration.xtextsirius.runtime.feature.feature.group
#Sodalite IDE
RUN ./eclipse/eclipse -application org.eclipse.equinox.p2.director -noSplash -repository https://raw.githubusercontent.com/SODALITE-EU/ide/master/dsl/org.sodalite.IDE.parent/org.sodalite.IDE.repository/target/repository -installIUs org.sodalite.dsl.AADM.feature.feature.group,org.sodalite.dsl.optimization.feature.feature.group,org.sodalite.dsl.RM.feature.feature.group


ENTRYPOINT ["/sodalite/eclipse/eclipse", "-data", "/workspace"]
