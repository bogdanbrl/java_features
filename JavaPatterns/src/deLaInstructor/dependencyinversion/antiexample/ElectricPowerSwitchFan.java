package deLaInstructor.dependencyinversion.antiexample;

public class ElectricPowerSwitchFan {

        public Fan fan;
        public boolean on;

        public ElectricPowerSwitchFan(Fan fan) {
            this.fan = fan;
            this.on = false;
        }

        public boolean isOn() {
            return this.on;
        }

        public void press(){

            boolean checkOn = isOn();

            if (checkOn) {
                fan.turnOff();
                this.on = false;
            } else {
                fan.turnOn();
                this.on = true;
            }

        }
    }

