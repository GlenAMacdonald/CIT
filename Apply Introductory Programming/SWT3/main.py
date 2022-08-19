"""
Program Summary: Make books list

Created by: Glen Mac
Created on: 17-Aug-2022
Last Edited: 19-Aug-2022

"""

# This collection is needed for the 'Books' Object
from collections import UserList

# Class 'Book' holds the required attributes and has a toString function which converts the book object to a string which gets stored 
# in the text file.

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

# The 'Books' Class implements the class 'UserList', which is an extendable version of data-type list()
# It holds all the functions which operates on itself! including adding objects of class Book, to itself.
# None of the functions in 'Books' return anything as they operate directly on 'Books' itself.

class Books(UserList):

    # Importbooks opens up the text file 'database', creates the book object and adds it to Books
    def importBooks(self):
        bookFile = open('books.txt','r')
        bookList = bookFile.readlines()
        for itemString in bookList:
            itemList = itemString.split(';')
            self.append(Book(itemList[0],itemList[1],itemList[2],itemList[3],itemList[4],itemList[5]))

    # Exportbooks converts all the 'Book' objects in 'Books' to strings and stores them in the text file database
    def exportBooks(self):
        print('\nExporting Inventory\n')
        bookFile = open('books.txt','w')
        for book in self:
            bookString = book.toString() + '\n'
            bookFile.write(bookString)
        bookFile.close()
        print('Export complete\n')

    # addBook requests book attributes from the user, generates the 'Book' object and stores it in 'Books'
    def addBook(self):
        print("\nAdding a New Book\n")
        title = input("Title> ")
        author = input("Author> ")
        isbn = input("ISBN> ")
        callNumber = input("Call Number> ")
        stock = input("Stock> ")
        loaned = input("Loaned> ")
        self.append(Book(title,author,isbn,callNumber,stock,loaned))

    # removeBook requests input from the user, finds all the book objects with the specified attribute and removes them from 'Books'
    # note that the second for loop is required as if the removal occurs in the first for loop, it will terminate after the 
    # removal of the first book that matches the specification - not sure why.
    def removeBook(self):
        print("\nRemoving a book \n")
        author = input("Author> ")
        callNumber = input("Call Number> ")
        removalList = list()
        for book in self:
            if book.Author == author and book.CallNumber == callNumber:
                removalList.append(book)
        for book in removalList:
            self.remove(book)
    
    # displayBooks shows all the books in the database
    def displayBooks(self):
        print("\nDisplaying Westlands Books Inventory\n")
        ts = ['Name','Author','ISBN','Call Number','Stock','Loaned','Available']
        print(f"{ts[0]:<50}\t{ts[1]:<20}\t{ts[2]:<13}\t{ts[3]:<13}\t{ts[4]}\t{ts[5]}\t{ts[6]}")
        for book in self:
            print(f"{book.Title[0:50]:<50}\t{book.Author[0:20]:<20}\t{book.ISBN[0:13]:<13}\t{book.CallNumber[0:13]:<13}\t{book.Stock:^5}\t{book.Loaned:^6}\t{int(book.Stock)-int(book.Loaned):^9}")

    # displayMenu gets looped through to prompt the user for the next input.
    def displayMenu(self):
        print('\nWestlands Books Inventory Management Subsystem\n')
        print('1. Display Inventory')
        print('2. Add a Book')
        print('3. Remove a Book')
        print('4. Export Inventory')
        print('5. Quit IMS')

# Initialize the 'Books' list, import the data and....
books = Books()
books.importBooks()

# while the user hasn't quit or entered something funny, run the requested function.
while True:
    books.displayMenu()
    userInput = input('Select an option from the menu> ')
    match userInput:
        case '1':
            books.displayBooks()
        case '2':
            books.addBook()
        case '3':
            books.removeBook()
        case '4':
            books.exportBooks()
        case '5':
            break
        case other:
            print('\nUnexpected command requested, exiting\n')
            break
    
