#!/bin/bash

#operators:
#   equal ==/-eq
#   greaterthanequalto -ge
#   lessthanequalto -le
#   greater than -gt
#   less than -lt
#   not equal -ne/!=

#echo What is your name?
read -p 'What is your age? ' age

if [ $age -ge 18 ]; then
    echo You can vote!
else
    echo You cannot vote!
fi
