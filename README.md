# Digital ATM Simulator

## Overview
The **Digital ATM Simulator** is a Java-based application that simulates an Automated Teller Machine (ATM) system. It allows users to perform banking operations such as balance inquiry, deposits, withdrawals, and PIN authentication securely.

## Features
- Secure user authentication with PIN verification
- Login page for user authentication
- Balance inquiry
- Cash deposit functionality
- Cash withdrawal feature
- Transaction history tracking
- User-friendly console-based interface

## Technologies Used
- **Programming Language:** Java
- **Database:** MySQL (optional, for storing user data persistently)
- **IDE:** IntelliJ IDEA / Eclipse / NetBeans

## Installation and Setup
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/your-username/Digital-ATM-Simulator.git
   cd Digital-ATM-Simulator
   ```
2. **Set Up MySQL Database (Optional):**
   - Create a database and table for storing user details and transactions.
   - Update database credentials in the Java file if using persistence.
3. **Compile and Run the Application:**
   ```sh
   javac Login.java
   java Login
   ```

## Workflow
1. **Login:**
   - User inputs their card number and PIN for authentication.
    ![image](https://github.com/user-attachments/assets/3cbd6716-b8e4-4bea-8153-326cb480c623)

   - If the credentials are correct, access is granted; otherwise, an error message is displayed.
     ![image](https://github.com/user-attachments/assets/8854885b-1ec4-410c-b8b3-eac6432591f5)


2. **Main Menu:**
   - Once logged in, users can choose from the following options:
     - Deposit
     - Fast Cash
     - Pin Change
     - Cash Withdrawl
     - Mini Statement
     - Balance Enquiry
     - Exit
       
       ![image](https://github.com/user-attachments/assets/36fa6c0c-6dc8-4b9f-b925-e7f583a0d635)


3. **Balance Inquiry:**
   - The system retrieves and displays the current account balance.

     ![image](https://github.com/user-attachments/assets/2febe356-da84-46d6-b889-ed02bc218707)


4. **Cash Deposit:**
   - User inputs the deposit amount.
   - The balance is updated accordingly, and a confirmation message is displayed.

     ![image](https://github.com/user-attachments/assets/ee6aae73-0c95-4501-92e9-38166cb0f34d)


5. **Cash Withdrawal:**
   - User inputs the withdrawal amount.
   - If sufficient funds are available, the balance is deducted and dispensed; otherwise, an insufficient balance message is shown.
     
    ![image](https://github.com/user-attachments/assets/0ed6b50a-abee-469f-8f2d-07e2612ad525)


6. **Fast Cash:**
   - You can select a withdrawl amount.
     
     ![image](https://github.com/user-attachments/assets/4083c3c1-229f-4232-bb8b-e05ecdd989e6)


7. **Mini Statement:**
   - Provides a brief summary of the last few transactions.
     
   ![image](https://github.com/user-attachments/assets/b743c769-cb93-4884-ab41-bb5d739f9c67)
   

9. **Change PIN:**
    - Users can update their ATM PIN for enhanced security.
      
   ![image](https://github.com/user-attachments/assets/cc337e8d-218f-4eed-8848-edf647071b09)


11. **Exit:**
   - The user logs out, and the session ends securely.

## Demo Video

https://drive.google.com/file/d/1pdjpjSi3yzBB2FRHUZJ-vkHDWq-oRwC-/view?usp=sharinghttps://drive.google.com/file/d/1pdjpjSi3yzBB2FRHUZJ-vkHDWq-oRwC-/view?usp=sharing

     

## Usage
- **Start the ATM:** Run the Java program.
- **Login Page:** Enter your card number and PIN to log in.
- **Perform Transactions:** Choose from options like checking balance, withdrawing, or depositing money.
- **Exit:** Select the exit option to end the session.

## Future Enhancements
- Implement a graphical user interface (GUI)
- Add support for multiple bank accounts per user
- Enhance security with encryption for user data
- Integrate with real banking APIs

## Contributing
Feel free to fork the repository and submit pull requests. Contributions are welcome!

## License
This project is licensed under the MIT License.

## Contact
For any queries or contributions, reach out at hiyasdrive@gmail.com

