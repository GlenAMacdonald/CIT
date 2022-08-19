"""
Program Summary: Make books list

Created by: Glen Mac
Created on: 17-Aug-2022
Last Edited: 17-Aug-2022

"""
from collections import UserList
from email.policy import default

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

# JalalsBook = Book('Gettin Huge','JZ','1111111','asdfasd','10000','10000')
# books.append(Book('Fairies','Glen','12345','ab123','4','3'))

# class easyList(UserList):
#     def aad(self):
#         self.append('aad')


class Books(UserList):
    def importBooks(self):
        # os.chdir(os.getcwd() + '/Apply Introductory Programming/SWT3/')
        # books = list()
        bookFile = open('books.txt','r')
        bookList = bookFile.readlines()
        for itemString in bookList:
            itemList = itemString.split(';')
            self.append(Book(itemList[0],itemList[1],itemList[2],itemList[3],itemList[4],itemList[5]))
            # print(item) 
        # return books

    def exportBooks(self):
        print('\nExporting Inventory\n')
        bookFile = open('books.txt','w')
        for book in self:
            bookString = book.toString() + '\n'
            bookFile.write(bookString)
        bookFile.close()
        print('Export complete\n')

    def addBook(self):
        print("\nAdding a New Book\n")
        title = input("Title> ")
        author = input("Author> ")
        isbn = input("ISBN> ")
        callNumber = input("Call Number> ")
        stock = input("Stock> ")
        loaned = input("Loaned> ")
        self.append(Book(title,author,isbn,callNumber,stock,loaned))

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
    
    def displayBooks(self):
        print("\nDisplaying Westlands Books Inventory\n")
        ts = ['Name','Author','ISBN','Call Number','Stock','Loaned','Available']
        print(f"{ts[0]:<50}\t{ts[1]:<20}\t{ts[2]:<13}\t{ts[3]:<13}\t{ts[4]}\t{ts[5]}\t{ts[6]}")
        for book in self:
            print(f"{book.Title[0:50]:<50}\t{book.Author[0:20]:<20}\t{book.ISBN[0:13]:<13}\t{book.CallNumber[0:13]:<13}\t{book.Stock:^5}\t{book.Loaned:^6}\t{int(book.Stock)-int(book.Loaned):^9}")

    def displayMenu(self):
        print('\nWestlands Books Inventory Management Subsystem\n')
        print('1. Display Inventory')
        print('2. Add a Book')
        print('3. Remove a Book')
        print('4. Export Inventory')
        print('5. Quit IMS')

books = Books()
books.importBooks()

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
    
