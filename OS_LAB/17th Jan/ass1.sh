#!/bin/bash
read -p "enter first number: " x
read -p "enter second number: " y
sum=$(($x+$y))
echo "addition=$sum" 
echo "difference=" $(($x - $y))
echo "multiplication=" $(($x * $y))
echo "quotient=" $(($x / $y))
echo "remainder=" $(($x % $y))
