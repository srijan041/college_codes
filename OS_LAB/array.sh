#!/bin/bash

os=('ubuntu' 'windows' 'kali' 'mint')

os[4]='mac'

unset os[2] #removes element at index

echo "${os[@]}"
echo "${os[1]}"
echo "${!os[@]}" #prints index
echo "${#os[@]}" #prints length

name='Srijan Chakraborty'

echo "${name[@]}"

echo "${name[0]}"

echo "${name[1]}" #prints nothing as entire string in stored in 0th index of name variable
