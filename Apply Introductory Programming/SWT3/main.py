"""
Program Summary: Make books list

Created by: Glen Mac
Created on: 17-Aug-2022
Last Edited: 17-Aug-2022

"""

class Book:
    def __init__(self, Title, Author, ISBN, CallNumber, Stock, Loaned):
        self.Title = Title
        self.Author = Author
        self.ISBN = ISBN
        self.CallNumber = CallNumber
        self.Stock = Stock
        self.Loaned = Loaned

Books = list()

# os.chdir(os.getcwd() + '/Apply Introductory Programming/SWT3/')
BookFile = open('books.txt','r')
BookList = BookFile.readlines()
for itemString in BookList:
    itemList = itemString.split(';')
    Books.append(Book(itemList[0],itemList[1],itemList[2],itemList[3],itemList[4],itemList[5]))
    # print(item) 



Books.append(Book('Fairies','Glen',12345,'ab123',4,False))

