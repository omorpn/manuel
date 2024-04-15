CREATE TABLE IF NOT EXISTS Users(
  user_id INTEGER AUTO_INCREMENT,
  username VARCHAR(255) NOT NULL,
    full_name VARCHAR(255) NOT NULL,
    useremail VARCHAR(255) NOT NULL,
    phoneNumber VARCHAR(100) NOT NULL,
    userstatus VARCHAR(100) NOT NULL,
    account_type VARCHAR(100) NOT NULL,
    password VARCHAR(300) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    PRIMARY KEY(user_id)

);