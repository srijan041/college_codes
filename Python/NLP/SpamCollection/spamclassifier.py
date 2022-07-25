from sklearn.metrics import accuracy_score
from sklearn.metrics import confusion_matrix
from sklearn.naive_bayes import MultinomialNB
from sklearn.model_selection import train_test_split
from sklearn.feature_extraction.text import CountVectorizer
from sklearn.feature_extraction.text import TfidfVectorizer
from encodings import utf_8
from nltk.stem import WordNetLemmatizer
from nltk.corpus import stopwords
import nltk
import re
import pandas as pd
import os

messages = pd.read_csv(os.path.join(
    os.getcwd(), 'Python/NLP/SpamCollection/SMSSpamCollection'), sep='\t', names=['v1', 'v2'])


lemmatizer = WordNetLemmatizer()
corpus = []

for i in range(len(messages)):
    review = re.sub('[^a-zA-Z]', ' ', messages['v2'][i])
    review = review.lower().split()

    review = [lemmatizer.lemmatize(word) for word in review if not word in set(
        stopwords.words('english'))]
    review = ' '.join(review)

    corpus.append(review)


tfv = TfidfVectorizer(max_features=5000)
X = tfv.fit_transform(corpus).toarray()

y = pd.get_dummies(messages['v1'])
y = y.iloc[:, 1].values

X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.5, random_state=0)


spam_detect_model = MultinomialNB().fit(X_train, y_train)
y_pred = spam_detect_model.predict(X_test)


confusion_m = confusion_matrix(y_test, y_pred)


accuracy = accuracy_score(y_test, y_pred)


print(accuracy)
# print(os.path.join(os.getcwd(), 'Python/NLP/SpamCollection/spam.csv'))


# bagofwords = 0.9820627802690582
# tfidf = 0.9766816143497757
