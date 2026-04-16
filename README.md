# Train-Consist-Management-App

DDrawback of UC2 Approach
In UC2, bogies are stored in a List. However, a List allows duplicate values, which is dangerous in a railway system.
For example, two bogies could accidentally be registered with the same ID:
BG101, BG101
This violates business rules and can cause inconsistent train formation.
To enforce uniqueness, we introduce the Set data structure.
Goal
Ensure no duplicate bogie IDs are added to the train.
