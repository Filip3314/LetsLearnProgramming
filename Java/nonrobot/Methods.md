## Let's Learn Methods!

[<- Previously: Let's Learn More Variables!](MoreVariables.md)

----------------------------------------------------------------------------------------

**Objectives**: Learn how to use and write methods.

**Starting Point**: [Code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/Methods.java)

**Process**: 
Sometimes we want to use the same code over and over again. In the last lesson, we had to write product\*price a lot and while that was only one line, imagine how much work it would have been if we calculated the tax for each set of parts (wheels, encoders, etc). 

This is where _methods_ come in. _Methods_ allow us to make reusable code without a lot of copy/paste. Lets look at the following method:

```
public static int myMethod(int a, int b) {
        int product = a * b;
        System.out.println("a = " + a + ", b = " + b + ", product = " + product);
        return product;
    }
```

Lets break down the anatomy of the method line by line:

```public static int myMethod(int a, int b)``` This line is called the _method header_. There is a lot of information in this header. 

The first thing we see is ```public```. This is an _access modifier_. In this case it is public, which simply means that other files can use, or *call*, this method. Note that you don't have to include an access modifier in your method header.

Next is ```static```. This means that the method belogs to the class, rather than an instance of the class. That probably doesn't make a lot of sense to you right now,but we will learn more about instances later. Just know for now that we have to include this to be able to use the method we made in main. Try removing it and see what happens.

Then we see ```int```. This is the _return type_ of the method and means that the method _returns_ an int. We'll talk more about that later.

```myMethod``` is the name of the method. We can name the method almost anything - I chose a really boring name. 

```(int a, int b)``` these are the _arguements_. We talked about _arguements_ with the println line. When we make our own method we need to tell the computer what arguements we want/are expecting. When we define the arguements, we have to tell the computer what type the argument is as well as what we are going to name it. The arguements are then variables that only exist inside our method.

```
{
    int product = a * b;
    System.out.println("a = " + a + ", b = " + b + ", product = " + product);
    return product;
}
```

This whole section is called the _method body_. This is where all the code in our method lives! The first two lines in our body are just normal code that we are used to writing. 

The last line is the _return statement_. Because everything inside our method only lives inside the method (no one else can see inside the method), we use return statements to give information back to our other code. We can only have one return statement and any code after a return statement will never be run! Return is akin to "The End" in a book. We have to make sure the type of data we return is set as the return type at the beggining of the method header. 

We can have all different kinds of return types - int, double, char, float and even void! Void is when our method doesn't return anything

In our starting code, we call myMethod(2,6). What do you think x will equal after calling that line?

If you guessed 12, you'd be correct! To understand why, when we call _return_ in the method, we are saying "wherever you called me, give that line of code this data". 

What do you think would happen we changed our code to the following?

```
int x = myMethod(myMethod(2,2),3);
```
Try to figure it out and then edit the code and try it out. Explain to Filip what you think is happening. 

.

.

.

.

Did you try?

.

.

.

.

.

After that line of code, x will equal 12. Why is that?
```
int x = myMethod(myMethod(2,2),3);
```
We need to evaluate the inner most "my method" first - its like order of operations. `myMethod(2,2)` _returns_ 4. We can effectively replace `myMethod(2,2)` with `4`.  Now we're calling the outermost `myMethod()` as `myMethod(4,3)` which returns 12 and is assigned to x. 

----------------------------------------------------------------------------------------
So lets practice with methods some more.

Lets open up [this code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/SquareCircle.java) and solve the following problem:
Compute the difference in area between a square and a circle of the same diameter. Our method will take in a diameter and return the difference in area. For this practice, we only need to fill in the method body.

![Image](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/Images/circle.PNG)

----------------------------------------------------------------------------------------

Lets cement our knowledge and write two more funcitons: one that converts from Celsius to Fahrenheit and one that converts Fahrenheit to Celsius.

Here is the formula for Celsius to Fahrenheit to get you started: Fahrenheit = Celsius * 1.8 + 32

[Here is your starter code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/CelsiusFahrenheit.java)

----------------------------------------------------------------------------------------

[Next: Let's Learn unConditionally! ->](Conditionals.md)

[Back to Main](../../README.md)
