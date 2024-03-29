## Calculates the GPA of each student.
## Author: M. Ployee
## Last Modified: 25/8/21
## Contributors:
### M. Ployee


#Blank variable to store user input and GPA
totals = set()
letters = set()

#Get and store user input
print ("Please enter the grade for each student, or press q to quit")
while(True):
    user_input = input("> ")
    if(user_input.lower() == "q"):
        break
    totals.add(user_input)

#Caclulate letter grade for each user response
for total in totals:
    if total <= "59":
        letters.add("F")
    elif total <= "69":
        letters.add("P")
    elif total <= "79":
        letters.add("C")
    elif total <= "89":
        letters.add("D")
    else:
        letters.add("HD")

#Print GPA results.
print("The GPA for your students is: {}".format(totals))