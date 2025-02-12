#Samual Charles, Will Kelley, James Harden, and Alex Gagliano

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from dotenv import load_dotenv
import time 
import os

# Load environment variables from .env file
load_dotenv()

# Retrieve credentials from .env
username = os.getenv("USERNAME")
password = os.getenv("PASSWORD")

# Check if the credentials are loaded correctly
if not username or not password:
    raise ValueError("Failed to load username or password from .env file")

driver = webdriver.Chrome() # Replace with the path to your WebDriver
driver.maximize_window()
driver.get('https://student.cengage.com/course-link/MTPPCQM5N5P1')
time.sleep(3)

def login(username, password):
    # Locate the username input field and enter the username
    username_input = driver.find_element(By.NAME, 'username')
    username_input.send_keys(username)
    username_input.send_keys(Keys.RETURN)
    
    # Wait for the password input field to become visible
    WebDriverWait(driver, 10).until(
        EC.visibility_of_element_located((By.NAME, 'password'))
    )
    
    # Locate the password input field and enter the password
    password_input = driver.find_element(By.NAME, 'password')
    password_input.send_keys(password)
    password_input.send_keys(Keys.RETURN)

    
    # Wait until the Cengage logo appears as confirmation of successful login
    try:
        WebDriverWait(driver, 10).until(
            EC.presence_of_element_located((By.XPATH, "//img[@alt='Cengage Logo']"))
        )
        print("Login successful! Cengage logo is visible.")
    except:
        print("Login failed. Cengage logo not found.")

# Call the login function with the retrieved credentials
login(username, password)

# Add a wait to ensure the login process completes
time.sleep(5)

# Close the browser
driver.quit()





# Points of Failure for Error Testing 
# username 
# Load time between
# password Field
# Load time between
# Sign in Button 
# Load time between
# FINDING Cengage Logo Image Element 
# Failure to locate
# failure to load 
# Screen size Mismatch 
# Viewable area failure 