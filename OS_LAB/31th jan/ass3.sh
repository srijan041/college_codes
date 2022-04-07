#!/bin/bash
read -p "Enter range: " num
for ((i = 1; i <= $num; i++)); do
    sum=$(($sum + $i))
done
echo "Sum from 1 to $num = $sum"
