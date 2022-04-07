
import random

passLength = int(input('Enter the length of password: '))

s = 'qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890[].,/?!@#$%^&*()_+=:'

print(''.join(random.sample(s, passLength)))
