#!/bin/bash
read -p "Number of elements in one line: " value
for ((i = 1; i <= 100; i++)); do
    if ((($i % $value) == 0)); then
        echo "$i, "
    else
        echo -n "$i, "
    fi
done
