## Let's Loop de Loop!

[<- Previously:  Let's Learn unConditionally!](Conditionals.md)

----------------------------------------------------------------------------------------

**Objectives**: Learn about while loops and for loops

**Process**: 

Loops are everywhere in life, you just may not realize it. A loop can loosely be defined as "something that repeats with or without small changes each time."

Common examples of loops include:
* Counting: "One, two, three, four..."
* Music: "My name is no, my number is no, my sign is no..."
* Brushing your Teeth: "My toothpaste lasts two weeks. Until the toothpaste runs out, I can brush my teeth."
* Using your Phone: "While my battery is more than 0%, I can watch YouTube."

Can you think of any other loops you see everyday?

Let's try counting in code. Let's start with [this code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/Loops1.java).

"Oh, that's only five lines of code! That's not bad!"

Oh contrair, young pupil, what if I asked you to count to one hundred? One thousand? Four thousand ninety-six?

"But that's... a lot of lines of code! Ain't nobody got time for that!"

![IMAGE](http://quotespictures.com/wp-content/uploads/2013/04/dont-worryi-got-your-back-funny-quote.jpg)

There are these amazing things in code called *for loops* and *while loops*! For now, let's start with for loops.

Take a look at [this code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/Loops2.java).

Run the code. What do you notice with the output?

Let's take a closer look at this line: `for (int i = 1; i <= 5; i++)`

First, the keyword `for` lets Java know that this is a for loop.

Next, the `int i = 1` declares a new integer to be used as a counter for the loop. Think of this as where we start counting - we can start counting at 0, 1, 10, 15, 562, etc. 

Then, the `i <= 5` limits the for loop by setting a bound for the integer. This is how high (or low) we want to count. The loop will run over and over again as long as this statement is true. 

Lastly, the `i++` tells the code to increment `i` by one at the conclusion of each [iteration](https://www.techopedia.com/definition/3821/iteration) of the loop. An _iteration_ is what we call the code that is actually run in the loop - its all the code that exists between `{` and `}`.  

Note: Our post-iteration action can be any line of code. We could have done `i = i + 1` which would be the same thing. Other things we could do are decrementing i with `i--` aka `i = i - 1`, multiply i by three `i = i*3`, or multiple i by i `i = i*i`. 

Just be careful - if you do `for(i = 10; i > 5; i = i + 1)` then you'll be in an infinite loop! `i` will always be greater than 5 and the for loop will run forever!

To practice, try changing the code to count to ten by twos. 

------------------------------------------------------------------------------------------

Now, Andy, Dom, and Jared are playing the game "3, 5." The rules of the game are as follows:
* Players take turns saying a number, increasing by one each time
* If a number is divisible by either 5 or 3, the player claps instead of saying a number
* If a number is divisible by both 5 and 3, the player claps twice.

Andy, Dom, and Jared aren't very good at this game. They only made it to thirty before messing up! Have the computer output what they should have said if they had all three played the game correctly up to 50.

---------------------------------------------------------------------------------------

Another type of loop is called a _while loop_. A _while loop_ is a loop that runs as long as (or while) its condition is true. 

The anatomy of a while loop is much simpler than that of a for loop. Where a for loop has an initializer, a condition, and a post loop action, a while loop only has a condition. The basic structure of a while loop is as follows:

```
while(condition) {
  //do a thing
}
```

For example, we could count to ten with the following while loop:

```
int i = 0;
while(i < 10) {
  println(i);
  i++;
}
```

Another thing we could do is write a version of integer division where we see how many times i goes into j:

```
int i = 3;
int j = 365;
int count = 0;
int product = 0;

while(product<j) {
  product += i;
  count ++;
}

count --; //we overshoot j, so lets subtract 1

println(i + " goes into " +  j + " wholly " + count + " times");
```
Try [running that code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/WhileLoops.java). Change the numbers.

Another fun thing we can do is write the "99 bottles of beer on wall" song:
[99 Bottles of Beer on the Wall](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/BottlesOfBeer.java).

I know what you're thinking, _"Wow, that was so much fun..."_ and I have to agree - I have excellent taste in fun. Speaking of fun, lets write a while loop!

What if we wrote the clapping game as a while loop? What would change?

Lets say you wrote the clapping game as follows: (note, there are many different ways to solve this problem - there are multiple "right answers")
```
for(i=1; i <= 50; i++) {
    if(i%3==0)
    {
		System.out.print("clap ");
    }
	if(i%5==0)
	{
		System.out.print("clap ");
	}
	if(i%3 !=0 && i%5 != 0)
	{
		System.out.print(i);
	}
	System.out.println();
}
```

The first thing we could change is the word for to while, but the line ```while(i=0; i<=50; i++)``` won't compile. As far as the computer is concerned, that is nonsense gibberish. Because a while loop only needs a conditional, we'd write the first line as `while(i<=50)`. 

This means we need to make sure `i` is initialized - so we'll have to do that before the loop. If we do that in the loop - `i` will always be re-initialized and the loop will run forever! Now our code will look like this:
```
i = 1;
while(i <= 50) {
   if(i%3==0)
    {
		System.out.print("clap ");
    }
	if(i%5==0)
	{
		System.out.print("clap ");
	}
	if(i%3 !=0 && i%5 != 0)
	{
		System.out.print(i);
	}
	System.out.println();
}
```

If we ran our code - what would happen? Would it work? 

.

.

.

Try it. Can you figure out what it's behaving the way it is? Can you fix it?

.

.

.

What happened? The code printed 1 1 1 1 1 1 1 1 ... right? That's because we have an infinite loop! We never change the value of `i` inside the loop so `i<=50` is always true. In our for loop  we have `i++` as our post iteration process, so lets add `i++` at the end of each iteration.

```
i = 1;
while(i <= 50) {
    if(i%3==0)
    {
		System.out.print("clap ");
    }
	if(i%5==0)
	{
		System.out.print("clap ");
	}
	if(i%3 !=0 && i%5 != 0)
	{
		System.out.print(i);
	}
	System.out.println();

  i++;
}
```

Run it now! Tada!

Alright, now try it out on your own:

Write a while loop that prints out all the factors of someNumber starting with the largest first. For example, if someNumer = 30, the code should output ``30 15 10 6 5 3 2 1``. I'll give you [this template](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/Factors.java) to start with. 

----------------------------------------------------------------------------------------

[Next: Let's Make Objects! ->](Objects.md)

[Back to Main](../../README.md)