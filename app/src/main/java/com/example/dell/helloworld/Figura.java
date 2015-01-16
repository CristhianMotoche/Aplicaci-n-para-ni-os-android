package com.example.dell.helloworld;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Dell on 03/01/2015.
 */
@SuppressWarnings("serial")
public class Figura implements Parcelable {
    private String nombre;
    private Drawable imagen;
    private long id;
    private String descripcion;
    private Drawable fotos [];

    Figura(String nombre, String descripcion, Drawable imagen, Drawable[] fotos){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.fotos = fotos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Drawable[] getFotos() {
        return fotos;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public long getId(){
        return id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.fotos);
        dest.writeString(this.nombre);
        dest.writeString(this.descripcion);
        dest.writeLong(this.id);
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Figura createFromParcel(Parcel in) {
            return null;
        }
        public Figura[] newArray(int size) {
            return new Figura[size];
        }
    };
}