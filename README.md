# folderfileservice
## HomeworkAnnotating One-to-Many and Many-to-One Relationships:6th Oct '20

### Brief:
Create a one-to-many Spring application using annotations as you've done before.

Application should have the following models: Folders, Files and Users. Users should have many folders, and folders should have many files.

create repositories for each entity.

Create controllers for each entity, too, and ensure they implement the index, create and show routes.

### MVP:
Create a system to track files and folders:

#### 1) A File should have:
    * a name
    * extension (e.g. txt, rb, java, ppt)
    * size
    *folder

#### 2) A User should have:
    * name
    * a list of folders
    
#### 3) A Folder should have:
    * a title
    * list of files
    * a user
    
#### 4) Creata a seeding file DataLoader component to pre-seed the database.

#### 5) Test the routes with Insomnia

