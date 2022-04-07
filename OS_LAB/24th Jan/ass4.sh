#!/bin/bash
read -p "Enter side 1: " a
read -p "Enter side 2: " b
read -p "Enter side 3: " c
s=$(echo "scale=4; ($a+$b+$c)/2" | bc)
area=$(echo "scale=4; sqrt($s*($s-$a)*($s-$b)*($s-$c))" | bc)
echo "The area of the triangle is $area"
