# TeamProj
20/11/2022 13:39 Richard Sosinski - added a simple "login" button which gets the username and password from the database

25/11/2022 23:57 Richard Sosinski - Login system works with two levels of logging in (Admin, normal user), Purchasing products works, renting products(user can rent products and will not be able to rent until they return the product), Admin tab (Admin can add items to the inventory as well as update inventory accordingly)

27/11/2022 12:52 Francis Santos - Started work on adding return item functionality. Added fields for user to enter information into fields and system to read in values in fields.

28/11/2022 01:22 Francis Santos - Added error checking when user enters username and password, system now checks if username and password when executed with SQL statement returns an array of 0 meaning incorrect username and password which will also be displayed in the text area.

29/11/2022 00:36 Francis Santos - Improved error checking as ordinary user could access admin only page when admin was logged in first, error checks improved to catch not only if databse returns nothing but also if SQL statement returns values which do not correspond to existing user. Also only allowed for admin to edit rental returns, but created method for user to submit that they have returned the equipment, admin checks the user submission and can remove users existing rental data.

29/11/2022 22:16 Francis Santos - Added heuristics 1,2,3,9 and 10 -
Heuristic 1 - Visibility of system status.
Heuristic 2 - Match between system and the real world.
Heuristic 3 - User control and freedom.
Heuristic 9 - Help users recognize, diagnose, and recover from errors.
Heuristic 10 - Help and documentation.