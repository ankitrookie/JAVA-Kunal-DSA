//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
   smartDevice.turnOn()

   smartDevice = SmartLightDevice("Google Light", "Utility")
   smartDevice.turnOn()
}

open class SmartDevice(val name: String, val category: String) {
   var deviceStatus = "online";
   open val deviceType = "unKnown";

   open fun turnOn() {
      deviceStatus = "om"
   }

   open fun turnOff() {
      deviceStatus = "off"
   }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
   SmartDevice(name = deviceName, category = deviceCategory) {

   override val deviceType = "Smart TV"

   var speakerVolume = 2
      set(value) {
         if (value in 0..100) {
            field = value
         }
      }

   var channelNumber = 1
      set(value) {
         if (value in 0..200) {
            field = value
         }
      }

   fun increaseSpeakerVolume() {
      speakerVolume++
      println("Speaker volume increased to $speakerVolume.")
   }

   fun nextChannel() {
      channelNumber++
      println("Channel number increased to $channelNumber.")
   }

   override fun turnOn() {
      super.turnOn()
      println(
         "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                 "set to $channelNumber."
      )
   }

   override fun turnOff() {
      super.turnOff()
      println("$name turned off")
   }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
   SmartDevice(name = deviceName, category = deviceCategory) {

   override val deviceType = "Smart TV"

   var brightnessLevel = 0
      set(value) {
         if (value in 0..100) {
            field = value
         }
      }

   fun increaseBrightness() {
      brightnessLevel++
      println("Brightness increased to $brightnessLevel.")
   }

   override fun turnOn() {
      super.turnOn()
      brightnessLevel = 2
      println("$name turned on. The brightness level is $brightnessLevel.")
   }

   override fun turnOff() {
      super.turnOff()
      brightnessLevel = 0
      println("Smart Light turned off")
   }
}