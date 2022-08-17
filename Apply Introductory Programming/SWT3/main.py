"""
Program Summary

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
Books.append(Book('Fairies','Glen',12345,'ab123',4,False))

