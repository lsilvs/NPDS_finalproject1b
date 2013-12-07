package services;

class Account implements java.io.Serializable {
    private int _number;
    private float _balance;

    private int kamaradTalkKamarad100;
    private int kamaradTalkKamarad500;
    private int kamaradTalkEveryone100;
    private int kamaradTalkEveryone500;
    private int kamaradInternet1GB;
    private int kamardText300;
    private int kamaradInternational100;

    public Account (int number) {
        _number = number;
        _balance = 0;
        kamaradTalkKamarad100 = 0;
        kamaradTalkKamarad500 = 0;
        kamaradTalkEveryone100 = 0;
        kamaradTalkEveryone500 = 0;
        kamaradInternet1GB = 0;
        kamardText300 = 0;
        kamaradInternational100 = 0;
        System.out.println ("Created Account Server");
    }

    public float getBalance () { return _balance; }

    public void setBalance (float amount) { 
            _balance = amount; 
    }

    public int getNumber () { return _number; }

    public void setNumber (int number) { 
            _number = number; 
    }

    public int getKamaradTalkKamarad100 (){
            return kamaradTalkKamarad100;
    }
    public void setKamaradTalkKamarad100 (int amount){
            kamaradTalkKamarad100 = amount;
    }

    public int getKamaradTalkKamarad500 (){
          return kamaradTalkKamarad500;
    }
    public void setKamaradTalkKamarad500 (int amount){
          kamaradTalkKamarad500 = amount;
    }

    public int getKamaradTalkEveryone100 (){
          return kamaradTalkEveryone100;
    }
    public void setKamaradTalkEveryone100 (int amount){
          kamaradTalkEveryone100 = amount;
    }

    public int getKamaradTalkEveryone500 (){
          return kamaradTalkEveryone500;
    }
    public void setKamaradTalkEveryone500 (int amount){
          kamaradTalkEveryone500 = amount;
    }

    public int getKamaradInternet1GB (){
          return kamaradInternet1GB;
    }
    public void setKamaradInternet1GB (int amount){
          kamaradInternet1GB = amount;
    }

    public int getKamardText300 (){
          return kamardText300;
    }
    public void setKamardText300 (int amount){
          kamardText300 = amount;
    }

    public int getKamaradInternational100 (){
          return kamaradInternational100;
    }
    public void setKamaradInternational100 (int amount){
          kamaradInternational100 = amount;
    }
    
    @Override
    public String toString() {
       return "{\"Account\": { \"_number\":\"" + _number + "\", \"_balance\":\"" + _balance + 
                            "\", \"kamaradTalkKamarad100\":\"" + kamaradTalkKamarad100 + "\", \"kamaradTalkKamarad500\":\"" + kamaradTalkKamarad500 + 
                            "\", \"kamaradTalkEveryone100\":\"" + kamaradTalkEveryone100 + "\", \"kamaradTalkEveryone500\":\"" + kamaradTalkEveryone500 + 
                            "\", \"kamaradInternet1GB\":\"" + kamaradInternet1GB + "\", \"kamardText300\":\"" + kamardText300 + 
                            "\", \"kamaradInternational100\":\"" + kamaradInternational100 + "\" } }";
    }
}