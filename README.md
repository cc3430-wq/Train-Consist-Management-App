# Train-Consist-Management-App

Drawback of the UC9 Approach
In UC9, bogies are organized into logical groups using groupingBy().
While grouping structures the data, it does not provide numerical insight.
In real railway operations, administration often needs to:
• Know the total seating capacity of the train.
• Estimate passenger handling capability.
• Perform utilization planning.
With only grouped lists:
❌ No total metrics are available.
❌ No aggregation is performed.
❌ Decision-making lacks quantitative support.
For example, seeing Sleeper and AC Chair grouped is useful, but it is more useful to know how many total seats the train can offer.
To compute meaningful values, we introduce aggregation using reduce().
