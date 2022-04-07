#!/bin/bash

read -p 'Enter a : ' a
read -p 'Enter b : ' b

if(($a == "true" & $b == "true" ))
then
	echo Both are true.
else
	echo Both are false.
fi

if(($a == "true" || $b == "true" ))
then
	echo Atleast one of them is true.
else
	echo None of them is true.
fi

