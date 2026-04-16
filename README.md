# Train-Consist-Management-App

Drawback of UC6 Approach
In UC6, the system can store each bogie along with its capacity using a HashMap.
However, the data is still unordered from a planning perspective.
In real railway operations, administration often needs to:
• Identify high-capacity bogies first.
• Arrange bogies for optimal usage.
• Compare passenger capacity across classes.
With only storage:
❌ Bogies are not ranked.
❌ There is no logical ordering.
❌ Planning and reporting become difficult.
For example, knowing that Sleeper has 72 seats and AC Chair has 56 seats is useful,
but it is more useful to see them sorted by capacity.
To introduce ordering based on business logic, we use Comparator for custom sorting of objects.
