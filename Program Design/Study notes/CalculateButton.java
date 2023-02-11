// this program is used to handle events.. clicking jbutton creates an event called action event.
// an action event sends a signal(message) to another object called the action listener.
//event = argument which invokes a method from listener object.

//class actionListener handles events using a special type of class called interface. interface contains only
//method headings, and does not have a body. thus, you cant instantiate an object of type actionListener


//you build your own class to access that class makes sense? cuz u cant just use it cuz it's empty

// all this code is technically defining a class :'') 
private class CalculateButton implements ActionListener {
    //implement modifier is used to build classes on top of classes.

    //actionPerformed method executes when a specific event is generated. 
    public void actionPerformed(ActionEvent e){
        double width, length, perimeter, area;

        length = Double.parseDouble(lengthTF.getText());
        width = Double.parseDouble(widthTF.getText());
        area = length * width;
        perimeter = 2 * (length + width);

        // displays area and perimeter thus you need to convert it into a string.
        areaTF.setText("" + area);
        perimeter.setText("" + perimeter);


    }
}

//ok so here's how it works:
//1) you created a class Calculate button that makes it a listener by implementing
//actionListener interface.

//2.)this class has 2 methods. first is line 3. then, line 6. 
// in line 6, you are getting string from "length text field". this string specifies the length
//of the rectangle. since it is in a string form, you want to convert it into a double by parse, then storing the
// the parsed value in length variable.
// setText method in JTextField required a string, the easiest way to convert a double to a string is to concatenate it
// with an empty string.

//creating a listener object

CalculateButton handler;
handler = new CalculateButton(); //instantiate listener object

calculateB.CalculateButton(handler); // registers handler as the listener of calculateB
// in this part, we made handler listen to calculateB and register action event CalculateButton


