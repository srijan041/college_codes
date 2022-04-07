#!/bin/bash
read -p "Enter lower range: " low
read -p "Enter upper range: " upper

for ((i = low; i <= upper; i++)); do
    flag=0
    for ((j = 1; j < i / 2; j++)); do
        if [ $(expr $i % $j) -eq 0 ]; then
            flag=1
            break
        fi
    done
    if [ $flag -eq 0 ]; then
        echo "$i is prime"
    fi
done
