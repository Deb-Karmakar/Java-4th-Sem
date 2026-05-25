#define LED_PIN 7
#define IR_PIN 8
#define BuzzerPin 9

void setup()
{
    pinMode(LED_PIN, OUTPUT);
    pinMode(IR_PIN, INPUT);
    pinMode(BuzzerPin, OUTPUT);
}

void loop()
{
    if(digitalRead(IR_PIN)==HIGH)
    {
        digitalWrite(LED_PIN,HIGH);
        digitalWrite(BuzzerPin,HIGH);
    }
    else
    {
        digitalWrite(LED_PIN,LOW);
        digitalWrite(BuzzerPin,LOW);
    }
}