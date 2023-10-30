def spell_checker(word, dictionary):
    # Convert the word and dictionary to lowercase for case-insensitive matching
    word = word.lower()
    dictionary = [entry.lower() for entry in dictionary]
    
    # Check if the word is in the dictionary
    if word in dictionary:
        return f"'{word}' is spelled correctly."
    else:
        suggestions = []
        for entry in dictionary:
            # Calculate the Levenshtein distance between the word and dictionary entries
            distance = levenshtein_distance(word, entry)
            
            # You can define a threshold for similarity and suggest words with a lower distance
            if distance < 3:  # You can adjust this threshold as needed
                suggestions.append(entry)
        
        if suggestions:
            return f"'{word}' is not in the dictionary. Did you mean {', '.join(suggestions)}?"
        else:
            return f"'{word}' is not in the dictionary, and no suggestions were found."

# A simple implementation of Levenshtein distance (edit distance)
def levenshtein_distance(word1, word2):
    if len(word1) < len(word2):
        return levenshtein_distance(word2, word1)

    if len(word2) == 0:
        return len(word1)

    previous_row = range(len(word2) + 1)
    for i, c1 in enumerate(word1):
        current_row = [i + 1]
        for j, c2 in enumerate(word2):
            insertions = previous_row[j + 1] + 1
            deletions = current_row[j] + 1
            substitutions = previous_row[j] + (c1 != c2)
            current_row.append(min(insertions, deletions, substitutions))
        previous_row = current_row

    return previous_row[-1]

# Example usage
dictionary = ["apple", "banana", "cherry", "grape", "orange"]
word_to_check = "oranje"  # Replace with the word you want to check

result = spell_checker(word_to_check, dictionary)
print(result)
