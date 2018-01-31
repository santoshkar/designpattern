package designpattern.Behavioral.Command;

class LightOffCommand implements Command {
        private Light myLight;
        public LightOffCommand ( Light L) {
                myLight  =  L;
        }
        public void execute( ) {
                myLight . turnOff( );
        }
}
