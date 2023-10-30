def analyze_text(text):
    # Split the text into words
    words = text.split()

    # Create an empty dictionary to store word frequencies
    word_frequencies = {}

    for word in words:
        # Remove punctuation and convert to lowercase for consistency
        word = word.strip('.,!?()[]{}:;')  # Remove common punctuation marks
        word = word.lower()

        # Update the word frequency in the dictionary
        if word in word_frequencies:
            word_frequencies[word] += 1
        else:
            word_frequencies[word] = 1

    # Sort the word frequencies by count in descending order
    sorted_word_frequencies = sorted(word_frequencies.items(), key=lambda item: item[1], reverse=True)

    return sorted_word_frequencies

# Example usage
text = "Hi, I am Vishwas Acharya, a Software Engineer"
result = analyze_text(text)
for word, count in result:
    print(f"'{word}': {count}")
