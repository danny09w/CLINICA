//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //ENTRADA POR TECLADO
    Scanner teclado = new Scanner(System.in);
    //CREACION DE LISTA
    List<Paciente> lstpaciente =new ArrayList<>();
    //VARIABLES
    int opc;
    //DO-WHILE
    do {
        System.out.println("""
                *** BIENVENIDO ***
                1. CREAR PACIENTE
                2. BUSCAR PACIENTE
                """);
        //OPC INICIALIZADA
        opc = teclado.nextInt();
        //SWITCH CASE
        switch (opc){
            case 1:
                System.out.println("*** CREACION DE PACIENTE***");
                System.out.println("NOMBRE:");
                String nombre1 = teclado.next();
                System.out.println("EDAD: ");
                int edad1= teclado.nextInt();
                System.out.println("PESO: ");
                double peso1= teclado.nextDouble();
                System.out.println("PRESION ARTERIAL ACTUAL: ");
                double presionA= teclado.nextDouble();
                System.out.println("ESTADO DEL PACIENTE: (ESTABLE/MUERTO) ");



        }

    }while (opc !=4);



}
