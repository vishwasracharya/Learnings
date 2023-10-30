# First, create a list of letter counts for each word
word1 = "listen"
word2 = "silent"

def letter_count(word):
    # Create an empty dictionary to store the letter counts
    letter_counts = {}
    
    # Iterate through each letter in the word
    for letter in word:
        # Check if the letter is already in the dictionary
        if letter in letter_counts:
            # If it is, increment the count
            letter_counts[letter] += 1
        else:
            # If it's not, initialize the count to 1
            letter_counts[letter] = 1
    
    # Return the dictionary containing letter counts
    return letter_counts

# Next, compare the lists
if letter_count(word1) == letter_count(word2):
    print("They are anagrams!")
else:
    print("They are not anagrams.")