#!/usr/bin/env bash
set -e

NAME=${NAME:-counter}

JAR=$(find . -name ${NAME}*.jar|head -1)

java   -jar -Dspring.profiles.active=$APP_ENV   "${JAR}"
