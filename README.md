# Prototype of Flipkart for college project

## Database Tables
1. Table Name : BUYER_INFORMATION<br />
   Description : Contains User Informations entered by user during registration.<br />
   Columns:  1. SKEY (Surrogate Key)(INT-10): Primary Key, Not Null, Unsigned, Auto Increment<br />
             2. USER_NAME(VARCHAR-45): Primary Key, Not Null, Unique<br />
             3. NAME(VARCHAR-45): Not Null<br />
             4. EMAIL(VARCHAR-45): Not Null, Unique<br />
             5. PASSWORD(VARCHAR-45): Not Null<br />
             6. DOB(DATE): Not Null<br />
             
             
## Variable Names to be used in parameter for registration and login
  userName,name,email,password,dOB<br />
  
## Status Returned in Registration
  status = 0 :: success<br />
  status = 1 :: User name already exist<br />
  status = 2 :: Email Id already exist<br />
  status = 3 :: Server side error<br />
  
## Status Returned in Login
  res = JSON object(User Information)<br />
  res = 1 :: Password not matching.<br />
  res = 2 :: User name not present in the database.<br />
  res = 3 :: Server side Error.<br />
          
