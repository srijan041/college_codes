#!/bin/bash
read -p "Enter number: " num
for ((i = $num; i > 0; i--)); do
    echo -n "$i, "
done
