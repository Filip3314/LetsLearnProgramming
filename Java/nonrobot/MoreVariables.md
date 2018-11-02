
## Let's Learn More Variables!

[<- Previously: Let's Learn Variables!](Variables.md)

----------------------------------------------------------------------------------------

**Objectives**: Expand on our variable knowledge

**Starting Point**: [This Code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/MoreVariables.java)

**Process**: 

1. In the previous lesson we learned about variables called integers ```int``` and doubles ```double```. We mostly focused on integers, and learned about integer division and how to store numbers in variables. We're going to expand a little more on variables in this lesson.

Open the starter code, it's pretty short and I bet you know roughly was it does, but I want to clarify the line with ```println```. 

```Java
System.out.println("Our team number is " + teamNumber);
```

So to start, ```println`` is a *method* that we use to tell the computer we want to print something to the screen. We can tell its a function because its followed by parenthesis with some stuff inside of them. The stuff inside of the parenthesis are called *arguements*.

The arguement for our ```println``` function is a single variable, usually a String, though it can be an int, double, or other variable type. 

```"Our team number is " + teamNumber```

For the most part, we're saying "hey computer, print these characters exactly," but it doesn't print the letters ```teamNumber``` literally. Instead it prints the value of ```teamNumber```, why is that?
The part in quotes is called a *String literal.* This means that it is a String (a variable consisting of a string of characters), and that it is a value rather than a variable. When we put a plus sign after "Our team number is ", we're telling the computer to add something on to the end of that String. This process of sticking things together is called *concatination*. In this case, the computer is  concatinating, or adding, teamNumber to the end of the String. It is outside of the quotes so that the computer recognizes that we're not trying to output the text we're typing, but instead the value of a variable. Remember that the plus sign only works this way when at least one of the things we're adding is a String. **Change the value of** ```teamNumber``` **and run the code.**

The output of the code should have changed to print that our team number is the new value you set ```teamNumber``` to. If you haven't, change the number to a negative number... do you think it will print the negative sign?

What if we wanted to print multiple variables in one line? We just need more plus signs!

Lets modify our code so it prints "Our team number is " + teamNumber + " and we have " + + " students". Lets also add a variable that will hold the number of students, I'll call mine ```numKids``` but you can call yours whatever you'd like. Lastly, lets tell the computer to print the number of kids between "have" and "students". Place ```numKids``` between the two plus signs that have nothing between them.
Our main body should look like this:

```Java
	int teamNumber = 3314;
	int numKids = 24; 
 
	System.out.println("Our team number is " + teamNumber + " and we have " + numKids + " students");
```

Click run to test your code. Did it work?

Change your println arguement so that ```numKids``` has switched places with ```teamNumber``` and click run. As you can see, the variable gets printed wherever we place it in the code.

2.  Now lets try printing a _double_. After we print out our team number, lets make a double. I'm going to call mine pie and pick a value to assign to it. You can pick whatever name and value you want, just make sure its a decimal:

```Java
	double pie = 3;
```
Using ```System.out.println()```, lets print out our _double_:

```Java
	System.out.println("The value of pie is " + pie);
```
Run your code - did it behave how you expected? 

If you didn't include a decimal after your number, you may have noticed that a .0 was added to the end of your number when you printed it. This is because doubles must always have a decimal at the end of them, so when we enter an integer like 3 as the value for the double, it converts it to a double by adding a .0 onto the end. Try doing it the other way around and set an int variable to a decimal.

You probably got an error, and that's because Java has an inbuilt protection against this, to make sure that you don't accidentaly lose your decimal places when doing math.

4. Lets try one last exercise to cement your knowledge:

>>Alex wants to build himself a drivetrain and has everything but the wheels, gearboxes, and encoders. He plans on buying them from VEXpro but seeing as it’s not for 1296, he'll have to pay for them, and he won't even be tax exempt! 
>>
>>He's not sure if he'll build something with 2/4/6/8/16 wheels, how many versa planetaries he will want, and if he will put encoders on all the wheels or just two. Make a program that lets him enter in different amounts of each item and prints what the final cost will be with tax. 
>>
>>Prices and Tax rate are in the template.
>>
>>Example:  If Alex wants 4 versa gearboxes, 6 colson wheels, and 2 encoders - his item total will be $249.88, the tax will be $12.49, and the final price will be $262.37

[Starting Code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/PriceCalculation.java)

Show me your working program and remember you can always ask for help!

----------------------------------------------------------------------------------------

[Next: Let's Learn Functions! ->](Methods.md)

[Back to Main](../../README.md)