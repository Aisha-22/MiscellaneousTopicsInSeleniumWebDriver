MiscellaneousTopicsInSeleniumWebDriver

***Handling HTTPS certifications***
>//SSL Certifications ?
> When you work on HTTPS under the Proxy - there is some code to add to your ChromeDriver so that Automatically
your Selenium WebDriver Understands the page and "click on Proceed Anyway" and navigates to the next page

*There is four lines of code to give to the test*
In the main method - HandlingHTTPScertifications:, 
So you can customize your browser by creating ChromeOptions - You need to add the Capabilities to your 
ChromeBrowser.
//Desired capabilities= is a class to help you customize your ChromeBrowser, by providing the proper 
knowledge for your Browser and then Pass the object of the capabilities to you Chrome Options, in this
way the browser yu are opening has the knowledge of what you are doing.

*QUESTIONS ASKED* 
What are ChromeOptions used for? - Its used to set your local Browser settings & Capabilities is 
like creating a general profile

***Maximizing window and deleting cookies***
>Cokkies / Maximize are a part of a Browser so all browser settings can be done by the help on 
'manage()'

***How to take Screenshots in Selenium***
How to delete the screenshot & 
How to clear process which is running in the background

**Challenges**
Importing jar file for FileUtils, could not find commons-io from project structure

***Strategy to automate the broken Links with Selenium***
*Interview question - broken links:
If there is over 32 links, and you have to check if to check that each one is working, you're 
going to have to manually check if each one is working
>The word broken -> page should send error link
>It is a broken URL, the URL is tied up the link that is not working
> You can read the status code in the Developer tools, select the network tab select HXR
> If status is 200 the links are working and if the status is 400, 500, 600 that means the link is broken

HTTP Methods: GET -> POST -> PUT -> DELETE 

***Open Connection method to identify status codes of the links***

*** Importance of Soft Assertions in Selenium WebDriver***
Optimized all the code to validate all links and will mention the one failed
