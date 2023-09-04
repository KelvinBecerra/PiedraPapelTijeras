import javax.swing.JOptionPane;

public class piedrapapelotijeras{
    public static void main(String[]args){
        JOptionPane.showMessageDialog(null,"BIENVENIDO AL JUEGO");
        String opcionUsuarioUno,opcionUsuarioDos,decisionEntrada,nombreUsuarioUno,nombreUsuarioDos;

        decisionEntrada=JOptionPane.showInputDialog(null, "¿Deseas empezar a jugar?").toLowerCase();
        //sustituir un while por el if
        //crear un booleano que sea sigoenel programa=true
        //se sustituye while(sigoenelprograma)
        if (decisionEntrada.equals("si")){
            Boolean salida=true;
        
            while (salida){
                nombreUsuarioUno=JOptionPane.showInputDialog(null,"Ingresa el nombre del jugador 1").toLowerCase();
                nombreUsuarioDos=JOptionPane.showInputDialog(null,"Ingresa el nombre del jugador 2").toLowerCase();

                String mensaje="<html>El jugador:  "+nombreUsuarioUno+"  <br> ¿Piedra, Papel o Tijera? </html>".toLowerCase();
                String mensajedos="<html>El jugador:"+nombreUsuarioDos+"  <br> ¿Piedra Papel o Tijera? </html>".toLowerCase();


                opcionUsuarioUno=JOptionPane.showInputDialog(null,mensaje );
                while((!opcionUsuarioUno.equals("piedra"))&&(!opcionUsuarioUno.equals("tijera"))&&(!opcionUsuarioUno.equals("papel"))){
                        JOptionPane.showMessageDialog(null, "DATO INVÁLIDO");
                        opcionUsuarioUno=JOptionPane.showInputDialog(null, "<html>jugador 1<br>¿Piedra, Papel o Tijera?</html>").toLowerCase();}


                opcionUsuarioDos=JOptionPane.showInputDialog(null,mensajedos);
                while((!opcionUsuarioDos.equals("piedra"))&&(!opcionUsuarioDos.equals("tijera"))&&(!opcionUsuarioDos.equals("papel"))){
                        JOptionPane.showMessageDialog(null, "DATO INVÁLIDO");
                        opcionUsuarioDos=JOptionPane.showInputDialog(null, "<html>jugador 2<br>¿Piedra, Papel o Tijera?</html>").toLowerCase();

                }
                if (opcionUsuarioUno.equals(opcionUsuarioDos)){
                    JOptionPane.showMessageDialog(null,"EMPATE");

                }else if((opcionUsuarioUno.equals("piedra") && opcionUsuarioDos.equals("tijera")) ||
                    (opcionUsuarioUno.equals("papel") && opcionUsuarioDos.equals("piedra")) ||
                    (opcionUsuarioUno.equals("tijera") && opcionUsuarioDos.equals("papel"))) {
                    JOptionPane.showMessageDialog(null, "EL JUGADOR: "+nombreUsuarioUno+" ES EL GANADOR");
                

                }else{
                    JOptionPane.showMessageDialog(null,"EL JUGADOR "+nombreUsuarioDos+" ES EL GANADOR");
                }
                decisionEntrada=JOptionPane.showInputDialog(null, "¿Deseas volver a jugar?").toLowerCase();
                if (decisionEntrada.equals("no")){
                    JOptionPane.showMessageDialog(null, "Hasta luego...");
                    break;//y aqui que cambie el booleano falso
                    //sigoenelprogramafalso
                }
            }
        

        }else if(decisionEntrada.equals("no")){
            JOptionPane.showMessageDialog(null,"Chao pescao");
        }else{
            JOptionPane.showMessageDialog(null, "DATO INVALIDO");
        }
    }
}
