'''
Introductory Programming Session 5 Practical Activity

Created by: Glen Macdonald
Created on: 12-Aug-2022
Last Edited: 12-Aug-2022
'''

raw_data = '5957276,Hadi Yap,Interface Design,25;9273408,Efrat Henriksen,Interface Design,22;5069877,Henrikki Salazar,Artificial Intelligence,10;9919992,Aurelianus Das,Data Modelling with SQL and Python,15;7295548,Dalia Milovanovic,Data Modelling with SQL and Python,13;5069877,Henrikki Salazar,Discrete Mathematics,20;7295548,Dalia Milovanovic,Discrete Mathematics,18;7295548,Dalia Milovanovic,Programming in C#,13;7295548,Dalia Milovanovic,Programming in C#,17;9919992,Aurelianus Das,Programming in Java,17;9919992,Aurelianus Das,Programming in Java,19;5957276,Hadi Yap,Master Microsoft Office,12'
raw_classes = raw_data.split(';')
teachers = dict()
classes = list()

for raw_class in raw_classes:
    temp = raw_class.split(',')
    teachers[temp[0]] = temp[1]
    class_ = [temp[0],temp[2],[3]]
    classes.append(class_)

for class_ in classes:
    



