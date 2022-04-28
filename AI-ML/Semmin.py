from more_itertools import seekable
import nltk
from nltk.stem import PorterStemmer
from nltk.corpus import stopwords


paragraph = """It is for us the living, rather, to be dedicated here to the unfinished work which they who fought 
            here have thus far so nobly advanced. It is rather for us to be here dedicated to the great task remaining before us; 
            that from these honored dead we take increased devotion to that cause for which they here 
            gave the last full measure of devotion; that we here highly resolve that these dead shall not have died in vain; 
            that this nation, under God, shall have a new birth of freedom, and that government of the people, by the people, 
            for the people, shall not perish from the Earth."""

sentences = nltk.sent_tokenize(paragraph)

stemmer = PorterStemmer()

for i in range(len(sentences)):
    words = nltk.word_tokenize(sentences[i])
    words = [stemmer.stem(word) for word in words if word not in set(stopwords.words('english'))]
    sentences[i] = ' '.join(words)

print(sentences)