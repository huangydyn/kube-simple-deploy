#!/bin/bash

cp ./docker/docker* /usr/bin/

cp docker.service /etc/systemd/system/

systemctl daemon-reload
systemctl enable docker
systemctl restart docker
