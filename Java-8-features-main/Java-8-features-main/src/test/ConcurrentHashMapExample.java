package test;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	 public static void main(String[] args) {
	        // Create a ConcurrentHashMap
	        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

	        // Put key-value pairs into the map
	        map.put("A", "Apple");
	        map.put("B", "Banana");
	        map.put("C", "Cherry");

	        // Retrieve values
	        System.out.println("Value for key 'A': " + map.get("A"));

	        // Use putIfAbsent to add only if the key is not present
	        map.putIfAbsent("A", "Avocado");  // No effect, "A" already exists

	        System.out.println("Value for key 'A' after putIfAbsent: " + map.get("A"));

	        // Remove a key-value pair
	        map.remove("B");

	        System.out.println("Value for key 'B' after removal: " + map.get("B"));

	        // Replace a value
	        map.replace("C", "Citrus");

	        System.out.println("Value for key 'C' after replace: " + map.get("C"));
	    }
}
