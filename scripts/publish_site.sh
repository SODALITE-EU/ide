#!/usr/bin/env bash
rm -r site/*
cp -r dsl/org.sodalite.IDE.parent/org.sodalite.IDE.repository/target/repository/* site/
scripts/deploy.sh -c scripts/setup.env -m "IDE update site"
