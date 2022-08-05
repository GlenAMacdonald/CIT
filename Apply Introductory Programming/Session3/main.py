"""
Program Summary

Created by: Glen Mac
Created on: 05-Aug-2022
Last Edited: 05-Aug-2022

"""
while True: 
    print("=" * 21)
    print("Conversion Categories")
    print("=" * 21)
    print("1. Energy")
    print("2. Temperature")
    print("3. Storage")
    print("q. Quit")
    response = input("Select a category> ")

    if (response == '1'): 
        # Energy Conversion}
        print("You have selected Energy Conversion")
        print("1. kJ to Calories")
        print("2. Calories to kJ")
        conversion_response = input("Select a category> ")

        if (conversion_response == '1') :
            conversion_value = input("Enter value to convert> ")
            return_value = float(conversion_value)/4.184
            print(conversion_value,"kJ is",return_value,"Calories")
        elif (conversion_response == '2'):
            conversion_value = input("Enter value to convert> ")
            return_value = float(conversion_value)*4.184
            print(conversion_value,"Calories is",return_value,"kJ")

    elif (response == '2'):
        # Temperature Conversion
        print("You have selected temperature conversion")
        print("1. F to C")
        print("2. C to F")
        conversion_response = input("Select a category> ")

        if (conversion_response == '1') :
            conversion_value = input("Enter value to convert> ")
            return_value = (float(conversion_value)-32)*5/9
            print(conversion_value,"F is",return_value,"C")
        elif (conversion_response == '2'):
            conversion_value = input("Enter value to convert> ")
            return_value = float(conversion_value)*9/5+32
            print(conversion_value,"C is",return_value,"F") 

    elif (response == '3'):
        # TODO: Storage Conversion
        print("You have selected Storage conversion")
        print("1. MB to GB")
        print("2. GB to MB")
        conversion_response = input("Select a category> ")

        if (conversion_response == '1') :
            conversion_value = input("Enter value to convert> ")
            return_value = float(conversion_value)/1024
            print(conversion_value,"MB is",return_value,"GB")
        elif (conversion_response == '2'):
            conversion_value = input("Enter value to convert> ")
            return_value = float(conversion_value)*1024
            print(conversion_value,"GB is",return_value,"MB") 
    elif response == 'q':
        break
    else:
        # TODO: Invalid input
        print("You have made an invalid input")

    
    





