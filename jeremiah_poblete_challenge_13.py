#Author: Jeremiah Poblete
#Course: Python IS-2053

#Description: Password Validation using Regular Expression


#allows for the use of regular expression funcitons
import re

#regex object using raw string. The ? ensures there is zero or one occurence then it is compared to the string using .* showing zero or more occurence of the password given. This confirms there is at least one lowercase, one uppercase, one number and one special character in the password. It then validates that all characters are within the appropriate string given and at least 8 characters.
validate = r"^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%*!])[0-9a-zA-Z@#$%*!]{8,}$"

#prompts user input
password = input("Please enter a password to validate: ")

#if password is not validated it will propmt user to input until an appropriate password is given.
while not re.match(validate, password):
    print("That is not a valid password.\n")
    password = input("Enter another password: ")

#prints only after password is validated.    
print("That is a valid password.")