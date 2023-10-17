class Solution {
    public int differenceOfSums(int n, int m) {

    int totalsum=n*(n+1)/2;
    int count=n/m;
    int divSum=(count*(m*2+(count-1)*m))/2;
    int notDivSum=totalsum-divSum;

    return notDivSum-divSum; 

    }
}
