// Represents a GPS position with longitude and latitude.
package Vehicels;

public class GPSPosition {
    private double longitude; // 0° to <360°
    private double latitude;  // -90° to 90°

    public GPSPosition(double longitude, double latitude) {
        setPosition(longitude, latitude);
    }

    public double getLongitude() { return longitude; }
    public double getLatitude() { return latitude; }
    public void setPosition(double longitude, double latitude) {
        if (longitude < 0 || longitude >= 360) {
            throw new IllegalArgumentException("Longitude must be between 0° and 360°.");
        }
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("Latitude must be between -90° and 90°.");
        }
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
