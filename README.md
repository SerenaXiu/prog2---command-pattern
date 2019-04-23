# PROG2 - Command Pattern

Thomas Kellner, Mehtap Ünsal, Oana Rusu & Serena Li

Code Beispiel
Erklärung im ReadMe vom Program
Deadline 23.4.2019 23:55
--> einer aus der Gruppe erklärt

COMMAND PATTERN
(by Oana, Serena, Thomas, Mehtap)

Pattern type: 	Behavioral

Definition: 	The command pattern encapsulates a request as an object, 
				thereby letting us parameterize other objects with different requests, 
				queue or log requests, and support undoable operations.
			
Benefits: 		Flexibility trough loose coupling in request-response Situations. 
				Undo Operations
				

General explanation: 

Classes to know are Client, Invoker, Command, Concrete Command, Receiver.

A Client (consumer of the request), is calling the Invoker to execute a command. 
The Invoker refers to the Command Interface [command.execute()], not knowing about the concrete commands. 
The Command Interface acts as a Parent Interface including only the execute() method. (For enable undo operations, it would also contain a undo() method.)
Every Concrete Command class implements the execute() method and a reference to a receiver [receiver1.action1()], 
to in conclusion make the receiver perform an action. 

Example explanation:

In our Code Example, we issue to remote control smart home elements. A light and a music player. 

A person (the Client) pushes one of two buttons on a remote control (Invoker), to command either the light to go on or the music to start. 
Lets say the light. The button refers to the Command interface, instead of sending a direct request to the light, which would be tight coupling between request and response.
The Command Interface only includes the execute() method, which is implemented in our Concrete Commands LightCommand and MusicCommand. 
These Concrete Commands include the reference to the Light class and the Musicplayer class. The receivers include the actual operations to perform the actions. 