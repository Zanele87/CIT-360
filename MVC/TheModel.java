/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;


public class TheModel {

    private String firstName;
    private String lastName;
    private int age;
    private boolean headOfHousehold;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHeadOfHousehold() {
        return headOfHousehold;
    }

    public void setHeadOfHousehold(boolean headOfHousehold) {
        this.headOfHousehold = headOfHousehold;
    }

}