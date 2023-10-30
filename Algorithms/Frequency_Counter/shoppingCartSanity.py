def check_shopping_cart(cart):
    # Create an empty set to store encountered items
    encountered_items = set()
    
    for item in cart:
        # Check if the item is already in the set, indicating a duplicate
        if item in encountered_items:
            return "Oops, you have a duplicate item in your shopping cart."
        # If it's not in the set, add it for future checking
        encountered_items.add(item)
    
    return "Your shopping cart looks good! No duplicates found."

# Example usage
shopping_cart = ["Brown Bread", "Peanut Butter", "Parle - G", "Peanut Butter"]  # Replace with your shopping cart items

result = check_shopping_cart(shopping_cart)
print(result)
