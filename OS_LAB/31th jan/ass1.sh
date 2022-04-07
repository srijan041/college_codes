#!/bin/bash
for ((i = 1; i <= 20; i++)); do
    sum=$(($sum + $i))
done
echo "Sum from 1 to 20 = $sum"
