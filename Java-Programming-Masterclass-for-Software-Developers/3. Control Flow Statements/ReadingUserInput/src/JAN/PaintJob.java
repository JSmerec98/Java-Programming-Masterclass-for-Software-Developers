package JAN;

public class PaintJob
{
    public static int getBuckerCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if(width <= 0 || areaPerBucket <= 0 || height <= 0 || extraBuckets < 0)
        {
            return -1;
        }

        double area = width * height;
        System.out.println(area);

        double needed = area / areaPerBucket;

        return (int)Math.ceil(needed) - extraBuckets;
    }

    public static int getBuckerCount(double width, double height, double areaPerBukcet)
    {
        if(width <= 0 || height <= 0 || areaPerBukcet <= 0)
        {
            return -1;
        }

        double area = width * height;
        System.out.println(area);

        double needed = area / areaPerBukcet;

        return (int)Math.ceil(needed);
    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }

        double needed = area / areaPerBucket;

        return (int)Math.ceil(needed);
    }

    public static void main(String[] args)
    {
        System.out.println(getBuckerCount(0.75,0.75,0.5,0));
        System.out.println(getBuckerCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(3.4,1.5));
    }
}
