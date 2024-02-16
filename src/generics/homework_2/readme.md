# Description

In this homework, you will write a program for exercise 1 at the end of the chapter on Generics. In the next homework, you will modify this program to meet the requirements of exercise 2.

### PART1

1. Write a generic class named MyList, with a type parameter T. The type parameter T should be constrained to an upper bound: the Number class. The class should have as a field an ArrayList of T. Write a public method named add, which accepts a parameter of type T. When an argument is passed to the method, it is added to the ArrayList. Write two other methods, largest and smallest, which return the largest and smallest values in the ArrayList.

Create two instances of the above class like shown below and insert bunch of Number into MyList of type Number and bunch of Double into Mylist of type Double.

Then call largest() and smallest() methods in each of the above class.

You can insert the following integer numbers into the list
2

5

-13

11

12

#### And insert the following double numbers:

27.3

5.7

-23.9

1.11

5.12

#### Here is the sample input/outPut

PART 1
The Integer largest:
12
The Integer smallest:
-13
The Double largest:
27.3
The Double smallest:
-23.9
