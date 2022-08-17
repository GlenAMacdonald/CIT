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
    
    def toString(self):
        rString = self.Title + ';' + self.Author + ';' + self.ISBN + ';' + self.CallNumber + ';' + self.Stock + ';' + self.Loaned + ';'
        return rString


# books.append(Book('Fairies','Glen','12345','ab123','4','3'))

def importBooks():
    # os.chdir(os.getcwd() + '/Apply Introductory Programming/SWT3/')
    books = list()
    bookFile = open('books.txt','r')
    bookList = bookFile.readlines()
    for itemString in bookList:
        itemList = itemString.split(';')
        books.append(Book(itemList[0],itemList[1],itemList[2],itemList[3],itemList[4],itemList[5]))
        # print(item) 
    return books

def exportBooks(books):
    bookFile = open('outBooks.txt','w')
    for book in books:
        bookString = book.toString() + '\n'
        bookFile.write(bookString)
    bookFile.close()




