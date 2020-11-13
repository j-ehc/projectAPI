#Instructional Guide
The outcome of this project was to demonstrate the capabilities of resourcing and collaborating information to collectively construct a web page that displays real time one-way flights departing from the West/East coasts, and adding a styled instruction manual page of sorts at the beginning.
## We had a few issues trying bring the project to life.
>
>- Figuring out where to start off from scratch
>- learning how to effectively find source code to think on and analyze if it would be best for our needs.
>
>- Throughout this project we experienced gaps in knowledge that we had to fill in order to get something reliably started on our own.
>- This project is due to continue progress to see what can be salvaged from what we do have.
_________________________________
## **Tasks Associated with with the epic**
**What are the individual stories (tasks) to m/up the epic?**
>- [ ] Create first page with instructions onto the next for API use
>- [ ] Create an API page that functions
>- [ ] Flights API that displays the real time info or similar
>- [X] Create a simple test (We ended up testing to see if we could see our class within our package system of our program)
__________________________________
## **Code Example for Test we used to derive our own simple first test**
**This would test to see if a class existed using the @Test Annotation**
>- It was here we would Assert that Class ProjectApiApplication existed within the package "com.infosys.projectAPI"
```
import org.junit.Test;
 public class ProjectApiApplicationTests {
    @Test
    public void basicTest() {
       try {
          Class.forName("com.infosys.projectAPI.ProjectApiApplication");
       } catch(ClassNotFoundException e) {
          Assert.fail("Should create a class called 'ProjectApiApplication'.");
       }
    }
 }
 ```
___________________________________________________________________
##**This section describes the technologies used to create this project**
**Technologies**
>-[X] Maven with Spring Boot
>-[ ] Heroku
>-[ ] FlightAPI/OtherAPI
>-[X] Intellij
>-[X] Java (**Partial Finish**)(**Currently In Testing**)
>-[X] HTML (**Partial Finish**)(**Currently Under Development**)
__________________________________________________________
##**This is the approach to the project**
**Approach**
> 1.Begin with blank project and fresh Git repository
>
> 2.Include appropriate technologies
> 
> 3.Understand problems encountered
>- Changed order of importance re: tasks, stories
>- Log problems and solutions
>
> 4.Maintain Agile mindset of being self-organized to problem solve ourselves
>
> 5.Testing (**should've been first**)
>- What function are we testing against, what should program do
> 
> 6.Deployment
>- Skipped hosting on Heroku w/ time constraint
>
> 7.Debugging
>- TBD
















