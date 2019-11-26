package ejercicioinstanceof1;

public class EjercicioInstanceOf1 {

        public static void main(String[] args) {
            Vehiculo caballo = new Vehiculo();
            Automovil fiat= new Automovil();
            Motocicleta zanella= new Motocicleta();
            System.out.println("Es el caballo un Vehiculo?: "  + (caballo instanceof Vehiculo));
            System.out.println("Es el caballo un Automovil?: " + (caballo instanceof Automovil));
            System.out.println("Es el caballo una Motocicleta?: " + (caballo instanceof Motocicleta));
            System.out.println("Es el caballo a motor?: " + (caballo instanceof IMotorizado));
            System.out.println("Es el fiat un Vehiculo?: " + (fiat instanceof Vehiculo));
            System.out.println("Es el fiat un Automovil?: " + (fiat instanceof Automovil));
            System.out.println("Es el fiat a motor?: " + (fiat instanceof IMotorizado));
            System.out.println("Es la zanella un Vehiculo?: " + (zanella instanceof Vehiculo));
            System.out.println("Es la zanella es una Motocicleta?: " + (zanella instanceof Motocicleta));
            System.out.println("Es la zanella a motor?: " + (zanella instanceof IMotorizado));
            
            //¿Qué pasa cuándo el objeto es nulo?
            Vehiculo velero = null;
            System.out.println("Es velero nulo un Vehiculo?: " + (velero instanceof Vehiculo));
            System.out.println("Es velero nulo un Automovl?: " + (velero instanceof Automovil));
            
        
    }
        }
        class Vehiculo {
            public void conducir(){
                System.out.println("Ve por aquí. Ve por allí. Vee Vee dijo Italia");
            }
        }
        interface IMotorizado {
            void arrancar();
        }
        class Automovil extends Vehiculo implements IMotorizado{
            public void arrancar(){
                System.out.println("Brum brum rum rum. Ruuuuuun, ruuuuuun, iiiiiiiiigh!");
            }
                }
        class Motocicleta extends Vehiculo implements IMotorizado{
            public void arrancar(){
                System.out.println("Ama ma ma ma ma mam. Mambam. Mmmmmbe be be beeeeeee!!!");
                
            }
        }

