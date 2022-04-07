#!/bin/bash
read -p "Enter number: " num
for ((i = 1; i < num; i++)); do
    if ((($num % i) == 0)); then
        sum=$(($sum + $i))

    fi
done
if (($sum == $num)); then
    echo "$num is perfect"
else
    echo "$num is not perfect"
fi
