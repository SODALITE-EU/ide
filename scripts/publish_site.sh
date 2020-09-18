#!/usr/bin/env bash
rm -r site/*
cp -r dsl/org.sodalite.IDE.parent/org.sodalite.IDE.repository/target/repository/* site/
cp scripts/setup.env.template scripts/setup.env
echo export GIT_DEPLOY_REPO="https://$1:$2@github.com/SODALITE-EU/ide.git" >> scripts/setup.env
scripts/deploy.sh -c scripts/setup.env -m "IDE update site"
