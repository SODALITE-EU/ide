#!/usr/bin/env bash
cp -r dsl/org.sodalite.IDE.parent/org.sodalite.IDE.repository/target/repository/ site/
cp scripts/_config.yml site/
cp scripts/index.md site/
scripts/deploy.sh -c ./scripts/setup.env
