## Let's Learn Arrays!

[<- Previously:  Let's Loop de Loop!](Loops.md)

**Objectives**: Create a foundational understanding of Arrays.

**Process**: 

In the last lesson we learned about loops, which allow us to do a lot in just a little code. Now we'll learn about arrays, which allow us to store a lot of data in a little bit of code.

As we learned, variables are created like this:

```int x = 5;```

Sometimes, though, we need might have a lot of data we need to store. Say we have 10 data points. We could do something like [this](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/Arrays1.java) and declare all the variables seperately. Notice that we can declare a bunch of variables of the same type by placing commas between them. This is a useful shortcut when we want to declare several variables of the same type. But what if we wanted to multiply all of these variables by two? There's no efficient way of doing that, we'd have to do it manually for all of them.

Thankfully we have a handy thing called *arrays* in Java.

Take a look at [this code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/Arrays2.java) and run it. What does it output?

Let's break the code down. We see the for loop, which we already learned about, but there's something new here, `int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}`.

This is one of the ways that we can declare and initialize an array. The first part here is `int[]`. The int tells us that it is an array of integers. Arrays cannot contain more than one kind of variable. The square brackets `[]` after int tell us that this is an array. 

After the equals sign is `{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}`. These are the *elements* of the array, basically the value of the array. When initializing (giving a value to) an array, the elements are always between curly braces `{}` and separated by commas. You're basically just typing out a list of the values.

Each number in the array has a position, or *index*. To access a specific value from an array, you have to place the index you want between the square brackets, like so: `arr[5]`. This would access the value at index 5. Arrays are *zero-indexed*, meaning that the first value has the index 0, and the indexes count up from there. Because of this, `arr[5]` would be equal to six in the array we just made.

If we were to match up the array values with their indexes it would look like this:

{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
 0, 1, 2, 3, 4, 5, 6, 7, 8, 9

In the for loop header we see that our conditional is `i < arr.length`. This makes it so that the loop will stop when i equals the array length. This is done because since array indexes start at zero, the length will always be 1 bigger than the last index of the array. We don't want to go past the last element of the array, or else we'll get an error.

Then, inside the for loop we have `System.out.println(arr[i])`. This prints out every value of the array. There are other ways to do this, but this is the simplest. 

This is not the only way that we can declare an array. We can also do it like [this](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/Arrays3.java). Try running this code. What do you think it will output?












As you saw, it printed a bunch of zeroes. This is because when we create an array by saying `int[] arr = new int[10]`, we're creating a array with length 10, but not specifiying any values for its numbers. Java automatically sets all the values equal to zero when we do this.

Changing the values of the array is just like changing the value of any other variable. If we wanted to change the value of the first number in the array to 5, for 
example, we would do `arr[0] = 5;`.

As an exercise, try to take an empty array and set each value equal to the index squared, so the values would be 0x0, 1x1, 2x2, and so on. Here's some [starter code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/Arrays4.java).

----------------------------------------------------------

Let's say that we have a sensor that stores its last 10 readings in an array. We want to take an average of these readings, but we want to find the highest and lowest values in the array so that we can exclude them. Here's some [code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/Arrays5.java) to get you started.


[Next: Let's Make Objects! ->](Objects.md)

[Back to Main](../../README.md)