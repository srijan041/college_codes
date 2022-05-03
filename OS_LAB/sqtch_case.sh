#!/bin/bash

echo Enter choice:
echo A=Date
echo B=Directory

read choice

case $choice in
a) date ;;
b) ls ;;
*) echo Invalid ;;
esac
