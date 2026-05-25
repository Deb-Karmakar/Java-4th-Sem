#include<dht.h>

#define DHTTYPE DHT22
#define DHTPIN 8

DHT dht(DHTPIN, DHTTYPE); 

float hum, temp;

void setup()
{
    dht.begin();
    Serial.begin(9600);
}

void loop()
{
    hum=dht.readHumidity();
    temp=dht.readTemperature();

    Serial.print("Humidity: ");
    Serial.print(hum);
    Serial.print("% and Temperature: ");
    Serial.print(temp);
    Serial.println(" Celsius");
    delay(2000);
}