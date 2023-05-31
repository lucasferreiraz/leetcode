package com.dsa.array;

public class ContainsDuplicate {
    
    public boolean containsDuplicate(int numbers[]) {
        int arrayLength = numbers.length;
        
        if(arrayLength == 0)
            return false;

        for(int i = 0; i < arrayLength; i++)
            for(int j = i + 1; j < arrayLength; j++)
                if(numbers[i]==numbers[j])
                    return true;   

        return false;
    }
}
