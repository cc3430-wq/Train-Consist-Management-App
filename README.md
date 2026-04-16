# Train-Consist-Management-App

Drawback of UC7 Approach
In UC7, bogies are sorted based on seating capacity using Comparator.
While sorting organizes data, it does not allow the system to select specific bogies based on conditions.
In real railway operations, administrators often need to:
• Display only high-capacity bogies.
• Exclude low-capacity or special-purpose bogies.
• Apply business rules dynamically.
Using traditional loops:
❌ Code becomes verbose and imperative.
❌ Logic is mixed with iteration.
❌ Harder to read and maintain.
For example, manually looping through each bogie to check capacity adds boilerplate code and hides the business intent.
To express filtering logic clearly and concisely, we introduce the Java Stream API
