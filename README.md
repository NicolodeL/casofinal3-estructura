https://github.com/NicolodeL/casofinal3-estructura.git
# -ModeloEntidades:
En este package se encuentran todas las clases extendidas de la clase principal organismo, seguida por la clase animal y planta, que a su vez contienen multiples clases.
Cada clase tiene sus interacciones propias con el enterno y con otros organismos.
También hay clases ambiente como desierto o pradera.
# -Dinamicas
Este package contiene la crecerPoblaccion,Estadisticas y Eventos.
La clase crecerPoblaccion mediante el metodo reproduccion de cada animal hace crecer  a los animales de la simulación, tambien da la señal de crear nuevos.
La clase eventos genera eventos aleatorios como el terremoto o la enfermedad, ambos quitando salud a todos los organismos.
La clase estadisticas recoge la salud total de los organismos y tambien la tendencia poblacional según que organismos hay.
# -org.example
ConfiguracionSimulacion: en esta clase se organiza la interfaz que se ve en la creacion de la simulacion, en esta se limita el acceso a ciertos usuarios, 
tambien crea los primeros organismos al azar.
Main: se ejecutan los comandos que inician la simulacion
Simulacion: Se recogen las distintas interacciones y las añade a la simulacion
