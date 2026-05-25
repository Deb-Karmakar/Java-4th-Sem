#define LED_PIN 7
#define IR_PIN 8

void setup()
{
    pinMode(LED_PIN, OUTPUT);
    pinMode(IR_PIN, INPUT);
    Serial.begin(9600);
}


void loop()
{
    if(digitalRead(IR_PIN)==HIGH)
    {
        digitalWrite(LED_PIN,HIGH);
        Serial.println("Obstacle detected!");
    }
    else
    {
        digitalWrite(LED_PIN,LOW);
        Serial.println("Path is clear!");
    }
    delay(200);
}