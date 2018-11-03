## Let’s Say Hello!

**Objectives**: Learn the basics of code and write a hello world program.

**Starting Point**: [Code](https://raw.githubusercontent.com/Filip3314/LetsLearnProgramming/master/StartingPoints/HelloWorld.java)

**Process**: 

1. Create a folder for the code we'll be writing. Title it anything you want.
2. In VSCode, click File>Add Folder to Workspace... Then select the folder that you just created.
3. Create a new file in VSCode and name it HelloWorld.java.
4. Copy paste the code from the link into your file.
5. First we have:
    ``` public class HelloWorld ```

    This is the class declaration. A class is a type of Java file, and it's the main one we'll be using. In addition to the word "class" and the class name "HelloWorld", there can be all sorts of other words in the class declaration like "public" and "extends" that we'll learn about later. Right now, we're just concerned with the class name. Note that the class name always has to be the same as the file name, otherwise your code won't work.

6. Next we have:
    ``` public static void main(String[] args) { } ```
	    
    This is the starting square for the program. Just like Monopoly always starts at “GO”, the program always starts at main.  After main we see curly open and close brackets “{ }” on different lines. Between these brackets is the **method body**. The other words "public", "static", and "void", aren't important right now.

7. Inside the **main method**, we’re going to write the following line:

	``` System.out.println(); ```
  
    Inside the println parenthesis, write something that you want printed to the screen. Traditionally, the standard is to write “Hello World”. Make sure that whatever you pick is surrounded by “double quotes.“ I decided to write “Mihir is a meme" so my code would look like this:

    ``` System.out.println(“Mihir is a meme"); ```

8. Now that we wrote our first code, lets see if it works! Above your main method, there should be a run button. Press it!

    If everything went well, the box beneath the code will display the text you wrote. If it didn’t go well, you’ll see some error messages. Double check that you included a semicolon “;” at the end of your statement, that you spelled and capitalized System.out.println correctly, that you are using double quotes inside the parenthesis, and that you have both parenthesis. Ask for help if you can’t figure out the errors. 

    Note that the println method goes to the next line after it prints the text you give it, so any further prints will be on the next line. If we don't want this, we can use System.out.print instead.
    
    Tada! You did it! Feel free to change what your code prints out to play with it.

----------------------------------------------------------------------------------------

[Next: Let's Learn Variables! ->](Variables.md)

[Back to Main](../../README.md)


