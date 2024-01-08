#Author: Jeremiah Poblete
#Course: Python IS-2053

#Description: Program allows user to create a character using classes, character customization and random number generation.

#Random function that allows for the use of random variables
import random

#Superclass Humanoids that will be the base of all subclasses
class Humanoids:
    
    #initializes the object with attributes
    def __init__(self, height, weight, hairColor, eyeColor):
        #Assign values to attribute
        self.height = height
        self.weight = weight
        self.hairColor = hairColor
        self.eyeColor = eyeColor
        #Assignes random numbers to each attribute
        self.strength = random.randint(1,18)
        self.dexterity = random.randint(1,18)
        self.constitution = random.randint(1,18)
        self.intelligence = random.randint(1,18)
        self.wisdom = random.randint(1,18)
        self.charisma = random.randint(1,18)
        
    #Setters set attribute to the value given
    #Getters returns the attribute value
    def set_height(self, height):
        self.height = height
    
    def get_height(self):
        return self.height
    
    def set_weight(self, weight):
        self.weight = weight
        
    def get_weight(self):
        return self.weight
    
    def set_hairColor(self, hairColor):
        self.hairColor = hairColor
    
    def get_hairColor(self):
        return self.hairColor
    
    def set_eyeColor(self, eyeColor):
        self.eyeColor = eyeColor
        
    def get_eyeColor(self):
        return self.eyeColor
 
# Subclass Humans of Humanoid class    
class Humans(Humanoids):
    #Initializes the attributes associated with the Human class
    def __init__(self, height, weight, hairColor, eyeColor, attribute):
        #Initializes the attributes that are already assigned in the humanoid class
        Humanoids.__init__(self, height, weight, hairColor, eyeColor)
        self.attribute = attribute
        
    # Function that is called upon in order to output the attributes of the class that was chosen by user 
    def info(self):
        # Gets the values associated with the user input
        attributeValue = getattr(self, self.attribute)
        # +2 Bonus that will be added to attribute
        attributeBonus = 2
        # Adds the Value and the bonus
        totalAttribute = attributeValue + attributeBonus
        # Outputs the them attribute and its bonus
        attributeInfo = f"{self.attribute.capitalize()}:{attributeValue}+{attributeBonus}\t\t**{totalAttribute}**"
        
        #returns the attriutes of the class
        return f"\nClass: \t\t\tHuman \nHeight: \t\t{self.height}ft \nWeight: \t\t{self.weight}lbs \nHair Color: \t\t{self.hairColor} \nEye Color: \t\t{self.eyeColor} \nStrength: \t\t**{self.strength}** \nDexterity: \t\t**{self.dexterity}** \nConstitution: \t\t**{self.constitution}** \nIntelligence: \t\t**{self.intelligence}** \nWisdom: \t\t**{self.wisdom}** \nCharisma: \t\t**{self.charisma}** \n\n***Bonus*** \n{attributeInfo}"
    
# Subclass Elves of Humanoid class    
class Elves(Humanoids):
    #Initializes the attributes associated with the Elves class
    def __init__(self, height, weight, hairColor, eyeColor):
        #Initializes the attributes that are already assigned in the humanoid class
        Humanoids.__init__(self, height, weight, hairColor, eyeColor)
        self.__sleep = 100
    
     # Function that is called upon in order to output the attributes of the class that was chosen by user 
    def info(self):
        
        return f"Class: \t\t\tElf \nHeight: \t\t{self.height}ft \nWeight: \t\t{self.weight}lbs \nHair Color: \t\t{self.hairColor} \nEye Color: \t\t{self.eyeColor} \nStrength: \t\t**{self.strength}** \nDexterity: \t\t**{self.dexterity}** \nConstitution: \t\t**{self.constitution}** \nIntelligence: \t\t**{self.intelligence}** \nWisdom: \t\t**{self.wisdom}** \nCharisma: \t\t**{self.charisma}** \n\n***Bonus*** \nDexterity: {self.dexterity}+2\t\t**{self.dexterity + 2}** \nCharisma: {self.charisma}+2 \t\t**{self.charisma + 2}**\nSleep Resistance: \t**{self.__sleep}%**"

