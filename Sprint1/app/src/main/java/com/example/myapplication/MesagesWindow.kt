package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MessagesWindow : AppCompatActivity() {

    private lateinit var connectionInfoTextView: TextView
    private lateinit var messageText: EditText
    private lateinit var sendMessageButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages_window)

        // Recuperar datos del Intent
        val intent = intent
        val nickName = intent.getStringExtra("nickName")
        val serverAddress = intent.getStringExtra("serverAddress")

        // Configurar el TextView de conexión
        connectionInfoTextView = findViewById(R.id.connectionInfoTextView)
        connectionInfoTextView.text = "Connectat a $serverAddress com a $nickName"

        // Configurar el EditText
        messageText = findViewById(R.id.MessageText)

        // Configurar el botón de envío (borrar texto)
        sendMessageButton = findViewById(R.id.sendMessage)
        sendMessageButton.setOnClickListener {
            messageText.text.clear() // Borrar el texto del EditText
        }
    }
}

