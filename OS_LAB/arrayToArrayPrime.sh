#!/bin/bash

arr=(1 2 3 4 5 6 7 8 9)

for i in "${arr[@]}"; do
    let sum=$i+5
    echo $sum
done
