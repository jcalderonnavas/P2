package com.example.josue.p2;

import android.provider.BaseColumns;

/**
 * Created by josue on 9/10/2017.
 */

public class UsuarioReaderContract {
    public UsuarioReaderContract(){}

    public class Usuario implements BaseColumns{
        public static final String TABLE_NAME = "USUARIO";
        public static final String COLUMN_NAME = "NOMBRE";
        public static final String COLUMN_LOGIN="NUSUARIO";
        public static final String COLUMN_PASSWORD="CLAVE";
    }
}
