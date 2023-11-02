# Sprint 1 - Rubén Bonilla

## Descripción
Esta aplicación Android te permite conectarte a un servidor utilizando un nombre de usuario y una dirección IP válida. La aplicación consta de dos actividades: `MainActivity` y `MessagesWindow`, que te guiarán a través del proceso de conexión y te permitirán enviar mensajes. Al ser una version no acabda de un proyecto más grande este no se conecta de momento a ningún servidor y tampoco envia ningún mensaje. básicamente es una interfaz que lo que hace es validar si los datos pasados son los esperados y mostrar en caso afirmativo la ventana de mensajes donde se puede escribir pero no visualizar los mensajes.


## Características Clave
- Ingrese un nombre de usuario y una dirección IP para conectarse al servidor.
- Valida que el nombre de usuario no esté vacío y que la dirección IP sea válida.
- Interfaz de usuario atractiva y fácil de usar.
- Abre una ventana de chat para enviar y recibir mensajes una vez conectado.

## Uso
1. Abra la aplicación.
2. Ingrese su nombre de usuario y la dirección IP del servidor.
3. Presione el botón "Conectar".
4. Una vez conectado, se abrirá la ventana de chat para enviar y recibir mensajes.

## MainActivity.kt
1. Importación de la clase Intent: El código comienza importando la clase Intent que se utiliza para iniciar otras actividades en la aplicación.
2. Obtención de las referencias a las vistas: Se obtienen las referencias a tres elementos de la interfaz de usuario: un campo de texto (EditText) para el nombre de usuario (nickNameEditText), otro para la dirección IP del servidor (serverAddressEditText) y un botón de conexión (connectButton).
3. Configuración del botón "Connect": Se establece un escuchador (listener) en el botón "Connect". Esto significa que cuando el usuario haga clic en ese botón, se ejecutará una serie de acciones.
4. Validación de los datos: Cuando el usuario hace clic en el botón "Connect", se recopilan dos valores: el nombre de usuario y la dirección IP del servidor. Se verifica si el nombre de usuario no está vacío.
5. Validación de la dirección IP en un hilo secundario: Si el nombre de usuario no está vacío, se crea un hilo secundario (Thread) para validar la dirección IP introducida por el usuario. La validación de la dirección IP se realiza en el método isValidIPAddress, que comprueba si la dirección IP es válida.
6. Abertura de la ventana de mensajes: Si tanto el nombre de usuario como la dirección IP son válidos, se abre una nueva actividad llamada "MessagesWindow". Esta actividad se abre utilizando un Intent que pasa los datos del nombre de usuario y la dirección IP.
7. Mensajes de error: Si el nombre de usuario está vacío o si la dirección IP no es válida, se muestran mensajes de error utilizando Snackbar para informar al usuario.
En resumen, este código de MainActivity.kt maneja la entrada del usuario, valida los datos introducidos y abre una nueva actividad de mensajes si los datos son correctos. También proporciona retroalimentación al usuario a través de mensajes de error cuando es necesario.

## MessagesWindow.kt
1. Declaración de la clase MessagesWindow: Comienza declarando una nueva clase llamada MessagesWindow, que hereda de AppCompatActivity. Esta clase representa la actividad que muestra la ventana de mensajes en la aplicación.
2. Declaración de variables de vistas: Se declaran tres variables para las vistas que se utilizarán en esta actividad: connectionInfoTextView para mostrar información de conexión, messageText para la entrada de mensajes y sendMessageButton para un botón que borra el texto del mensaje.
3. Sobreescritura del método onCreate: El método onCreate se sobrescribe para realizar la inicialización de la actividad cuando se crea.
4. Recuperación de datos del Intent: Se recuperan los datos enviados desde la actividad anterior a través del Intent. Estos datos son el "nickName" (nombre de usuario) y "serverAddress" (dirección IP del servidor).
5. Configuración del TextView de conexión: Se obtiene una referencia al TextView con ID connectionInfoTextView y se establece el texto que muestra información de conexión. El texto muestra el nombre de usuario y la dirección del servidor.
6. Configuración del EditText para mensajes: Se obtiene una referencia al EditText con ID MessageText, que permite al usuario ingresar mensajes.
7. Configuración del botón de envío (borrar texto): Se obtiene una referencia al botón con ID sendMessage. Cuando se hace clic en este botón, se ejecuta una acción: se borra el texto dentro del EditText, lo que permite al usuario limpiar el campo de entrada de mensajes.
En resumen, la clase MessagesWindow es responsable de mostrar información de conexión, permitir al usuario ingresar mensajes y proporcionar una función para borrar el texto de entrada en la ventana de mensajes de la aplicación.