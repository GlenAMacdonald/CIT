## Calculates the GPA of each student.
## Author: M. Ployee
## Last Modified: 26/8/2022 - by Glen Macdonald
## Contributors:
### M. Ployee
### G. Macdonald


#Blank variable to store user input and GPA
totals = list()
letters = list()

#Get and store user input
print ("Please enter the grade for each student, or press q to quit")
while(True):
    user_input = input("> ")
    if(user_input.lower() == "q"):
        break
    totals.append(int(user_input))

#Caclulate letter grade for each user response
for total in totals:
    if total <= 59:
        letters.append("F")
    elif total <= 69:
        letters.append("P")
    elif total <= 79:
        letters.append("C")
    elif total <= 89:
        letters.append("D")
    else:
        letters.append("HD")

#Print GPA results.
print("The GPA for your students is: {}".format(totals))