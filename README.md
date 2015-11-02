# ContactClass
Homework: Finish the Contact Class

We will finish what was not done in class as a lab. It will be a good chance for you to get your feet wet with class architecture, and will get you ready for the lectures next week. 

Using the Ex6_2 code posted, your job is to finish the implementation of the Contact class. In addition to finishing the getter/setter methods, you will need to write a nameIsValid method that takes a string and checks it to make sure it has only letters in it. There is some example code in the setLastName method. Once that is written, you'll need to use it wherever you have a string where there should be nothing but letters. After that, you'll have to write an phoneIsValid function that checks to make sure the phone number is valid. It will also use a regular expression (regex). These are easy and you should be able to get the help you need there from Google. When setting the phone number, use the phoneIsValid method to check that the phone number is actually valid. Finally, you'll need a method to check that the zip code is valid, and use that when setting the zip code. Remember that zip codes can be either 5 or 5+4. 

Once the class is implemented, finish writing the main() method so that you get all of the data for a contact and then display it after all is entered. 

Bonus: Modify the setter methods to return a boolean whether the set succeeded or failed, then use that in your main method to ask for input until you get a "correct" answer. 

**NOTE:** The boilerplate code in here is the Ex6_2 code as-posted. You will need to add anything we add in class on your own!