# Subclass Dwarves of Humanoid class    
class Dwarves(Humanoids):
    #Initializes the attributes associated with the Dwarves class
    def __init__(self, height, weight, hairColor, eyeColor):
        #Initializes the attributes that are already assigned in the humanoid class
        Humanoids.__init__(self, height, weight, hairColor, eyeColor)
        self.__magicResist = 20
    
    # Function that is called upon in order to output the attributes of the class that was chosen by user     
    def info(self):
        return f"Class: \t\t\tDwarf \nHeight: \t\t{self.height}ft \nWeight: \t\t{self.weight}lbs \nHair Color: \t\t{self.hairColor} \nEye Color: \t\t{self.eyeColor} \nStrength: \t\t**{self.strength}** \nDexterity: \t\t**{self.dexterity}** \nConstitution:  \t\t**{self.constitution}** \nIntelligence: \t\t**{self.intelligence}** \nWisdom: \t\t**{self.wisdom}** \nCharisma: \t\t**{self.charisma}** \n\n***Bonus*** \nStrength: {self.strength}+2 \t\t**{self.strength + 2}** \nConstitution: {self.constitution}+2 \t**{self.constitution + 2}**\nMagic Resistance: \t**{self.__magicResist}%**\n\n***Debuff***\nCharisma: {self.charisma}-2 \t\t**{self.charisma - 2}**"
    
# Character creation that prompts the user to create their character
def characterCreation():
    
    # List that hold the colors that can be used in the program for hair and eyes
    hair = ['white', 'silver', 'gray', 'black', 'brown', 'green', 'blue', 'yellow', 'pink', 'red', 'blonde']
    eye = ['white', 'black', 'red', 'green', 'blue', 'brown', 'purple', 'amber']
    att = ['strength', 'dexterity', 'constitution', 'intelligence', 'wisdom', 'charisma']
    
    # Try and Except to catch exceptions and errors
    try:
        # Prompts user to choose a playable character
        print("You can choose from the following playable races: ")
        choice = int(input("1. Human \n2. Elf \n3.Dwarf\n\n"))
        # While not to ensure input is between the ranges given
        while not (1<= choice <=3):
            print("\n***Invalid: You must choose one of the following***\n")
            choice = int(input("1. Human \n2. Elf \n3.Dwarf\n"))
              
        height = float(input("\nPlease enter the height of your character (4ft-7ft): "))
        while not (4<= height <=7):
            height = float(input("\n***Invalid: You must enter a height between (4ft-7ft)***\n"))
            
        weight = int(input("\nPlease enter the weight of your character from (60lbs-300lbs): "))
        while not (60<= weight <=300):
            weight = int(input("\n***Invalid: You must enter a weight between (60lbs-300lbs)***\n"))    
        
        # While loop to iterate through the list to ensure input is valid.
        while True:
            hairColor = input("\nPlease enter hair color for your character: ").lower()
            if hairColor in hair:
                break
            else:
                print("\n***Invalid Color Option: Please choose another color***")
        
        while True:
            eyeColor = input("\nPlease enter eye color for your character: ").lower()
            if eyeColor in eye:
                break
            else:
                print("\n***Invalid Color Option: Please choose another color***")
        
        # If and Elif to choose between the different classes 
        if choice == 1:
            # Prompts user to choose an attribute to add 2 points to
            attribute = input("\nHuman Attribute: +2 to any attribute of your choice \nPlease enter one of the following: \nStrength \nDexterity \nConstitution \nIntelligence \nWisdom \nCharisma\n").lower()
            
            # While loop that prompts user to keep entering an attribute if they do not input a correct one
            while attribute not in att:
                attribute = input("\nHuman Attribute: +2 to any attribute of your choice \nPlease enter one of the following: \nStrength \nDexterity \nConstitution \nIntelligence \nWisdom \nCharisma\n").lower()
            
            # Creates Human object and assigns values for arguments given in Humans
            yourHumans = Humans(height, weight, hairColor, eyeColor, attribute)
            #prints the info assigned to the Human class
            print (yourHumans.info())    
            
                
        elif choice == 2:
            # Outputs the attributes of the Elves class
            print("\nElves Attributes: \n100'%' Sleep Resistance \n+2 Dexterity \n+2 Charisma\n")
            # Creates Elves object and assigns values for arguments given in Elves
            yourElves = Elves(height, weight, hairColor, eyeColor)
            #prints the info assigned to the Elves class
            print (yourElves.info())
            
        elif choice == 3:
            # Outputs the attributes of the Dwarves Class 
            print("\nDwarves Attributes: \n20'%' Magic Resistance \n+2 Strength \n+2 Constitution \n-2 Charisma\n")
            # Creates Dwarves object and assigns values for arguments given in Dwarves
            yourDwarves = Dwarves(height, weight, hairColor, eyeColor)
            #prints the info assigned to the Dwarves class
            print (yourDwarves.info())
            
    except ValueError:
        print("\nPlease only enter value in the range given.")
        # Loops back into character creation
        characterCreation()
        

 # Main Function  
if __name__ == ('__main__'):
    print("**********Welcome to Jeremiah's RPG**********")
    # Calls the character creation function
    characterCreation()
