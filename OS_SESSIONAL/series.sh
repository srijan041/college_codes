#!/bin/bash

read -p "Enter the numebr of terms: " n
term=3

for ((i = 1; i <= n; i++)); do
    #for i in {1..n}; do
    echo -ne "$term, "
    let term+=8
done
