#!/bin/bash

read -p 'enter first number: ' a
read -p 'enter second number: ' b

if [ $a -gt $b ]; then
    echo "$a is greater than $b."
else
    echo "$b is greater than $a."
fi
