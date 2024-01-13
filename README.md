# Tanzania-Weather-SMS1
## WHY THE PROJECT?

## VIDEO LINK TO PROJECT
https://youtu.be/YClk9BPwjW4?si=km_szSO34RR70rkJ

My project tries to solve the problem of lacking weather information for farmers, particularly in Africa. 
Farmers require weather information daily to plan for their agricultural produce, but most lack smartphones, 
and instead use flip-phones. My project gets track of rainfall data from csv.files downloaded from TMA website 
and sends the requested weather information to farmers by SMS. 

## FEATURES IMPLEMENTED

1. The first feature is the creation of the Symbol Tables. In the file "TanzaniaWeatherData.java", I try to create in
   A smaller symbol table first, with dates and rainfall data. This is implemented in the method "monthDateAndRainfall".
   I then create a bigger symbol table with regions, dates and rainfall data. This is implemented in the method
   "regionsNumericalDatesAndRainfall". I then fill in the symbol table using the method "fillInWeatherData". Other 
   executions such as average and range are calculated in the "TanzaniaWeatherApp.java".

2. The second feature is the implementation of the Twilio library in the file "SmsWebhookHandler.java". The purpose of 
   This file is to get SMS input from the Twilio phone number "+17473077056" and use it as a text to be implemented in the
   "TanzaniaWeather.java" file. 

3. The third feature is the implementation of the Twilio library in the file "SMSSend.java:. The purpose of this file is
   To send SMS output to the user of the requested information. 


### C. HOW TO COMPILE AND RUN

To run the program, you need to open three terminal windows in IntelliJ. In the first terminal, you should run "./ngrok"
.You should run "./server" in the second terminal and wait until you see the output "Successfully written". Then you
run "./TanzaniaWeather" in the third terminal. After running the program, in order to test it you need to change the 
Phone number typed "+16099337966" in line 235 in TanzaniaWeatherApp.java into your phone number for texting. Then you need
to type in input in
Either of the following formats:
"Replace with region" + "Jul-1" to get data for Jul-1 of a specific region and date OR
"Replace with region" + "Jul-1" + "Jul-2" + "AVG" to get average data from Jul-1 to Jul-3 of that region OR
"Replace with region" + "Jul-2" + "Jul-3" + "RNG(or any abbreviation" to get range data from Jul-2 to Jul-3 of that 
region

Once you run the program, you will see the output both in your 3rd terminal and in your phone. 
EXCEPTIONS:
The format of input date must be Month-date. Also the month must be abbreviated using the first three letters e.g Jul 
And not July. Also the dates only run from 1st to 3rd because that's how the downloaded csv. Files were. Hence, you 
Can't type dates such as Jul-4. 




### D. HOW THE PROGRAM ACCEPTS USER INPUT 
My program accepts user input from the phone in the required format as described from above. This is implemented in 
"SmsWebhookHandler.java" along the lines 22, 23 and line 64. This was done through the implementation
An external library called twilio which is already cited as a reference




## E. HOW THE PROGRAM PRODUCES OUTPUT
My program produces output also into the phone using the file "SMSSend.java". This is implemented in the line 24.
This is also done through the implementation of an external library called twilio which is already cited.




## F. DATA STRUCTURES USED

1. Symbol Table - it is used to store all regions, dates and weather information.
		  The variable name is "regionsNumericalDatesAndRainfall" and it is declared in line 6 of 
		  "TanzaniaWeatherData.java" and initialized in line 13 of the same file. 

2. Arrays 	"filenames" array is declared and initialized in line 15 of "TanzaniaWeatherData.java".
		   - This are used to store the 25 files containing weather information of 25 different regions.

		"startDateArray" and "finishDate" arrays are used to store a list of starting dates,
		from months, and finishing dates, only used when the user requests average or range of weather data
		for a certain period of time. 
		   - This are both declared and initialized in single lines in line 99, 111 & 150 & 162 of 
		     TanzaniaWeatherApp.java


		"inputFormat" array is used to store the input sms in a split form. 
		   - This is initialized and declared in line 25 of TanzaniaWeatherApp.java

## CITATIONS

1. https://www.twilio.com/docs/libraries/java
2. https://www.twilio.com/blog/receive-respond-sms-java-twilio
3. https://stackoverflow.com/questions/24104313/how-do-i-make-a-delay-in-java
4. https://www.w3schools.com/java/java_files_create.asp
