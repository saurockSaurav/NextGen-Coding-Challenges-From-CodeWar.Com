package com.nextcitizen.codewars.interviewquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InterviewOnlineAssesment {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	@Test
	public void buildCacheBasedInString() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		Set<String> cache = new HashSet<>();
		while ((line = in.readLine()) != null) {
			String parts[] = line.split("\\|");
			if (parts.length == 2) {
				String function = parts[0];
				String key = parts[1];

				if (function.equals("Add")) {
					System.out.println(cache.add(key) ? "True" : "False");
				} else if (function.equals("Remove")) {
					System.out.println(cache.remove(key) ? "True" : "False");
				} else if (function.equals("Has")) {
					System.out.println(cache.contains(key) ? "True" : "False");
				} else if (function.equals("Get")) {
					if (cache.contains(key)) {
						System.out.println(key);
					} else {
						System.out.println("NULL");
					}
				}
			} else if (parts.length == 1) {
				String function = parts[0];
				if (function.equals("Reset")) {
					System.out.println(cache.size());
					cache.clear();
				}
			}
		}

	}
}
	
	

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
  *//**
   * Iterate through each line of input.
   *//*
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    Set<String> cache = new HashSet<>();
    while ((line = in.readLine()) != null) {
      //System.out.println(line);
      String parts[] = line.split("\\|");
      if(parts.length == 2){
        String function = parts[0];
        String key = parts[1];
        
        if(function.equals("Add")){
          System.out.println(cache.add(key));
        }
        else if(function.equals("Remove")){
          System.out.println(cache.remove(key));
        }
        else if(function.equals("Has")){
          System.out.println(cache.contains(key));
        }
        else if(function.equals("Get")){
           cache.contains(key) ? System.out.println("True") : System.out.println("NULL");
        }
      }
      else if(parts.length == 1){
        String function = parts[0]; 
        if(function.equals("Reset")){
          System.out.println(cache.size());
          cache.clear();
        }
      }
    }
  }
}
Programming challenge description:
Build an in-memory string cache that guarantees each entry is unique. This cache requires the following functions:

Add
Adds the supplied string to the cache and returns "True" if it was added or "False" if it already exists
Get
Returns the requested string if it exists in the cache or "NULL" if it does not exist in cache
Has
Returns "True" or "False" to indicate if the string is in the cache or not
Remove
Deletes the requested string from the cache and returns "True" if it was removed or "False" if it did not exist
Reset
Empties the cache of all entries and returns the number of entries
Try to implement this cache in a way that will have high read performance across a potentially large set.

Input:
Each line of input will have two parts separated with a pipe character:

Function Name
String Value
For example:

Add|Dog
Get|Dog
Remove|Dog
Has|Dog
The Reset function is an exception. It will only have the Function Name as input.

Output:
One line of output based on the function called by each line of input. For example:

True
Dog
True
False
Test 1
Test Input
Download Test 1 Input
Add|Dog
Get|Dog
Remove|Dog
Has|Dog
Expected Output
Download Test 1 Input
True
Dog
True
False
Test 2
Test Input
Download Test 2 Input
Get|English
Add|English
Add|German
Add|Mandarin
Add|Malay
Get|German
Get|Mandarin
Has|French
Add|French
Has|French
Reset
Has|English
Has|German
Has|Mandarin
Has|Malay
Has|French
Expected Output
Download Test 2 Input
NULL
True
True
True
True
German
Mandarin
False
True
True
5
False
False
False
False
False
Test 3
Test Input
Download Test 3 Input
Add|A
Add|B
Add|C
Add|D
Get|A
Get|B
Get|1
Get|2
Add|1
Add|2
Get|2
Remove|A
Remove|B
Remove|C
Has|A
Get|A
Add|A
Has|A
Get|A
Reset
Get|C
Expected Output
Download Test 3 Input
True
True
True
True
A
B
NULL
NULL
True
True
2
True
True
True
False
NULL
True
True
A
4
NULL
*/