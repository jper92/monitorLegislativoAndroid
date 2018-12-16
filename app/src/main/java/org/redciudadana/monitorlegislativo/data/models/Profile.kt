package org.redciudadana.monitorlegislativo.data.models

import android.annotation.SuppressLint
import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize


@SuppressLint("ParcelCreator")
@Parcelize
data class Profile(
    val id: String?,
    val nombre: String?,
    val institucion: String?,
    val profesion: String?,
    val educacion: String?,
    val edad: String?,
    val estadocivil: String?,
    val anosprofesional: String?,
    val colegiado: String?,
    val ocupacion: String?,
    val planTrabajo: String?,
    val biografia: String?,
    val experienciaProfesional: String?,
    val experienciaAcademica: String?,
    val proyeccion: String?,
    val primerNombre: String?,
    val apellidos: String?,
    val partidopostulante: String?,
    val partidoactual: String?,
    val distrito: String?,
    val nacimiento: String?,
    val estado: String?,
    val historialpolitico: String?,
    val cargo: String?,
    val sexo: String?,
    val tw: String?,
    val fb: String?,
    val fotoUrlPartido: String?,
    val fotoUrl: String?,
    val Contacto: String?,
    val direccion: String?,
    val telefono: String?,
    val ext: String?,
    val email: String?
) : Parcelable
