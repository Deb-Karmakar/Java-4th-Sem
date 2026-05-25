#define LED_PIN 7
#define LDR_PIN A0

void setup()
{
    pinMode(LED_PIN, OUTPUT);
    pinMode(LDR_PIN, INPUT);
    Serial.begin(9600);
}


void loop()
{
    int val=analogRead(LDR_PIN);
    if(val<=30)
    {
        digitalWrite(LED_PIN,HIGH);
        Serial.println("Its night time. Turn on LED!");
    }
    else
    {
        digitalWrite(LED_PIN,LOW);
        Serial.println("Its day time. Turn off LED!");
    }
    delay(200);
}