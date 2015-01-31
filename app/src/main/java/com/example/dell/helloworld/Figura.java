package com.example.dell.helloworld;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Dell on 03/01/2015.
 */
@SuppressWarnings("serial")
public class Figura implements Serializable{
    private String nombre;
    private long id;
    private String descripcion;
    private int fotos [];
    private int id_img;

    Figura(String nombre, String descripcion, int id_img, int[] fotos){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fotos = fotos;
        this.id_img = id_img;
    }


    public int getId_img(){
        return this.id_img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int[] getFotos() {
        return fotos;
    }

    public String getNombre() {
        return nombre;
    }

    public long getId(){
        return id;
    }
}