#Author: Jeremiah Poblete
#Course: Python IS-2053

#Description: Recursive function that will sum all numbers leading up to the number given

#function that will solve recursion problem
def sum(n):
    #base case if number is 1 it will return 1. It will also exit the recursion once number has looped to 1
    if n == 1:
        #will return 1 in base case
        return n
    
    else:
        #returns the number that is inputed and calls the function again but subtracts one from the number. This will keep repeating until base case is processed. Then it will unpack and give the numbers summed
        return n + sum(n-1)


#main function that prompts for user input
if __name__ == '__main__':
    number = int(input("Please enter a number: "))
    #calls the function and stores the result that is returned
    result = sum(number)
    #print the result of the sum function
    print(result)