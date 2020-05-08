import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

#%matplotlib inline

df = pd.read_csv("Airplane_Crashes_and_Fatalities_Since_1908.csv")
df.info()
df.head()

# removing the irrelevant columns
cols_to_drop = ["Date","Time","Flight #", "Route", "Registration", "cn/In", "Ground"]
df = df.drop(columns=cols_to_drop,axis=1)
df.info()
df.head()
df.to_csv('Clean_data.csv')


deep_df = df.copy(deep = True)
numerical_columns = [col for col in df.columns if (df[col].dtype=='int64' or df[col].dtype=='float64') and col != 'Summary']
df[numerical_columns].describe().loc[['min','max', 'mean','50%'],:]

print("Percentages")
percentages = []
for gen in list(df["Aboard"].unique()):
    
    p = round((df["Summary"][df["Aboard"]==gen].value_counts()[1]/df["Summary"][df["Aboard"]==gen].value_counts().sum())*100 , 2)
    
    percentages.append(p)
    print(gen,"(% to exit) : ", p)
    
    plt.bar(0, percentages[0])
    plt.bar(1, percentages[1])
    plt.xticks((0,1), ('Aboard','Fatalities'))
    plt.xlabel("Aboard")
    plt.ylabel("Fatalities")
    plt.title("Percentage of gender to Exit")
    plt.show()
