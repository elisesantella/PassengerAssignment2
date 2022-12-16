package ie.atu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Passenger {

    //Declare variables - set as private so that they can on;y be used within Passenger class
    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    /*Setting up a constructor that will initialise all the variables to the user input as it runs through the code*/
    /*Changed method to include all variables because we want the user to be prompt to enter all information
    at once not individually using different methods*/
    public Passenger(String titleName, String nameSize, String idNum, String phoneNum, int minAge){
        //Check that Title is either Mr, Mrs or Ms otherwise throw error message
        if(titleName == "Mr" || titleName == "Mrs" || titleName == "Ms"){
            this.title = titleName;
        }
        else{
            throw new IllegalArgumentException("Title invalid. MUST be either Mr, Mrs or Ms");
        }

        //Check that Name is at least 3 characters long otherwise throw error message
        if(nameSize.length() >= 3){
            this.name = nameSize;
        }
        else{
            throw new IllegalArgumentException("Name MUST be a minimum of 3 characters");
        }

        //Check that ID is at least 10 characters long otherwise throw error message
        if(idNum.length() >= 10){
            this.id = idNum;
        }
        else{
            throw new IllegalArgumentException("ID MUST be a minimum of 10 characters");
        }

        //Check that Phone number is at least 7 characters long otherwise throw error message
        if(phoneNum.length() >= 7){
            this.phone = phoneNum;
        }
        else{
            throw new IllegalArgumentException("Phone number MUST be a minimum of 7 characters");
        }

        //Check that Age is over 16 otherwise throw error message
        if(minAge > 16){
            this.age = minAge;
        }
        else{
            throw new IllegalArgumentException("Passenger is too young to fly. MUST be over 16");
        }

    }

    //Setting up getter methods that will get the user input for each variable
    //Getter method that will return age from Passenger
    //Getter method that will return title from Passenger
    public String getTitle(){
        return title;
    }

    //Getter method that will return name from Passenger
    public String getName(){
        return name;
    }

    //Getter method that will return ID from Passenger
    public String getID(){
        return id;
    }

    //Getter method that will return phone number from Passenger
    public String getPhone(){
        return phone;
    }

    //Getter method that will return age from Passenger
    public int getAge(){
        return age;
    }
}
