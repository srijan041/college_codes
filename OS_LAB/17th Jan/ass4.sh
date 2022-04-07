#!/bin/bash

read -p 'Enter year: ' year
if ((($year % 100) == 0)); then
    if ((($year % 400) == 0)); then
        echo $year is leap
    else
        echo $year is not leap

    fi
elif ((($year % 4) == 0)); then
    echo $year is leap

else
    echo $year is not leap

fi
