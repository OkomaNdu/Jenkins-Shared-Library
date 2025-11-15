#! /usr/bin/env groovy

def call() {
    echo "build the application for branch $GIT_BRANCH"
    sh 'mvn package'
}

