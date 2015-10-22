package HashTable;

public class CountPrimes {
	
	//Standard solution is really good check that one. Also probably this problem
	//can be solved with hashset.
    public boolean isPrime(int number) {
        if(number == 0 || number == 1)
            return false;
        if(number % 2 == 0)
            return number == 2;
        if(number % 3 == 0)
            return number == 3;
        if(number % 5 == 0)
            return number == 5;
        for(int k = 7; k * k <= number; k += 2)
            if(number % k == 0)
                return false;
        return true;
    }
    
    public int countPrimes(int n) {
        int counter = 0;
        
        for(int i = 0; i < n; i++){
            if(this.isPrime(i))
                counter++;
        }
        return counter;
    }
}
