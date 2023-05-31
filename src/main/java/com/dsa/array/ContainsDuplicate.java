package com.dsa.array;

import java.util.HashSet;

public class ContainsDuplicate {
    
    public boolean containsDuplicate(int numbers[]) {
        int arrayLength = numbers.length;

        HashSet<Integer> numbersSet = new HashSet<>();

        if(arrayLength == 0)
            return false;

        for(int number : numbers){
            boolean existNumberInSet = numbersSet.contains(number);
            if(existNumberInSet)
                return true;
            
            numbersSet.add(number);
        }

        return false;
    }
}
