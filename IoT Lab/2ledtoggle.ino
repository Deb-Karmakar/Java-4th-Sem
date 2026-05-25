#define LED_PIN 7
#define BUTTON_PIN 8

byte lastButtonState=LOW;
byte ledState=LOW;

void setup()
{
    pinMode(LED_PIN, OUTPUT);
    pinMode(BUTTON_PIN, INPUT);
}

void loop()
{
    byte buttonState=digitalRead(BUTTON_PIN);

    if(buttonState!=lastButtonState)
    {
       lastButtonState= buttonState;
    
        if(buttonState==HIGH)
        {
            ledState=(ledState==HIGH)?LOW:HIGH;
            digitalWrite(LED_PIN,ledState);
        }
    }
}