# PC Build Configurator
PC Build Configurator is an app that provides the user with an optimized list of all necessary parts to build a PC. The motto of the app is *minimalism at its finest* for the end user. With that in mind, we streamlined the process by providing a set of 3 choices with predetermined options for each and also a text box for the user to enter the maximum desired budget. For advice on how to put together your PC from your bought parts, see the given answer in the FAQ's section.

<p align="center">
  <img width="350" height="500" src="images/1.PNG?raw=true">
</p>

## Requirements
 - JDK 1.8+
 - Eclispe IDE (or other preferred IDE)
 - Git (optional)
## Installation
You need to install [JDK 1.8+](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) which has JavaFX built into it. You also need an IDE, preferably Eclipse, which you can download [here](https://www.eclipse.org/downloads/). You can visit this [website](http://www.cs.utsa.edu/~cs3443/javafx/index.html) for further instructions on how to get JavaFX to work on Eclipse. To download our code you can simply go to the [main page](https://github.com/owinterbg/Fire-Breathing-Rubber-Duckies), and click the *Download Zip* option or you can open up a terminal and type in the following command:
 ```bash
 git clone https://github.com/owinterbg/Fire-Breathing-Rubber-Duckies
```

## Usage
Open up the project in Eclipse, or in preferred IDE, and click *run*. 
On the main screen, you will be prompted for a few things.

**Step 1**
Choose your desired intention for the computer, whether it be for gaming or for workstation purposes.

<p align="center">
  <img width="350" height="500" src="images/2.PNG?raw=true">
</p>

 **Step 2**
Select the part, in which you want to put priority too. If you chose a gaming PC it is preferred to give priority to the Graphics Card, and conversely if you chose a workstation PC it is preffered to go give priority to the CPU. For default settings, leave it blank. 

<p align="center">
  <img width="350" height="500" src="images/3.PNG?raw=true">
</p>

**Step 3**
Select the part that you want to put the LEAST priority to. This will only decrease the priority of the selected part, meaning it will not make a drastic difference.

<p align="center">
  <img width="350" height="500" src="images/4.png?raw=true">
</p>

**Step 4**
Enter the desired budget for your PC in the text box.

<p align="center">
  <img width="350" height="500" src="images/5.png?raw=true">
</p>

**Step 5**
Click the *Next Page* button to go to the next screen for the list of parts.

<p align="center">
  <img width="350" height="500" src="images/6.png?raw=true">
</p>

**Step 6**
Click the *Show My Computer!!!* button to populate the screen with the personalized part list.

<p align="center">
  <img width="350" height="500" src="images/7.png?raw=true">
</p>

## FAQ
**Q:** Where do you get the information for the parts that were provided to me in your app?

**A:** We actually use a very popular website called [PCPartPicker](https://pcpartpicker.com/), where you can view virtually an unlimited number of parts for your PC. We scrape the information from that website, and have it locally stored in a database which the app uses.

**Q:** Why not just use a reputable website like PCPartPicker?

**A:** A website like PCPartPicker is a very good choice to allow you to build your own PC, but the problem lies within all the choices that it provides you, which is where our app comes in.

**Q:** Why should I use this app? 

**A:**  Within just a few clicks, our app provides the user with a completed build that is created from a handcrafted database of optimized builds.

**Q:** I purchased the parts that your app told me to get, but how  do I put a PC together? 

**A:** We totally understand that putting a PC together, looks as hard as flying to the moon but its actually quite simple. For some tutorials on how to put together a PC check out any of these links:

Note that these are three separate tutorials, meaning that any one of them will be sufficient enough to build your PC. 
- [Tutorial 1](https://www.youtube.com/watch?v=IhX0fOUYd8Q&t=1716s)
- [Tutorial 2](https://www.youtube.com/watch?v=gO-V8E9MIBg)
- [Tutorial 3](https://www.youtube.com/watch?v=MfwjISmkEJM&t=123s)


For some general tips on building a PC, check out this [website](https://www.redbull.com/gb-en/pc-building-tips-guide). If you have any further questions you can ask for help on [reddit](https://www.reddit.com/r/buildapc/).

## Contributing
This is a closed project so we will not have any pull requests.
