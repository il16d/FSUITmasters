import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from csv import writer
from csv import reader
from sklearn.preprocessing import LabelEncoder
from sklearn.linear_model import Lasso
from sklearn.linear_model import LinearRegression

import numpy as np
import pandas as pd

import matplotlib.pyplot as plt
import seaborn as sns

import re
import operator


from collections import Counter

data = pd.read_csv('Clean_data.csv')

failures = {
    'pilot error': '(pilot|crew) (error|fatigue)',
    'engine failure': 'engine.*(fire|fail)',
    'structure failure': '(structural fail)|(fuel leak)|(langing gear)',
    'electrical problem': 'electrical',
    'poor weather': '((poor|bad).*(weather|visibility)|thunderstorm)',
    'stall': 'stall',
    'on fire': '(caught fire)|(caught on fire)',
    'turbulence': 'turbulence',
    'fuel exhaustion': '(out of fuel)|(fuel.*exhaust)',
    'terrorism': 'terrorist|terrorism',
    'shot down': 'shot down',
}

##PLOT TYPE OF CRASHES WITH HOW MANY PEOPLE FOR EACH TYPE## HOWWWWW TO DO THAT

failure_counts = {'other':0}

fatality_count = {'some':0}

for s in data.Summary.dropna():
    other = True
    for failure, exp in failures.items():
        if re.search(exp, s.lower()):
            other = False
            if failure in failure_counts:
                failure_counts[failure] += 1
            else:
                failure_counts[failure] = 1
    if other:
        failure_counts['other'] += 1

nan_counts = len(data.Summary.isnull())
print('Number of entries: %d' % nan_counts)
print('unindentified causes: %d' % failure_counts['other'])

del failure_counts['other']

sortedcauses = sorted(failure_counts.items(), key=operator.itemgetter(1), reverse=True)

print('HOW MANY ENTRIES NOT HOW MANY PEOPLE: ')
for k, v in sortedcauses:
    print(k, v)


operator = data[['Operator','Fatalities', 'Aboard']].groupby('Operator').agg(['sum','count'])
accidents = operator['Fatalities','count'].sort_values(ascending=False)
totalacc = accidents.sum()
accprop = accidents/totalacc
print ('Number of accidents',totalacc)

fatalities = operator['Fatalities','sum'].sort_values(ascending=False)
totalfatal = fatalities.sum()
print ('Number of fatalities',totalfatal)
fatalprop = fatalities/totalfatal

aboard = operator['Aboard','sum'].sort_values(ascending=False)
totalA = aboard.sum()
print('Number of aboard', totalA)

types = data[['Type','Fatalities']].groupby('Type').agg(['sum','count'])

acctype = types['Fatalities','count'].sort_values(ascending=False)
typeprop = acctype/totalacc
fig_type,((ax1,ax2),(ax3,ax4))=plt.subplots(2,2,sharex = True)
fataltype = types['Fatalities','sum'].sort_values(ascending=False)
typefatalprop = fataltype/totalfatal

##Top TEN TOP 15
oper_list = Counter(data['Operator']).most_common(12)
operators = []
crashes = []
for tpl in oper_list:
    if 'Military' not in tpl[0]:
        operators.append(tpl[0])
        crashes.append(tpl[1])
print('Top 10 the worst operators')
pd.DataFrame({'Count of crashes' : crashes}, index=operators)


loc_list = Counter(data['Location'].dropna()).most_common(15)
locs = []
crashes = []
for loc in loc_list:
    locs.append(loc[0])
    crashes.append(loc[1])
print('Top 15 the most dangerous locations')
pd.DataFrame({'Crashes in this location' : crashes}, index=locs)


type_list = Counter(data['Type'].dropna()).most_common(12)
typs = []
crashes = []
for typ in type_list:
    typs.append(typ[0])
    crashes.append(typ[1])
print('Top 10 worst Aircrafts')
pd.DataFrame({'Crashes in this location' : crashes}, index=typs)



##PLOTS!


#How many people died of Engine F, ETC

#PLOT ACCIDENT
accidents.head(10).plot(kind='bar',title='Accidents by Operator',ax=ax1,grid=True,rot=90)

accprop.head(10).plot(kind='bar',title='Proportion of Total Accidents',ax=ax2,grid=True,rot=90)
#FATALITIES
fatalities.head(10).plot(kind='bar',title='Fatalities by Operator',ax=ax3,grid=True,rot=90)

fatalprop.head(10).plot(kind='bar',title='Proportion of total Fatalities',ax=ax4,grid=True,rot=90)

#Plots
props = operator['Fatalities'].reset_index()
props['Fatalities per Crash'] = props['sum']/props['count']
props.columns = ['Operator','Fatalities','Accidents','Fatalities per Accident']

########

acctype.head(10).plot(kind='bar',title='Accidents by Type',grid=True,ax=ax1,rot=90)

typeprop.head(10).plot(kind='bar',title='Proportion of total accidents',grid=True,ax=ax2,rot=90)

fataltype.head(10).plot(kind='bar',title='Fatalities by Type',grid=True,ax=ax3,rot=90)

typefatalprop.head(10).plot(kind='bar',title='Proportion of total fatalities',grid=True,ax=ax4,rot=90)

#Linear regression for predicting deaths
operator.dropna(inplace=True)
X = operator['Fatalities','count']
Y = operator['Fatalities','sum']
model = LinearRegression()
model.fit(X.values.reshape(-1,1),Y.values.reshape(-1,1))
m = model.coef_[0][0]
c = model.intercept_[0]

fig_fit,axd=plt.subplots()
axd.scatter(X,Y,label='Operators')
axd.set_title('Linear Model: Predicting Fatalities given Accidents')
axd.plot(X,model.predict(X.values.reshape(-1,1)),label='Linear Fit: y = %2.2fx %2.2f' % (m,c))
axd.grid(True)
axd.set_xlabel('Accidents')
axd.set_ylabel('Fatalities')
axd.legend(loc=2)




#prints every failures in the column with the cause of accident and the total count of accidents
#for sin in data.Fatalities.dropna():
# for j in sortedcauses:
# if failure in fatality_count[]
# print(sin,j)
# print data.Fatalities.sum()


#Plot STUFF
#plt.figure(figsize=(14, 8))
#x, y = zip(*sortedcauses)
#sns.barplot(x=x, y=y)
#plt.xticks(rotation=25, horizontalalignment='right')
#plt.show(block=True)
#matplotlib.plt.show()
