With this practice I did improve my skill in the creating the index, create and show route using Spring; and improved in the Db relationship between tables

**Learning Objectives**

- Understand one to many relationships
- Be able to use Spring Data REST to create the RESTful routes for a set of resources
- Use insomnia to GET and POST records

#Brief

Create a one-to-many Spring application using annotations as you’ve done before.

Your application should have the following models: Folders, Files and Users. Users should have many folders, and folders should have many files.

You’ll need to create repositories for each entity.

You’ll need to create controllers for each entity, too, and ensure they implement the index, create and show routes

**MVP**

Create a system to track files and folders:

A File should have:
- a name
- extension (e.g. txt, rb, java, ppt)
- size
- folder

A User should have:

- name
- a list of folders

A Folder should have:
- a title
- list of files
- a user


Create a seeding file DataLoader component to pre-seed the database.

Test with insomnia to test the

Planning

Draw a diagram detail the relationships between models.