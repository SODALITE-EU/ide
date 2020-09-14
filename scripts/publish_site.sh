#!/usr/bin/env bash
cp -r dsl/org.sodalite.IDE.parent/org.sodalite.IDE.repository/target/repository/ site/repository/
scripts/deploy.sh -c ./scripts/setup.env
