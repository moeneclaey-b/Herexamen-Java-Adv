package edu.ap.spring;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// getallen terug te geven die deelbaar zijn door twee
	// 2 punten
	public int[] getTimesTwo(int[] numbers) {
		int[] list;
        /*Arrays.stream(numbers)
                .anyMatch(n -> n%2 == 0 )
                .foreach(n -> list)
                */
        Arrays.asList(numbers)
                .stream()
                .forEach(n%2 == 0 : numbers);


        return list;
	}
	
	// Maak gebruik van lambdas en streams om alle uppercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countUppercaseCharacters(String sentence) {
	    int count = 0;
        Arrays.asList(sentence)
                .stream()
                .forEach(e -> countUppercaseCharacters(sentence));
        count++;
        return count;
	}
	
	// Maak gebruik van lambdas en streams om het aantal keren te tellen
	// dat string s voorkomt (zowel uppercase als lowercase) in de lijst names
	// 1 punt
	public int countChar(List<String> names, String s) {
	    int count = 0;
	    names
                .stream()
                .anyMatch(e -> e.contains(s));
	    count++;

        return count;
	}
	
	// Maak gebruik van lambdas en streams om het hoogste Y coordinaat
	// te vinden
	// 2 punten
	public int getMaxY(List<Point> points) {
	    int y = points
                .stream()
                .mapToInt(v -> v.getY())
                .max();

	    return y;
	}	
}