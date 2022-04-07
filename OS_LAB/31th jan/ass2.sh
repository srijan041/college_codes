#!/bin/bash
for ((i = 1; i <= 20; i++)); do
    if [ $(($i % 2)) -eq 0 ] 
    then
        sum=$(($sum + $i))
    fi
done
echo "Sum of all even from 1 to 20 = $sum"
