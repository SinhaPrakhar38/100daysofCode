class Solution {
    public double angleClock(int hour, int minutes) {
        double angleHour = hour*30, angleMinutes = minutes*6;
        
        angleHour =angleHour + 0.5*(minutes);
        
        double res = Math.abs(angleHour - angleMinutes);
        
        return Math.min(res, 360-res);
    }
}
