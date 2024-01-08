#Author: Jeremiah Poblete
#Course: Python IS-2053

#Description: opens .txt file and will count the frequency of words within the file

#function that will open file and create a dictionary showing the word and its frequency
def dictionary():
    #empty dictionary that will create key and value for file 
    stdout = {}
    
    #prompts user to open a specific file they would like to read
    file = open(input('Please enter file path: '))
    
    #for loop that will seperate each word into a line
    for lines in file:
        words = lines.split()
        
        #loop that will strip each word and make it all lower case
        for string in words:
            word = string.strip('.,').lower()

            #places the key and value of how many times a word was repeated into the dictionary
            if word in stdout:
                stdout[word] += 1
            else:
                stdout[word] = 1
            
    #sorts the dictionary in alphabetical order    
    for key in sorted(stdout):
        print (key, stdout[key])
    
    #closes the file 
    file.close()
   
#main function that calls onto ther functions
if __name__ == ('__main__'):
    dictionary()