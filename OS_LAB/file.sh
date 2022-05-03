#!/bin/bash

names="/home/minato/Code/CODE/OS_LAB/name"

for name in $(cat $names); do
    echo $name
done
