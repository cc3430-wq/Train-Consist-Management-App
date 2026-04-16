# Train-Consist-Management-App

Drawback of UC4 Approach
In UC4, we maintained order using LinkedList.
However, train yards often perform last-minute attachments and emergency removals, where the last attached bogie must be removed first.
Problems with plain list logic:
No enforced removal discipline.


Students don’t see real operational constraints.


LIFO behavior is not modeled.


To simulate real-world rollback and last-attachment handling, we need a Stack.
